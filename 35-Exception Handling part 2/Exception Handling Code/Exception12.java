//When to duck Exception?
//usually developer duck the checked exception.
//two type of exception are there
//1. Unchecked Exception- Compiler will not force use to 
//   handle.
// ->it will not be checked during compile time.
// ->Unchecked exceptions are such exceptions which are 
//   not being checked during compile time by compiler 
//   directly it will occur during the runtime and as 
//   developer has to identify the risky code.

//2. Checked Exception- it will be checked by compiler.
//  ->unless it is handled compiler will not allow to run 
//    the code.
//  ->risky code is checked by the compiler.
//  ->Compiler says it doesn't take risk and there is chances 
//    of abruptly termination of application.

//example 1- 
//	->Thread sleep for four seconds(4 sec)
//	->for 4 seconds other lines of code will not be 
//	  executed.
//	->Compiler is showing error because thread sleeping for 
//	  4 seconds. it is risky code.
//	->Compiler tells to handle this risky code.
//	->unless it is handled compiler will not allow to run 
//	  the code.
//  -> two things we can do  
//     1. surround it with try and catch
//     2. Ducking an exception.
//     ->Compiler forcing to handle.
//     ->usually developer ducking the Checked Exception.
//->ducking ignores exception but it won't handle exception.
//->but it is better to handle the exception.
//->if it is unchecked exception you are ducking then problem
//  goes to caller. if you duck next time also then the 
//  program abruptly terminate the program.
//->if you are sure that no exception occur even when compiler 
//  warns then you can duck it.
//->throws keyword used to duck in java.
//->ducking suitable for checked exception

//1. surround it with try and catch

//public class Exception12 {
//	public static void main(String[] args) {
//	   try {
//		   Thread.sleep(4000);
//	    } catch (InterruptedException e) {
//		   e.printStackTrace();
//	    }
//  }
//
//}

//2. Ducking an exception.
//->Complier thinks there may be risk in duration of 4 sec.
//->but it sure there will not be any proble so exception is 
// ducked.
public class Exception12  {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("before sleep");
		Thread.sleep(4000);
		System.out.println("After sleep");//output displays after 4 sec
	   
  }

}





