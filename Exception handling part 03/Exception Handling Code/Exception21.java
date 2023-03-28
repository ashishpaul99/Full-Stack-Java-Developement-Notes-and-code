//2. Control Flow w.r.t nested try and catch

//->which are the statements get executed for the following
//  cases?
//case-1: if no exception occurs. 
//->Statement-1,2,3,4,5,6,8,11 and 12 will get executed.
//->Statement-7 and 10 will not get executed because of no 
//  exception.
//->Resulting in normal termination.

//try {
//statement-1;
//statement-2; 
//statement-3;
//  	try {
//			statement-4;
//			statement-5; 
//			statement-6;
//		}
//		catch(xxx e) {
//			statement-7;
//		}
//		finally {
//			statement-8
//		}
//      statement-9
//	}
//	catch(yyy e) {
//		statement-10;
//	}
//	finally {
//		statement-11;
//	}
//		statement-12

//case-2: if an exception is occurs at statement-2 and the 
//corresponding catch block is matched.

//->statement-1,10,11,12 will get Executed.
//->Resulting in normal termination.

//->from the point execution till the handler or catch block 
//  which handles matter the code in between will not get 
//  executed.

//try {
//statement-1;
//statement-2; //->Exception occurred here
//statement-3;
//  	try {
//			statement-4;
//			statement-5; //->Exception occurred here
//			statement-6;
//		}
//		catch(xxx e) {
//			statement-7;
//		}
//		finally {
//			statement-8
//		}
//      statement-9
//	}
//	catch(yyy e) {
//		statement-10;
//	}
//	finally {
//		statement-11;
//	}
//		statement-12

//case-3 : if an exception occurs at statement-2 and the 
//corresponding catch block is not matched.
//->statement 1,11 will get executed.
//->Resulting in abnormal termination.

//try {
//statement-1;
//statement-2; //->Exception occurred here
//statement-3;
//  	try {
//			statement-4;
//			statement-5; 
//			statement-6;
//		}
//		catch(xxx e) {
//			statement-7;
//		}
//		finally {
//			statement-8
//		}
//      statement-9
//	}
//	catch(yyy e) {
//		statement-10;
//	}
//	finally {
//		statement-11;
//	}
//		statement-12




