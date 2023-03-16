//Case5:

//While resolving class names compiler will always gives the importance in the
//following order.
//1. Explicit class import
//2. Classes present in current working directory.
//3. Implicit class import.

//Example:
//import java.util.Date;
//import java.sql.*;
//class Test {
//public static void main(String args[]){
//Date d=new Date();
//}
//}

//The code compiles fine and in this case util package Date will be considered.

import java.sql.Date;
//import java.util.*;


public class Import4 {

	public static void main(String[] args) {
//	       5. date class in sql and util package
//	       can we create two classes of same name in one folder?
//	       No
//	           
//	       >>we can create two classes of same name in 
//	       two separate folders with same is possible
		
		   Date d=new Date();
		   
//		 ->1. if we import both util and sql from which package
//		   it will take
//		   import java.sql.*;
//		   import java.util.*;
//		          or 
//		   import java.sql.Date;
//		   import java.util.Date;
		   
		   
//		   confusion for compiler
//		   Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//				The type Date is ambiguous
//				The type Date is ambiguous
		   
//		   2. if we import explicitly there will no confusion
//		   import java.util.Date;
//		   import java.sql.*;
		   
//		   it takes form util package
		   
		   

		

	}

}
