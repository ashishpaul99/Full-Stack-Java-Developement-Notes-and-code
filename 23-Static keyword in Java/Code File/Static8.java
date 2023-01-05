//static method directly by class name
class Demo5{
	static int a;
	
	static {
		a=10;
	}
	static void disp1() {
		System.out.println("value of a:"+ a);
	}
}
public class Static8 {
	static void disp2() {
		System.out.println("Disp 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		disp() method is called
		System.out.println("main method");
		
//		disp1() method is called by class name
		Demo5.disp1();
		
//		disp2() method is called by by method name itself beacuse 
//		it is present in same class
		
		disp2();

	}

}


