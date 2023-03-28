//case 4- if an exception occurs at statement-5 and the 
//Corresponding inner catch block is matched.
//->Statements 1,2,3,4,7,8,11 and 12 get executed.
//-> Statement 5,6,9,10 will not executed.
//->Resulting in normal termination.
//try {
//statement-1;
//statement-2; 
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


//case-5: if an exception occurs at statement-5 and the 
//corresponding inner catch block is not matched, but outer 
//catch block is matched.
//->Statements 1,2,3,4,8,10, 11 and 12 will get executed.
//->Statements 5, 6,7 and 9 will not get executed.
//->Resulting in normal termination.
//->Finally block after inner catch block will get
//  executed even inner mater mater is not handled by 
//  inner catch block.

//try {
//statement-1;
//statement-2; 
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

//case-6: if an exception occurs at statement-5 and both 
//inner and outer catch block are not matched.
//->Statement 1,2,3,4,8 and 11 get Executed.
//->Statement 5,6,7,9,10 and 12 will not executed.
//->finally blocks are get executed.
//->Resulting in abnormal termination.


//try {
//statement-1;
//statement-2; 
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
//	statement-12
