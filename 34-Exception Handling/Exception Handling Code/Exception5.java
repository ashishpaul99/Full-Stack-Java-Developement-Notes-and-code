
//1. if programmer has handled the exception will matter
//go to default exception handler?
//  Ans- No, it will go default exception handler when user 
//       not handled.

//--> there are many exceptions. parent of all exceptions is
//Exception.
//ArithmetiEexception
//NegativeArraySizeException
//ArrayeIndexOutOfBound Exception

//-> Exception is parent of all Exception
//-> if we write Exception in catch block then it handles any 
//type of exception.
//eg: 
//	catch(Exception e)
//	{
//		System.out.println("You're trying to divide by zero illogical");
//		
//	}

//see picture in notes : 1:52:00

//Example-1:

import java.util.Scanner;

public class Exception5
{

	public static void main(String[] args) 
	{
	
//	 -->try block
	  try { 
//	  1. Connection to calc application
	     System.out.println("connection to calc is established");
				
//	  2. taking input form console
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter num1 to divide");
		 int num1=scan.nextInt();
			    
		 System.out.println("enter num2 to divide");
	     int num2=scan.nextInt();
			    
		 int res=num1/num2;
	     System.out.println("the result"+res);
			    
	     // using array
		 System.out.println("enter size of array");
		 int size=scan.nextInt();
		 int[] a=new int[size];
			    
//		 enter elements in particular position
		 System.out.println("enter elements to be inserted in that array ");
		 int elem=scan.nextInt();
			    
		 System.out.println("enter pos at which elements has to be inserted");
		 int pos=scan.nextInt();
			
		//giving elements in a particular position
		 a[pos]=elem;
	     System.out.println("Element "+elem+" inserted at "+pos+"successfully");
		 
		}
        catch(Exception e) {
        	System.out.println("Wrong input please give right one");
        }
	  System.out.println("Connection is terminated");
		
	}

}

//working case:output size=7, elem=6 pos=5 
//connection to calc is established
//enter num1 to divide
//100
//enter num2 to divide
//10
//the result10
//enter size of array
//7
//enter elements to be inserted in that array 
//6
//enter pos at which elements has to be inserted
//5
//Element 6 inserted at 5successfully
//Connection is terminated


//Exception case: output(size=5, elem=3 pos=5 ) gives exception
//connection to calc is established
//enter num1 to divide
//100
//enter num2 to divide
//10
//the result10
//enter size of array
//5
//enter elements to be inserted in that array 
//3
//enter pos at which elements has to be inserted
//5
//Wrong input please give right one
//Connection is terminated

