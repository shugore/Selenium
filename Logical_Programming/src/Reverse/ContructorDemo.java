package Reverse;

class Parent {
	
	int a = 10;
	
	int b = 20 ;
	
	public Parent() {
		
	    int a=5;
	    int b=8;
	    
	    a=  this.a  ;
	    b = this.b  ;
	    
		int c = a * b ;
		
		
		System.out.println(c);
	}
	
	void m1() {
		
		int a = 50;
		int b = 60;
		int c = a*b;
		System.out.println(c);
	}
}
public class ContructorDemo extends Parent {



	public static void main(String[] args) {
		ContructorDemo demo = new ContructorDemo();
		
		demo.m1();
	}

}
