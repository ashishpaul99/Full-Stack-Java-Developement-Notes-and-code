import java.util.Scanner;

//1. Problem in previous code in Exception5.java

//->for every mistake same message is printed.
//->not able to find exact mistake.
//->the problem is associated with single catch block.

//2. Solution for the problem
//   for every type of exception we have to provide 
//   specific catch block.

//->in java single try block can have multiple catch blocks.

//-> Developer may handle all possible errors which may 
//   Occurs and provide catch block for them. in some 
//   cases developer may forget give catch block for some 
//   possible error then developer must provide a generic 
//    catch block after sppecific catch block.
//example:
//->generic catch block--> parent of all Exceptions
// catch(Exception e) {
//	  System.out.println("Wrong input");

//->still there will situations not anticipated after giving specific catch 
// blocks then we have use generic catch block.

//--> highly recommended to provide generic catch block at 
//	  the end.
//-->you cannot write generic catch block before of 
//   specific catch blocks in program.
//-->compiler think he is parent of all exception. 
//    so provide generic catch block at the end.



//Example: specific catch block and generic catch block

public class Exception6 {

	public static void main(String[] args) {
		
//		
		

	}

}


//->for every type of exception we have to provide specific 
//catch block.

//1.  Catch block-1 :Exception due to zero as denominator
//output:
//	connection to calc is established
//	enter num1 to divide
//	100
//	enter num2 to divide
//	0
//	Wrong input please give right one
//	Connection is terminated

//2. catch block-2: Exception due to provinding negative for size of array
//connection to calc is established
//enter num1 to divide
//100
//enter num2 to divide
//10
//the result10
//enter size of array
//-5
//Please provide size of array as possitive
//Connection is terminated

//3. catch block-3 -> for giving position which out of size of array
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
//8
//be in limits, don't cross limits
//Connection is terminated


