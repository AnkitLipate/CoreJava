package test_static;

import static java.lang.System.out;

public class Test1 {
	public static int testData;
	static {
		System.out.println("1");
		testData = 100;
	}
	static {
		System.out.println("2");
		testData++;
		test();
	}
	// non static init box
	{
		System.out.println("in non-satic (instance) initializer block ");
	}
	public static void main(String[] args) {
//	    int testData  = 1234;
//	    System.out.println("local vaiable "+testData);
		out.println("in main : static variable " + testData);
		
		Test1 ref = new Test1();
		Test1 ref2 = new Test1();
	}
	
//	private void show()
//	{
//		out.println("in show : non-static method");
//	    test();
	
//	}
	private static void test() {
		out.println("in test : static method" + testData);
		testData++;
	}  
}
