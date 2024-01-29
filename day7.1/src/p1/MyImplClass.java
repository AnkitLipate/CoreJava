package p1;

public class MyImplClass implements Computable, Printable{
	
	@Override
	public void print(String mesg) {
		System.out.println("Print a mesg "+mesg);
	}

	@Override
	public double compute(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	//add new method
	public void test()
	{
		System.out.println("in test");
	}
}
