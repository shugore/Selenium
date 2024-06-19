package ArrayTest;

import java.util.Iterator;

public class SecondLargestNumber {
	public static void main(String[] args) {

		int[] arr = {26, 120, 10, 50, 46, 32, 102, 78, 41, 85,10 };
		
		int n =3 ;
		
		for (int i = 0; i < arr.length; i++) {
			
			int count = 0;
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					
					count++;
					
				}
			}
			if(count == n-1) {
				
				System.out.println(arr[i] + "is " + n + "th greatest number");
				
				System.exit(0);
			}
		}

	}
} 