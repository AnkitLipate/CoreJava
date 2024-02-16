package p2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		//2. create AL<Integer>, populate it convert it to seq stream & display element
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,23,45,12,11,90,-89));
		System.out.println("Attaching a seq  stream to a list --> displaying elements");
		//attach seq stream 
		//Collection i/f method : Stream<T> stream()
		list.stream()//Stream<Integer>
		.forEach(i -> System.out.print(i+" "));
		
		System.out.println("Attaching a stream for parallel processing, to a list --> displaying elements");
		//attach seq stream 
		//Collection i/f method : Stream<T> parallelStream()
		list.parallelStream()//Stream<Integer>
		.forEach(i -> System.out.print(i+" "));

	}

}
