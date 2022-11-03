package protecteduse2;

import protecteduse1.A;

public class B1 {
 
	
	void b1meth() {
	 A obj = new A();
	 obj.meth3();
	 
	 //obj.meth(); protected method is only accessible in derived class in 
	 // another package via inheritance but not object reference 
	  // or without inheritance (in another package)
	 
	 
	}
}
