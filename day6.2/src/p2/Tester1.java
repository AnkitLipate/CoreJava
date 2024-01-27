package p2;

public class Tester1 {

	public static void main(String[] args) {
		
		Printable printer; //ref type var -- i/f type ref.
		printer = new ConsolePrinter();//up casting 
		printer.print("1st mesg");//run time poly(Dynamic method dispatch) : instance of ConsolePrinter
		printer = new FilePrinter();//up casting 
		printer.print("1st mesg");//run time poly(Dynamic method dispatch) : instance of FilePrinter
		printer = new NetworkPrinter();//up casting 
		printer.print("1st mesg");//run time poly(Dynamic method dispatch) : instance of NetworkPrinter
	}

}
