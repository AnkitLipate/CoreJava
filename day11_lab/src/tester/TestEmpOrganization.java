package tester;

import static utils.ValidationRules.*;

import java.util.Date;
import java.util.Scanner;

import com.app.core.Department;
import com.app.core.Employee;
import static com.app.core.Employee.sdf;
import custom_exception.EmployeeHandlingException;

public class TestEmpOrganization {

	public static void main(String[] args) {
		// Scanner -- try with respurces
		try (Scanner sc = new Scanner(System.in)) {
			// array
			System.out.println("Enter max no of emps to hire");
			Employee[] emp = new Employee[sc.nextInt()];// array object -- all array slot inited to null
			// exit, counter
			boolean exit = false;
			int counter = 0;
			// while contains Options ---1. Hire Emp 2. Display All 3.update Emp details 10.Exit
			while (!exit) {
				try {
					System.out.println("Options 1.Hire Employee 2.Display All 3.update Emp details 4.Link Adhar Card 10.Exit");
					System.out.println("Choose option");
					// Switch case
					switch (sc.nextInt()) {
					case 1:// Hire Employee
						if (counter < emp.length) {
							System.out.println(
									"Ener Employee Details--empId, firstName, lastName, email, dept, joinDate(day/mon/year), salary");
							Employee e  = validateAllInputs(sc.nextInt(), emp, sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
									sc.nextDouble());
							emp[counter++] = e;
							System.out.println("emp hired!!!!");
						} else// throw exc err --recruitment over
							throw new EmployeeHandlingException("Recruitment Over...!!!");
						break;
					case 2:
						System.out.println("Employee Details: ");
						for (Employee e : emp)
							if (e != null)
								System.out.println(e);
						break;
					case 3:
						System.out.println("Enter empId, new dept, salary increment");
						//check if emp exists
						Employee details = getEmpDetails(sc.nextInt(), emp);
						//=>emp found, validate new dept
						Department validDept = validateDept(sc.next());
						//=>emp id and new dept : valid 
						// change dept
						details.setDept(validDept);
						//update salary
						details.setSalary(details.getSalary()+sc.nextDouble());
						System.out.println("update emp details.....");
						break;
					case 4://4.Link Adhar Card 
						System.out.println("Enter emp id to link card details");
						details = getEmpDetails(sc.nextInt(), emp);
						//valid emp id details=> current emp details (except card details)
						System.out.println("Enter card details: cardNumber, creationDate, location");
						details.linkAdharCard(sc.next(), sdf.parse(sc.next()), sc.next());
						System.out.println("Adhar card details linked for emp");
						break;
					case 10:
						exit = true;
						break;

					}// switch over
				} // inner try over
				catch (Exception e) {
					//System.out.println("Error " + e);
					System.out.println(e.getMessage());
				}
				// clear off all pending inputs from scanner buffer till next Line
				sc.nextLine();
			} // while over
		} // try with resources over sc.close();
	}// main over

}// class over
