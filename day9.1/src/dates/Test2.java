package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws ParseException{
		try(Scanner sc = new Scanner(System.in)){
			//1:create instance of  SDF -- date based pattern
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Enter join date of the 1st emp(day-mon-yr)");
			Date joinDate1 = sdf.parse(sc.next());
			System.out.println("Enter join date of the 2st emp(day-mon-yr)");
			Date joinDate2 = sdf.parse(sc.next());
			//display which of them is senior emp?
			if(joinDate1.before(joinDate2))
				System.out.println("Emp 1 is senior");
			else
				System.out.println("Emp 2 is senior");
			System.out.println("toString of Date "+joinDate1);
			System.out.println("formatted date String "+sdf.format(joinDate1));
			
		}//sc.close();
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main continues....");

	}

}
