package AbstractExample;

public class Square extends Shape {
    
	
	
	public Square(int side) {
		super(side);
		// TODO Auto-generated constructor stub
	}

	
	
    public  int CalcArea() {
	return this.getSide1() * this.getSide1();
  }
	
	public int CalcPerimeter() {
	  return this.getSide1();
	}
	
	
	
	
}
