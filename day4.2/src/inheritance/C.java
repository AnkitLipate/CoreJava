package inheritance;

public class C extends B {
	C()
	{
//		super(); //javac implicitly add super()--> a call to immediate super's class's constructor 
	System.out.println("3");
	}
}
