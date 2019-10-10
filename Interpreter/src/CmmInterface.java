import java.awt.*;
import java.awt.event.*;
import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;

public class CmmInterface extends Frame implements ActionListener {

    private TextArea input = new TextArea();
    private TextArea output = new TextArea();
    private Button interBtn1 = new Button("interpret");
    //private Button interBtn2 = new Button("语法分析");
    private Button chooseBtn = new Button("choose file");
    private TextField fileName = new TextField(20);

    private class WindowCloser extends WindowAdapter{
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
        in.add(input);
//		Panel button = new Panel();
//		button.setLayout(new FlowLayout());
//		button.add(interBtn1);
        //button.add(interBtn2);
        Panel out = new Panel();
        out.setLayout(new FlowLayout());
        out.add(output);
//		inter.add(interBtn);
//		inter.add(output);
        //setLayout(new GridLayout(3,1));
        Panel down = new Panel();
        down.setLayout(new GridLayout(2,1));
        down.add(in);
        //down.add("Center",button);
        down.add(out);
        setLayout(new BorderLayout());
        add("North",up);
        add("South",down);

    }

    public CmmInterface() {
        super("CMM解释器");
        setup();
        fileName.setSize(60, 20);
        interBtn1.addActionListener(this);
        chooseBtn.addActionListener(this);
        //interBtn2.addActionListener(this);
        addWindowListener(new WindowCloser());
        pack();
        //setSize(800, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == interBtn1) {
            if(!input.getText().equals("")){
                String code = input.getText();
                ANTLRInputStream input = new ANTLRInputStream(code);
                CMMLexer lexer = new CMMLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CMMParser parser = new CMMParser(tokens);
                ParseTree tree = parser.file();
                output.setText(tree.toStringTree(parser));
                System.out.println(tree.toStringTree(parser));
            }else if(!fileName.getText().equals("")){
                String inputFile = fileName.getText();
                InputStream is = null;
                try
                {
                    is = new FileInputStream(inputFile);
                }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                ANTLRInputStream input = null;
                try
                {
                    input = new ANTLRInputStream(is);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                CMMLexer lexer = new CMMLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CMMParser parser = new CMMParser(tokens);
                ParseTree tree = parser.file();
                output.setText(tree.toStringTree(parser));
                System.out.println(tree.toStringTree(parser));
                fileName.setText("");
            }
            System.out.println("词法分析");
        }else if(ae.getSource() == chooseBtn) {
            input.setText("");
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            chooser.showDialog(new JLabel(), "选择");
            File file = chooser.getSelectedFile();
            fileName.setText(file.getAbsoluteFile().toString());
            System.out.println("选择文件");
        }
//        else if((ae.getSource() == interBtn2) && (!input.getText().equals(""))) {
//            System.out.println("语法分析");
//        }
    }

//    public static void main(String args[]) {
//        CmmInterface ci = new CmmInterface();
//    }
}
