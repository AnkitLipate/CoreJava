package strings;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		// String class API
		String s1 = "Ankit";
		String s2 = "Testing String api here";
		System.out.println(s1.compareTo(s2));
		//display 1st and last char of  hte String 
		System.out.println("1st char: "+s2.charAt(0)+", Last char: "+s2.charAt(s2.length()-1));
		//print YES if s2 contain "API" else print NO
		System.out.println(s2.contains("API")?"YES":"NO");
		String s3 = new String("Java Strings are easier than Strings in c++");
		System.out.println(s3.indexOf("String")+" "+s3.lastIndexOf("String"));
		System.out.println(s2.startsWith("T"));//t
		System.out.println(s3.endsWith("+"));//t
		String s4 = "one:two:three:four";
		System.out.println(Arrays.toString(s4.split(":")));
	}

}
