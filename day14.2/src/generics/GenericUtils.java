package generics;

import java.util.List;

public class GenericUtils {
	/*
	 * Objectives : create a class GenericUtils, as non-generic class
	 * 1.add a static method to print elements of any type of the list.
	 */
	
	public static void printList(List<?> list)
	{
		for(Object e:list)
			System.out.println(e);
	}
	//can you achieve similar objective as above BUT using generic method? YESS 
	//use a generic method with type declaration
	public static <T> void printList2(List<T> list)
	{
		for(T t : list)
			System.out.println(t);
	}
	//add a static method to compute Salary of list of emps/mgr/salesmgr/ tempworker....
//	public static void invokeComputeSalary(List<Emp> list)
//	{
//		for(Emp o: list)
//			o.computeSalary();
//	}
	public static void invokeComputeSalary(List<? extends Emp> list)
	{
		for(Emp o: list)
			o.computeSalary();
	}
}
