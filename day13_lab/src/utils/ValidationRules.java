package utils;

import static com.app.core.Department.valueOf;
import static com.app.core.Employee.sdf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.app.core.Department;
import com.app.core.Employee;

import custom_exception.EmployeeHandlingException;

public class ValidationRules {
	public static final int MIN_LENGTH;
	public static final int MAX_LENGTH;
	public static Date thresholdDate;

	static {
		MIN_LENGTH = 4;
		MAX_LENGTH = 15;
		try {
			thresholdDate = sdf.parse("1/4/2021");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

	// add public static method for validating all inputs
	public static Employee validateAllInputs(int empId, ArrayList<Employee> empData, String firstName, String lastName,
			String email, String dept, String joinDate, double salary)
			throws EmployeeHandlingException, ParseException {
		validateEmpId(empId, empData);
		validateName(firstName, "first");
		validateName(lastName, "last");
		validateEmail(email);
		Department department = validateDept(dept);
		Date date = parseValidateJoinDate(joinDate);
		// => all i/ps are valid -- Encapsulate all thse details in emp class instance,
		// return it's instance to the caller
		return new Employee(empId, firstName, lastName, email, department, date, salary);

	}

	// add a public static method : to validate email(invoke by tester)
	// rule must contain : @ --contains, must end with .com --endsWith
	// return validatee email, in case of no validation errs
	// otherwise throw custom exc.
	public static String validateEmail(String email) throws EmployeeHandlingException {
		if (email.contains("@") && email.endsWith(".com"))
			return email;
		// => Invalid email -- throw custom exception
		throw new EmployeeHandlingException("Invalid Email...!!!");
	}

	// add static method to validate first name : in case of success ret first name
	// o.w throw the cust exc with prop mesg
	public static String validateName(String name, String mesg) throws EmployeeHandlingException {
		if (name.length() < MIN_LENGTH | name.length() > MAX_LENGTH)
			throw new EmployeeHandlingException("Invalid " + mesg + " name : must be within range 4-15");
		// => valid name
		return name;
	}

	// add static method to validate dept
	public static Department validateDept(String dept) throws EmployeeHandlingException {
		try {
			// parse String ---> Enum
			return valueOf(dept.toUpperCase());
		} catch (IllegalArgumentException e) {
			//create StringBuilder object inited with err msg
			StringBuilder sb = new StringBuilder("Invalid Department\n");
			sb.append("valid departments :");
			sb.append(Arrays.toString(Department.values()));
			//throw cust ex with suitable mesg
			throw new EmployeeHandlingException(sb.toString());
		}

	}

	// add static method, for parsing and validation of join date
	public static Date parseValidateJoinDate(String joinDate) throws ParseException, EmployeeHandlingException {
		// parsing (String ---> Date)
		Date d1 = sdf.parse(joinDate);
		// =>parsing is successful -- continue to validation
		if (d1.after(thresholdDate))
			return d1;
		// => validation failure
		throw new EmployeeHandlingException("Invalid join date");
	}

	// add static method, to check for dup empid
	// in case of dup id throw cust exc o.w. return validate(non dup) emp id to the
	// caller
	public static int validateEmpId(int empId, ArrayList<Employee> empData) throws EmployeeHandlingException
	// empId=sc.nextInt(), empData = emp
	{
		Employee newEmp = new Employee(empId);
		if(empData.contains(newEmp))
			throw new EmployeeHandlingException("Duplicate Employee id....");
		// =>no duplicate id
		return empId;
	}
	
	//add static method for validating  empid
	//Method should throw custom exc : in case of invlid empid
	//ret Employee ref, encapsulating complete emp details
	public static Employee getEmpDetails(int empId, ArrayList<Employee> emp) throws EmployeeHandlingException {
		Employee newEmp = new Employee(empId);
		//find out index of 1st and only occurence of the specified emp
		int index = emp.indexOf(newEmp);
		if(index==-1)
			throw new EmployeeHandlingException("Emp Not Found : Invalid Emp Id...");
		return emp.get(index);
	}
		
}
