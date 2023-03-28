//case 7: if an exception occurs at statement-7 and the 
//corresponding catch block is matched.
//->Statement 1,2,3,8,10,11,12 get executed.
//->Exception may occur at statements 4,5 and 6 then only 
//  control goes to inner catch block. 
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
//			statement-7; //->Exception occurred here
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

//case 8: if an exception occurs at statement-7 and the 
//corresponding catch block is not matched.
//-> statements 1,2,3,8,11 will be executed.
//->Exception may occur at statements 4,5 and 6 then only 
//  control goes to inner catch block. 
//->finally blocks get executed.
//->Resulting in abnormal termination.

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
//			statement-7; //->Exception occurred here
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


