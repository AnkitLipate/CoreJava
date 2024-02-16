package com.app.core;

import java.time.LocalDate;

public class Product {
	private int id;
	private String name;
	private Category productCategory;
	private LocalDate manufacturingDate;
	private double price;
	
	public Product(int id, String name, Category productCategory, LocalDate manufacturingDate, double price) {
		super();
		this.id = id;
		this.name = name;
		this.productCategory = productCategory;
		this.manufacturingDate = manufacturingDate;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", productCategory=" + productCategory + ", manufacturingDate="
				+ manufacturingDate + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
