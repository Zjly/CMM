package SemanticAnalysis;

import CMM.CMMLexer;
import CMM.CMMParser;
import SemanticAnalysis.Scope.Output;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sun.misc.Queue;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CheckSymbol {
	public static void main(String[] args) throws IOException {
		String inputFile = "./src/SemanticAnalysis/test.c";
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

		if(Output.q.isEmpty()) {
			VisitPhase visitPhase = new VisitPhase();
			visitPhase.visit(tree);
		}
	}
}
