package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TesterPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Point2D p1 = new Point2D(20,20);
		Point2D p2 = new Point2D(50,60);

		p1.showCordinates();
		p2.showCordinates();
		
		p1.equalsMethod();
		p1.isEqual(p2);
		
		System.out.println("The Distance b/w point p1 and p2 is: "+p1.Distance(p2));
		
		sc.close();
	}

}
