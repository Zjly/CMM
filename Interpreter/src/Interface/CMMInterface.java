package Interface;

import CMM.CMMLexer;
import CMM.CMMParser;
import SemanticAnalysis.DefPhase;
import SemanticAnalysis.Scope.Output;
import SemanticAnalysis.VisitPhase;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sun.misc.Queue;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class CMMInterface extends Frame implements ActionListener {

	private JScrollPane scroll;
	private JScrollPane scroll1;
	private JScrollPane scroll2;
	//private JScrollPane scroll3 = new JScrollPane();
	private JTextPane input = new JTextPane();
	private TextArea output = new TextArea("", 48, 25, TextArea.SCROLLBARS_VERTICAL_ONLY);
	private static JTabbedPane jta1 = new JTabbedPane();

	private JButton interBtn1 = new JButton(new ImageIcon(".\\src\\Interface\\images\\start.png"));
	//private Button interBtn2 = new Button("语法分析");
	private JButton chooseBtn = new JButton(new ImageIcon(".\\src\\Interface\\images\\file.png"));
	//private TextField fileName = new TextField(20);
	private JButton saveBtn = new JButton(new ImageIcon(".\\src\\Interface\\images\\save.png"));

	private static JTabbedPane jta = new JTabbedPane();
	private JTextPane fault = new JTextPane();
	private JTextPane output1 = new JTextPane();
	private JTextField input1 = new JTextField();
//	private JScrollPane scroll1;
//	private JScrollPane scroll2;
//	private JScrollPane scroll3;

	private class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}

	private void setup() {
		Panel up = new Panel();
		up.setLayout(new BorderLayout());
		//up.add(fileName);
		Panel btn = new Panel();
		btn.setLayout(new FlowLayout());
		btn.add(chooseBtn);
		btn.add(saveBtn);
		btn.add(interBtn1);
		up.add("West", btn);
		JPanel in = new JPanel();
		in.setPreferredSize(new Dimension(900, 600));
		in.setLayout(new GridLayout(2, 1));
		scroll = new JScrollPane(input);
		in.add(scroll);
		//jta.add("分析结果",output);
		//in.add(jta1);
		//jta.add("分析结果", output);
		scroll1 = new JScrollPane(fault);
		scroll2 = new JScrollPane(output1);
		jta.add("输出信息", scroll2);
		jta.add("输入信息", input1);
		jta.add("错误信息", scroll1);
		in.add(jta);
		JPanel right = new JPanel();
		right.setLayout(new FlowLayout());
		right.setPreferredSize(new Dimension(300, 150));
		//scroll3.setViewportView(output);
		//jta1.add("分析结果",scroll3);
		right.add(output);
		JPanel ta = new JPanel();
		ta.setPreferredSize(new Dimension(1200, 900));
		ta.setLayout(new BorderLayout());
		ta.add("West", in);
		ta.add("East", right);
//		ta.setLayout(new GridLayout(1,2));
//		ta.add(in);
//		ta.add(right);
		setLayout(new BorderLayout());
		setBackground(new Color(239, 239, 239));
		add("North", up);
		add("South", ta);
	}

	public CMMInterface() {
		super("CMM解释器");
		setup();
//		interBtn1.setHorizontalTextPosition(SwingConstants.CENTER);
//		interBtn1.setVerticalTextPosition(SwingConstants.BOTTOM);
		interBtn1.setMargin(new Insets(0, 0, 0, 0));//将边框外的上下左右空间设置为0
		interBtn1.setIconTextGap(0);//将标签中显示的文本和图标之间的间隔量设置为0
		interBtn1.setBorderPainted(false);//不打印边框
		interBtn1.setBorder(null);//除去边框
		interBtn1.setFocusPainted(false);//除去焦点的框
		interBtn1.setContentAreaFilled(false);
//		chooseBtn.setHorizontalTextPosition(SwingConstants.CENTER);
//		chooseBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
		chooseBtn.setMargin(new Insets(0, 0, 0, 0));//将边框外的上下左右空间设置为0
		chooseBtn.setIconTextGap(0);//将标签中显示的文本和图标之间的间隔量设置为0
		chooseBtn.setBorderPainted(false);//不打印边框
		chooseBtn.setBorder(null);//除去边框
		chooseBtn.setFocusPainted(false);//除去焦点的框
		chooseBtn.setContentAreaFilled(false);

		saveBtn.setMargin(new Insets(0, 0, 0, 0));//将边框外的上下左右空间设置为0
		saveBtn.setIconTextGap(0);//将标签中显示的文本和图标之间的间隔量设置为0
		saveBtn.setBorderPainted(false);//不打印边框
		saveBtn.setBorder(null);//除去边框
		saveBtn.setFocusPainted(false);//除去焦点的框
		saveBtn.setContentAreaFilled(false);
		//fileName.setSize(80, 30);
		input.setPreferredSize(new Dimension(450, 240));
		input.getDocument().addDocumentListener(new SyntaxHighlighter(input));
		//input.setBorder(new LineBorder(Color.BLACK));
		//output.setPreferredSize(new Dimension(270, 565));
		//output.setBorder(new LineBorder(Color.BLACK));
		output1.setPreferredSize(new Dimension(450, 150));
		//output1.setBorder(new LineBorder(Color.BLACK));
		fault.setPreferredSize(new Dimension(450, 150));
		//fault.setBorder(new LineBorder(Color.BLACK));
		fault.setForeground(Color.RED);
		output1.setForeground(Color.BLUE);
		input.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
		input1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 35));
		output.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 16));
		output1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 35));
		fault.setFont(new Font(Font.MONOSPACED, Font.BOLD, 35));
		interBtn1.addActionListener(this);
		saveBtn.addActionListener(this);
		chooseBtn.addActionListener(this);
		input1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = input1.getText();
				Output.input.enqueue(text);
				System.out.println("回车了！");
				input1.setText("");
//				if(!Output.input.isEmpty()){
//					try {
//						text = Output.input.dequeue();
//						System.out.println(text);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
			}
		});
		LineNumberHeaderView lh = new LineNumberHeaderView();
		scroll.setRowHeaderView(lh);
		//interBtn2.addActionListener(this);
		addWindowListener(new WindowCloser());
		pack();
		//setSize(550, 670);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		/* 运行解释器的线程 */
		class ThreadCMM extends Thread {
			@Override
			public void run() {
				fault.setText("");
				output1.setText("");
				String code = input.getText();
				ANTLRInputStream input = new ANTLRInputStream(code);
				CMMLexer lexer = new CMMLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				CMMParser parser = new CMMParser(tokens);
				parser.removeErrorListeners();
				ShouldFailListener listener = new ShouldFailListener();
				parser.addErrorListener(listener);
				// 开始语法分析
				ParseTree tree = parser.file();
				String error = "";
				while(!listener.q.isEmpty()) {
					try {
						error = listener.q.dequeue();
						error += "\n";
						System.out.println(error);
						//fault.setText(error);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(tree);
				output.setText(tree.toStringTree(parser));
				System.out.println(tree.toStringTree(parser));

				ParseTreeWalker walker = new ParseTreeWalker();
				DefPhase defPhase = new DefPhase();
				walker.walk(defPhase, tree);
				while(!Output.error.isEmpty()) {
					try {
						error += Output.error.dequeue();
						error += "\n";
						System.out.println(error);
						System.out.println("错误不为空");
						//fault.setText(error);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				fault.setText(error);
				String outdetail = "";
				if(error.isEmpty()) {
					try {
						VisitPhase visitPhase = new VisitPhase();
						visitPhase.visit(tree);
					} catch(Exception e) {
						fault.setText("代码语法错误！");
					}

					while(!Output.output.isEmpty()) {
						try {
							outdetail += Output.output.dequeue();
							//outdetail += "\n";
							System.out.println("输出不为空");
							//fault.setText(error);
						} catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				output1.setText(outdetail);
			}
		}
		if(ae.getSource() == interBtn1) {
			if(!input.getText().equals("")) {
				ThreadCMM threadCMM = new ThreadCMM();
				threadCMM.start();
			}
			System.out.println("词法分析");
		} else if(ae.getSource() == chooseBtn) {
			System.out.println("选择文件");
			input.setText("");
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			int result = chooser.showDialog(new JLabel(), "选择");
			if(result == JFileChooser.CANCEL_OPTION) {
				System.out.println("您没有选择任何文件");
			} else if(result == JFileChooser.APPROVE_OPTION) {
				File file = chooser.getSelectedFile();
				//fileName.setText(file.getAbsoluteFile().toString());
				readFileByLines(file);
			}
		} else if(ae.getSource() == saveBtn) {
			System.out.println("保存文件");
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			int result = chooser.showDialog(new JLabel(), "保存");
			if(result == JFileChooser.CANCEL_OPTION) {
				System.out.println("您没有选择任何文件");
			} else if(result == JFileChooser.APPROVE_OPTION) {
				File file = chooser.getSelectedFile();
				String path = file.getAbsoluteFile().toString();
				File file3 = new File(path);
				if(file3.exists()) {
					file3.delete();
				} else {
					try {
						file3.createNewFile();
						FileWriter fileWriter = new FileWriter(file3.getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fileWriter);
						bw.write(input.getText());
						bw.close();
						System.out.println("finish");
						System.out.println(input.getText());
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
				//fileName.setText(file.getAbsoluteFile().toString());

			}
		}
//        else if((ae.getSource() == interBtn2) && (!input.getText().equals(""))) {
//            System.out.println("语法分析");
//        }
	}

	//    public static void main(String args[]) {
//        CmmInterface ci = new CmmInterface();
//    }
	public static class ShouldFailListener extends BaseErrorListener {
		Queue<String> q = new Queue<String>();

		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
			line -= 1;
			String err = "line " + line + ": " + msg;
			//System.err.println("line " + line + ":" + charPositionInLine + " at : " + msg);
			q.enqueue(err);
		}
	}

	public void readFileByLines(File file) {
		//File file = new File(fileName);
		BufferedReader reader = null;
		String fileDetail = "";
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;

			int line = 1;
			// 一次读一行，读入null时文件结束
			while((tempString = reader.readLine()) != null) {
				fileDetail += tempString + "\n";
				System.out.println(tempString);
				line++;
			}
			reader.close();
			input.setText(fileDetail);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch(IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}