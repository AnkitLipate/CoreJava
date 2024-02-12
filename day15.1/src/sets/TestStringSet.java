package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestStringSet {

	public static void main(String[] args) {
		// create empty HashSet to store String type of ref
		HashSet<String> stringSet = new HashSet<>();//size=0, initCapa=16, load factor=0.75
		System.out.println("Added "+stringSet.add("abc"));//t
		System.out.println("Added "+stringSet.add("xyz"));//t
		System.out.println("Added "+stringSet.add("pqrst"));//t
		System.out.println("Added "+stringSet.add("ztr"));//t
		System.out.println("Added "+stringSet.add("xyz"));//f
		System.out.println("size of the set "+stringSet.size());//4
		System.out.println(stringSet);//no dup, un ordered, un sorted set impl class
		//contains : inherited method from Collection i/f
		System.out.println("exists "+stringSet.contains("xyz"));//t
		//remove
		System.out.println("remove "+stringSet.remove("xyz"));//t
		System.out.println(stringSet);
		System.out.println("exists "+stringSet.contains("xyz"));//f
		//wil you be able to attached for-each to the set? YES
		System.out.println("printing the set contents using for-each");
		for(String s: stringSet)
			System.out.println(s+" ");
		//will you be able to atached Iterator to the set? YES
		//remove all the elements of the set, having String length>3
		//Hint:Iterator's remove method 
		//what will happen if u try it with for-each
//		for(String s: stringSet)
//			if(s.length()>3)
//				stringSet.remove(s);
//		System.out.println("set after remove "+stringSet);
		//1.attached Iterator
		Iterator<String> itr = stringSet.iterator();
		while(itr.hasNext())
			if(itr.next().length()>3)
				itr.remove();
		System.out.println("set after remove "+stringSet);
	}

}
