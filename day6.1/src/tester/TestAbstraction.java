package tester;

import javax.swing.plaf.basic.BasicTextAreaUI;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class TestAbstraction {

	public static void main(String[] args) {
//		BoundedShape[] shapes = new BoundedShape[3];// array of refs of type of bounded shape
//		shapes[0] = new Circle(0, 0, 0);
//		int[] data = new int[] {1,2,3,4,5,6};
		// dynamic int array
		BoundedShape[] shapes = { new Circle(50, 100, 5.6), new Circle(10, 20, 10.5),
				new Rectangle(45, 50, 10.0, 5.8) };// 4 objects (1 array,c1, c2,r1)
		// diplay complete details of each shape + area
		for (BoundedShape s : shapes)
			System.out.println(s + " Area " + s.area());// 1st iteration : toString area : circle last itr : Rect run
														// time poly. 

	}
}
