package com.app.core;

public class Faculty extends Person{

	private int yrsOfExperience;
	private String sme;
	
	public Faculty(String fn, String ln, int yrs, String sme) {
		super(fn, ln);//explicitly invoke immediate super class MATCHING contr
		System.out.println("in faculty constructor");
		yrsOfExperience = yrs;
		this.sme = sme;
		
	}
	// modifying the inherited method toString from person
	@Override
	public String toString() {
		return "Faculty " + super.toString() + " Teaching for " + yrsOfExperience+ " expert in "+sme;
	}
	//add a new functionality: teach
	public void teach()
	{
		System.out.println(getFistName()+ " expert in "+sme);
	}
}
