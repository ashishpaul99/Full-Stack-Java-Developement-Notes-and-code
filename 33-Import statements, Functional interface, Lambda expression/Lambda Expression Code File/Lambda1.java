//	every method in interface is abstract and public.
//	body has to be given  for the methods in interface

//1. functional interface- if an interface has single abstract 
//method or one abstract method that particular interface is 
//called functional interface.

//>>it should only have one abstract method to write lambda
//expression.


//2. Relation between functional interface and lambda expression

//whenever there is interface which has single abstract method 
//or one abstract method we can write lambda expression.

//whenever there is functional interface we can write lambda 
//expression.

//Lambda expression and function interface work together.
//they are useless without each other.

//interface which more than one abstract method it is not called 
//function interface. if we write lambda expression for interface with more than 
//one abstract method it result in error.

//we cannot write lambda expression if interface has more than
//one method.

//3. @FunctionalInterface Annotation- telling compiler and developer that 
//this is functional interface.

//it is extra information added to code.
//it is indication to developer and compiler.
//so developer will not do mistake of adding one more method
//in interface.
//if developer does mistake compiler throw error.



//-->it is functional interface.
//@FunctionalInterface
//interface Demo
//{
//
//	void disp();//abstract method
//	void disp1();
//	
//	
//}
//public class Lambda {
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}


//>>in java if you want write activity we use method
//printing something on console
//void disp() {
//	Systerm.out.println();
//}

//4. Lambda operator
//in java 8 
//they introduced a operator. which looks like arrow.
//it is called arrow operator or lambda operator.
//Symbol : --> 

//to write lambda expression they introduced arrow operator.
//we need Lambda operator to write lambda expression.

//->5. How to write lambda expression?

//lambda expression is anonymous method.
//writing method without name.

//lambda expression is an unnamed or anonymous method

//void disp() return type, name of method and parameter
//{
//	System.out.println(); //body of method
//}

//How to write lambda expression?
//1. we need to use Lambda operator to write lambda expression.

//2. divide operator into two parts
//to left of arrow operator mention the parameters required.
//to right of arrow operator write the body.

// ( ) -> {
//	 
//         system.out.print("hello world");
// 
//        }
 
// 3. implementation or body have single statement then
// curly brackets are optional.

// eg- ( ) -> system.out.print("hello world");

//->we can call method with its name 

//void disp() return type, name of method and parameter
//{
//	System.out.println(); //body of method
//}

//->disp();

//4. no name for lambda how we can call?
//lambda expression never be written alone. 
//lambda expression is dependent on functional interface.
//they work together

//->functional interface also interface.
//->we can create object or reference for functional 
//interface

//example 1: here it is one line implementation of method
//@FunctionalInterface
//interface Demo
//{
//
//	void disp();//abstract method
//	
//	
//	
//}
//public class Lambda1 {
//
//	public static void main(String[] args) {
////		Demo d= ()->
////		{
////			System.out.println("Hello world");
////		};
////		or
////	 ==>alternative for above code
////		no need of curly brackets if we have one statement 
////		body
////	-> implement the interface in one line
//		Demo d= ()->System.out.println("Hello world");
//		d.disp();//Hello world
//
//	}
//
//}

//we can implement in just one line. 
//-> lambda expression is called magic operator.

//java is not pure oop language
//java is oop language- before java is pure veg
//little impure because of primitive data types-- egg is added 
//after adding functional interface it is impure

//exampl2:implementing functional interface by class
//traditional way of implementing a Interface
//it is lengthy alternative for above code
//@FunctionalInterface
//interface Demo
//{
//
//	void disp();//abstract method	
//}
////traditional way of implementing a Interface
//class Trail implements Demo{
//	public void disp() {
//		System.out.println("hello java ");
//	}
//}
//public class Lambda1 {
//
//	public static void main(String[] args) {
//
//		Trail t=new Trail();
//		t.disp();//hello java
//		
//
//
//	}
//
//}

//--> functional interface is a interface which consist of 
//    single abstract method.
//--> we can implement functional interface by any class however 
//    usually we implement using lambda expression.
//-->lambda expression body contain single line then no curly 
//   brackets are optional.
//-->Lambda expression not written independently it has to be 
//   written using the functional interface.


//example-3:we can write implement method by anonymous 
//inner class. after using lambda expression is being using 
//people stop using anonymous inner class.

//@FunctionalInterface
//interface Demo
//{
//
//	void disp();//abstract method	
//}
//
//public class Lambda1 {
//
//	public static void main(String[] args) {
//
//		Demo d=new Demo() {
//			 public void disp() {
//				System.out.println("hello");
//			}
//		};
//		
////		calling disp method
//		d.disp();//hello
//	}
//
//}

//1. Implementing interface by using class
//2. Implementing interface by anonymous inner class 


//example-4: implementing interface which has two methods
//by anonymous inner class
//interface Demo
//{
//
//	void disp();//abstract method	
//	void add(int a, int b);
//}
//
//public class Lambda1 {
//
//	public static void main(String[] args) {
//
//		Demo d=new Demo() {
//			 public void disp() {
//				System.out.println("hello");
//			}
//			 public void add(int a, int b) {
//				 int c=a+b;
//				 System.out.println(c);
//			 }
//		};
//		
////  >>calling disp method
//		d.disp();//hello
//		d.add(10, 20);//30
//	}
//
//}

//above cannot be implemented by lambda expression

//implementing multiple interfaces in same class by using
//anonymous


