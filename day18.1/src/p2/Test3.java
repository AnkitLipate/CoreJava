package p2;

import java.util.stream.IntStream;

public class Test3 {

	public static void main(String[] args) {
		//3.create Stream of ints between 1-100 & display all even elements
		//(Hint : IntStream methods  -- range, filter, forEach)
		
		System.out.println("Even nos in 1-100");
		IntStream.range(1, 101)//IntStream 1-100
		.filter(i -> i%2==0)//IntSream even element bet 1-100
		.forEach(i -> System.out.print(i+" "));

	}

}
