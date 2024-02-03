package tester;

import com.app.students.Student;

public class TestStudentEquals {

	public static void main(String[] args) {
		Student s1 = new Student(101, "React", "a1", "b1", 7.5);
		Student s2 = new Student(10, "Angular", "a1", "b1", 7.5);
		System.out.println(s1.equals(s2));

	}

}
