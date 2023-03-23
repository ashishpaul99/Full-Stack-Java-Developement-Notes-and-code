//Three methods inside catch block we usually write

//see class notes at : 1:50:00
//->Methods to Print Exception Information
//   (throwable)
//1. getMessage
//2. toString()
//3. printStackTace()

//e is reference of Exception given in below program
//1.e.getMessage()-> prints the Description of the exception.
//eg:  / by zero

//2.e.toString()->prints the name and the description of 
//                exception.
//eg: 
//	java.lang.ArithmeticException: / by zero

//3.e.printStackTrace()->prints the name and the description 
//                   of Exception along with the stack trace.
//eg:
//	java.lang.ArithmeticException: / by zero
//	at Alpha6.alpha6(Exception16.java:28)
//	at Exception16.main(Exception16.java:45)

//-> we can know this details after handling the exception.

import java.util.Scanner;
class Alpha6
{
	void alpha6() 
	{
		System.out.println("Connection to Calc app is established");
	    try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first num to divide");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd num to divide");
		int num2=scan.nextInt();
		
		 int res=num1/num2;
		
		System.out.println("The res is "+ res);
	    }
	    catch(ArithmeticException e) {
	    	System.out.println("give write input");
	    	System.out.println(e.getMessage());
	    	System.out.println(e.toString());
	    	e.printStackTrace();
	    }
		
	}
}
public class Exception16 {

	public static void main(String[] args) {
		Alpha6 a=new Alpha6();
		a.alpha6();

	}

}

//output: 
//Connection to Calc app is established
//Enter the first num to divide
//100
//Enter the 2nd num to divide
//0
//give write input
/// by zero
//java.lang.ArithmeticException: / by zero
//java.lang.ArithmeticException: / by zero
//	at Alpha6.alpha6(Exception16.java:28)
//	at Exception16.main(Exception16.java:45)

//-->finally will be executed 
//1. if there is not exception finally block get executed. 
//2. if exception occurs and catch block matches.
//-->Finally block will not execute. 
//3. if exception occur and catch block not matched.

//Purpose of finally block
//see picture in notes 1:55:00
//1. connection is established with data base
//2. something is happen in code then at any cost for closing 
//   opened Resources we use finally block. 
//3. irrespective of the things .finally block get executed.



