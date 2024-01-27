package p1;

public class Tester3 {

	public static void main(String[] args) {
		ConsolePrinter printer = new ConsolePrinter();//dir ref
		printer.print("Hello, How are you doing");
		Printable reference; //ref type var -- i/f type ref.
		//can you create instance of i/f ? NO
		reference = printer;//up casting i/f ref var --->ANY of it's impl. class instance : indirect ref.
		reference.print("new mesg..!!!");//JVM invokes : @run time : print() on which instance -- consolePrinter
	}

}
