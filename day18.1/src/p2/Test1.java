package p2;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		//1.create int[] --->IntStream & display its contents.
		int[] data = {10,23,45,12,11,90,-89};
		//API Help
		//Arrays Class method
		//public IntStream stream(int[] ints)
		//IntStream method : public void forEach(IntConsumer consumer)
		//stream : src --- intermediate ops(0..n)--- terminal op
		System.out.println("printing array contents --->IntStream --> forEach -- lambda exp");
		Arrays.stream(data)//IntStream : scr
		.forEach(i -> System.out.println(i)); //terminal operation
		System.out.println("printing array contents --->IntStream --> forEach -- method ref");
		Arrays.stream(data)//IntStream : scr
		.forEach(System.out::println);
	}

}
