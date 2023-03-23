
//2. Duck the Exception(throws keyword)-
// ->we can also duck the exception.
// ->we are not handling we are giving responsibility 
//   to caller.
// ->here in alpha1 exception is not handled by try catch.
// ->here responsibility is given to caller.
// ->it is always recommended if handler is not provided
//     in the method signature please write 
//     "throws Exception name"
//    eg: void alpha1() throws ArithmeticException{
//        
//
//        }

//-> in this case caller of alpha method will not go and 
//   check entire body.
//->in programming world a look programmer don't want to 
//  handle don't handle it at least be mature and responsible.
//->telling method signature throws whatever type exception
//  so that caller of alpha(beta) when he calls alpha
//  get to know alpha method is throwing exception by 
//  seeing method signature.
//-> caller of alpha(beta) will not check the whole body.
//-> if method beta also not handled then tell 
//   caller of beta(main) by writing which exception that 
//   code in method throws.
//    example: void beta1() throws ArithmeticException
//	{
//	
//	}
//->whoever going to call beta method they will be cautious.
//  beta method throws exception and caller method wil be 
//  cautious and provide the handler(try catch).

//conclusion
//  telling the caller that these exception may occur if it is
//  invoked. write in method signature.
  

import java.util.Scanner;

class Alpha2{
	void alpha2() throws ArithmeticException{
 
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
class Beta2 
{
	void beta2() throws ArithmeticException
	{
		Alpha2 a=new Alpha2();
		a.alpha2();
	}
}
public class Exception11 {

	public static void main(String[] args) {
		try {
		Beta2 b=new Beta2();
		b.beta2();
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


//->the exception which is occurring is at runtime.
//->it is unchecked.
//->for unchecked exception it is highly recommended to handle 
// it should not duck it.
//->if we think exception any occur it is developer 
//  Responsibility. 
//->to handle the exception.
//->it is good recommendation to handle the code.


