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
	private MyTextPane input = new MyTextPane();
	private JTextPane output = new JTextPane();
	private Button interBtn1 = new Button("interpret");
	//private Button interBtn2 = new Button("语法分析");
	private Button chooseBtn = new Button("choose file");
	private TextField fileName = new TextField(20);

	private static JTabbedPane jta = new JTabbedPane();
	private JTextPane fault = new JTextPane();
	private JTextPane output1 = new JTextPane();
	private JScrollPane scroll1;
	private JScrollPane scroll2;
	private JScrollPane scroll3;

	private class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}

	private void setup() {
		Panel up = new Panel();
		up.setLayout(new FlowLayout());
		up.add(fileName);
		up.add(chooseBtn);
		up.add(interBtn1);
		Panel in = new Panel();
		in.setLayout(new FlowLayout());
		scroll = new JScrollPane(input);
		in.add(scroll);
//		Panel button = new Panel();
//		button.setLayout(new FlowLayout());
//		button.add(interBtn1);
		//button.add(interBtn2);
		Panel out = new Panel();
		out.setLayout(new FlowLayout());
		scroll1 = new JScrollPane(output);
		scroll2 = new JScrollPane(output1);
		scroll3 = new JScrollPane(fault);
		jta.add("分析结果", scroll1);
		jta.add("输出信息", scroll2);
		jta.add("错误信息", scroll3);
		out.add(jta);
//		inter.add(interBtn);
//		inter.add(output);
		//setLayout(new GridLayout(3,1));
//		Panel down = new Panel();
////		down.setLayout(new GridLayout(2, 1));
////		down.add(in);
		//down.add("Center",button);
//		down.add(out);
		setLayout(new BorderLayout());
		add("North", up);
		add("Center", in);
		add("South", out);

	}

	public CMMInterface() {
		super("CMM解释器");
		setup();
		fileName.setSize(80, 30);
		input.setPreferredSize(new Dimension(380, 250));
		input.setBorder(new LineBorder(Color.BLACK));
		output.setPreferredSize(new Dimension(420, 250));
		output.setBorder(new LineBorder(Color.BLACK));
		output1.setPreferredSize(new Dimension(420, 250));
		output1.setBorder(new LineBorder(Color.BLACK));
		fault.setPreferredSize(new Dimension(420, 250));
		fault.setBorder(new LineBorder(Color.BLACK));
		fault.setForeground(Color.RED);
		input.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 16));
		output.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 16));
		fault.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 16));
		interBtn1.addActionListener(this);
		chooseBtn.addActionListener(this);
		LineNumberHeaderView lh = new LineNumberHeaderView();
		scroll.setRowHeaderView(lh);
		//interBtn2.addActionListener(this);
		addWindowListener(new WindowCloser());
		pack();
		setSize(500, 670);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == interBtn1) {
			if(!input.getText().equals("")) {
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
				output.setText(tree.toStringTree(parser));
				System.out.println(tree.toStringTree(parser));

				ParseTreeWalker walker = new ParseTreeWalker();
				DefPhase defPhase = new DefPhase();
				walker.walk(defPhase, tree);
				while(!Output.error.isEmpty()){
					try
					{
						error += Output.error.dequeue();
						error += "\n";
						System.out.println(error);
						System.out.println("错误不为空");
						//fault.setText(error);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				fault.setText(error);
				String outdetail = "";
				if(Output.error.isEmpty()){
					VisitPhase visitPhase = new VisitPhase();
					visitPhase.visit(tree);
					while(!Output.output.isEmpty()){
						try
						{
							outdetail += Output.output.dequeue();
							outdetail += "\n";
							System.out.println("输出不为空");
							//fault.setText(error);
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
				output1.setText(outdetail);

			} else if(!fileName.getText().equals("")) {
				fault.setText("");
				output1.setText("");
				String inputFile = fileName.getText();
				InputStream is = null;
				try {
					is = new FileInputStream(inputFile);
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				ANTLRInputStream input = null;
				try {
					input = new ANTLRInputStream(is);
				} catch(IOException e) {
					e.printStackTrace();
				}
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
				output.setText(tree.toStringTree(parser));
				System.out.println(tree.toStringTree(parser));

				ParseTreeWalker walker = new ParseTreeWalker();
				DefPhase defPhase = new DefPhase();
				walker.walk(defPhase, tree);
				while(!Output.error.isEmpty()){
					try
					{
						error += Output.error.dequeue();
						error += "\n";
						System.out.println(error);
						//fault.setText(error);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				System.out.println(error);
				fault.setText(error);
				String outdetail = "";
				if(Output.error.isEmpty()){
					VisitPhase visitPhase = new VisitPhase();
					visitPhase.visit(tree);
					while(!Output.output.isEmpty()){
						try
						{
							outdetail += Output.output.dequeue();
							outdetail += "\n";
							System.out.println("输出不为空");
							//fault.setText(error);
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
				output1.setText(outdetail);
				fileName.setText("");
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
				fileName.setText(file.getAbsoluteFile().toString());
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
			line -=1;
			String err = "line " + line + ": " + msg;
			//System.err.println("line " + line + ":" + charPositionInLine + " at : " + msg);
			q.enqueue(err);
		}
	}
}