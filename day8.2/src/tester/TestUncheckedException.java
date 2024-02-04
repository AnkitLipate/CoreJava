package tester;

public class TestUncheckedException {

	public static void main(String[] args) {
		String s = "123abc";
		System.out.println(Double.parseDouble(s));// NumberFormatException : un checked exception
		System.out.println("code continue.....");

	}

}
