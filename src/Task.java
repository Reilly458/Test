/*Task.java
  Reilly t00643522
  COMP 1231 Assignment 2
  This application methods for forming and modifying a to do list.
*/ 
public class Task implements Priority, Comparable<Task> {
	private String description;
	private int rank;
	
	//Constructor: Sets description of a task and its priority value
	Task(String name, int value){
		setDescription(name);
		setPriority(value);
	}
	
	//Description modifier
	public void setDescription(String dscrp) {
		description = dscrp;
	}
	
	//Description accessor
	public String getDescription() {
		return description;
	}
	
	//Priority modifier
	public void setPriority(int num){
		if (num == urgent) {
			rank = urgent;
		}
		else if (num == high) {
			rank = high;
		}
		else if (num == medium) {
			rank = medium;
		}
		else {
			rank = low;
		}
	}
	
	//Priority accessor
	public int getPriority() {
		return rank;
	}
	
	//Converts contents to a readable string for output
	public String toString() {
		return "Priority level: " + rank + "\t" + description ;
	}

	//Compares one rank value to another to establish hierarchy 
	public int compareTo(Task tsk){    
		 if(rank==tsk.rank) {    
			 return 0;    
		 }
		 else if(rank < tsk.rank) {    
			 return 1;    
		 }
		 else {    
			 return -1;    
		 }
	}
}
