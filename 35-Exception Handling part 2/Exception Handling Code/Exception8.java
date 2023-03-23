//28th Nov Live Class Exception Handling part 2
//=>previous class revision
//  see picture in notebook
//  14:03- Snippet
//->different cases explained.

//case-1: it there is no exception raised how many statements 
//get executed. 
//->statement -1,2,3,4 and 6 get executed.
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
//statement-6;

//case-2:if an exception is raised at statement-3 and the 
//corresponding catch block is matched.
//-> Statement-1,2, 5  and 6 get executed. Result in normal
//termination. st-3 get executed but no output is visible.


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
//statement-6

//case-3: if an exception is raised at statement-3 and 
//the corresponding catch block is not matched.
//->statement 1 and 2 get executed.
//it will lead to abnormal termination of program.

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
//statement-6

//case-4: if Exception is raised at statment-1 or statement-5
//or statement-6.
//-> Resulting in abnormal termination.
//->risky code is not put in try block. 
//->the matter goes to default handler.


	

