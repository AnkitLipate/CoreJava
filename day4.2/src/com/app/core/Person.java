package com.app.core;

public class Person {

	private String firstName, lastName;

	public Person(String firstname, String lastName) {
		System.out.println("in person's constructor");
		//super();
		this.firstName = firstname;
		this.lastName = lastName;
	}
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	// can Person class modity(override), inherited toString method ?
	public String toString()
	{
		return firstName+" "+lastName;
	}
}
