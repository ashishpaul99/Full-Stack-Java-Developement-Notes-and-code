//->if exception is not handled in specific stack frame then 
//  Exception object will be propagated down the hierarchy 
//  in stack to the callers of particular stack. 

//Run stack of below example-1
//->there is possibility of risky code in alpha3
//->if exception occurred in alpha3 method.
//->Exception object is created in alpha3 stack frame and 
//->given to jvm.
//->JVM checks for handler in alpha3.
//->there is handler in alpha3.
//->catch block and lines under it in alpha2 get executed.
//catch block in the method will not executed.

//->Exception object will be propagated  to caller if and 
//  only if in that particular method handler is not provided.
//->if handler is present in particular then matter is 
//  resolved in that method only.
//->if exception handled in alpha3 then code will not go to main


//1Q.if there is handler in both alpha3  method and main then 
//which catch block get executed?
//catch block and lines under it in alpha3 get executed.

//->catch body in the main is not executed that means there is 
// no exception in main

//Example-1: try catch is written in alpha3 and main

//import java.util.Scanner;

//class Alpha3
//{
//	void alpha3() 
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
//		 int res=num1/num2;
//		
//		System.out.println("The res is "+ res);
//		}
//		catch(ArithmeticException e)
//		{
//		System.out.println("Exception handled in alpha only");	
//		
//		}
//		
//	}
//}
//
//public class Exception13 {
//
//	public static void main(String[] args) 
//	{
//		try
//		{
//		System.out.println("Main method connection");
//		Alpha3 a=new Alpha3();
//		a.alpha3();
//		}
//		catch(ArithmeticException e)
//		{
//		System.out.println("Exception handled in main");
//		}
//
//	}
//
//}

//output: 
//	Main method connection
//	Connection to Calc app is established
//	Enter the first num to divide
//	100
//	Enter the 2nd num to divide
//	0
//	Exception handled in alpha only

//Example-2:try catch is written in main not in alpha3
//-> here exception handled in main
import java.util.Scanner;

class Alpha3
{
	void alpha3() throws ArithmeticException
	{
		System.out.println("Connection to Calc app is established");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first num to divide");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd num to divide");
		int num2=scan.nextInt();
		
		 int res=num1/num2;
		 System.out.println("The res is "+ res);	
	}
}

public class Exception13 {

	public static void main(String[] args) 
	{
		try
		{
		System.out.println("Main method connection");
		Alpha3 a=new Alpha3();
		a.alpha3();
		}
		catch(ArithmeticException e)
		{
		System.out.println("Exception handled in main");
		}
	}
}
//output:
//	Main method connection
//	Connection to Calc app is established
//	Enter the first num to divide
//	100
//	Enter the 2nd num to divide
//	0
//	Exception handled in main


