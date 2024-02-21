package tester;

import java.util.Scanner;
import static utils.CollectionUtils.*;
import static utils.IOUtils.storeProductDetails;
public class storeProductDetails {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter file Name");
			storeProductDetails(populateMapFromList(populateData()), sc.nextLine());
			System.out.println("product stored....");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
