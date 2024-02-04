package tester;

public class TestFinally3 {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			testMe();
			System.out.println("back in main");
		} catch (Exception e) {
			System.out.println("in main's catch all " + e);
		} finally {
			System.out.println("in main's finally");
		}
		System.out.println("main over...!!!");
	}

	private static void testMe() throws InterruptedException {
		try {
			System.out.println("in methods try");
			String[] ss = { "aa", "bb" };
			Thread.sleep(5000);// javac forces handling of the chked exc
			System.out.println(ss[1]);
			boolean flag = true;
			if (flag)
				return;
			System.out.println("End of try......");
		} finally {
			System.out.println("in method's finally...");
		}
		System.out.println("method End....");
	}

}
