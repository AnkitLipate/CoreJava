package com.app.fruits;

public class Apple extends Fruit{

	public Apple(String color,double weight) {
		super("Apple", color,weight);
	}
	
	@Override
	public String taste()
	{
		return "Apple taste sweet and sour";
	}
	
	public void jam()
	{
		System.out.println(getName()+" can make  jam");
	}
	
}
