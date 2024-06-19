package ArrayTest;

import java.util.TreeSet;

public class DuplicatesFromArray {
	public static void main(String[] args) {
		
		int[] arr= {10,20,50,80,150,50,90,20,120,20,20,20,20,20,20,20};
		
		TreeSet t = new TreeSet();
		TreeSet t1 = new TreeSet();
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean b = t.add(arr[i]);
		
			
			if(b==false && !t1.contains(arr[i])) {
				t1.add(arr[i]);
				
				System.out.println(arr[i]+" is repeating element.");
		
			
		}
		}
	}
}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
