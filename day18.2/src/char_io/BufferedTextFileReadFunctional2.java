package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedTextFileReadFunctional2 {

	/*
	 * Read data from text file using buffer, till EOF(end of file), filter lines
	 * having line length>50 upper case connects and display it.
	 * br-->stream(lines)--->filter ---> map---> forEach
	 */
	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <--- BR <--- FR <--- Text File
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			br.lines() //Stream<String>
			.filter(s -> s.length()>50) //Stream<String> : filtered
			.map(String::toUpperCase)//Stream<String> : maped to upper case : s -> s.toUpperCase()
			.forEach(System.out::println);
			System.out.println("Data Read Over");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main Over...");

	}

}
