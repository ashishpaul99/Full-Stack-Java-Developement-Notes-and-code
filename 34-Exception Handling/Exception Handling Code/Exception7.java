
//Conclusion
//1. in java to handle exception we use try and catch block.
//2. catch block get executed only there is exception within 
//the try if not it will not executed.
//3. by chance there is exception from statement of 
//exception till the catch block in between whatever 
//statements are there they will not get executed.
//4. one single try block can have multiple try blocks.
//5.highly recommended to provide generic catch block at 
//the end of the specific catch block for still there 
//will situations not anticipated.

//6. generic catch block has to be written at the end of 
//specific block but not before the specific catch block.
//7. we can have separate try catch blocks for every code.
//example:
//->Same program writing practically 
//1. for every case giving separate try and catch block in 
//   code. it is good practice.
//2. if exception is occurred at first other logics after 
//   that logics are not getting executed so we are this 
//   practice.
//3. in this practice other lines or logics are executing 
//   after exception occurs.

import java.util.Scanner;
public class Exception7 {

	public static void main(String[] args) {
//    1. Connection to calc application
	     System.out.println("connection to calc is established");
				
//	  2. taking input form console
		 Scanner scan=new Scanner(System.in);
//		-->try block
		  try { 

			 System.out.println("enter num1 to divide");
			 int num1=scan.nextInt();
				    
			 System.out.println("enter num2 to divide");
		     int num2=scan.nextInt();
		          
			 int res=num1/num2;
		     System.out.println("the result"+res);
		    }	
//	       catch block-1--> for division operation on calc
//		   when  zero  is provided for denominator
			catch(ArithmeticException ae)
			{
				System.out.println("Please provide non Zero denominator");
					
			}
		     
		  
		     try {
		     // using array
			 System.out.println("enter size of array");
			 int size=scan.nextInt();
			 int[] a=new int[size];
		 
//			 enter elements in particular position
			 System.out.println("enter elements to be inserted in that array ");
			 int elem=scan.nextInt();
		         
			 System.out.println("enter pos at which elements has to be inserted");
			 int pos=scan.nextInt();
			 
			//giving elements in a particular position
			 a[pos]=elem;
		     System.out.println("Element "+elem+" inserted at "+pos+"successfully");
		     }	
//			 catch block-2-> for array when negative input provided for array size 
			 catch(NegativeArraySizeException nae) {
				  System.out.println("Please provide size of array as possitive");
			  }
//			 catch block-3--> for giving position which out of size of array
			 catch(ArrayIndexOutOfBoundsException abe) {
				 System.out.println("be in limits, don't cross limits");
			 }
			
		  //->generic catch block--> parent of all Exceptions
		  catch(Exception e) {
			  System.out.println("Wrong input");
		  
		  System.out.println("Connection is terminated");
		  
	}

	}

}


