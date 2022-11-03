package protecteduse1;

// not inherited from A 
public class B {
     
	void bmeth() {
	A obj = new A();
	obj.meth();
	obj.meth1();
	obj.meth3();
	}
	
}
