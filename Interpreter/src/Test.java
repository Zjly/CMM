import java.io.IOException;
import Test.*;

public class Test {
	static String passFolder1 = "./src/Test/ParameterizedTestCase";
	static String passFile1[] = {
			"functionCall.c",
			"comment.c",
			"variable.c",
			"if.c",
			"for.c",
			"while.c",
			"final.c",
	};

	static String failFolder1 = "./src/Test/ParameterizedShouldFailCase";
	static String failFile1[] = {
			"error1.c",
			"error2.c",
			"error3.c",
			"error4.c",
			"error5.c",
			"error6.c"
	};

	static String passFolder2 = "./src/Test/SemanticTestCase";
	static String passFile2[][] = {
			{"scope.c", "scope.txt"}
	};

	static String failFolder2 = "./src/Test/SemanticShouldFailCase";
	static String failFile2[][] = {
			{"error1.c", "error1.txt"},
			{"error2.c", "error2.txt"},
			{"error3.c", "error3.txt"},
			{"error4.c", "error4.txt"},
			{"error5.c", "error5.txt"},
			{"error6.c", "error6.txt"},
			{"error7.c", "error7.txt"},
			{"error8.c", "error8.txt"},
			{"error9.c", "error9.txt"},
	};

	static String passFolder3 = "./src/Test/Example";
	static String passFile3[][] = {
			{"assign.c", "assign.txt"},
			{"expression.c", "expression.txt"},
			{"if.c", "if.txt"},
			{"while.c", "while.txt"},
			{"for.c", "for.txt"},
			{"array.c", "array.txt"},
			{"hanoi.c", "hanoi.txt"},
	};

	public static void main(String[] args) throws IOException {
		// 词法+语法分析测试
		System.out.println("词法+语法分析测试:");
		for(String f : passFile1) {
			testParameterized(passFolder1, f, true);
		}
		System.out.println();
		for(String f : failFile1) {
			testParameterized(failFolder1, f, false);
		}
		System.out.println();

		// 类型和作用域测试
		System.out.println("类型和作用域测试:");
		for(String[] filePair : passFile2) {
			testSemantic(passFolder2, filePair, true);
		}
		System.out.println();
		for(String[] filePair : failFile2) {
			testSemantic(failFolder2, filePair, false);
		}
		System.out.println();

		// 程序的正确性测试
		System.out.println("程序的正确性测试:");
		for(String[] filePair : passFile3) {
			testExecute(passFolder3, filePair);
		}
		System.out.println();
	}

	private static void testParameterized(String folder, String file, Boolean passed) {
		ParameterizedTest test = new ParameterizedTest(folder, file);
		try {
			if(passed) {
				test.PassedResourceTest();
			} else {
				test.FailedResourceTest();
			}
		} catch(Exception e) {
			System.err.println(e);
		}
	}

	private static void testSemantic(String folder, String[] filePair, Boolean passed) {
		SemanticTest test = new SemanticTest(folder, filePair[0], filePair[1]);
		try {
			if(passed) {
				test.PassedTest();
			} else {
				test.FailedTest();
			}
		} catch(Exception e) {
			System.err.println(e);
		}
	}

	private static void testExecute(String folder, String[] filePair) {
		ExecuteTest test = new ExecuteTest(folder, filePair[0], filePair[1]);
		try {
			test.PassedTest();
		} catch(Exception e) {
			System.err.println(e);
		}
	}
}
