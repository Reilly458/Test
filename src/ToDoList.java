/*ToDoList.java
  Reilly t00643522
  COMP 1231 Assignment 2
  This program uses polymorphism and interfaces to create and order a to do list.
*/ 

//  Instantiates a derived class and invokes its inherited and local methods.
import java.util.ArrayList;
import java.util.Collections;

public class ToDoList {
	public static void main(String[] args) {
		ArrayList<Task> list1 = new ArrayList <> ();
		list1.add(new Task("Wash soccer clothes", 3));
		list1.add(new Task("Wash work clothes", 4));
		list1.add(new Task("Wash dishes", 2));
		list1.add(new Task("Vaccuum living room", 1));	
		list1.add(new Task("Mow lawn", 3));		
		list1.add(new Task("Clean pool", 3));	
		list1.add(new Task("General laundry", 2));		
		list1.add(new Task("Pick food from garden", 4));
		list1.add(new Task("Mop kitchen floor", 1));
		
		//sorts the list into numeric order with highest priority first
		Collections.sort(list1);
		
		//prints out each element in the list
		System.out.println("List of task in order of priority: ");
		for(Task element: list1) {
			System.out.println(element);
		}
	}
}
