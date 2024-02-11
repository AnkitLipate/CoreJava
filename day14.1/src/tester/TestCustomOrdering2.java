package tester;

import static utils.CollectionUtils.populatedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.app.core.Customer;

import comparators.CustomerDobNameComparator;

public class TestCustomOrdering2 {

	public static void main(String[] args) {
		try {
			// get list of populated customers from utils
			ArrayList<Customer> customers = populatedList();
			System.out.println("Original List");
			for (Customer c : customers)
				System.out.println(c);
			// Custom Ordering
			//new Comparator<Customer>() L: instance of anno inner class which imple Comparator
			Collections.sort(customers, new Comparator<Customer>() {
				@Override 
				public int compare(Customer o1, Customer o2) {
					System.out.println("in anno inner's compare");
					int retVal = o1.getDob().compareTo(o2.getDob());
					if(retVal ==0)//=>same DOB
						return o1.getName().compareTo(o2.getName());
					return retVal;
				}
				
			});
			System.out.println("Sorted list of customer as per Dob and Name");
			for (Customer c : customers)
				System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
