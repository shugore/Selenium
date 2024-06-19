package ArrayTest;

import java.util.TreeSet;

public class RemoveDuplicatesFromArray {
	private static TreeSet TreeSet;

	public static void main(String[] args) {

		int[] array = { 10, 20, 50, 80, 150, 50, 90, 20, 120, 20 };

		TreeSet single = new TreeSet();
		TreeSet duplicate = new TreeSet();

		for (int i = 0; i < array.length; i++) {

			boolean b = single.add(array[i]);

			if (b == false) {

				duplicate.add(array[i]);
			}
			if (duplicate.contains(array[i])) {

				single.remove(array[i]);
			}

		}
		Object[] revisedArray = 	single.toArray();
		System.out.println("Revised Array after removing duplicates ::");
	
        for (int i = 0; i < revisedArray.length; i++) {
			
				System.out.println(revisedArray[i]);
        }
	}
 
}
