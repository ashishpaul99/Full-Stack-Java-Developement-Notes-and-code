//=>Interface new feature In Java-8
//->the methods inside interface are by default public and 
//  abstract.
//->whoever wants they can implement the methods.
//->Which ever class is going to implement they have to provide
//  implementation for those methods.
//->the methods must override.
//->To override a method it is mandatory to make it public.
//->Java is taken by Oracle. they made lot of changes.
//->Java Alpha to Java 8  ->15 years.


//=>Interface New Feature Introduced in Java-8
//1. Feature-1 : default method inside interface.
//->In Java 8 Interface need not have public abstract methods.
//->it is not necessary to have public abstract method inside 
//  Interface. 
//->In java inside interface along with public absract methods
//  we can also have methods with a body however  it must and 
//  should have default keyword. 
//->It is compulsory to write default keyword for a method 
//  which has body inside interface.
//eg:
//  default void disp() {
//		System.out.println("normal method alowed");
//	}

//->By nature abstract methods get inherted into implemented
//  class there we override the method.
//->default methods will inherited in implemented class.
//->Default methods can be overrided in Implemented class.
//->default methods will inherited in implemented class but 
//  overriding is optional.
//->we cannot create object of interface that's the reason we
//  cannot call default method in the Interface.
//->These feature used when all implemented classes needs method 
//   with body.

//Example-1: writing default method with a body in interface 
//interface Hyder
//{
//	void teaches();      //public abstract void teaches();
//	void writesCode();   //public abstract void wirtesCode();
//	
////	New feature -we can also have methods with a body however  it must and should have default keyword.
//	default void disp() {
//		System.out.println("normal method allowed");
//	}
//	
//	
//}
//class Student implements Hyder{
//	public void teaches() {
//		System.out.println("Hyder teaches Java");
//	}
//	
//	public void writesCode() {
//		System.out.println("Hyder write code");
//	}
//}
//
//public class Map11 {
//
//	public static void main(String[] args) {
//		
////		Creating object of implementing class
//          Student s=new Student();
//          s.teaches();
//          s.writesCode();
//          s.disp(); // here we can know default method is inherited in 
////                      Implemented class
//
//	}
//}
//Output:
//Hyder teaches Java
//Hyder write code
//normal method allowed

//Example-2: default method written in interface can be overrided.
//->Default methods can be overrided in Implemented class.
//interface Hyder
//{
//	void teaches();      //public abstract void teaches();
//	void writesCode();   //public abstract void wirtesCode();
//	
//	default void disp() {
//		System.out.println("normal method alowed");
//	}
//	
//	
//}
//class Student implements Hyder{
//	public void teaches() {
//		System.out.println("Hyder teaches Java");
//	}
//	
//	public void writesCode() {
//		System.out.println("Hyder write code");
//	}
//  ->default method written in interface can be overrided.
//	public void disp() {
//		System.out.println("Default method can be overrided");
//	}
//}
//
//public class Map11 {
//
//	public static void main(String[] args) {
//		
////		Creating object of implementing class
//          Student s=new Student();
//          s.teaches();
//          s.writesCode();
//          s.disp(); // here we can know default method is inherited in 
////                      Implemented class
//
//	}
//}

//Questions
//1. Will defaults methods will inhertied in implemented class?
//->default methods will inherited in implemented class.

//2. Can we override default methods in implemented class?
//->Default methods can be overrided.





//Feature-2: Static method inside interface
//->In Java 8 inside interface we can have static method however
//  that static method will not inherited in implementing classes.
//->static methods are object independent. In order to call static 
//  method non neeed to create object. 
//->we can Invoke static method by Interface name.


//Example-3: Static method inside interface.
//->In Java 8 inside interface we can have static method however
//  that static method will not inherited in implementing classes.
//->static methods are object independent. In order to call static 
//  method non neeed to create object. 
//->we can invoke static method by using Interface name.

//interface Hyder
//{
//	void teaches();      //public abstract void teaches();
//	void writesCode();   //public abstract void wirtesCode();
//	
//	default void disp1() {
//		System.out.println("normal method allowed");
//	}
//	
//	static void disp2() {
//		System.out.println("Static method in Interface");
//	}
//
//	
//	
//}
//class Student implements Hyder{
//	public void teaches() {
//		System.out.println("Hyder teaches Java");
//	}
//	
//	public void writesCode() {
//		System.out.println("Hyder write code");
//	}
//// ->default method written in interface can be overrided.
//	public void disp() {
//		System.out.println("Default method can be overrided");
//	}
//}
//
//public class Map11 {
//
//	public static void main(String[] args) {
//		
////		Creating object of implementing class
//          Student s=new Student();
//          s.teaches();
//          s.writesCode();
//          s.disp1();
//           
////       ->calling static methods by using class name
//          Hyder.disp2();
//	}
//}

//Output:
//	Hyder teaches Java
//	Hyder write code
//	normal method allowed
//	Static method in Interface