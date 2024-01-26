package com.app.fruits;

public class Fruit {

	private String name, color;
	private double weight;

	public Fruit(String name, String color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

	public String taste() {
		return "no specific taste";
	}

}
