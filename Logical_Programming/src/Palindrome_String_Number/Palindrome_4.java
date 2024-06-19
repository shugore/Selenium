package Palindrome_String_Number;

public class Palindrome_4 
{
	public static void main(String[] args) {
		
		String a = "abcdcba";
		
		int i  ;
		
		int j =a.length()-1;
	
		
		for(i = 0; i < j; i++) {
			
			if(a.charAt(i) != a.charAt(j)) {
				
				System.out.println(a+" is not palindrome.");
				
				System.exit(0);
			}
			
			j--;
			
		}
		System.out.println(a+" is palindrome.");
	}

}
