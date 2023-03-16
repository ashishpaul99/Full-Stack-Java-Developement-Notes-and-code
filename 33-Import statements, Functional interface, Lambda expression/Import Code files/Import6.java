//9. Static Import
//->observe in lang package we Math class
//->type in cmd--> javap java.lang.Math
//->check access modifiers of methods
//->all methods are static


//->if a class contains every method to be static  those 
//  methods we call it as helper methods that class we call 
//  it as helper class

//they are also called utility methods

//see for public static double sqrt(double); method
//we can directly called this method because it is static.

//>>class Notes start
//Static import:
//This concept introduced in 1.5 versions. According to sun static import improves
//readability of the code but according to worldwide 
//Programming exports (like us) static imports creates 
//confusion and reduces readability of the code.

//Hence if there is no specific requirement never recommended 
//to use a static import.

//Usually we can access static members by using class name 
//but whenever we are using static import it is not require 
//to use class name we can access directly.

//class notes end



//import java.lang.*; //normal import where * refers to .class files of cwd
//public class Import6 {
//
//	public static void main(String[] args) {
//
//		System.out.println(Math.sqrt(16));
//		
//		System.out.println(Math.max(10, 20));// public static int max(int, int);
//		System.out.println(Math.random());// we use this for generate otp in 
//		                                  //real time
//			
//
//	}
//
//}

//same code we write with static import

//Static import- no need to tell class name
//when we work with static import to call static method 
//no need to class name

//if static methods and static variables are used in class
//where that class is present somewhere go static import.

//Advantages of static import
//no need give class name. directly we use them.

//Explicit import
//import static java.lang.Math.sqrt;
//import static java.lang.Math.random;
//import static java.lang.Math.max;

//implicit static import
//import static java.lang.Math.*;

//public class Import6 {
//	public static void main(String[] args) {
//
//		System.out.println(sqrt(16));
//		
//		System.out.println(max(10, 20));// public static int max(int, int);
//		System.out.println(random());// we use this for generate otp in 
//		                                  //real time
//			
//
//	}
//
//}


//output: 
//	4.0
//	20
//	0.9300142231098597

