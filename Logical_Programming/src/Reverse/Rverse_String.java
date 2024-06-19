package Reverse;

public class Rverse_String 
{
	public static void main(String[] args) {
		
		String a = "12345";
		String rev="";
		
		int i = a.length()-1;
		
		System.out.println("Reversed String:-");
		
		while(i >= 0) {
			
			rev=rev.concat(String.valueOf(a.charAt(i)));
			
			i--;
		}
		System.out.print(rev);
	}

}
//   int no = 123;
//   int temp = no;
//   rev=rem*1,rem;