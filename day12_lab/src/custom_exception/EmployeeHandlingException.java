package custom_exception;

@SuppressWarnings("serial")
public class EmployeeHandlingException extends Exception{

	public EmployeeHandlingException(String errMesg) {
		super(errMesg);
	}
}
