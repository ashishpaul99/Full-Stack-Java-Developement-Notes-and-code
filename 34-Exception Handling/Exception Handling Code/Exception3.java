

//1. Exception Handling-
//exception handling is process of handling exception in such
//a manner because of which abnormal termination application 
//should not happen.

//see notes
//Exception--> unwanted event--> runtime--> abnormal
// handling Exception--> abnormal termination not to be 
// happen

//keywords we use 
//try, catch, throws,throw, finally....
//see notes

//Runtime stack- anything in program brought into run time 
//stack for execution.
//see picture

//thread will execute everything in run time stack.
//==>Activity in stack frame
//1. any activity we write inside method. it is brought into 
//to run time stack for execution. here thread will execute that
//activity.

//2. if there is no mistake in logic and user given correct input 
//then there will be no exception.

//3. if user give wrong input or logic is wrong it throws exception.
//in which ever method exception or unwanted event occurs that 
//Particular method create Exception object.
//eg:
//1. if error occurred in add method then add method creates 
//exception object.
//2. if error occurred in main method then main method creates 
//exception object.


//see notes at 01:03:00
//4. in whichever stack frame where exception is occurred or generated
//that particular stack frame create one exceptional object.
//5. that exception will be thrown to jvm.
//->inside jvm there rts(run time system).
//6. jvm internally use rts(run time system) it will do later 
//Activities.
//-> it will find out in same stack frame or code where 
//   method is present whether developer the developer handled
//   the exception or not.
//->if we handle exception the matter will go to that part only. 
//  Program get execute smoothly.
//->if it not handled then jvm will give  matter to 
//  default exception handler.
//->if it is still not handles OS come into picture.
//->if OS also fail then system crash occurs.
//->java is more secures in these days the matter not even 
//  go for OS Default exception handler will handle it. 


//example:
//	--> give input as num1=100, num2=0
//	--> it gives ArithmeticException.
//  -->Exception generate in main method. Exception object is 
//     Created by main stack frame.
//	-->it gives to jvm(rts). jvm checks whether developer
//     handled the exception. jvm gives exception object 
//     to default Exception handler.
//   -->default exceptional handler abnormally terminated then
//		it gave the Exception(Arithmetic Exception) 
//Message by default exception handler
// Exception in thread "main" java.lang.ArithmeticException: 
// by zero at Exception3.main(Exception3.java:78)


import java.util.Scanner;
public class Exception3 {

	public static void main(String[] args) {
//		1. Connection to calc application
			System.out.println("connection to calc is established");
			
//		2. taking input form console
			Scanner scan=new Scanner(System.in);
		    System.out.println("enter num1 to divide");
		    int num1=scan.nextInt();
		    
		    System.out.println("enter num2 to divide");
		    int num2=scan.nextInt();
		    
		    int res=num1/num2;
		    System.out.println("the result"+res);
//		   3. terminate connection
		    System.out.println("connection is terminated");

	}

}

//output:
//enter num1 to divide
//100
//enter num2 to divide
//0
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Exception3.main(Exception3.java:78)


//Monday class Exception hierarchy where in built classes are present.
//by using this in built class we can handle Exceptions.
//to avoid the abnormal termination we have handle the exception.

//Exception hierarchy chart

