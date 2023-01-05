class Demo{
//1. static variables
	static int a;
	static int b;
	
//a. static block
	static {
//	accessing static variables 
		System.out.println("static block");
		a=10;
		b=20;
		
		
	}
//Printing values present static variables
//b. static method
	static void disp() { 
		System.out.println("static mehtod");
		System.out.println(a);
		System.out.println(b);
	}
	
//>>2. instance variables
	int x;
	int y;
	
//a. java block or non static java block
	{
		System.out.println("non static java block");
		x=30;
		y=40;
	}
	
//b. Constructor
	Demo(){
		System.out.println("Constructor");
	}
	
//printing values stores in instance variables
//c. non stactic method
	void disp1() {
		System.out.println("Non static method");
		System.out.println(x);
		System.out.println(y);
	}
	

	
	
	
}
public class Static1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. accessing static elements(no need to create object for accessing)
//		Demo.disp();
		
//		creating object
//		2. accessing non-static elements(dneed to create object for accessing)
//		Demo d=new Demo();
//		d.disp1();
//		

	}

}
