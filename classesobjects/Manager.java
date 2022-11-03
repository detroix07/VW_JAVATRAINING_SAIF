package classesobjects;

import miscellaneous.Employee;

public class Manager extends Employee {
	
	// properties of manager class's objects 
	private int TeamSize;
	private String mgrtype;
	private double commission;
	
	
	
// constructor for manager class 
    public Manager(int empid, double salary, String name, int deptno , int TeamSize,String mgrtype , double commission) {
	super(empid, salary, name, deptno);
	this.TeamSize = TeamSize;
	this.mgrtype = mgrtype;	
	this.commission = commission;
 }

    // setters getters for all private attributes 
	public double getCommission() {
	return commission;
}


   public void setCommission(double commission) {
	this.commission = commission;
  }


	public int getTeamSize() {
		return TeamSize;
	}

	public void setTeamSize(int teamSize) {
		TeamSize = teamSize;
	}

	public String getMgrtype() {
		return mgrtype;
	}

	public void setMgrtype(String mgrtype) {
		this.mgrtype = mgrtype;
	}
	
	// method overriding // run time // late binding 
	public void display () {
	  super.display();
	  System.out.println(this.TeamSize + " " + this.mgrtype + " " + this.commission);
	}
  
}
