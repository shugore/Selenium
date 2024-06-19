package Logics_0n_String;

public class Duplictes_char_2 {
	public static void main(String[] args) {

		String str = "absegakgsk";

		while (str.length() != 0) {
			char c = str.charAt(0);

			int length = str.length();

			str = str.replaceAll(String.valueOf(c), "");

			if (length - str.length() > 1) {

				System.out.println(c + " is repeating.");

			}

		}

	}
}