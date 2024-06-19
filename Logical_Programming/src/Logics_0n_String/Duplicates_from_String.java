package Logics_0n_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicates_from_String {
	public static void main(String[] args) {

//		Map<Character,Integer> map =new HashMap<>();
//		for(int i =0;i<a.length();i++) {
//			
//			//System.out.println(a.charAt(i));
//			
//			if(map.containsKey(a.charAt(i))) {
//				
//				map.put(a.charAt(i), map.get(a.charAt(i))+1);
//				
//			} else {
//				
//				map.put(a.charAt(i), 1);
//			}
//			
//		}
//		for(Entry<Character, Integer> e:map.entrySet()) {
//			if(e.getValue() > 1) {
//				System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
//			}
//		}
		String a = "abcdbghai";

		while (a.length() != 0) {

			char c = a.charAt(0);

			int length = a.length();

			a = a.replaceAll(String.valueOf(c), "");

			if (length - a.length() > 1) {

				System.out.println(c + "  is duplicate");
			}
		}

		String[] str = { "5M", "22K", "223K", "6M", "7770K", "8M" };

		int[] arr = new int[str.length];
		String s = "";
		for (int i = 0; i < str.length; i++) {
			s = str[i];
			if (s.charAt(s.length() - 1) == 'M') {
				s = s.replace("M", "000000");
			} else if (s.charAt(s.length() - 1) == 'K') {
				s = s.replace("K", "000");
			}
			arr[i] = Integer.valueOf(s);

		}

		for (int i : arr) {
			System.out.println(i);
		}

	}

}
