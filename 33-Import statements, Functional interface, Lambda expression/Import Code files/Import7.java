
//example 1:
//class Test{
//	static String name="sachin";
//}
//public class Import7 {
//
//	public static void main(String[] args) {
//		System.out.println(Test.name.length());//6
//
//	}
//
//}

//example-2: System.out.print();

//class System{
//	static PrintStream out;
//	
//}
//
//class PrintStream{
//	public void println() {
//		
//	}
//}

//if we want call print() method 
//we have create object of class PrintStream
//object of PrintStream is available in System class
//printStream is available in java.io package

//using System class name to access object  out
//using object of PrintStream we make call to println() method

//System.out.print();

//System- it is class
//out -it is reference of PrintStream class
//println- it is method of PrintStream class

//out is static variable


//example-3: using out by static import
//import static java.lang.System.out;
//public class Import7 {
//
//	public static void main(String[] args) {
//		out.println("Hello");//Hello
//
//	}
//
//}

//in wrapper classes we have two variables static and final
// public static final int MIN_VALUE;
// public static final int MAX_VALUE;


//example 4: finding MAX and MIN value of int static Import 
//Min and Max value of integer
//import static java.lang.Integer.*;
//public class Import7 {
//
//	public static void main(String[] args) {
//		System.out.println(MAX_VALUE);//2147483647
//		System.out.println(MIN_VALUE);//-2147483648
//
//	}
//
//}

//example 5: if two static import are imported 
//both contains the same methods then compiler get confused

//import static java.lang.Byte.*;
//import static java.lang.Integer.*;
//
//public class Import7 {
//
//	public static void main(String[] args) {
//		System.out.println(MAX_VALUE);//2147483647
//		System.out.println(MIN_VALUE);//-2147483648
//
//	}
//
//}

//example 6://telling explicitly it consider upper two 
//             import

//import static java.lang.Byte.MAX_VALUE;
//import static java.lang.Byte.MIN_VALUE;
//import static java.lang.Integer.*;
//
//public class Import7 {
//
//	public static void main(String[] args) {
//		System.out.println(MAX_VALUE);//127
//		System.out.println(MIN_VALUE);//-128
//
//	}
//
//}

//example 7:
//>>class notes start<<
//Note:
//Two packages contain a class or interface with the same is very rare hence
//ambiguity problem is very rare in normal import.
//
//But 2 classes or interfaces can contain a method or variable with the same name is
//very common hence ambiguity problem is also very common in 
//static import.
//
//While resolving static members compiler will give the precedence in the following
//order.
//1. Current class static member
//2. Explicit static import
//3. implict static import

//>>class notes end>>

//rule followed by compiler when conflict occurs Compiler 
//follow this order.
//			Current class
//			Explicit import
//			Implicit import



//-->here compiler gives preference for current class
//import static java.lang.Byte.MAX_VALUE;
//import static java.lang.Integer.*;
//
//public class Import7 {
// 
//	
//	static int MAX_VALUE=999;
//	public static void main(String[] args) {
//		System.out.println(MAX_VALUE);//999
//	
//
//	}
//
//}

//example 7:
//--> here it gives preference for Explicit import
//import static java.lang.Byte.MAX_VALUE;
//import static java.lang.Integer.*;
//
//public class Import7 {
// 
//	public static void main(String[] args) {
//		System.out.println(MAX_VALUE);//127
//	
//
//	}
//
//}

//example 8:
//--> here it gives preference for Integer
//import static java.lang.Integer.*;
//
//public class Import7 {
// 
//	public static void main(String[] args) {
//		System.out.println(MAX_VALUE);//2147483647
//	
//
//	}
//
//}

//Which of the following import statement is valid?
// import java.lang.Math.*; //invalid(static is missing)
// import static java.lang.Math.*;//valid
// import java.lang.Math;//valid(normal import)
// import static java.lang.Math;//invalid
// import static java.lang.Math.sqrt.*;//invalid
// import java.lang.Math.sqrt;//invalid(static is missing)
// import static java.lang.Math.sqrt();//invalid(sqrt() fucntion not allowed)
// import static java.lang.Math.sqrt;//valid


//Usage of static import reduces readability and creates 
//confusion hence if there is no specific requirement never 
//recommended to use static import.


//What is the difference between general import and static 
//import ?

//normal import
//============
// => We can use normal imports to import classes and interfaces of a package.
// => whenever we are using normal import we can access class and interfaces directly
//by their short name it is not
// require to use fully qualified names.


//static import
//===========
//=> We can use static import to import static members of a particular class.
//=> whenever we are using static import it is not require to use class name we can
//access static members directly.

//creation of user defined package
//instanceof vs isinstance()




