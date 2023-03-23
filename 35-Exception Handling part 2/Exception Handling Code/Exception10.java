//-> whenever there is exception we can do three things
//1. Handle exception(try-catch)
//2. Duck the Exception(throws keyword)
//3. Re-throwing an Exception(throw, throws, try, catch, finally)

//->all the keywords associated in Exception handling are
//try, catch, throw, throws, finally.

//--> Duck the Exception(throws keyword)
//example: bowler(shoib akthar)  
//         batsman(rahul dravid)-> he just duck it.
//-> if there is an exception we ignore it.


//1. Handling Exception(try-catch) -

//1. first control comes to main method.
//2. from main method beta method is called.
//3. from beta method alpha is called.
//4. alpha method stack is running. 
//5. if exception occurs in alpha. Exception object is 
//   created and given to jvm.
//   then matter(exception object) goes to JVM.
//6. JVM search for handler in alpha method. there is no 
//   handler present in alpha.
//7. then matter goes to beta. here beta is
//   caller of alpha. if there is no handler in beta it goes to main.
//   main is the caller of beta.
//8. here we have handler in main. the matter resolved in 
//   main. it will not go to default handler.
//   Exception finally handled in main.

//->Point of observation
//1. if exception is not handled in specific stack frame then 
//   Exception object will be propagated down the hierarchy 
//   in stack to the callers of particular stack. 
//   ->it is automatically propagated. 
//   ->it is nature of java.
//   ->this only called handling an Exception

//   alpha stack is called or invoked by beta.
//   beta is called by main. 
//					alpha
//					  |
//					 beta
//					  |
//					 main


import java.util.Scanner;

class Alpha1{
	void alpha1() {
 
//			1. Connection to calc application
				System.out.println("connection to calc is established");
				
//			2. taking input form console
				Scanner scan=new Scanner(System.in);
			    System.out.println("enter num1 to divide");
			    int num1=scan.nextInt();
			    
			    System.out.println("enter num2 to divide");
			    int num2=scan.nextInt();
			    
			    int res=num1/num2;
			    System.out.println("the result"+res);

//			 3. terminate connection
			    System.out.println("Connection is terminated");
	}
}
class Beta1 
{
	void beta1()
	{
		Alpha1 a=new Alpha1();
		a.alpha1();
	}
}
public class Exception10 {

	public static void main(String[] args) {
		try {
		Beta1 b=new Beta1();
		b.beta1();
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception finally handled in main");
		}

	}

}

//output: 
//	connection to calc is established
//	enter num1 to divide
//	100
//	enter num2 to divide
//	0
//	Exception finally handled in main




      



