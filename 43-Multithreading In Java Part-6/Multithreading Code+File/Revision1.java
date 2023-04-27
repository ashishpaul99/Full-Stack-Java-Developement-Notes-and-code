//Revision class by Navin Reddy Sir

//1. Java
//->JAVA is platform independant.
//->it is object oreinted language.
//->the execution of code and creation of object done by JVM.
//->JVM->Java Virtual Machine


//2. Main method
//->we write main method to execute code.

//Method Defination
//public static void main() {
//	
//}

//->main is the part a class.

//3. Class in Java
//->to create object we need blue print.
//->class is basically a design.
//->class- It is a template or blueprint from which objects 
//         are created.
//->Based on the design we create a object.
//->we have to create a class then we can create object.
//->every class has name.

//3.1 Creating class
//public class Revision {
//	public static void main(String[] args) {
//
//		
//
//	}
//
//}

//4. Compiling and runnnig Java program
//->In order to execute we have to compile the code and 
//  run the code.
//->Compile Code- javac file.java
//   eg: javac Revision1.java
//->Run code- java file name
//   eg: java Revision1

//->Instead of two steps we can directly compile and run in 
//  in single step in Latest version of Java.
//    java file name.java

//eg: java Revision.java

//->it works for one file.
//->it will not work when we work on multiple files.


//5. Command Line arguments
//->Passing data or pararmeters while running code and the 
//  data is collected in array of string.
//->Main will accept the data in array of string.

//->String[] args

//public class Revision1 {
//	public static void main(String[] args) {
//
//		System.out.println();
//
//	}
//
//}

//6. Printing Something in Java
//->there is method name print() in java to print on console.
//->Print() is method of PrintStream class.
//->No need create a object of print stream by ourselves.
//->out object is already created in System class
//public static final PrintStream out = null; in System class.

//->Enable Extension pack for Java in VS code to see 
//info about methods.
//-> press Ctrl+Shift+T (for a type) 
//-> Ctrl+Shift+M (for a method)


//7. System.out.println(); Explaination
//->System is class present in java lang package.
//->there is static vaiable of type print stream which is out.
//->out is static variable present in System class of type
//  print stream.
//->out is static varible we can access it by class name 
//  directly.
//->Println() is method present in print stream class. 
//  that's we are calling println method on out.

//               System.out.println();


//class System{
//	static PrintStream out;
//}


//eg:
//class Test{
//	static String s= "java";
//	
//}

//Accessing s static variable of Test class
//->Test.s.length();
//Test is a class name.
//s is static variable presrent in Test class of String type.
//lenght is method presnt in String class