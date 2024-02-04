package strings;

public class Test5 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println("length " + sb1.length() + " capacity " + sb1.capacity());// length 5 capacity 21
		sb1.append(true);
		sb1.append(123.45);
		StringBuilder sb2 = sb1.append(345673452461l);
		System.out.println(sb1);// sb1.toString hellotrue123.45345673452461
		System.out.println(sb2);// hellotrue123.45345673452461
		System.out.println(sb1 == sb2);// t
		System.out.println("length " + sb1.length() + " capacity " + sb1.capacity()); // length 27 capacity 44
		sb1.insert(2, 9999);
		System.out.println(sb1);// he9999llotrue123.45345673452461
		sb2.delete(1, 4);
		System.out.println(sb1);// h99llotrue123.45345673452461
		sb1.reverse();
		System.out.println(sb1);// reverse content
		StringBuilder sb3 = new StringBuilder("testing 123");
		StringBuilder sb4 = new StringBuilder("testing 123");
		System.out.println(sb3 == sb4);// false based upoun ref equality
		System.out.println(sb3.equals(sb4));// false: based upoun ref equality(since sb class HAS 
		                                                        //NOT OVERRIDING method

	}

}
