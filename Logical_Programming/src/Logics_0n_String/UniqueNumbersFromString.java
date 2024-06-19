package Logics_0n_String;

public class UniqueNumbersFromString {
	public static void main(String[] args) {

		String str = "abcgtabckbgm";

		while (str.length() != 0) {
			char z = str.charAt(0);

			int length = str.length();

			str = str.replaceAll(String.valueOf(z), "");

			if (length - str.length() == 1) {

				System.out.println(z + " :- is unique character.");

			}
		}
	}

}
