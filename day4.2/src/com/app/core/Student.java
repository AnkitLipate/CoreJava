package com.app.core;

public class Student extends Person {

	private int gradYear;
	private String course;
	private double fees;
	private int marks;

	// add parameterized contr to init complete state of a student
	public Student(String firstName, String lastName, int gradYear, String course, double fees, int marks) {
		super(firstName, lastName);// explicitly invoke immediate super class MATCHING contr
		System.out.println("in student constructor");
		this.gradYear = gradYear;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}

	// modifying the inherited method toString
	public String toString() {
		return "Student " + super.toString() + " Graduated in " + gradYear + " course " + course +
				" fees " + fees+ " marks " + marks;
	}
}
