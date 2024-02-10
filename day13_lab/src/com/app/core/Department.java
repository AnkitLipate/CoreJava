package com.app.core;

public enum Department {

	RND, FINANCE, MARKETING, SALES, HR, PRODUCTION;
	//public static final Depatment SALES ---> self type constant
	/*
	 * static{
	 *   RND = new Department("RND",0);
	 *   .....
	 *   SALES = new department("SALES",3);
	 *   ......
	 * }
	 * Method --->values(), valueOf()
	 * public static Department[] values();
	 * public static Department valueOf(String name) throws IllegalArgumentException
	 *  
	 */   
	@Override
	public String toString() {
	//	System.out.println("in toString of Department");
		return ordinal() +":"+name().toLowerCase();
	}
	//Has enum class overriden equals method of object class ?
	//Can you override further?
	//Is Enum comparable ? YES
	//what wwill be o/p
	//System.out.println(Department.RND.compareTo(Department.HR)); ---> +ve
}
