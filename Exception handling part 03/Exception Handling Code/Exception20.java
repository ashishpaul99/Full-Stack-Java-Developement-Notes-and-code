//36-Exception handling part 03 - 29th Nov Live Class 

//->this class agenda
//1. Custom Exception or user defined Exception
//2. Possible syntax.
//3. valid and invalid ways to try- catch and finally.
//4. Nested try and catch.
//5. Control Flow w.r.t nested try and catch
//6. Asynchronous and Synchronous Exception.

//->Class Notes
//1.  Nested try and catch.
//->Either parent type or same type can handle particular 
//  exception.
//->try catch can be nested inside try block, catch block and 
//finally block also.
//->try-catch can be return in finally block also.
//->nesting can be done any number of times.



//Example-1:
//public class Exception20 {
//	public static void main(String[] args) {
//		try {
//			System.out.println("Inside outer try");
//			try {
//				System.out.println("Inside inner try");
//				System.out.println(10/0);//-> Exception occurs here
//			}
//			catch(ArithmeticException e) {
//				System.out.println("Inside inner catch");
//			}
//			System.out.println("outside inner try-catch");
//		}
//		catch(Exception e)
//		{
//			System.out.println("Inside outer catch");
//		}
//		finally {
//			System.out.println("Inside outer finally");
//		}
//	}
//}

//output:
//	Inside outer try
//	Inside inner try
//	Inside inner catch
//	outside inner try-catch
//	Inside outer finally


//-> if inner catch block cannot handle the matter then 
//the matter will go to default exceptional handler but it 
//goes to outer catch block.
 
//->if outer catch blocks handles it then body of outer catch
//block get executed.

//->handler-> catch block

//->from exception to till the handler( the corresponding 
//Responsible to handle the code) in between code will not 
//work.

//->from line 76 to 79 will not get executed.


//Example-2:
//public class Exception20 {
//	public static void main(String[] args) {
//		try {
//			System.out.println("Inside outer try");
//			try {
//				System.out.println("Inside inner try");
//				System.out.println(10/0);//-> Exception occurs here
//			}
//			catch(NullPointerException e) {
//				System.out.println("Inside inner catch");
//			}
//			System.out.println("outside inner try-catch");
//		}
//		catch(Exception e)
//		{
//			System.out.println("Inside outer catch");
//		}
//		finally {
//			System.out.println("Inside outer finally");
//		}
//	}
//}

//output:
//	Inside outer try
//	Inside inner try
//	Inside outer catch
//	Inside outer finally

//Example-3
public class Exception20 {
	public static void main(String[] args) {
		try {
			System.out.println("Inside outer try");
			System.out.println(10/0);
//			try {
//				System.out.println("Inside inner try");
//				System.out.println(10/0);//-> Exception occurs here
//			}
//			catch(NullPointerException e) {
//				System.out.println("Inside inner catch");
//			}
//			finally {
//				System.out.println("Inside Inner try finally");
//				
//			}
//			System.out.println("outside inner try-catch");
		}
		catch( NullPointerException | ArithmeticException e )
		{
			System.out.println("Inside outer catch");
		}
		finally {
			System.out.println("Inside outer finally");
		}
		System.out.println("statement after outer finally");
	}
}




//-->nest class topics
//1. Try with resources
//2. creating our own package
//--> new class
//1. Multi threading
//2. Coolection
//3. stram api