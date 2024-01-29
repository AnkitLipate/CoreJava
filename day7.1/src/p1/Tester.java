package p1;

public class Tester {

	public static void main(String[] args) {
		Printable printable = new MyImplClass();//up casting 
		printable.print("Some Mesg");
		Computable ref = new MyImplClass();
		System.out.println("Result "+ref.compute(10, 20));
		((MyImplClass)ref).test();
	}

}
