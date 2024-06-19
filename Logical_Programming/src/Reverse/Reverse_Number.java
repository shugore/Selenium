package Reverse;

public class Reverse_Number 
{
	public static void main(String[] args) {
		
		int no = 987654321;
		
		
		
		int rev = 0,rem;
		
		System.out.println("Given number is Reversed :-");
		
		while( no != 0 ) 
		{
			rem = no % 10 ;
			
			rev = rev * 10 + rem ;
			
			no = no / 10 ;
			
		}
		
		System.out.println(rev);
	}

}
