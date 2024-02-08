package inner_class;

public class Test {

	public static void main(String[] args) {
		// invoke inner class's instance method : innerShow()
//		B b1 = new B(12345);
		A.B innerRef = new A(11).new B(22);
		innerRef.innerShow();
	}

}
