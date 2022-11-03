package langfundamental;

import java.util.Scanner;

public class sumfirst5even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		int sum = 0;
		int i = n;
		
		while(cnt<5) {
		 if(i%2==0) {
		  sum+=i;
		  cnt++;
		 }
		 i++;
		}
		
		System.out.println(sum);
		sc.close();

	}

}
