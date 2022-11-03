package arraysex;

public class Employee {
  
	// private fields 
	private int empid;
	private double salary;
	private String name;
	private int deptno;

	
	
	
	// public member functions 
	 public void display() {
     System.out.println(this.empid + " " + this.salary + " " + this.name + " " + this.deptno);
	}
	 
	// public member function for bonus 
	public void AnnSal(double bonus) {
	 System.out.println((this.salary * 12)+ bonus);
	}
	
	
	
	// constructor 
	public Employee(int empid, double salary, String name, int deptno) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
		this.deptno = deptno;
	}
	
	
	
	
	// setters and getters 
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getEmpid() {
		return empid;
	}
	
	
	
}
