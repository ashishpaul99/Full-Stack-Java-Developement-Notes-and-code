//1. Import statement

import java.util.ArrayList;



class Student7
{
	
	static {
		System.out.println("Student .class file is loading");
		
	}
	public Student7()
	{
		
		System.out.println("Student constructor is called");
	}
}
public class Import1 {

	public static void main(String[] args) {
		
//		1. we are not getting error Student file present 
//		in current working  directory
		
		Student7 std=new Student7();
		
//		2. we get error.arrayList class not available in current 
//		working directory array list is one class.
//		ArrayList a1=new ArrayList();
		
		
//	  >>javac==> search for the required class information in 
//      a. Current working directory
//      b. Did the programmer specified where the class is available
		
		
//		3. then how to tell to compiler
//		this arrayList is class present in java.util package
//		we explicitly telling where these package is present. 
//		these is called fully qualified path.
		
		java.util.ArrayList a1=new java.util.ArrayList(); //fully qualified path
		
		ArrayList a=new ArrayList();
		
//	  >>there is problem if we explicitly telling where 
//		these package is present.
		
//    >>the fully qualified path scope is konwn only to 
//		that line(Line 38). here compiler knows were path of the of ArrayList
		
//    >>At line 40 compiler not aware where ArrayList is present
		
//    >>we cannot always write every time fully qualified Path. 
//		a. it is disturbing readability
//		b. length of the code will be reduced
		
//	  >>to resolve this issue don't use fully qualified path
		
//	  >>at the beginning we have tell in which package 
//		the class is present.
		
//	 -->import java.util.ArrayList; //Explicit import
		
//	    it means bring ArrayList class to current working directory
//		or informing the compiler please search for ArrayList class in
//		"java.util"
		
//		we can also write import statement like this
//		import java.util.*; //implicit import
		

		
		
//		
//		#class Notes
//		Import statement
//		==============
//		class Test{
//		public static void main(String args[]){
//		ArrayList l=new ArrayList();
//		}
//		}
		
//		Output:
//		Compile time error.
		
//		D:\Java>javac Test.java
//		Test.java:3: cannot find symbol
//		symbol : class ArrayList
//		location: class Test
//		ArrayList l=new ArrayList();
		
		
//		=> We can resolve this problem by using fully qualified name "java.util.ArrayList"
//		l=new java.util.ArrayList();". But problem with using fully qualified name
//		every time is it increases length of the code and
//		reduces readability.
		
		
//		=> We can resolve this problem by using import statements.
//		Example:
//		import java.util.ArrayList;
//		class Test{
//		public static void main(String args[]){
//		ArrayList l=new ArrayList();
//		}
//		}
		
//		Output:
//		D:\Java>javac Test.java
//		Hence whenever we are using import statement it is not require to use fully
//		qualified names we can use short names directly.
//		
		
//		This approach decreases length of the code and improves readability.
//		
		
//		Case 1: Types of Import Statements:
//		There are 2 types of import statements.
//		1) Explicit class import
//		2) Implicit class import.
		
		
//		Explicit class import:
//		you are explicitly telling this the class 
//		I am using that class is available in particulat location.

		//		Example: Import java.util.ArrayList ;
//		=> This type of import is highly recommended to use because it improves
//		readability of the code.
//		=> Best suitable for developers where readability is important.
	
		
//		Implicit class import:
//		go to this place search for particular class
		
//		Example: import java.util.*;
//		=> It is never recommended to use because it reduces readability of the code.
//		=> Best suitable for students where typing is important.
		
//		>>Picture in pain
//		which one we have to use-->
//		import play a role always at compiler
//		 Import java.util.ArrayList ;
//		 import java.util.*;
		
//		->Compilation  time is more in case of Implicit import
//		->here compiler search. 
//		compiler takes more compilation Time.class beacause we have not
//		told explicitly
		
//		->in case of explicit import. compiler goes to 
//		exact location and search for the class
//		the compilation time is less.
		
//		jvm replace import java.util.* to  Import java.util.ArrayList
//		so difference for jvm
		
		
//      form the development perspective which one is best to use
//      providing info should be crystal clear
//		Explicitly import is good
//		refer picture
		
//		
		

	}

}

