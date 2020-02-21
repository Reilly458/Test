/*Priority.java
  Reilly t00643522
  COMP 1231 Assignment 2
  This application is an interface and provides methods for implemenation in other classes.
*/ 
public interface Priority {
	int urgent = 4;
	int high = 3;
	int medium = 2; 
	int low = 1;
	
	//Provides methods for classes implementing this interface
	public void setPriority(int value);
	public int getPriority();
}
