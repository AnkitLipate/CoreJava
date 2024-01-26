package tester;

import java.util.Scanner;
import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many fruits you want to add in fruitBasket: ");
		Fruit[] basket = new Fruit[sc.nextInt()];

		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("Option 1.Add Mango 2.Add Apple 3.Add Orange 4.Display All Fruits "
					+ "5.Display test method of fruits in basket 0.Exit");
			System.out.println("choose Option");

			switch (sc.nextInt()) {
			case 1:// add mango
				if (counter >= 0 && counter < basket.length) {
					System.out.println("Enter Mango Details: color, weight ");
					basket[counter++] = new Mango(sc.next(), sc.nextDouble());
				} else
					System.out.println("Basket Full...!!!");
				break;

			case 2:// add apple
				if (counter < basket.length) {
					System.out.println("Enter Apple Details: color, weight ");
					basket[counter++] = new Apple(sc.next(), sc.nextDouble());
				} else
					System.out.println("Basket Full...!!!");
				break;
			case 3:// add orange
				if (counter < basket.length) {
					System.out.println("Enter Orange Details: color, weight ");
					basket[counter++] = new Orange(sc.next(), sc.nextDouble());
				} else
					System.out.println("Basket Full...!!!");
				break;

			case 4:// diplay fruits
				for (Fruit f : basket)
					if (f != null)
						System.out.println(f);
				break;
			case 5:// Display test method of fruits in basket
				for (Fruit f : basket)
					if (f != null)
						System.out.println(f.taste());
				break;
			case 0:// exit
				exit = true;
				break;
			}
		}

	}

}
