 package Armstrong_FibonnaciDemo;

import java.util.Iterator;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int limit = 15;
		System.out.println("Fibonacci series:-");
		
		System.out.print(a+" "+b);
		
		for (int i = 2; i < limit; i++) {
			   int c=a+b;                                //0 1 1 2 3 5 8 13 21 34 55 
			
			  
			   a=b;
			   b=c;
			  System.out.print(" "+c);
		}
	}

}
