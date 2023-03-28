//4. Asynchronous Exception vs Synchronous Exception
//see pictures at 1:45:00 to 1:46:00
//->Some exception occur at specific position.
//->Some exception we don't know possibility of exception 
//  occurs.

//eg:
//string=null;
//->if you change upper case and lower case then it gives 
//  Exception.

//Live class notes
//1. Synchronous Exception-
//->occurs at a specific program statement.
//where you done mistake there only it occur not everywhere.
//eg:
//1. ArithmeticException
//	System.out.println(10/0);->Synchronous Exception
//2.ArrayIndexOutOfBoundsException-Synchronous Exception
//	it is occurring at specific position when you try
//  Accessing position out of boundary.
//  ->Buffer over run  in java

//Example-3
//->Actual string object is not stored in str
//->it throws exception when str is converted to Uppercase.
//->it leads exception at the run time called as 
//  NullPointerException.

//public class Exception25 {
//
//	public static void main(String[] args) {
//		String str=null;
//		str.toUpperCase();
//	}
//
//}

//output:
//	Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "str" is null
//	at Exception25.main(Exception25.java:34)

//Example-4
//->here 5 means 0 to 4
//->5th is out of boundary.
//->it throws Exception at runtime called as ArrayIndexOutOfBoundsException 
//-> here Exception is occurring at specific point.

//public class Exception25 {
//
//	public static void main(String[] args) {
//	int[] a=new int[5];
//	a[5]=10;
//	}
//
//}
//
//output:
//	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//	at Exception25.main(Exception25.java:53)

//2. Asynchronous Exception
//->Exception occurs anywhere in the program.

//Example-1:
//here instead of giving input if we give something else
//like CTRL+C it gives keyboard interrupts Exception.

//import java.util.Scanner;
//public class Exception25 {
//
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter name");
//		String name=scan.next();
//		System.out.println("Enter grades");
//		String grades=scan.next();
//		System.out.println(grades);
//	}
//
//}

//OUTPUT:
//	Enter name
//	ASHISH
//	Enter grades
//	CTRL+C -->Keyboard interrupt
//  Exception in thread "main" Terminate batch job(Y/N)?

