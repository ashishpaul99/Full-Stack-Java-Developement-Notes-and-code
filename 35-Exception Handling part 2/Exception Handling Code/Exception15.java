//What does the Exception object contains?
//1. it will have name of exception.
//eg: Name of Exception = ArithmeticException
//
//2. Description of Exception
//eg: divided by zero

//3. Stack Trace of the Exception
//in which stack frame exception is occurred.
//eg: for the below code
//		at Alpha5.alpha5(Exception15.java:28)
//		at Exception15.main(Exception15.java:39)

//name of exception
//why this exception occur
//where this Exception occur(which stack frame it is occurred)

//--> Exception object is given to JVM.




import java.util.Scanner;
class Alpha5
{
	void alpha5() 
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

public class Exception15 {

	public static void main(String[] args) {
		Alpha5 a=new Alpha5();
		a.alpha5();

	}

}

//output:
//	Connection to Calc app is established
//	Enter the first num to divide
//	100
//	Enter the 2nd num to divide
//	0
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at Alpha5.alpha5(Exception15.java:28)
//		at Exception15.main(Exception15.java:39)
