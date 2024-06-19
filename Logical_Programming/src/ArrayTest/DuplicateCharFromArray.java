package ArrayTest;

import java.util.TreeSet;

public class DuplicateCharFromArray {
	public static void main(String[] args) {
		
		char [] arr = {'f','d','s','s','w','a','d'};
		
		TreeSet t = new TreeSet();
		TreeSet t1 = new TreeSet();
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean b = t.add(arr[i]);
			
			if(b==false && !t1.contains(arr[i])) {
				
				t1.add(arr[i]);
				
				System.out.println(arr[i]+" is repeating character.");
			}
			
		}
		
	}

}
