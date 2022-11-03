package protecteduse1;

public class A {
  
	protected void meth() {
	 System.out.println("Meth is protected method in A called ");
	}
	
	
	void meth1() {
		System.out.println("Meth1 is default access specifier method in A called");
	}
	
	public void meth3() {
		System.out.println("Meth is public method in A is called");
	}
	
}
