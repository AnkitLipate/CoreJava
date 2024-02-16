package p2;

import static utils.CollectionUtils.populateData;

import java.util.List;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;
public class Test4 {

	public static void main(String[] args) {
		/*
		 * 4.Display all product name of perticular category, exceding specific 
		 * price I/P category name & price. (Stream, filter, forEach) eg: productList : 
		 * List<Product>
		 */
		try(Scanner sc = new Scanner(System.in)){
			List<Product> list = populateData();
			System.out.println("Original List");
			list.forEach(System.out::println);
			System.out.println("Enter Category and price");
			Category category = Category.valueOf(sc.next().toUpperCase());
			double price = sc.nextDouble();
			System.out.println("Filter list of Products");
			//get lis of products
			list.stream()//Stream<Product> : all Products
			.filter(p -> p.getProductCategory()==category)//filtered by category
			.filter(p ->p.getPrice()>price)//filtered by price
			//.forEach(System.out::println);
			.forEach(p -> System.out.println(p.getName()));			
		}

	}

}
