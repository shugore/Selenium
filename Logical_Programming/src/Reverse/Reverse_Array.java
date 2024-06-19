 package Reverse;

public class Reverse_Array 
{
	public static void main(String[] args) {
		
		int a [] = {10,20,30,40,50};
		
		int i = a.length-1 ;
		
		System.out.println("Reversed Array : -");
		
		while(i >= 0) {
			
			
			System.out.print( a[i]+" ");
			
			i--;
			
		}
	}

}
