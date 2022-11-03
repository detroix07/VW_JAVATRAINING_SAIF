package arraysex;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int[] arr;
        arr = new int[5];
        
        for(int i=0;i<arr.length;i++) {
         arr[i] = i;
        }
        
        for(int i=0;i<arr.length;i++) {
         System.out.println(arr[i]);
        }
		
        for(int v:arr) {
         System.out.println(v);
        }
		
        String[] str = new String[3];
        
        str[0] = "Saif";
        str[1] = "Hussain";
        str[2] = "Iqbal";
        
        for(String s : str) {
         System.out.println(s);
         System.out.println(s.toLowerCase());
         System.out.println(s.length());
         

         
        }
        
        
		
		
		
		
	}

}
