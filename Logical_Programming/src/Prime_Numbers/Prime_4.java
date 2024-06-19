package Prime_Numbers;

public class Prime_4 
{
	public static void main(String[] args) {
		int no = 131 ;
		
		
		for(int i =2;i<no;i++) {
			
			if(no%i==0) {
				System.out.println("no is not prime");
				
				System.exit(0);
				
			
			}
		
			
		}	System.out.println("no is prime");;
	}

}
