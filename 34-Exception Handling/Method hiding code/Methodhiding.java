//>>Method Hiding
//static methods participate in inheritance.
//but we cannot override static method.
//if we overridden static method it is treated as specialized 
//method.

//this concept is called as method hiding.


//->Remaining part of inheritance(previous lectures)
//we call methods by class name and reference of object also.
//using parent reference in child we can access
//1. Inherited methods
//2. Overridden methods

//we cannot access specialized method directly. 
//compiler gives error.

//example-1
//for child type object parent type reference is created.
//calling disp method

//class Parent{
//		public void disp() {
//			System.out.println("hello parents");
//		}
//}
//
//class Child extends Parent{
//		public void disp1() {   //specialized method
//			System.out.println("Hello child");
//		}
//}
//public class Methodhiding { 
//
//	public static void main(String[] args) {
//		Parent p=new Child();
//		p.disp();
////		p.disp1();
//
//	}
//
//}

//example-2 : static methods do participate in inheritance.

//making disp as static. 
//static methods do participate in inheritance.

//class Parent{
//		public static void disp() {
//			System.out.println("hello parents");
//		}
//}
//
//class Child extends Parent{
//		
//}
//public class Methodhiding { 
//
//	public static void main(String[] args) {
//		Parent p=new Child();
//		p.disp();
//		
//
//	}
//
//}

//output: hello parents

//example 3:
	
//-> disp is overridden method
//for child type object parent type reference is created.
//accessing overridden by method in the child class
//class Parent{
//		public void disp() {
//			System.out.println("hello parents");
//		}
//}
//
//class Child extends Parent{
//		public void disp() { // overridden method
//			System.out.println("hello child");
//		}
//}
//public class Methodhiding { 
//
//	public static void main(String[] args) {
//		Parent p=new Child();
//		p.disp();//hello child
//		
//
//	}
//
//}

//output: hello child

//example 4:
//static methods participate in inheritance.
//but we cannot override static method.
//if we overridde static method it is treated as specialized 
//method

//this concept is called as method hiding

class Parent{
		public static void disp() {
			System.out.println("hello parents");
		}
}

class Child extends Parent{
	public static void disp() {
		System.out.println("hello child");
	}
}
public class Methodhiding { 

	public static void main(String[] args) {
		Parent p=new Child();
		p.disp();//hello parents
		Child c=new Child();//--> we access method in child
		c.disp();//hello child
		

	}

}

//output: hello parents


	
//->lambda expression expression in multi threading concept
//in built predefined interface- runnable interface. 
//it has one abstract method which is run method 