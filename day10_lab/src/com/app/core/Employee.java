package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;


//emp id, first Name, Last name, emil, dept, join date, salary
public class Employee {
	
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private Department dept;
	private Date joinDate;
	private double salary;
	// add SDF for parsing(String ---> Date) n format(Date--->String)
	public static SimpleDateFormat sdf;
	//static  init : for initing sdf : day/mon/year---pattern
	static {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
	}
	
	public Employee(int empId, String firstName, String lastName, String email, Department dept, Date joinDate,
			double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dept = dept;
		this.joinDate = joinDate;
		this.salary = salary;
	}
	//add overloaded constr to init empid
	public Employee(int empId) {
		super();
		this.empId = empId;
	}
	
	//Override toString 
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dept=" + dept + ", jionDate=" + sdf.format(joinDate) + ", salary=" + salary + "]";
	}
	
	
	//override equals for replacing ref equality by content equality(PK : unique ID -- empid)
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in employee equals");
		if(o instanceof Employee)
			return this.empId==((Employee)o).empId;
		return false;
	}
	//setter: dept, salary
	public void setDept(Department dept)
	{
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
