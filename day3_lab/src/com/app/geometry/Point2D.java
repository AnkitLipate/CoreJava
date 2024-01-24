package com.app.geometry;

public class Point2D {

	private int x;
	private int y;
	
	// parameterised constructor
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showCordinates()
	{
		System.out.println("The x coordinate is: "+this.x +" And y coordinate is :"+this.y);
	}
	
	public void equalsMethod()
	{
		if(this.x==this.y)
			System.out.println("Yes, Point coordinates are equal");
		else
			System.out.println("No, point coordinates are unequal");
	}
	
	public void isEqual(Point2D anotherPoint)
	{
		if((this.x==anotherPoint.x) && (this.y==anotherPoint.y))
			System.out.println("Yes, points are same");
		else
			System.out.println("No, points are not same");
	}
	
	public double Distance(Point2D anotherPoint)
	{
		double X = this.x-anotherPoint.x;
		double Y = this.y-anotherPoint.y;
		double m = java.lang.Math.pow(X, 2);
		double n = java.lang.Math.pow(Y, 2);
		double z= m+n;
		double Dist = java.lang.Math.sqrt(z);
		
		return Dist;
	}
}
