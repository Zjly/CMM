package Interface;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.rtf.RTFEditorKit;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyTextPane extends JTextPane {

	private static final long serialVersionUID = -66377652770879651L;
	protected StyleContext m_context;
	protected DefaultStyledDocument m_doc;
	private MutableAttributeSet keyAttr, normalAttr;
	private MutableAttributeSet bracketAttr;
	private MutableAttributeSet inputAttributes = new RTFEditorKit()
			.getInputAttributes();
	/**
	 * ���йؼ���
	 */
	private final static String[] _keys = new String[]{"abstract", "boolean", "break", "byte", "case",
			"catch", "char", "class", "continue", "default", "do",
			"double", "else", "extends", "false", "final", "finally",
			"float", "for", "if", "implements", "import", "instanceof",
			"int", "interface", "long", "native", "new", "null", "package",
			"private", "protected", "public", "return", "short", "static",
			"super", "switch", "synchronized", "this", "throw", "throws",
			"transient", "true", "try", "void", "volatile", "while"};
	/**
	 * �����ų��ַ���
	 */
	private final static char[] _character = new char[]{'(', ')', ',', ';',
			':', '\t', '\n', '+', '-', '*', '/'};

	/**
	 * ��ʼ���������ؼ�����ɫ���ͷǹؼ�����ɫ
	 */
	public MyTextPane() {
		super();
		m_context = new StyleContext();
		m_doc = new DefaultStyledDocument(m_context);
		this.setDocument(m_doc);
		this.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent ke) {
				dealSingleRow();
			}
		});
		// ��ؼ�����ʾ����
		keyAttr = new SimpleAttributeSet();
		StyleConstants.setForeground(keyAttr, new Color(128, 0, 128));
		StyleConstants.setBold(keyAttr, true);
		// ��һ���ı���ʾ����
		normalAttr = new SimpleAttributeSet();
		// StyleConstants.setFontFamily(normalAttr, "serif");
		StyleConstants.setBold(normalAttr, false);
		StyleConstants.setForeground(normalAttr, Color.black);
		bracketAttr = new SimpleAttributeSet();
		StyleConstants.setForeground(bracketAttr, Color.RED);
		// StyleConstants.setFontFamily(bracketAttr, "serif");
		StyleConstants.setBold(bracketAttr, true);
	}
	/**
	 * ���ô�������ɫ
	 * @param _text
	 */
//	private void setBracketColor(String _text) {
//	int len = _text.length();
//	for (int i = 0; i < len; i++) {
//	char ch = _text.charAt(i);
//	if (ch == '{' || ch == '}') {
//	m_doc.setCharacterAttributes(i, 1, bracketAttr, false);
//	}
//	}
//	}

	/**
	 * �ж��ַ��ǲ������ų��ַ�����
	 *
	 * @param _ch
	 * @return
	 */
	private boolean isCharacter(char _ch) {
		for(int i = 0; i < _character.length; i++) {
			if(_ch == _character[i]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * ���ùؼ�����ɫ
	 *
	 * @param _key
	 * @param _start
	 * @param _length
	 * @return
	 */
	private int setKeyColor(String _key, int _start, int _length) {
		for(int i = 0; i < _keys.length; i++) {
			int li_index = _key.indexOf(_keys[i]);
			if(li_index < 0) {
				continue;
			}
			int li_legnth = li_index + _keys[i].length();
			if(li_legnth == _key.length()) {
				if(li_index == 0) {//������һ���ؼ��ֵ���������磺if else ��
					m_doc.setCharacterAttributes(_start, _keys[i].length(),
							keyAttr, false);
				} else {//����ؼ���ǰ�滹���ַ�����������磺)if ;else ��
					char ch_temp = _key.charAt(li_index - 1);
					if(isCharacter(ch_temp)) {
						m_doc.setCharacterAttributes(_start + li_index,
								_keys[i].length(), keyAttr, false);
					}
				}
			} else {
				if(li_index == 0) {//����ؼ��ֺ��滹���ַ�����������磺if( end;��
					char ch_temp = _key.charAt(_keys[i].length());
					if(isCharacter(ch_temp)) {
						m_doc.setCharacterAttributes(_start, _keys[i].length(),
								keyAttr, false);
					}
				} else {//����ؼ���ǰ��ͺ��涼���ַ�����������磺)if( ��
					char ch_temp = _key.charAt(li_index - 1);
					char ch_temp_2 = _key.charAt(li_legnth);
					if(isCharacter(ch_temp) && isCharacter(ch_temp_2)) {
						m_doc.setCharacterAttributes(_start + li_index,
								_keys[i].length(), keyAttr, false);
					}
				}
			}
		}
		return _length + 1;
	}

	/**
	 * ����һ�е�����
	 *
	 * @param _start
	 * @param _end
	 */
	private void dealText(int _start, int _end) {
		String text = "";
		try {
			text = m_doc.getText(_start, _end - _start).toUpperCase();
		} catch(BadLocationException e) {
			e.printStackTrace();
		}
		if(text == null || text.equals("")) {
			return;
		}
		int xStart = 0;
		// ���ؼ���---
		m_doc.setCharacterAttributes(_start, text.length(), normalAttr, false);
		MyStringTokenizer st = new MyStringTokenizer(text);
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			if(s == null)
				return;
			xStart = st.getCurrPosition();
			setKeyColor(s.toLowerCase(), _start + xStart, s.length());
		}
		//setBracketColor(text);
		inputAttributes.addAttributes(normalAttr);
	}

	/**
	 * �ڽ����ı��޸ĵ�ʱ��
	 * ��ù�������У�ֻ�Ը��н��д���
	 */
	private void dealSingleRow() {
		Element root = m_doc.getDefaultRootElement();
		// ��굱ǰ��
		int cursorPos = this.getCaretPosition(); // ǰ����λ��
		int line = root.getElementIndex(cursorPos);// ��ǰ��
		Element para = root.getElement(line);
		int start = para.getStartOffset();
		int end = para.getEndOffset() - 1;// ��\r�ַ�
		dealText(start, end);
	}

	/**
	 * �ڳ�ʼ������ʱ����ø÷�����
	 * ��������ƪ���Ĺؼ���
	 */
	public void syntaxParse() {
		Element root = m_doc.getDefaultRootElement();
		int li_count = root.getElementCount();
		for(int i = 0; i < li_count; i++) {
			Element para = root.getElement(i);
			int start = para.getStartOffset();
			int end = para.getEndOffset() - 1;// ��\r�ַ�
			dealText(start, end);
		}
	}
}
