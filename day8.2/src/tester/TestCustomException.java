package tester;

import static utils.ValidationRules.validateSpeed;

import java.util.Scanner;

import custom_exceptions.SpeedOutOfRangeException;

public class TestCustomException {

	public static void main(String[] args) /*throws SpeedOutOfRangeException*/ {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter speed");
			validateSpeed(sc.nextInt());
			System.out.println("End of try");
		}catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("end of main");
	}

}
