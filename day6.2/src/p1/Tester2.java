package p1;
import static p1.Printable.TEST_DATA;

public class Tester2 {

	public static void main(String[] args) {
		ConsolePrinter printer = new ConsolePrinter();
		printer.print("Hello, How are you doing");
		// can tester(non-impl class) access i/f constatnt? YES
		//system.out.println("i/f constant "+Printable.TEST_DATA);
		System.out.println("i/f constatnt "+TEST_DATA);
	}

}
