package itc_with_wait;

public class Emp {
	private int id;
	private String name, deptid;
	private double sal;
	
	public Emp(int id, String name, String deptid, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", sal=" + sal + "]";
	}

	
}
