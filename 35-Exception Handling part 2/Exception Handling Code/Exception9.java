//-> Exception handler is not present in code.
//see stack diagram at 22:39:00
//Run time stack
//1. control has come to main method.
//2. main method record brought to stack area.
//3. we are creating object of alpha in main method.
//4. Alpha method record is present at top of main method 
//   in run time stack.
//5. thread is executing the code in alpha method. 
//->if exception when we give input like num2=100 and num2=0
//  then alpha stack frame create Exception object. 
//->Exception object is created and given to jvm.
//6. jvm internally use of rts(run time system).
//->jvm will find whether exception handler is present in 
//  alpha or not.
//->In alpha there is no exception handler.
//7. the matter automatically propagated to caller(Main method).
//   from main method only we are calling alpha method.
//8. JVM will go and check in main method stack frame
// ->whether is calling alpha or may be handling or not.
//9. if in main method handler is not present the JVM will go 
//   to default exception handler.
//10.then default exception handler abruptly terminate the 
//   program and tell what causes this exception.

import java.util.Scanner;

class Alpha{
	void alpha() {
 
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
public class Exception9 {

	public static void main(String[] args) {
		Alpha a=new Alpha();
		a.alpha();

	}

}

//example: output->here num1=100,num2=0-> Exception is occured
//  connection to calc is established
//  enter num1 to divide
//  100
//  enter num2 to divide
//  0
//  Exception in thread "main" java.lang.ArithmeticException: / by zero
//  at Alpha.alpha(Exception9.java:46)
//  at Exception9.main(Exception9.java:57)

//Run stack mechanism-->animation in 29:12

//-> exception occurred in stack frame or method(alpha method)
//if there is no exception handler then matter propagated to 
//caller(main method) if it is not present in caller then the
//matter goes to default exception handler it result in 
//abnormal termination.

