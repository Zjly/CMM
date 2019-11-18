import CMM.CMMLexer;
import CMM.CMMParser;
import SemanticAnalysis.DefPhase;
import SemanticAnalysis.Scope.Output;
import SemanticAnalysis.VisitPhase;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainTest {
	public static void main(String[] args) throws IOException {
		String inputFile = "./src/DemonstrationProgram/demo9.c";
		InputStream is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		CMMLexer lexer = new CMMLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CMMParser parser = new CMMParser(tokens);
		parser.setBuildParseTree(true);
		ParseTree tree = parser.file();

		ParseTreeWalker walker = new ParseTreeWalker();
		DefPhase defPhase = new DefPhase();
		walker.walk(defPhase, tree);

//		VisitPhase visitPhase = new VisitPhase();
//		visitPhase.visit(tree);

		if(Output.error.isEmpty()) {
			try {
				VisitPhase visitPhase = new VisitPhase();
				visitPhase.visit(tree);
			} catch(Exception e) {
				System.err.println("程序发生错误, 类型为: " + e);
			}
		}
	}
}
