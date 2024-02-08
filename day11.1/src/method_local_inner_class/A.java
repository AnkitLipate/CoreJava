package method_local_inner_class;

public class A {

	private int i;

	public A(int i) {
		super();
		this.i = i;
	}
	//add method to embed, entire inner class definition
	public void test(){
		int data = 100;
		System.out.println("In Test method");
		//method local inner class def.
		class B{
			private int j;

			public B(int j) {
				super();
				this.j = j;
			}
			void show() {
				System.out.println("from show "+j+" "+data+" "+i);
			}
		}//method local inner class over
		//how to uinvoke inner's show()
		B b1 = new B(1234);
		b1.show();
	}//test method over
	public void test2() {
		//can you access class B from hre? NO
//		B b1 = new B(123);
		
	}
}
