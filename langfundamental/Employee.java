package langfundamental;

public class Employee {
    
	int empid; // member properties 
	
	// constructor
	
	public Employee ( int id) {
	 empid = id;
	}
	
	// member functions 
	void display() {
	 System.out.println("id=" + empid);
	}
}
