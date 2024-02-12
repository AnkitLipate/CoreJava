package sets2;

import java.util.HashSet;

public class TestEmpSet2 {

	public static void main(String[] args) {
		// create empty HashSet  to store Emp type of ref
		HashSet<Emp> emps = new HashSet<>();
		//BBBB AaBB AaAa BBAa
		Emp e1 = new Emp("BBBB", "Rama", 1000);
		Emp e2 = new Emp("AaBB", "Rohit", 2000);
		Emp e3 = new Emp("AaAa", "Meera", 3000);
		Emp e4 = new Emp("BBAa", "Rama", 1000);
		Emp e5 = new Emp("BBBB", "Meera", 3000);
		Emp e6= new Emp("ABCD", "sam", 5000);
		
		System.out.println("BBBB".equals("AaBB"));
		System.out.println("BBBB".hashCode()+" "+"AaBB".hashCode());
		
		System.out.println("Added "+emps.add(e1));//
		System.out.println("Added "+emps.add(e2));//
		System.out.println("Added "+emps.add(e3));//
		System.out.println("Added "+emps.add(e4));//
		System.out.println("Added "+emps.add(e5));//
		System.out.println("Added "+emps.add(e6));//
		System.out.println("size of set "+emps.size());//
		System.out.println("set contents ");
		for(Emp e: emps)
			System.out.println(e);//dup contents !!!!!!!!
		
	}

}
