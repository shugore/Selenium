package ArrayTest;

public class GreatestNUmberInArray {
	public static void main(String[] args) {

		int[] z = { 102, 20, 50, 90, 120, 30,420,15,98,421,120,50 };

		int a = z[0];

		for (int i = 1; i < z.length; i++) {

			if (a < z[i]) {

				a = z[i];

			}
		}System.out.println(a+" is greatest number");
		
		// another way to find greatest number
		
		int[]arr= {10,50,46,32,102,78,41,85};
		int b=arr[0];
		int i =1;
		while(i<arr.length) {
			if(b<arr[i]) {
				b=arr[i];
				
			}
			i++;
		}System.out.println(b+" is greatest number");
		

	}

}
