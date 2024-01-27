package p1;

public class ConsolePrinter implements Printable{
	//MUST implement, inherited abstract functionality
	@Override
	public void print(String mesg)
	{
		System.out.println("Printing "+mesg+" on the console");
	}
}
