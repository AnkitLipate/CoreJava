package sets3;

import java.util.Objects;

//PK : id and salary => composite PK (i.e Emp are same if id and salary same)
public class Emp {
	private String id;
	private String name;
	private double salary;
	public Emp(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
	  //add overriding form of equals : based on id
//	@Override
//	public boolean equals(Object o)
//	{
//		System.out.println("in emp equals");
//		if(o instanceof Emp) {
//			Emp e = (Emp) o;
//			return id.equals(e.id) && salary == e.salary;
//		}
//		return false;
//	}
//	//add overriding forn of  hashcode to follow the MANDATORY part of contract
//	@Override
//	public int hashCode()
//	{
//		System.out.println("in hashCode");
//		int result = (int)(id.hashCode() * salary);
//		return result;
//	}
	@Override
	public int hashCode() {
		System.out.println("in hashcode");
		return Objects.hash(id, salary);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(id, other.id) && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
}
