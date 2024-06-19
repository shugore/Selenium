package Logics_0n_String;

public class DuplicatesFromArray {
	
	public static void main(String[] args) {
		
		int [] z = {10,20,30,40,30,20,10};
		
		int p =z[0];
		
		int length = z.length-1;
		
		while(length >= 0) {
			
			System.out.println(z[length] );
			length--;
			
		}
	}

}
