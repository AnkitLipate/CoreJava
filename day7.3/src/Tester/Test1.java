package Tester;

import java.util.Scanner;
import com.app.vehicle.*;
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st vehicle details: regNo, color, price");
		Vehicle vehicle1 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
		System.out.println("Enter 2nd vehicle details: regNo, color, price");
		Vehicle vehicle2 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
		//test equality of 2 vehicles
		System.out.println(vehicle1.equals(vehicle2));//using inherited form of equals: based upoun ref equality
		//method to display internal representation of the address
//		System.out.println(vehicle1.hashCode()+" "+vehicle2.hashCode());
//		System.out.println(vehicle1 == vehicle2);
		//System.out.println(vehicle1.equals(sc));
		sc.close();
	}

}
