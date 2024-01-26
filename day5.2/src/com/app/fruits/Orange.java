package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String color, double weight) {
		super("Orange", color, weight);
	}
	
	@Override
	public String taste()
	{
		return "Orange Taste sour...!!!";
	}
	
	public void juice()
	{
		System.out.println(getName()+" can extract juice...!!!");
	}
}
