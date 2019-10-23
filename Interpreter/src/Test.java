import java.io.IOException;

public class Test {
	static String passFolder = "./src/TestCase";
	static String passFile[] = {
			"functionCall.c",
			"comment.c",
			"variable.c",
			"if.c",
			"for.c",
			"while.c",
			"final.c",
	};

	static String failFolder = "./src/ShouldFailCase";
	static String failFile[] = {
			"error1.c",
			"error2.c",
			"error3.c",
			"error4.c",
			"error5.c",
			"error6.c"
	};

	public static void main(String[] args) throws IOException {
		for(String f : passFile) {
			testFile(passFolder, f, true);
		}
		System.out.println();
		for(String f : failFile) {
			testFile(failFolder, f, false);
		}
	}

	private static void testFile(String folder, String file, Boolean passed) {
		ParameterizedTest p = new ParameterizedTest(folder, file);
		try {
			if(passed) {
				p.PassedResourceTest();
			} else {
				p.FailedResourceTest();
			}
		} catch(Exception e) {
			System.err.println(e);
		}
	}
}