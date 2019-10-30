package SemanticAnalysis.Scope;

import org.antlr.v4.runtime.Token;
import sun.misc.Queue;

public class Output {
	public static Queue<String> q = new Queue<>();
	public static Queue<String> output = new Queue<>();

	/**
	 * 输出
	 * @param msg 输出信息
	 */
	public static void output(String msg) {
		System.out.print(msg);
		output.enqueue(msg);
	}

	/**
	 * 错误打印
	 *
	 * @param t   token
	 * @param msg 错误信息
	 */
	public static void error(Token t, String msg) {
		System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
		q.enqueue("line " + t.getLine() + ": " + msg);
	}
}
