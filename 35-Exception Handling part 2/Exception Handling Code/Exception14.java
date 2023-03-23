//What if there is a need to propagate handled exception object 
//to caller?
//-->This concept is called Re-throwing an Exception.
//->if you not handled exception object get propagate.
//->if you handle exception object will not propagate.
//->the requirement is after handling if there is need to 
//propagate the exception object.

//bank example-->see picture in notes(1:13:00)

//            	   bank
//                 	 |
//       branch-1            	branch-2
//      	 |						|
// ATM-1		ATM-2		ATM-3		ATM-4


//->trying to access account with atm card in multiple atms 
//after trying each atm multiple times.
//->while exception is handled then if it propagate 
//to upper hierarchy then card will get blocked and he will not access other ATM's.

//->in some scenario even after handling the exception object
//  you may have propagate caller in such cases we should have 
//  some facility.
//->if you handler exception it will not propagate but if you 
//  not handle the exception object will propagate.



//what if after handling Exception giving it to caller?
//->This concept is called Re-throwing an Exception.
//->Throwing or propagating already handled exception to the 
//  caller.
//->here intentionally throwing handling Exception giving it 
// to caller.

//->1. we have to write throw keyword in catch block with the 
//  Reference variable.
//->throw keyword is used to Re-throwing an exception.
//   eg:
//	   catch(ArithmeticException e)
//		{
//		System.out.println("Exception handled in alpha only");	
//		//Re-throwing an exception
//		throw e; 
//		}
//-> throw is indicator to caller.

//->2. after exception is handled in alpha3 it is throwed to 
//  main method.

//->if a method is throwing an exception it is good practice
//  to write which exception may occur in method signature.
//->caller will not check the body of the method. 
//3. main method is calling alpha4 then it is main method 
//   Responsibility to handle it.
//->Exception object alpha4 is successfully thrown handled 
//  Exception object to main.

//4. throws in method signature
//->whenever exception is ignored or when after handling 
//  exception forcefully throws the exception object to 
//  caller mention in method signature "throws Exception 
//  name". so caller will be cautious that called method 
//  throw an exception.

//->before throwing exception object to the caller the 
//  connection has to be terminated.

//->generally lines after catch block get executed in java. 
//  but in Re-thrown an Exception case it is not the line
//  after catch block of alpha4 is not executed because 
//  of throw keyword.

//5. Finally block-
//   what if statements below the throw keyword are critical?
//   here code is responsible to terminate the connection.
//   in that case we have to one block called as finally block.
//-> throw keyword means the control will leave entire
//   alpha4 method by taking exception object to 
//   caller(main method).
//-> if you write final keyword it will excute final block 
//   and it goes to caller.



//Example: Re-throwing an Exception.
import java.util.Scanner;

class Alpha4
{
	void alpha4() throws ArithmeticException
	{
		System.out.println("Connection to Calc app is established");
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first num to divide");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd num to divide");
		int num2=scan.nextInt();
		
		 int res=num1/num2;
		
		System.out.println("The res is "+ res);
		}
		catch(ArithmeticException e)
		{
		System.out.println("Exception handled in alpha only");	
		//Re-throwing an exception
		throw e; 
		}
		finally {
			System.out.println("Connection is terminated");
		}
		
		
	}
}


public class Exception14 {

	public static void main(String[] args) {
		
		try
		{
		System.out.println("Main method connection");
		Alpha4 a=new Alpha4();
		a.alpha4();
		}
		catch(ArithmeticException e)
		{
		System.out.println("Exception handled in main");
		}
		

	}

}

//->Exception object alpha4 is successfully thrown handled 
//  Exception object to main.

//output:
//Main method connection
//Connection to Calc app is established
//Enter the first num to divide
//100
//Enter the 2nd num to divide
//0
//Exception handled in alpha only
//Connection is terminated
//Exception handled in main


//Important Points
//1. throw keyword is used to Re-throwing an exception.
//2. throw keyword is written in catch block.
//3. statements below the throw keyword will never be 
//   executed.
//4. what if statements below the throw keyword are critical?
//   here code is responsible to terminate the connection.
//   in that case we have to one block called as finally block.
//-> throw keyword means the control will leave entire
//   alpha4 method by taking exception object to 
//   caller(main method).
//-> if you write final keyword it will excute final block 
//   and it goes to caller.

//see notes at 1:30:00
//interview questions
//1. Throw-
//->we write in method or catch block.
//->purpose of throw keyword is to re-throw the Exception
//Object to caller.
//->Statements below the throw keyword get excuted.
//
//2. throws-
//1. we write in method signature.
//2. Purpose- to duck and exception or indiaction to caller.

//->if there is exception catch block get executed.
//->if there is no exception catch block will not get 
//  executed.
//finally will be executed even if there is exception or 
//no Exception.



