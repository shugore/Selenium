package Palindrome_String_Number;

public class Palindrome_1 
{
	public static void main(String[] args) {
		
		int a []  = {1,2,3,2,1};
		
		int i = 0 ;
		//System.out.println(a.length);
		
		int j = a.length-1;
		
		while( i < j) 
		{
			if( a[i] != a[j]) 
			{
			
				System.out.println(" Given array is not palindrome");
				
			 System.exit(0);
			}
			i++;
			j--;
	}
		System.out.println( " Given array is palindrome");
	}

}
