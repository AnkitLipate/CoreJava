package com.app.vehicles;

public enum Category {

	PETROL, DIESEL, KEROSENE, WHITEPETROL, CNG, LPG; 
	
	private Category() {
		System.out.println("in default constr of category ");
	}
	
	@Override
	public String toString() {
		System.out.println("in toString of Category");
		return ordinal() +":"+name().toLowerCase();
	}
}
