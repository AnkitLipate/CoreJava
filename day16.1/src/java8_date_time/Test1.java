package java8_date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			//create DateTimeFormatter instance
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
			// create current date w/o time or time zone
			LocalDate d1 = LocalDate.now();
			System.out.println(d1);//toString of LocalDate : ret formatted date
			//Local date corresponding to 31st Dec 2020
			LocalDate d2 = LocalDate.of(2020, 12, 31);
			System.out.println("Enter join date of the Emp: yr-mon-day");
			LocalDate joinDate = LocalDate.parse(sc.next());
			System.out.println("join date: "+joinDate);
			System.out.println("Enter join date of the emp : day-mon-yr");//13-6-2022
			LocalDate joinDate2 = LocalDate.parse(sc.next(), formatter);
			System.out.println(joinDate);
			//Display who is more senior?
			System.out.println("Senior Emp : "+(joinDate.isBefore(joinDate2)?"1st Emp": "2nd Emp"));
			System.out.println("Enter manufacturing Date of Bread : yr-mon-day");
			//dislay expiry date after 3 days												
			System.out.println("Bread Expiry Date: "+LocalDate.parse(sc.next()).plusDays(3));
		}
	}

}
