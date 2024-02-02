package com.app.vehicle;

public class Vehicle {

	private int regNo;
	private String color;
	private double price;

	public Vehicle(int regNo, String color, double price) {
		super();
		this.regNo = regNo;
		this.color = color;
		this.price = price;
	}

	// override toString to replace hashcode by actual state detials
	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", color=" + color + ", price=" + price + "]";
	}

	// override equals to replace ref equality by content equality(Unique Id)
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals's ");
		if (o instanceof Vehicle)
			return this.regNo == ((Vehicle) o).regNo;
		return false;
//		return this.regNo==o.regNo;
	}
}
