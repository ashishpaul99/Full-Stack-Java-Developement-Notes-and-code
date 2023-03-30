

//2. Normal termination and Abnormal termination
//1. Normal Termination-
//->Smoothly executes no exception in code.
//->if exception occurs also we have handling logic in 
//  application.
//2. Abnormal Execution- 
//->Execution occurred and resulted in exception.
//->if we don't have handling logic in our application and if
//  the exception object delegated to JVM(default exception 
//  handler) then it is abnormal termination.

//3. Try with Multiple catch block
//->Till jdk1.6,even though we have multiple exception having
// same handling code we have to write a separate catch block 
// for every exceptions, it increases the length of the code 
// and reduces readability.

//-> we can write same references for exception variable.
//->they are local variable the scope is limited to the 
//   block.
//->what is handling logic of all the catch blocks in code?
// here handing logic same for all catch blocks. here lines
// of code is getting increased.
//->this is the problem when we work with jdk 1.6 version.

//eg:
//import java.io.IOException;
//public class Exception37 {
//
//	public static void main(String[] args) {
//		try {
//			//Some risky code
//		}
//		catch(ArithmeticException e) {
////			handling code
//			e.printStackTrace();
//		}
//		catch(NullPointerException e) {
////			handling code
//			e.printStackTrace();
//		}
//		catch(ClassCastException e) {
////			handling code
//			System.out.println(e.getMessage());
//		}
//		catch(IOException e) {
////			handling code
//			System.out.println(e.getMessage());
//		}
//	}
//}

//3.1 Solution for the problem
//->To overcome this problem SUNMS has introduced 
//  "Multi catch block" concept in 1.7 version.
//->in JDK 1.7 we can use try with multiple catch block
//  to reduce to the lines of code.

//->above is code is written with try with multiple catch block.
//import java.io.IOException;
//eg-1:
//import java.io.IOException;
//public class Exception37 {
//
//	public static void main(String[] args) {
//		try {
////			Some risky code
//		}
//		catch(ArithmeticException | NullPointerException e){
////			handling code
//			e.printStackTrace();
//		}
//		catch(ClassCastException | IOException e) {
////			handling code
////			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}
//}

//=>Rule to use try with Multi catch block
//In multi catch block,there should not be any relation b/w
//exception types(either child to parent or parent to child 
//or same type) it would result in compile time error.

//eg-2:\import java.io.IOException;
public class Exception37 {

	public static void main(String[] args) {
		try {
//			Some risky code
			int a=10/0;
			System.out.println(a);
		}
		catch(ArithmeticException |Exception e){
//			handling code
			e.printStackTrace();
		}
	}
}

//output:

//new1.java:1: error: class Exception37 is public, should be declared in a file named Exception37.java
//public class Exception37 {
//       ^
//new1.java:9: error: Alternatives in a multi-catch statement cannot be related by subclassing
//                catch(ArithmeticException |Exception e){
//                                           ^
//  Alternative ArithmeticException is a subclass of alternative Exception
//2 errors

//->here there is a possibility of exception object can be 
// collected by two exception.
//->here compiler will give error because confusion occurs.
//->Compiler telling to read syntax
//->we can write any number of exception in catch block if 
//  the handling logic is same for all
