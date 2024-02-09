package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		int[] ints = {10,12,2,3,34,-10,20,30,10};
		//create Empty AL n populate it array data
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : ints)
			list.add(i);//auto boxing
		System.out.println("Display list via toString "+list);
		//can you attache an iterator to the AL? YES, implicit form of iterator: for-each
		for(int i : list)//Integer ----> int  auto done by javac : auto un boxing
			System.out.print(i+" ");//for-each iterates over size of the collection
		//double value of elem if elem>20
		System.out.println("doubling the values");
		for(int i=0; i<list.size(); i++)
			if(list.get(i)>20)
				System.out.println("Replaced "+list.set(i, list.get(i)*2));
		System.out.println("list again "+list);
		list.remove(1);
		System.out.println("List after remove "+list);//[10, 2, 3, 68, -10, 20, 60, 10]
		ArrayList<Integer> list2 = new ArrayList<>();
		int[] ints2 = {11,10,2,3};
		for(int i : ints2)
			list2.add(i);
		System.out.println("List 2 "+list2);
		list.retainAll(list2);
		System.out.println("List after Retains All: "+list);//[10, 2, 3, 10]
		list.add(0, 10);
		System.out.println("index: "+list.indexOf(10)+" Last index: "+list.lastIndexOf(10));
		list.add(112);
		list.add(50);
		list.add(-19);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
			
		

	}

}
