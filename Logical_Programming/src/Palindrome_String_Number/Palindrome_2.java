package Palindrome_String_Number;

public class Palindrome_2 
{
	public static void main(String[] args) {
		
		int no = 1222332221;
		
		int temp = no ;
		
		int rev = 0 ,rem ;
		
		while(temp != 0) {
			
			rem = temp % 10;
			
			rev = rev * 10 + rem ;
			
			temp = temp / 10 ;
		}
		if(rev == no ) {
			
			System.out.println(no+" is palindrome.");
			
		}else 
		{
		System.out.println(no+" is not palindrome.");
	}
	}
}
