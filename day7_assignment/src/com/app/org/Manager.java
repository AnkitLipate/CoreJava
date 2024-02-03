package com.app.org;

public class Manager extends Employee{

	private double performanceBonuce;
	
	public Manager(int id, String name, String deptId, double basic, double performanceBonuce) {
		super(id, name,deptId, basic);
		System.out.println("in manager constr");
		this.performanceBonuce = performanceBonuce;
	}

	public double getPerformanceBonuce() {
		return performanceBonuce;
	}

	@Override
	public String toString() {
		return "Manager "+super.toString()+"performanceBonuce=" + performanceBonuce;
	}
	
	public double computNetSal()
	{
//		double computNetSal =basic+performanceBonuce;
		return computNetSal();
	}
	
}
