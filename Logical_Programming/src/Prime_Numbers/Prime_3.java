package Prime_Numbers;

public class Prime_3 
{
	public static void main(String[] args) {
		
		int no = 11;
		
		int i;
		
		for( i = 2 ; i < no ; i++) {
			
			if(no % i == 0) {
				
				break;
			}
		}
		if( i == no) {
			
			System.out.println(no+ " is prime number.");
		}
		else {
			
			System.out.println(no+ " is not prime number.");
		}
		
	}

}
