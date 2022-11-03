package langfundamental;




public class MainApp {
	
    static int ans = Integer.MIN_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    System.out.println("hello");
//    Employee e = new Employee(10);	
//	e.display();
		
   
		
	int arr[] = new int[3];
	
	arr[0] = -10;
	arr[1] = 20;
	arr[2] = 32;
	
	for(int i=0;i<3;i++) {
	 if(arr[i] > ans) {
	  ans = arr[i];
	 }
	}
	
	System.out.println(ans);
	
		
	}


		
	
	

}
