package Test;

import static org.junit.Assert.assertEquals;

import java.io.*;

import CMM.*;

import SemanticAnalysis.DefPhase;
import SemanticAnalysis.VisitPhase;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SemanticTest {
    String resourceDict;
    String resourceName;
    String expectedFile;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    public SemanticTest(String resourceDict, String resourceName, String expectedFile) {
        this.resourceDict = resourceDict;
        this.resourceName = resourceName;
        this.expectedFile = expectedFile;
    }

    private void semanticTest() throws Exception {
        String inputFile = resourceDict + "/" + resourceName;
        InputStream is = new FileInputStream(inputFile);
        if(is == null) {
            throw new RuntimeException("Resource not found: " + resourceName);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        CMMLexer lexer = new CMMLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CMMParser parser = new CMMParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        DefPhase defPhase = new DefPhase();
        walker.walk(defPhase, tree);

        VisitPhase visitPhase = new VisitPhase();
        visitPhase.visit(tree);
    }

    @Test
    public void PassedTest() throws Exception {
        System.out.println("Test (Source File: " + resourceName + ") ...");

        // 输出重定向到outContent中
        setUpStreams();
        semanticTest();
        // 输出重定向复原
        restoreStreams();

        String expected = readFile(resourceDict + "/" + expectedFile, "\r\n");
        assertEquals(expected, outContent.toString());
        System.out.print(outContent.toString());
        System.out.println("--- PASS ---");
    }

    @Test
    public void FailedTest() throws Exception {
        System.out.println("Test (Source File: " + resourceName + ") ...");

        // 输出重定向到errContent中
        setUpStreams();
        semanticTest();
        // 输出重定向复原
        restoreStreams();

        String expected = readFile(resourceDict + "/" + expectedFile, "\n");
        assertEquals(expected, errContent.toString());
        System.out.print(errContent.toString());
        System.out.println("--- PASS ---");
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    // 读取期望输出
    // System.out换行符为"\r\n", System.err换行符为"\n"
    public String readFile(String fileName, String linefeed) {
        //读取文件
        BufferedReader br = null;
        StringBuffer sb = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"GBK"));
            sb = new StringBuffer();
            String line = null;
            while((line = br.readLine()) != null) {
                sb.append(line + linefeed);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String s = new String(sb);
        return s;
    }
}
