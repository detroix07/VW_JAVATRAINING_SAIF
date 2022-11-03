package classesobjects;

import miscellaneous.Employee;

public class ClassesObjectsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object creation in main function 
		
		Employee e1 = new Employee(1,20000.00,"ABC",10); // employee 1 
		Employee e2 = new Employee(2,30000.00,"XYZ",11);    // employee 2 
		
		// printing getters 
		
		System.out.println("Details of e1");
		System.out.println("Empid="+e1.getEmpid());
		System.out.println("Salary="+e1.getSalary());
		System.out.println("Name="+e1.getName());
		System.out.println("Deptno=" +e1.getDeptno());
	    e1.AnnSal(10000);  // with bonus 10000
		e1.display();
		
		
		System.out.println("Details of e2");
		System.out.println("Empid="+e2.getEmpid());
		System.out.println("Salary="+e2.getSalary());
		System.out.println("Name="+e2.getName());
		System.out.println("Deptno=" +e2.getDeptno());
		e2.AnnSal(0);  // with bonus 0
		e2.display();
		
		
		
	}

}
