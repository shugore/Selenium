   package Armstrong_FibonnaciDemo;

public class ArmstrongNumber {
	public static void main(String[] args) {

		int no = 93084;

		int temp = no;
		int number = 0;
		int original;
		int count = 0;

		while (temp != 0) {
			count++;
			original = temp % 10;
			temp = temp / 10;
		}
		temp = no;
		while (temp != 0) {

			original = 1;
			int n = temp % 10;

			for (int i = 0; i < count; i++) {

				original = original * n;

			}
			number = number + original;
			temp = temp / 10;
		}
		if (no == number) {
			System.out.println(no + " is Armstrong number.");
		} else {
			System.out.println(no + " is not Armstrong number.");

		}

	}
}
