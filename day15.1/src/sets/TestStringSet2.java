package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestStringSet2 {

	public static void main(String[] args) {
		// create empty HashSet to store String type of ref
		HashSet<String> stringSet = new HashSet<>();//size=0, initCapa=16, load factor=0.75
		String s1 = new String("abc");
		String s2 = new String("xyz");
		String s3 = new String("pqrst");
		String s4 = new String("ztr");
		String s5 = new String("xyz");
		System.out.println("Added "+stringSet.add(s1));//t
		System.out.println("Added "+stringSet.add(s2));//t
		System.out.println("Added "+stringSet.add(s3));//t
		System.out.println("Added "+stringSet.add(s4));//t
		System.out.println("Added "+stringSet.add(s5));//f
		System.out.println("size of the set "+stringSet.size());//4
		System.out.println(stringSet);//no dup, un ordered, un sorted set impl class
		
	}

}
