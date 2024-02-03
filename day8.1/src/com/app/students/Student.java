package com.app.students;

public class Student {
	
	private int rollNo;
	private String subject;
	private String firstName; 
	private String lastName;
	private double gpa;
	public Student(int rollNo, String subject, String firstName, String lastName, double gpa) {
	
		this.rollNo = rollNo;
		this.subject = subject;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", subject=" + subject + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gpa=" + gpa + "]";
	}
	@Override
	public boolean equals(Object o) {
		System.out.println("in Student equals");
		if(o instanceof Student)
		{
			Student s = (Student)o;
			return this.rollNo==s.rollNo && this.subject.equals(s.subject);
		}
		return false; 
	}
	
}
