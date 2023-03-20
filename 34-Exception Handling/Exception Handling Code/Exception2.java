

//Practical example on Exception handling
//Example-1:
//ATM machine
//-->inserting card-> connection is establishing. later we do activity.
//after doing actvity we terminate connection smoothly.

//any application
//1. we establish the connection.
//2. we do activity.
//3. we smoothly terminate connection smoothly.

import java.util.Scanner;
public class Exception2 {

	public static void main(String[] args) {
		
//	1. Connection to calc application
		System.out.println("connection to calc is established");
		
//	2. taking input form console
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter num1 to divide");
	    int num1=scan.nextInt();
	    
	    System.out.println("enter num2 to divide");
	    int num2=scan.nextInt();
	    
	    int res=num1/num2;
	    System.out.println("the result"+res);
//	   3. terminate connection
	    System.out.println("connection is terminated");
		
		
	}

}

//case-1: num1=10, num2=5 , res=2
//connection to calc is established
//enter num1 to divide
//10
//enter num2 to divide
//5
//the result2
//connection is terminated

//case 2 : results in Exception(ArithmeticException)
//num1=100, num2=0

//connection to calc is established
//enter num1 to divide
//100
//enter num2 to divide
//0
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Exception2.main(Exception2.java:30)


//if user made mistake to while giving input it results in
//Exception.

//num1=100
//num2=0

//-->it is happening in runtime. Exception is a mistake.
//that will occur during in run time. which results in abrupt 
//or abnormal termination of application.


//our application are used by many users
//As developer we need to be more careful and find such codes
//and handle exceptions because of which abrupt or abnormal 
//termination should not be happen.

//Exception is a mistake or unwanted event or unusual event. 
//that will occur during in run time. which will result in
//abnormal termination of application.








