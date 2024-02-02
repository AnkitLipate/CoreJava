package tester;

public class TestExcHandling {

	public static void main(String[] args) {
		try {
		int a=100;
		int b=10;
		System.out.println("Result "+(a/b));//java.lang.arithmaticException
		System.out.println("End of try...!!!!");
		}catch (ArithmeticException e) {
			System.out.println("Exception Occured");
		}
		System.out.println("Main over....");

	}

}
