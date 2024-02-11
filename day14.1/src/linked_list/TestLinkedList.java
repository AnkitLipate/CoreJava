package linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		Collections.addAll(l1, "one","two", "three", "four", "five");
		System.out.println(l1);//[one,two,three,four,five]

	/*
	 * public E getFirst() throws NoSuchException if list is empty
	 * Return the first element in this list, w/o removing it from the list,
	 */
		System.out.println("getFirst: "+l1.getFirst());//one
		
	/*
	 * public E peekFirst() Retreives but does not remove, the head (First
	 * Element) of this list. Return null if empty list.
	 */
		
		System.out.println("peek First: "+l1.peekFirst());//one
//		System.out.println("peek: "l1.peek());//one
		
		/*
		 * public E removeFirst() Removes and return the first element from
		 * this list.---Throws NoSuchElementException same as remove
		 */
		System.out.println("remove first: "+l1.removeFirst());//one 
		System.out.println("remove first: "+l1.removeFirst());//two
		
		
	}

}
