package test_enums;

public enum Department {
//typically Enum have : set of related constant
	
	RND, FINANCE, MARKETING,HR, PRODUCTION;
	
	//can you override toString method in your enum? YES
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
