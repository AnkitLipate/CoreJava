package utils;

import static com.app.core.Customer.sdf;

import java.text.ParseException;
import java.util.ArrayList;

import com.app.core.Customer;

public class CollectionUtils {

	//add static method to return populated list of customers
	public static ArrayList<Customer> populatedList() throws ParseException
	{
		//create empty List
		ArrayList<Customer> customers = new ArrayList<>();
		//String name, String email, String password, Date dob, double regAmount
		customers.add(new Customer("Rama", "rama@gmail.com", "12345", sdf.parse("12-5-1993"), 500));
		customers.add(new Customer("Kiran", "kiran@gmail.com", "98764", sdf.parse("1-5-1992"), 600));
		customers.add(new Customer("Amit", "amit@gmail.com", "65433", sdf.parse("12-10-1992"), 550));
		customers.add(new Customer("Suraj", "suraj@gmail.com", "14777", sdf.parse("1-5-1992"), 590));
		customers.add(new Customer("Rekha", "rekha@gmail.com", "95174", sdf.parse("1-5-1992"), 790));
		return customers;
	}
}
