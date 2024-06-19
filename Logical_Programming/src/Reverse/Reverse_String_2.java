package Reverse;

public class Reverse_String_2 
{
	public static void main(String[] args) {
		
		String a = "abcde";
		String rev = "";
		
		int i = a.length()-1;
//		
//		System.out.println("Reversed String :-");
//		
//		while(i >= 0) {
//			
//			System.out.print(a.charAt(i));
//			rev = rev.concat(String.valueOf(a.charAt(i)));
//			
//			i--;
//		}
//		System.out.println(rev);
		for(int j=0; j<a.length(); j++) {
			rev = String.valueOf(a.charAt(j)).concat(rev);
		}
		System.out.println(rev);
	}

}
