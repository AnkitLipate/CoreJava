package tester;

import static utils.ValidationRules.validateAllInputs;

import java.util.Scanner;

import com.app.core.Employee;

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
			// while contains Options ---1. Hire Emp 2. Display All 3.Exit
			while (!exit) {
				try {
					System.out.println("Options 1.Hire Employee 2.Display All 3.Exit");
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
						exit = true;
						break;

					}// switch over
				} // inner try over
				catch (Exception e) {
					System.out.println("Error " + e);
				}
				// clear off all pending inputs from scanner buffer till next Line
				sc.nextLine();
			} // while over
		} // try with resources over sc.close();
	}// main over

}// class over
