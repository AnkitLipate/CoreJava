package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedTextFileRead {

	public static void main(String[] args) {
		System.out.println("Enter src file name");
		System.out.println("Enter destination file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <--- BR <--- FR <--- Src Text File
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				//Java App---> PW --->FW ---> dest text file
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine(), true)) //apend mode
				) {
			br.lines() //Stream<String>
			.forEach(s -> pw.println(s)); //pw::println
			System.out.println("Data Read Over");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main Over...");

	}

}
