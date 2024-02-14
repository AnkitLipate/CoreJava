package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.app.cms.Customer;
import com.app.cms.customerPlan;
import static utils.CollectionUtils.authenticateCustomer;
import custom_exceptions.CustomerHandlingException;

public class CustomerManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// empty map to store customer details
			HashMap<String, Customer> customerMap = new HashMap<>();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options 1.Register Customer 2.Display Register customer details 3.Customer Login "
						+ "7.Display senior citizen 100.Exit");
				System.out.println("Choose an Option");
				try {
					switch (sc.nextInt()) {
					case 1:// user reg
						System.out.println("Enter Customer Email");
						String email = sc.next();
						if (customerMap.containsKey(email))
							throw new CustomerHandlingException("Dup Email ID, Choose a new one!!!!");
						// =>new Email
						System.out.println("Enter name, password, plan, dob(yr-mon-day), regAmount");
						customerMap.put(email,
								new Customer(sc.next(), email, sc.next(), customerPlan.valueOf(sc.next().toUpperCase()),
										LocalDate.parse(sc.next()), sc.nextDouble()));
						System.out.println("Customer Registered Successful...!!!!");
						break;
					case 2:
						System.out.println("All Customer Details");
						for(Customer c : customerMap.values())
							System.out.println(c);
						break;
					case 3://login
						System.out.println("Enter customer email n password for login");
						Customer c = authenticateCustomer(sc.next(),sc.next(),customerMap);
						System.out.println("Login Successful, your Details : "+c);
						break;
					case 7://Display senior citizen details(i.e. customer age>60 yrs)
						//convert map---> Collection view
						for(Customer c1: customerMap.values())
							if(c1.getAge() >60)
								System.out.println(c1);
						break;
					case 100:
						exit = true; 
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
