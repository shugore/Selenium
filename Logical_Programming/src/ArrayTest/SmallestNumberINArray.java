package ArrayTest;

public class SmallestNumberINArray {
	public static void main(String[] args) {

		int[] z = { 302, 203, 104, 110, 15, 202, 98 };

		int a = z[0];
		for (int i = 1; i < z.length; i++) {
			if (a > z[i]) {

				a = z[i];
			}
		}
		System.out.println(a);
	}

}
