package tester;

import static com.app.core.Employee.sdf;
import static utils.ValidationRules.getEmpDetails;
import static utils.ValidationRules.parseValidateJoinDate;
import static utils.ValidationRules.validateAllInputs;
import static utils.ValidationRules.validateDept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Department;
import com.app.core.Employee;

import custom_exception.EmployeeHandlingException;
import custom_ordering.EmployeeLastNameComparator;

public class TestEmpOrganization {

	public static void main(String[] args) {
		// Scanner -- try with respurces
		try (Scanner sc = new Scanner(System.in)) {
			// create empty AL to hold emp type of ref
			ArrayList<Employee> empList = new ArrayList<>();

			// exit, counter
			boolean exit = false;

			// while contains Options ---1. Hire Emp 2. Display All emp details 3.update Emp
			// details 10.Exit
			while (!exit) {
				try {
					System.out.println("Options 1.Hire Employee 2.Display All emp details 3.update Emp details "
							+ "4.Link Adhar Card 5.Display specific Emp Details 6.delete emp info "
							+ "7.Display names joind after 8.sort emps as per emp id "
							+ "9.sort emp as per last Name 10.Exit");
					System.out.println("Choose option");
					// Switch case
					switch (sc.nextInt()) {
					case 1:// Hire Employee

						System.out.println(
								"Ener Employee Details--empId, firstName, lastName, email, dept, joinDate(day/mon/year), salary");
						Employee e = validateAllInputs(sc.nextInt(), empList, sc.next(), sc.next(), sc.next(),
								sc.next(), sc.next(), sc.nextDouble());
						empList.add(e);
						System.out.println("emp hired!!!!");

						break;
					case 2:
						System.out.println("Employee Details: ");
//						for (Employee e1 : empList)
//							System.out.println(e1);
						// display all employee using list iterator
						Iterator<Employee> empitr = empList.iterator();
						while (empitr.hasNext()) {
							System.out.println(empitr.next());
						}
						break;
					case 3:
						System.out.println("Enter empId, new dept, salary increment");
						// check if emp exists
						Employee details = getEmpDetails(sc.nextInt(), empList);
						// =>emp found, validate new dept
						Department validDept = validateDept(sc.next());
						// =>emp id and new dept : valid
						// change dept
						details.setDept(validDept);
						// update salary
						details.setSalary(details.getSalary() + sc.nextDouble());
						System.out.println("update emp details.....");
						break;
					case 4:// 4.Link Adhar Card
						System.out.println("Enter emp id to link card details");
						details = getEmpDetails(sc.nextInt(), empList);
						// valid emp id details=> current emp details (except card details)
						System.out.println("Enter card details: cardNumber, creationDate, location");
						details.linkAdharCard(sc.next(), sdf.parse(sc.next()), sc.next());
						System.out.println("Adhar card details linked for emp");
						break;
					case 5:// Display specific emp Details
						System.out.println("Enter emp id to fetch details ");
						System.out.println(getEmpDetails(sc.nextInt(), empList));
						break;
					case 6:// delete emp info
						System.out.println("Enter emp id to fire");
						int index = empList.indexOf(new Employee(sc.nextInt()));
						if (index == -1)
							throw new EmployeeHandlingException("Emp deletion failed : invalid emp id !!!");
						// =>valid emp id
						System.out.println("Removed " + empList.remove(index));
						break;
					case 7:// display names join after
						System.out.println("Enter join date");
						Date joinDate = parseValidateJoinDate(sc.next());
						System.out.println("Emp names join after " + sdf.format(joinDate));
						for (Employee e1 : empList)
							if (e1.getJoinDate().after(joinDate))
								System.out.println(e1.getFirstName() + " " + e1.getLastName());
						break;
					case 8:// sort emp as per emp id
						System.out.println("Sorted Emp List");
						Collections.sort(empList);
						System.out.println(empList);//Natural Ordering
						break;
					case 9://sort emp as per last Name
						//1.create instance of the class that implement comparator
						EmployeeLastNameComparator comp = new EmployeeLastNameComparator();
						Collections.sort(empList, comp);//custom ordering
						break;
					case 10:
						exit = true;
						break;

					}// switch over
				} // inner try over
				catch (Exception e) {
					// System.out.println("Error " + e);
					System.out.println(e.getMessage());
				}
				// clear off all pending inputs from scanner buffer till next Line
				sc.nextLine();
			} // while over
		} // try with resources over sc.close();
	}// main over

}// class over
