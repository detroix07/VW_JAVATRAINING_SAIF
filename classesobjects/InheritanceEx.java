package classesobjects;

import miscellaneous.Employee;

public class InheritanceEx {

	public static void main(String[] args) {
	
        Manager m = new Manager(5,20000.00,"Saif",13,10,"Tech",1000.00);
      
        m.display(); // display function in base class employee 
//	    System.out.println(m.getDeptno()); // reference to employee class 
//	    System.out.println(m.getMgrtype()); // reference to manager class 
//	    System.out.println(m.getTeamSize()); // same as line 15 code
//	    System.out.println(m.getName());
//        System.out.println(m.getEmpid());
//        System.out.println(m.getSalary());
//	    System.out.println(m.getCommission());
//	    
	   
	    // run time // late binding 
        
        
	    
	    Employee obj = new Manager(6,21000.00,"zayn",14,12,"HR",2000.00);
	    //obj.display(); // manager display called 
	    meth(obj);
	   
	    
	    obj = new Employee(7,22000.00,"Arun",15);
	   // obj.display();  // employee display called 
	    meth(obj);
	    
	    
	    meth(new Manager(14,23000.00,"Mathur",17,13,"HR",3000.00));
	    meth(new Employee(17,28000.00,"Aryan",19));
	        
	}
	
	
	public static void meth (Employee obj) {
	  obj.display();
	  obj.AnnSal(0);
	}

	
}
