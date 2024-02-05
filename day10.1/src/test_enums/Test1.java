package test_enums;

import java.util.Arrays;
import java.util.Scanner;
import static test_enums.Department.*;
public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("valid departments to choose  from : "+Arrays.toString(values()));
			System.out.println("Enter dept name");
			Department selectedDepartment = valueOf(sc.next().toUpperCase());
			//=>parsing (String ---> Enum) : success
			System.out.println("You choose "+selectedDepartment);
		}catch (Exception e) {
			e.printStackTrace();	
			
		}

	}

}
