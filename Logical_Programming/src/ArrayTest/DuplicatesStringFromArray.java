package ArrayTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class DuplicatesStringFromArray {
	public static void main(String[] args) {
		
	
	String[] str = { "sg", "ah", "sg", "sh", "ah", "vu", "sg", "ak", "ah","vu" };
	
	
	
	
	
	TreeSet t = new TreeSet();
	TreeSet t1 = new TreeSet();
	
	for (int i = 0; i < str.length; i++) {
		
		boolean b = t.add(str[i]);
		
		if(b==false && !t1.contains(str[i])) {
			
			t1.add(str[i]);
			
			System.out.println(str[i]+" is repeating from array.");
		}
	
		}
		
		
		
	}
	
	
}
		
		
		







//List<String> list = new ArrayList(Arrays.asList(str));


//list.removeIf(x -> {
//	List<String> list1 = new ArrayList<>(list);
//	list1.removeAll(list1.subList(list1.indexOf(x), list1.indexOf(x)+1));
//	return !(list.size()-list1.size() > 1);
//});
//Set<String> set = new TreeSet<>(list);
//System.out.println("duplicates:" + set);
