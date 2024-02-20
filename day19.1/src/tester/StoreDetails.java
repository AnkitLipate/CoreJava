package tester;

import static utils.CollectionUtils.*;
import static utils.IOUtils.storeProductDetails;

import java.util.Scanner;
public class StoreDetails {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter bin file name to store product details");
			storeProductDetails(populateMapFromList(populateData()), sc.nextLine());
			System.out.println("product stored.....");
		}catch (Exception e) {
			e.printStackTrace(); 	
		}

	}

}
