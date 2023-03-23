

//Exception hierarchy- where in built classes are present.
//by using this in built class we can handle Exceptions.
//to avoid the abnormal termination we have handle the exception.
//-->Exception hierarchy chart

//-->How do we handle Exception?
//-->try catch - we need another support within try catch. 
//   we are going to use in built class inside catch.

//-->2. there are Two types of Exception
//->both exceptions are occur during runtime.

//1. Checked exception- Exception in which compiler only 
//identify any risk code is present. Compiler only give
// the warning during compile time. it warns about abnormal 
//termination may happen.

//->Compiler warning ->compiler will be very strict. it will not allow to 
//compile.

//2. Unchecked Exception- Compiler is not checking whether 
//exception is occurring or not then it is called 
//Unchecked exception.
//here compiler will not give any warning. as developer we have to identify. 


//3. How do we handle Exception? 
//eg: ATM Example- if password is given it has to give reason 
//for not working to user. it should abruptly terminate.
//-->see notes

//1. try catch - we need another support within try catch. 
//   we are going to use in built class inside catch.

//->to handle exception we have to use try block and catch 
//block.

//try {
//	
//}
//catch(in built classes) {
//	
//}

//--> in catch block we have to catch block we have to use 
//in built-classes. whatever suitable message we can give here. 

//example 1: handling exception by try catch
//--> 1. as developer anticipate all the risky code or 
//check for risky statements. 
//because of which exception may occur. it is developer 
//Responsibility.

//-->here compiler is not checking in this case. 
//   so it is unchecked.

//--> 2. Enclose rsiky statement with try block
//here int res-- num1/num2; is risky statement.
//  try {
//        int res=num1/num2;
//      }

//here we are enclosing all code with try block for better result.

//3. for every try block we have to corresponding catch block.
//     --> In catch block parenthesis we have to use in built 
//     classes to handle.
//     -->Initially we handle with parent class of all 
//         Exceptions which is exception.
//     -->Reference variable may be anything here it is e.

//for eg: when num1=100 and num2=0  
//->at line int res= num1/num2 exception occurred; 
//whatever lines until catch block from exception line
//those  will not executed

//==> #a. line above catch box and below exception occurred
//the statements after exception till the catch block will 
//not get executed..
//-->here those lines are: 
// System.out.println("the result"+res);


//==> #b. lines in catch block body
//->so whenever there is exception, whichever statements you 
//need to be execute write those statement in catch block.
//that will get executed.

//->want to convey message to user after exception occurred 
//write in catch block.

//->Catch block get executed only when there is exception
//in try block.

//--> if there is no exception catch block body will not get executed.
//here we want application gracefully terminated


//==> #c. lines after catch block 
//->statement after catch will also get executed.

//here statement after catch block is:
//System.out.println("Connection is terminated");
	

//try block we write risky  code. by chance there is any 
//exception it come to catch block.
//catch block is a handler. statement in catch block get 
//executed.


import java.util.Scanner;

public class Exception4 {

	public static void main(String[] args) {
//   -->try block
		try { 
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
//		  
		}
//		 3. terminate connection
		catch(Exception e)
		{
			System.out.println("You're trying to divide by zero illogical");
			
		}
		System.out.println("Connection is terminated");

	}

}

//output:
//	Connection to Calc app is established
//	Enter the first num to divide
//	100
//	Enter the 2nd num to divide
//	0
//	You're trying to divide by zero illogical
//	Connection is terminated

//->In case of num=100 and num2=0
//->exception occurred in this at that stage.
//->Exception occurred in main method stack frame.
//->that will create exception object. give to jvm internally 
//  use rts. 
//->jvm will check in same stack area or program or method 
//  whether the exception is handles by developer.
//-> if handled the matter comes to catch block whatever 
//   code is present in catch block that get executed and 
//   statements after catch block also executed.

//Exception line--> jvm-->catch block

