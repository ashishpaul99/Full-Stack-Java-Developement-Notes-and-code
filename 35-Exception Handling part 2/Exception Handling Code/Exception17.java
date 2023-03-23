//5. Finally block-
//   what if statements below the throw keyword are critical?
//   here code is responsible to terminate the connection.
//   in that case we have to one block called as finally block.
//-> throw keyword means the control will leave entire
//   alpha4 method by taking exception object to 
//   caller(main method).
//-> if you write final keyword it will execute final block 
//   and it goes to caller.

//-->finally will be executed 
//   1. if there is not exception finally block get executed. 
//   2. if exception occurs and catch block matches.
//-->Finally block will not execute 
//   3. if exception occur and catch block not matched

//5.2 Purpose of finally block
//see picture in notes 1:55:00
//1. connection is established with data base
//2. something is happen in code then at any cost for closing 
//   opened Resources we use finally block. 
//3. irrespective of the things .finally block get executed

//5.3 when and how to write finally?
//->if there is no return statement we write void
//->thread come to return statement and take the 10 value 
//  to caller(main method).
//->immediately control leave this method.
//->Lines below the return statement will never be executed.
//->in one case it will be executed that is finally block.
//->try and catch cannot written alone
//  similarly finally block cannot written alone.
//  it is written with try or catch block.

//5.4 finally block vs return statement-> who is dominating
//    finally block is dominating return statement.

//class Demo{
//	int disp() {
//		try {
//		System.out.println("Method starting");
//		return 10;
//		}
//		finally{
//		System.out.println("Method ending");
//		}
//	}
//}
//public class Exception17 {
//
//	public static void main(String[] args) {
//		Demo d=new Demo();
//		d.disp();
//
//	}
//
//}

//output:
//	Method starting
//	Method ending


      
//5.5 finally block vs system.exit
//-->system.exit will dominate the final block
//-->system.exit-> JVM will terminate entire application.
//-->whenever the method got into stack area the thread will
//   get executing it.
//-->when thread encounters system.exit(o) entire java application 
//   will terminated.
//-->the entire program will be closed. 
//-->no lines will get executed.

//example: 
//class Demo{
//	void disp() {
//		try {
//		System.out.println("Method starting");
//		System.exit(0);
//		}
//		finally{
//		System.out.println("Method ending");
//		}
//	}
//}
//public class Exception17 {
//
//	public static void main(String[] args) {
//		Demo d=new Demo();
//		d.disp();
//
//	}
//
//}

//5.6 finally block vs throw
//-->finally block dominates throw

//example:
//import java.util.Scanner;
//
//class Alpha7
//{
//	void alpha7() throws ArithmeticException
//	{
//		System.out.println("Connection to Calc app is established");
//		try
//		{
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the first num to divide");
//		int num1=scan.nextInt();
//		System.out.println("Enter the 2nd num to divide");
//		int num2=scan.nextInt();
//		
//		int res=num1/num2;
//		
//		System.out.println("The res is "+ res);
//		}
//		catch(ArithmeticException e)
//		{
//		System.out.println("Exception handled in alpha only");	
//		//Re-throwing an exception
//		throw e; 
//		}
//		finally {
//			System.out.println("Connection is terminated");
//		}
//		
//		
//	}
//}
//
//public class Exception17 {
//
//	public static void main(String[] args) {
//		Alpha7 a=new Alpha7();
//		a.alpha7();
//	}
//
//}


