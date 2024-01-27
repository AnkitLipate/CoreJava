package p2;

public class Tester2 {

	public static void main(String[] args) {
		//up casting
		Printable[] printables = {new FilePrinter(), new ConsolePrinter(), new NetworkPrinter()};// Array holding 
		//i/f type of refs, FP, CP, NP
		for(Printable p : printables)//p = printables[0]
			p.print("some Mesg...!!!");//DMD (Dynamic method dispatch)

	}

}
