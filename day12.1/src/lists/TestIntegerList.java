package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class TestIntegerList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		//create empty AL for sorting integer type of refs.
		ArrayList<Integer> list = new ArrayList<>();
		//size=0 capacity=10
		// add 10,20,30,40,50 : in the list
		for(int i=1; i<6; i++)
			list.add(i*10);// auuto boxing
		System.out.println(list);//toString of AL
		list.add(20);
		System.out.println(list);
		list.add(20);
		System.out.println(list);
		list.add(null);
		list.add(0, null);
		System.out.println(list);
		System.out.println("size of ArrayList = "+list.size() );
		//Display present if the list contains specified element  o.w print absent
		System.out.println("Enter the element to search");
		System.out.println(list.contains(sc.nextInt())?"Present":"Absent");
		}
	}

}
