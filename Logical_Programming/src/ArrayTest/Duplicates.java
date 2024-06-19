package ArrayTest;

public class Duplicates {
	
	public void run() {
		
	}
	
	public static void main(String[] args) {
		
		int [] arr= {10,20,50,40,50,20,30,60,20};
		int [] brr = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					int k = 0;
					for(k = 0; k < count; k++) {
						if(brr[k]==arr[i]) {
							break;
						}
					}
					if(count == k ) {
						brr[count++] = arr[i];
					}
				}
				
			}
			
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(brr[i]);
		}
		
	}

}
  