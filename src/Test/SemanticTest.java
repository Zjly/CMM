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

        // 输出重定向到outContent和errContent中
        setUpStreams();
        try {
            semanticTest();
        } catch (Exception e) {
            throw e;
        } finally {
            // 输出重定向复原
            restoreStreams();
        }

        // 期望没有错误内容输出
        assertEquals("", errContent.toString());
        System.out.println("--- PASS ---");
    }

    @Test
    public void FailedTest() {
        System.out.println("Test (Source File: " + resourceName + ") ...");

        // 错误重定向到errContent中
        setUpStreams();
        try {
            semanticTest();
        } catch (Exception e) {
            // 程序本身的错误不做处理
        } finally {
            // 输出重定向复原
            restoreStreams();
        }

        // 将CMM解释器执行代码时产生的错误与期望发生的错误进行比较
        String expected = readFile(resourceDict + "/" + expectedFile);
        assertEquals(expected.trim(), errContent.toString().trim());
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
    public String readFile(String fileName) {
        //读取文件
        BufferedReader br = null;
        String s = "";
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"UTF-8"));
            String line = null;
            while((line = br.readLine()) != null) {
                if (s != "")
                    s += "\n" + line;
                else
                    s = line;
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

        if (s.startsWith("\uFEFF")){
            s = s.replace("\uFEFF", "");
        } else if (s.endsWith("\uFEFF")) {
            s = s.replace("\uFEFF", "");
        }
        return s;
    }
}
