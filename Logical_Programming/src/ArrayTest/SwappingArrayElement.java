package ArrayTest;

public class SwappingArrayElement {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		
		int temp=a[1];
		a[1]=a[2];
		System.out.println(a[1]);
		a[2]=temp;
		for(int b:a) {
			System.out.println(b);
		}
	}

}
