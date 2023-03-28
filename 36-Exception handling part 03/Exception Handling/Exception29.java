//Example-3: made few changes
//->passing some message in exception
//eg:
//InvalidCustomerException ice=new InvalidCustomerException("are you sure? try again because wrong credentials ");

//-> it is call to parameterized constructor.
//->we have to create parameterized constructor in 
//  InvalidCustomerException class.
//->super message calls parent constructor.
//->after custom exception in else block we are printing
//  ice.getMessage()
//->there is no getMessage( ) in class 
//->InvalidCustomerException  but it is there in parent class
//->here parent class is Exception.
//->getMessage() present in Exception class.

//1. getMessage()-> prints the Description of the exception.
//2. printStackTrace()->prints the name and the description 
//   of Exception along with the stack trace.



//Behind the scenes-
//see class at 1:53:00
//see notes at 1:59:00
     
// 1. there is Throwable which extends object.
// 2. there are man variables in it. 
//    it contains string type variable.
// 3.Many constructors are there one of the constructor 
//   is  public throwable which is accepting string type
//   Message.
// eg:
//	 public throwable(String msg) {
//	 		this.msg=msg;
// 	 }
     
// 4. there are many getter are there in throwable method
//    one of the getter is getMessage() which return
//    message variable.
// eg:
//   	String getMessage() {
//	 
//	   		return msg;
//    	}
// 5.Child of throwable class is Exception class.
//  ->In class Exception extends Throwable there are many
//    methods.
//  ->In this class there is constructor named Excetion is
//    present which is accepting string type data.
//  ->within that there is super method
     
// eg:
//   class Exception extends Throwable
//  	{
// 	 	Exception(String name){
// 		 	super(msg);
// 		}
//   }
     
//   6. now user defined exception is written 
//      which extends Exception class.
//   ->in this class we written constructor with same name as
//     class name with which accepting string type data. 
//   ->inside constructor super method is written with msg 
//     as input.
//     eg:
//   	class InvalidCustomerException extends Exception
//   	{
//  	 		InvalidCustomerException(string msg){
//  		 	super(msg);
//      		}
//   	}
     
//   7. Later in else block while creating object a message
//      passed.
// 	   else {
//          InvalidCustomerException ice=new InvalidCustomerException("are you sure? try again");
//          System.out.println(ice.getMessage());
//          throw ice;
//     }
     
//  8. from created object to message is given to 
//     InvalidCustomerException method in 
//     InvalidCustomerException class.
//   -> then matter comes to super method in InvalidCustomerException method
//   ->from super method to matter goes to Exception method 
//     in Exception class.
//       
//     ->from super method in Exception method the matter goes
//       to Throwable method.
//     ->the moment class Exception extends Throwable class
//       getMessage() is inherited here.
//     ->the moment  class InvalidCustomerException extends 
//        Exception getMessage() is inherited to custom 
//        Exception class also.
//     -> so using ice.getMessage we are getting output.

//
//                Object
//                  |
//               Throwable
//                  |
//               Exception
//                  |
//         InvalidCustomerException(Custom Exception)
                  
     
//  Code:
     
//     class Throwable extends Object{
//
//    	 String msg;
//    	 public throwable(String msg) {
//    		 this.msg=msg;
//    	 }
//       String getMessage() {
//    	 
//    	   return msg;
//        }
//    	 
//     }
//     class Exception extends Throwable
//     	{
//    	 	Exception(String name){
//    		 	super(msg);
//    		}
//      }
//     class InvalidCustomerException extends Exception
//     {
//    	 InvalidCustomerException(string msg){
//    		 super(msg);
//        }
//     }
	
//	message is passed in InvalidCustomerException object
	
//	 InvalidCustomerException ice=new InvalidCustomerException("are you sure? try again");


import java.util.Scanner;
class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msg) {
		super(msg);
	}
}
class ATM3
{
//	1. Assume two details in bank data base.
	int userid=1212;
    int password=1111;
    
//  2. asking user to verify  
    int pw;
    int uid;
    
//  3. taking user input
    public void input() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Welcome to bank");
    	System.out.println("Enter user id:");
        uid=scan.nextInt();
    	System.out.println("Enter password:");
    	pw=scan.nextInt();	
    }
    public void verify() throws InvalidCustomerException {
    	if((userid==uid) &&(password==pw)) {
    		System.out.println("Take your cash");
    	}
    	else {
         InvalidCustomerException ice=new InvalidCustomerException("are you sure? try again");
//         System.out.println(ice);
         System.out.println(ice.getMessage());
         throw ice;
    	}
    }

}
class Bank3{
	public void initiate() {
		ATM3 a=new ATM3();
		
		try {
			a.input();
			a.verify();
		}
//		catch block
		catch(InvalidCustomerException e1) {
      
			try {
				a.input();
				a.verify();
			}
//			Inner catch block-1
			catch(InvalidCustomerException e2) {
		
				try {
					a.input();
					a.verify();
				}
//				Inner catch block-2
				catch(InvalidCustomerException e3) {
				 
				  System.out.println("card is blocked");
				  System.exit(0);
			     }
		     }
	     }
    }
}
	
public class Exception29 {

	public static void main(String[] args) {
		Bank3 b=new Bank3();
		b.initiate();
       
	}

}

//output: for wrong credentials
//Welcome to bank
//Enter user id:
//1234
//Enter password:
//1234
//are you sure? try again
//Welcome to bank
//Enter user id:
//1234
//Enter password:
//1234
//are you sure? try again
//Welcome to bank
//Enter user id:
//234
//Enter password:
//1234
//are you sure? try again
//card is blocked
//234
	
