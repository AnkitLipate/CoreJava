package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedFileCopyFunctional {

	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <--- BR <--- FR <--- Text File
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			br.lines()
			.forEach(System.out::println);
			System.out.println("Data Read Over");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main Over...");

	}

}
