package com.app.org;

public class Employee {
	
	private int id;
	private String name,deptId;
	private double basic;
	public Employee(int id, String name, String deptId, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptId=" + deptId + ", basic=" + basic + "]";
	}
	
}
