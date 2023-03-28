//3. Possible syntax to write try and catch.
//Case-1: writing only try is invalid.
//try {
//	
//	
//}

//Case-2 : Writing only catch is invalid.
//catch(xxx e) {
//	
//	
//}

//Case-3 : Writing only finally is invalid.
//finally {
//	
//}

//Case-4: Writing try and catch is valid.
//try {
//	
//	
//}
//catch(xxx e) {
//	
//	
//}

//Case-5:first catch block after that try block is not allowed.
//->Reverse order not allowed.
//catch(xxx e) {
//	
//}
//try {
//	
//}

//Case-6:Multiple try and single catch not allowed.
//try {
//	
//}
//try {
//	
//}
//catch(xxx e) {
//	
//}

//Case-7 try-catch-try not allowed.
//Multiple try and single catch not allowed.
//try {
//	
//}
//catch{
//	
//}
//try {
//	
//}

//Case-8: Multiple try-catch is allowed.
//try {
//	
//}
//catch{
//	
//}
//try {
//	
//}
//catch{
//	
//}

//Case-9: Multiple catch block with different exception 
//classes is allowed.

//try {
//	
//}
//catch(xxx e) {
//	
//}
//catch(yyy e) {
//	
//}

//Case 10:Multiple catch with same exception class is 
//not allowed.
//-> one catch block handles the exception no need other 
//catch block to handle the exception.

//try {
//	
//}
//catch(xxx e) {
//	
//}
//catch(xxx e) {
//	
//}

//Case 11: In single catch block writing two classes
//is allowed.
//try {
//	
//}
//catch(xxx | yyy e) {
//	
//}

//Example
//  try {
//			System.out.println("Inside outer try");
//			System.out.println(10/0);
//   }
//  catch( NullPointerException | ArithmeticException e )
//  {
//	  		System.out.println("Inside outer catch");
//  }

//Case-12: try-catch-finally is allowed.

//try
//{
//	
//}
//catch(xxx e)
//{
//	
//}
//finally
//{
//	
//}

//Case-13: try-finally is allowed.
//finally will dominate return statement.

//try {
//	
//}
//finally {
//	
//}
//Case-14: catch-fianally is not allowed.
//catch(xxx e)
//{
//	
//}
//finally {
//	
//}

//Case-15: try-finally then catch is not allowed.
//->Unordered.
//try {
//	
//}
//finally {
//	
//}
//catch(xxx e) {
//	
//}

//Case-16: try-multiple catch-finally is allowed.

//try {
//	
//}
//catch(xxx e) {
//	
//}
//catch(yyy e) {
//	
//}
//finally {
//	
//}

//Case-17: Multiple finally is not allowed.

//try {
//	
//}
//catch(xxx e) {
//	
//}
//finally {
//	
//}
//finally {
//	
//}

//Case 18: Statements in-between try-catch-finally is 
//not allowed.

//try
//{
//	
//}
//System.out.println("Hi");
//catch(xxx e) {
//	
//}
//System.out.println("Hello");
//finally
//{
//	
//}

//Case-19: Only try with resource

//try(R){
//	
//}