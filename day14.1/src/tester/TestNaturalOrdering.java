package tester;
import static utils.CollectionUtils.populatedList;

import java.util.ArrayList;
import java.util.Collections;

import com.app.core.Customer;
public class TestNaturalOrdering {

	public static void main(String[] args) {
		try {
		// get list of populated customers from utils
		ArrayList<Customer> customers = populatedList();
		System.out.println("Original List");
		for(Customer c: customers)
			System.out.println(c);
		//Natural Ordering
		Collections.sort(customers);
		System.out.println("Sorted list of customer as per email");
		for(Customer c: customers)
			System.out.println(c);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
