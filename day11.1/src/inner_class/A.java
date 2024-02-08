package inner_class;

public class A {

	private int i;
	private static int j;
	static {
		j=100;
	}
	public A(int i) {
		this.i = i;
	}
	//add static method 
	public static void show() {
		System.out.println("in static method show, j= "+j);
	}
	
	//add non static (instance) method 
	public void print() {
		System.out.println("in non-static print:: i="+i+" j= "+j);
		//can outer class's non static method access private inner class members? :NO
		//System.out.println("inner's members "+k+" "+l);
		System.out.println("inner's static data members "+B.k);
		//create inner class instance
		B b1 = new B(12);
		System.out.println("inner's non static data members : "+b1.l);
	}
	//can you add nested class def? YES --non static nested class : inner class
	class B{
		//can you add static data memeber in the inner class ? NO
//		private static int k;
		//JDK 1.8 onwards : can declare static final data member : YES
		private static final int k=1234;
		//can you declare non static (instance) data member? : YES
		private int l;
//		static {
//			
//		}
		//can u declare static method in inner class ? NO
//		public static void test() {
//			
//		}
		
		//can you add contr/s in the inner class : YES
		public B(int l) {
			this.l = l;
		}
		//cn you add non static method in the inner class ? YES
		public void innerShow() {
			//what  all u can access directly from inner's method: outer as well as inner class members : DIRECTLY
			System.out.println("from inner's show "+i+" "+j+" "+k+ " "+l);
			
		}
	}
}
