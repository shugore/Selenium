package Logics_0n_String;

public class Reverse_only_char 
{
	public static void main(String[] args) {
		
		String a = "Reverse only characters";
		
		String b = "";
		
		for(int i = a.length()-1 ; i >= 0 ; i--) {
			
			b = b.concat(String.valueOf(a.charAt(i)));
		}
		System.out.println(b);
		
	}

}
