package tester;

import java.util.Date;

import com.app.core.Department;
import com.app.core.Employee;

public class TestAssociation {

	public static void main(String[] args) {
		// can you create adhar card instatnce directly? No(composition)
//		AdharCard card = new AdharCard("qwertyuio1234", new Date(), "Mumabi");
		Employee e =new Employee(101, "a1", "b1", "a1@gmai.com", Department.RND, new Date(), 123345);
		System.out.println(e);
		Employee.AdharCard card = e.new AdharCard("qwertyuio1234", new Date(), "Mumabi");
		System.out.println(e);
//		System.out.println(card); 
		e.linkAdharCard("abcd-1234", new Date(), "Delhi");
		System.out.println(e);
	}

}
