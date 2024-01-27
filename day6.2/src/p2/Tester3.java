package p2;

public class Tester3 {

	public static void main(String[] args) {
		//up casting
		Printable[] printables = {new NetworkPrinter(), new FilePrinter(), new ConsolePrinter()};// Array holding 
		//i/f type of refs, FP, CP, NP
		for(Printable p : printables){//p = printables[0]
			p.print("some Mesg...!!!");//DMD (Dynamic method dispatch)
		if(p instanceof NetworkPrinter)
			((NetworkPrinter)p).encryptData("mesg to be coded");
		else
			System.out.println("can't encrypt data!!!!!");
		}
	}

}
