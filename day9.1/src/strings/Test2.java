package strings;

public class Test2 {

	public static void main(String[] args) {
		// == vs equals
		String s1 = new String("testing12345");
		String s2 = new String("testing12345");
		System.out.println(s1==s2);//refs equality : false
		System.out.println(s1.equals(s2));// equals inherited from java.lang.Object-- has String class overriding
		String s3 = new String("TESTING12345");
		System.out.println(s1==s3);//f
		System.out.println(s1.equals(s3));//f
		System.out.println(s1.equalsIgnoreCase(s3));//t

	}

}
