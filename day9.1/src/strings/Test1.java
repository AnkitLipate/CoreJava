package strings;

public class Test1 {

	public static void main(String[] args) {
		// testing immutable of the String
		String s1 = new String("hello");
		String s2 = s1.concat("hi!");
		System.out.println(s1);
		System.out.println(s2);
		s1 += "12345";
		System.out.println(s1);
		System.out.println(s2.toUpperCase());// HELLOHI!
		System.out.println(s2);// hellohi!
		//replace all occurances of 'l' in s2 by 't'
		String s3 = s2.replace('l', 't');
		System.out.println(s2);//orignal Sring
		System.out.println(s3);//replaced String
	}

}
