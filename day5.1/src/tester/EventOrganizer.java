package tester;

import java.util.Scanner;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class EventOrganizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Max no of participants");// 20
		
		Person[] participants = new Person[sc.nextInt()];// Array of ref
		
		boolean exit = false;
		int counter = 0;
		
		while (!exit) {
			
			System.out.println(
					"Options 1.Register Student 2.Register faculty 3.Display details of all participants "
					+ "4. Display specific participant details 5.Invoke sub class specific functionality 0.Exit");
			
			System.out.println("choose option: ");
			
			switch (sc.nextInt()) {
			
			case 1:// student registration
				if (counter < participants.length) {
					System.out.println("Enter student details: firstName, lastName, gradYear, course, fees, marks");
					participants[counter] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
					counter++;
				} else
					System.out.println("Event full...!!!");
				break;
			
			case 2:// faculty registration
				if (counter < participants.length) {
					System.out.println("Enter faculty details: firstName, lastName, Experience in yrs, sme");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
				} else
					System.out.println("Event Full...!!!!");
				break;
			
			case 3://  display detailss of all participates
				for(Person p : participants)
					if(p!=null)//null checking
						System.out.println(p);//type of ref : Person , type of object : Studnt or Faculty
				break;
			case 4: 
				System.out.println("Enter seat no: ");
				int index = sc.nextInt()-1;
				if(index>=0 && index < counter)
					System.out.println(participants[index]);
				else
					System.out.println("Invalid Seat No...!!!");
				break;
			case 5:
				System.out.println("Enter Seat No : ");
				index = sc.nextInt()-1;
				if(index >=0 && index<counter)
				{
					Person p = participants[index];
					//p.study(); // javac resolve by type of the reference. p : Person , why javac err : since
										// ther is no "study" method define in person class
				    // in order toaviod ClassCastException, must use inctanceof checking before doing down casting 
					//down casting : climbing down inheritance heirarchy (not done implicitly by the javac)
					if(p instanceof Student)
						((Student)p).study();
					else
						((Faculty)p).teach();
				}
				else
					System.out.println("Invalid Seat No...!!!");
				break;
			case 0:
				exit = true;
				break;

			}
		}
	}

}
