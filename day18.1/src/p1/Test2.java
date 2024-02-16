package p1;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		//integer list of fixedd size
		List<Integer> list = Arrays.asList(10,23,1,2,3,456);
		//display the elements using lambda expression
		System.out.println("Printing list via lambda expression");
		list.forEach(i -> System.out.println(i));
		System.out.println("printing list via method reference");
		//can above lambda expression be replace by method ref? YES
		list.forEach(System.out::println);
		System.out.println("Printing list on the same line via lambda expression");
		list.forEach(i -> System.out.print(i+" "));
		//can above lambda expression be replace by method ref? NO!!!

	}

}
