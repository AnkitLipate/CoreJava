package com.app.vehicles;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale.Category;

//regNo color price categorymanufactureDate address
public class Vehicle {

	private int regNo;
	private String color;
	private double price;
	//Vehicle HAS-A Category
	private Category category;	
	//Vehicle HAS-A manufacturing Date
	private Date manufactureDate;
	//Vehicle HAS-A DeliveryAddress //UDT user define type : class inner
	//class (to ensure composition) 
	private DeliveryAddress address;
	//add SDF for parsing(String ---> Date) and formating (Date---> String)
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}
	public Vehicle(int regNo, String color, double price, Category category, Date manufactureDate) {
		super();
		this.regNo = regNo;
		this.color = color;
		this.price = price;
		this.category = category;
		this.manufactureDate = manufactureDate;
	}
	//add  overloaded constr to init unique id fields
	public Vehicle(int regNo) {
		this.regNo = regNo;
	}
		
	//override toString to replace hashcode version by actual state details
	@Override
	public String toString() {
		String message = address==null?"Delivery address Not Set" : address.toString();
		return "Vehicle [regNo=" + regNo + ", color=" + color + ", price=" + price + ", category=" + category
				+ ", manufactureDate=" +sdf.format(manufactureDate)+ ", address= "+message ;
	}
	
	
	//override equals to replace the ref equality by content equality (unique id)
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicles equals");
		if(o instanceof Vehicle)
			return  this.regNo==((Vehicle)o).regNo;			
		return false;
	}
	
	//add method in the outer class to assign delivery address to the current vehicle
	public void assignDeliveryAddress(String city, String state, String country, String zipCode)
	{
		address = new DeliveryAddress(city, state, country, zipCode);
	}
	//add a getter to get delivery address
	 public DeliveryAddress getAddress()
	 {
		 return address; 
	 }
	
	
	//add non static nested class(=inner class)
	class DeliveryAddress{
		//city, state, country, zipcode : String
		private String city, state, country, zipCode;

		//constr n toString 
		public DeliveryAddress(String city, String state, String country, String zipCode) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
		}

		@Override
		public String toString() {
			return "DeliveryAddress [city=" + city + ", state=" + state + ", country=" + country + ", zipCode="
					+ zipCode + "]";
		}

		//add getter for city
		public String getCity() {
			return city;
		}
		
		
			
		
	}//inner class over 
}// outer class over
