package tester;

public class Tester1 {
	public static void main(String[] args) {
		try {
			System.out.println("in main");
			int c = 100 / 10;
			System.out.println("Result " + c);
			String s = "a1234";
			System.out.println("parsed int value " + Integer.parseInt(s));// NFE
			s = "Ankit";
			System.out.println("Char at 0th index: " + s.charAt(0));// NPE
			int[] data = { 1, 2, 3, 4, 5 };
			System.out.println("array data " + data[5]);// AIOB
			System.out.println("end of try");
//		} catch (ArithmeticException e) {
//			System.out.println("1");
//		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
//			System.out.println("2");
		} catch (Exception e) {
			System.out.println("in catch - all");
			System.out.println(e.getMessage());//detailed err msg 
			System.out.println(e);// toString
			e.printStackTrace();
		}
		System.out.println("main Over");
	}
}
