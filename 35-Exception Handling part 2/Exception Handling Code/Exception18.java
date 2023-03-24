//from 2:05:00
//Coding snippets
//Note-
//we can also write nested try catch if we need.
//Inside finally also we can write try catch.


//Exception Raised  Exception Handled  finally block Exceuted
//      NO                -                   YES
//      YES              YES                  YES
//      YES               NO					YES

//case-1 : if no exception occur below case
//if no exception occurred. what will be executed.
//only try and finally block get executed.
//try {
//	System.out.println("Inside try");
//}
//catch(Exception e)
//{
//	System.out.println("Inside catch");
//}
//finally
//{
//	System.out.println("Inside finally");
//}

//output:
//	Inside try
//  Inside finally

//case-2: if an exception is occurred and the corresponding
//catch block is matched..
//->try, catch and finally block get executed.

//try {
//	System.out.println("Inside try");
//	System.out.println("10/0");
//}
//catch(ArithmeticException e)
//{
//	System.out.println("Inside catch");
//}
//finally
//{
//	System.out.println("Inside finally");
//}

//output: 
//	Inside try
//  Inside catch
//  Inside finally

//case-3: if an Exception has occurred and the corresponding
//catch block is not matched.
//try {
//	System.out.println("Inside try");
//	System.out.println("10/0");
//}
//catch(NullPointerException e)
//{
//	System.out.println("Inside catch");
//}
//finally
//{
//	System.out.println("Inside finally");
//}

//try and finally block will get executed.

//case-4: it there is no exception raised how many statements 
//get executed. 
//->statement -1,2,3,4,6,7 get executed.
//no exception so no call to catch block.

//statement-1;
//	try 
//	{
//		statement-2;
//		statement-3;
//		statement-4;
//	}
//	catch(xxx e)
//	{
//		statement-5;
//	}
//   finally{
//	   Statement-6;
//   }
//  statement-7;


//case-5:if an exception is raised at statement-3 and the 
//corresponding catch block is matched.
//-> Statement-1,2, 5,6 and 7 get executed. 
//Result in normal termination. 

//	statement-1;
//	try 
//	{
//		statement-2;
//		statement-3;
//		statement-4;
//	}
//	catch(xxx e)
//	{
//		statement-5;
//	}
//  finally {
//	  statement-6;
//  }
//  statement-7;


//case-6: if an exception is raised at statement-3 and 
//the corresponding catch block is not matched.
//-> statement 1,2 and 6 get executed.
//->resulting in abnormal termination
//	statement-1;
//	try 
//	{
//		statement-2;
//		statement-3;
//		statement-4;
//	}
//	catch(xxx e)
//	{
//		statement-5;
//	}
//  finally {
//	   statement-6;
//  }
//  statement-7;

//case-7: if an exception is raised at statement-5
//->no exception in try block so catch will not be exceuted.
//statement 1,2,3,4 and 6
//->Resulting in abnormal termination
//->But before that finally block will be executed.
//->in this case we have to do nesting.

//	statement-1;
//	try 
//	{
//		statement-2;
//		statement-3;
//		statement-4;
//	}
//	catch(xxx e)
//	{
//		statement-5;
//	}
//  finally {
//	   statement-6;
//  }
//  statement-7;


//->doubt
//case 8: if an exception is raised at statement-6
//->statement 1,2,3,4 and 6 get executed.
//->there is no handler in finally block then it results in 
//  abnormal termination.
//	statement-1;
//	try 
//	{
//		statement-2;
//		statement-3;
//		statement-4;
//	}
//	catch(xxx e)
//	{
//		statement-5;
//	}
//  finally {
//	   statement-6;
//  }
//  statement-7;

//case-9 if an Exception is raised at statement-7.
//->statement 1,2,3,4 and 6 get executed.
//->it lead to abnormal termination.
//	statement-1;
//	try 
//	{
//		statement-2;
//		statement-3;
//		statement-4;
//	}
//	catch(xxx e)
//	{
//		statement-5;
//	}
//  finally {
//	   statement-6;
//  }
//  statement-7;

