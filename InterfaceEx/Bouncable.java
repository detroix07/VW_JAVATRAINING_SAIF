package InterfaceEx;

public interface Bouncable {
	 int BOUNCE_FACTOR = 5;
	    
	    void bounce(); // by default all methods are public and abstract in interface 
	    
	    void setBounceMultiple(int multiple);
}
