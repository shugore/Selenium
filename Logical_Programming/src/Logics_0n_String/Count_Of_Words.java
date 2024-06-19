package Logics_0n_String;

public class Count_Of_Words 
{
	public static void main(String[] args) {
		
	 String s1 = "Total  words             present    in the string.";
	
	 
	 
	
	 int count =0;
	 //System.out.println(s1.split(" ").length);
	
		
		for( int i = 0; i<s1.length(); i++) {
			
			if(s1.charAt(i)==' ') {
				
				
				count++;
				while(s1.charAt(i+1)==' ') {
					i++;
				}
			}
		}count++;
		//System.out.println("Total Number of words in s1 :- "+count);
	}
	

}







//int i = s1.length();
// int j = s2.length()-1;
 //System.out.println(s2.charAt(0));
