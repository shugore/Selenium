package Prime_Numbers;
import java.util.Scanner;
public class Prime_1
  {
	public static void main (String args[])
      { 
		Scanner x = new Scanner(System.in);
		int no = x.nextInt();
		System.out.println("Enter a number :"+no);
	
		int count = 0;
		
		for(int i = 1 ; i <= no   ; i++) {
			
			if( no % i == 0) {
				
				count++;
			}
		}
		
		if(count == 2) {
			 
			System.out.println(no+ " is prime number.");
		}
		
		else {
			System.out.println(no+ " is not prime number.");
		}
		
	
	}

}
