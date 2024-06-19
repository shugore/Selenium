package Palindrome_String_Number;

public class Palindrome_3 
{
	public static void main(String[] args) {
		
		String a = "abcddcba";
		
		 int i = 0;
		
		 int j = a.length()-1;
		 
		 
		 
		 while(i < j) {
			 
			 if(a.charAt(i) != a.charAt(j)) {
				 
				 System.out.println(a+" is not palindrome.");
				 
				 System.exit(0);
			 }
			 i++;
			 j--;
			 
		 }
		 
		 System.out.println(a+" is palindrome.");
		 
	}

}
