package com.app.cms;

import java.time.LocalDate;
import java.time.Period;

public class Customer {

	private String name;
	private String email;
	private String password;
	private customerPlan plan;
	private LocalDate dob;
	private double regAmount;
	
	public Customer(String name, String email, String password, customerPlan plan, LocalDate dob, double regAmount) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.plan = plan;
		this.dob = dob;
		this.regAmount = regAmount;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", plan=" + plan + ", dob="
				+ dob + ", regAmount=" + regAmount + "]";
	}
	//getter for password
	public String getPassword() {
		return password;
	}
	//add public method to compute age of customer
	public int getAge()
	{
		return Period.between(dob, LocalDate.now()).getYears();
	}
	
}
