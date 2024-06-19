package Logics_0n_String;

public class DuplicateFromString {
	public static void main(String[] args) {
		String str = "ahsbakgsab";

		while (str.length() != 0) {
			
			char z = str.charAt(0);
			
			int length = str.length();
			
			str = str.replaceAll(String.valueOf(str.charAt(0)), "");
			
			if (length - str.length() > 1) {
				
				System.out.println(z + " is repeating character");
			}
		}
	}

}
