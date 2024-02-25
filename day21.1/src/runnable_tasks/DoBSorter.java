package runnable_tasks;

import java.util.Map;
import java.util.stream.Stream;
import static utils.IOUtils.storeStudentDetails;
import static utils.CollectionUtils.sortStudentDoB;
import com.app.core.Student;
public class DoBSorter implements Runnable {
	// instance vars
	private String fileName;
	private Map<String, Student> map;

	// parameterized ctor to init the state
	public DoBSorter(String fileName, Map<String, Student> map) {
		super();
		this.fileName = fileName;
		this.map = map;
		System.out.println("in ctor by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");// GPA sorted thrds
		try {
			//sort student details as per gpa
			Stream<Student> sortedStrm = sortStudentDoB(map);
			//invoke store data to write info in text file
			storeStudentDetails(sortedStrm, fileName);
			System.out.println("student details stored by "+Thread.currentThread().getName());
			
			
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over ");
	}

}
