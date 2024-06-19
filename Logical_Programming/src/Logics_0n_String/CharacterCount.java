package Logics_0n_String;

import java.util.Arrays;

public class CharacterCount {
	public static void main(String[] args) {

		String str = "Number of characters in String";
		int count = 0;

		for (char ch : str.toCharArray()) {
			count++;
			if(ch == ' ')
				count--;
		}
		System.out.println(count);
		count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {

				count++;
				

			}

		}
		System.out.println(str.length());
		System.out.println(count);
		int totalChar = str.length() - count;

		System.out.println("Total number of characters in string ::" + totalChar);
	}

}
