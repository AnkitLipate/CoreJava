package tester;
import com.app.core.*;

public class Test1 {

	public static void main(String[] args) {
		// create student class instance
		// super class ref, super class object, sub class ref, sub class object
		//Person : super class, sudent sub class
		// Direct referencing : sub class ref--> sub class object
		Student student1 = new Student("Rama ", "Seth", 2023, "PG-DAC", 12345, 75);
		System.out.println(student1);//implicitly-- Student1.toString()--Student toString is Invoke
		Person p;// p super class ref
		p=student1;//up-casting : implicit casyt added by javac (Student extends Person)
		                 // JVM invoke's Student toString  
		System.out.println(p);//p.toString--javac resolve method binding by type of the ref(Person)
		//But JVM resolves the method binding by type of the object it's refering to 
		p=new Faculty("Kiran", "Mujumdar", 10, "Java React NoSQL");//up casting 
		System.out.println(p);//p.toString  : JVM will invokes toString on Faculty's object 
		Object o;
		o = new Student("Ram ", "Sethiya", 2023, "PG-DBDA", 12785, 73);
		System.out.println(o);
		o = new Faculty("Karan", "Tiwari", 10, "Java Angular MySQL");//up casting 
		System.out.println(o);
		
	}

}
