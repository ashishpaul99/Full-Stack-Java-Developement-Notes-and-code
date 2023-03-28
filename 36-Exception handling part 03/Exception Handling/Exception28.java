//6. How to write custom Exception?
//Write a logic if you enter wrong credentials ask for enter 
//it correct for three time if user not enter correct 
//credentials three times then block the card.

//->here we have to create custom exception to write this code 
//  because it is not belongs to non of the scenario.

//6.1 How to write custom Exception?
///1. if you want create exception that exception class
//    you have to create.
//   eg:
//    class InvalidCustomerException extends Exception
//    {
//	
//    }

//2. custom exception must extend Exception class(Parent of 
//   all Exception)
//->all the features in Exception get inherited in custom 
//   Exception.
//   eg:
//    class InvalidCustomerException extends Exception
//    {
//	
//    }

//3. after verifying details(event) we have to propagate the 
//   event to bank. 
//->using exception we can propagate.
//->we create Custom Exception for the below code in else 
//  block.
//  eg:
//    else {
//         InvalidCustomerException ice=new InvalidCustomerException();
//         System.out.println(ice);
//         throw ice;
//    	}
//->here else block is present for indicating if any erorr 
//  occur while verifying details.
//->in method signature which exception is throwing is 
//  mentioned.
// eg:
//    public void verify() throws InvalidCustomerException
//    {
//    	
//    }
//4. the caller will be cautious and enclose with try and 
//   catch.

//	class Bank{
//		public void initiate() {
//			ATM a=new ATM();
//		
//			try {
//				a.input();
//				a.verify();
//			}
//			catch(InvalidCustomerException e) {
////			it prints all information of exception
//				e.printStackTrace();
//			}
//	
//		}
//	}


//==>Control flow
//->Control comes to verify method.
//1. if correct credentials are given the if block get executed.
//2. if wrong credentials are given then else will get executed.
//->in else block custom exception is created. here we are 
//  creating own exception object.
//->here exception is throwed to caller.
//->here caller is initiate method which in bank class.
//->Initiate()method is caller of verify()method then matter
//  comes to catch block-1 in initiate method.
//->in catch block giving 2 chances to enter the 
//  correct credentials.
//->Nest the try-catch for 2 times inside respective inner 
//  catch blocks.
//eg:
//	try {
//			a.input();
//			a.verify();
//		}
////    catch block
//		catch(InvalidCustomerException e) {
//			try {
//				a.input();
//				a.verify();
//			}
//			Inner catch block-1
//			catch(InvalidCustomerException e) {
//				try {
//					a.input();
//					a.verify();
//				}
//				Inner catch block-2
//				catch(InvalidCustomerException e) {
//					System.out.println("card is blocked");
////					it terminated the entire application
//					System.exit(0);
//				}
//			}
//		}
	
//	}
	
	
//->then give message to the user that card is blocked.
//->terminate the entire application.
//eg:
//    System.exit(0);






//Example-2:
import java.util.Scanner;
class InvalidCustomerException extends Exception
{
	
}
class ATM2
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
         InvalidCustomerException ice=new InvalidCustomerException();
         System.out.println(ice);
         throw ice;
    	}
    }

}
class Bank2{
	public void initiate() {
		ATM2 a=new ATM2();
		
		try {
			a.input();
			a.verify();
		}
//		catch block
		catch(InvalidCustomerException e1) {
        System.out.println("Incorrect Credentials try again");
			try {
				a.input();
				a.verify();
			}
//			Inner catch block-1
			catch(InvalidCustomerException e2) {
			  System.out.println("Incorrect Credentials try again");
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
	
public class Exception28 {

	public static void main(String[] args) {
		Bank2 b=new Bank2();
		b.initiate();
       
	}

}

//ouput: for incorrect credentials 
//	Welcome to bank
//	Enter user id:
//	1223
//	Enter password:
//	1234
//	InvalidCustomerException
//	Welcome to bank
//	Enter user id:
//	12324
//	Enter password:
//	324134
//	InvalidCustomerException
//	Welcome to bank
//	Enter user id:
//	5235132
//	Enter password:
//	324
//	1InvalidCustomerException
//	card is blocked

//output: for correct credentials
//Welcome to bank
//Enter user id:
//1212
//Enter password:
//1111
//Take your cash

