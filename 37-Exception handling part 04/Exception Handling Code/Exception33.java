//What happens if resources are not closed?
//->Resource will leak will occur.


//1.7 Rules of using try with resource

//Rule-1 :
//we can declare any no of resources, but all these 
//resources should be separated with semi colon(;).

//->if there are multiple resources how to use try with 
//  resources.

//eg:
//Multiple resources in project
//syntax:	
//try(R1;R2;R3;...){
//	
//}
//catch(xxx e) {
//	
//}

//Rule-2: 
//->All resources are said to be AutoCloseable resources if 
//  the class implements an interface called 
//  "java.lang.AutoCloseable" either directly or indirectly.
// eg:
//     java.io package classes, java.sql package classes

//typer in cmd: javap java.lang.AutoCloseable
//C:\Users\Ashishpaul\Desktop\java>javap java.lang.AutoCloseable
//Compiled from "AutoCloseable.java"
//public interface java.lang.AutoCloseable {
//	  public abstract void close() throws java.lang.Exception;
//}

//->Note: which ever class has implemented this interface 
//  those classes objects are referred as "resources".

//->All java.io and java.sql package classes are implements
//  AutoCloseable.

//->Check by typing in cmd
//    1. javap java.sql.Connection
//    2. javap java.sql.Statement
//    3. javap java.util.Scanner

//Eg: java.util.Scanner implements  AutoCloseable
//->java.util.Scanner implements java.util.Iterator<java.lang.String>, java.io.Closeable
//import java.util.Scanner;
//public class Exception32 {
//
//	public static void main(String[] args) {
//		
//      try(Scanner scanner=new Scanner(System.in)){
//           System.out.println("hello");
//      }
//      catch(Exception e) {
//    	  e.printStackTrace();
//      } 
//	}
//}


    
    
//->we cannot write whichever resource in try with resource.
//  if you are working with try with resource make sure the 
//  resources compulsorily implement AutoCloseable only
//  such resource we have to use other ressource results in
//  compile time error.
//eg:
//public class Exception32 {
//
//	public static void main(String[] args) {
//		
//      try(String s=new String("sachin")){
//           System.out.println(s);
//      }
//      catch(Exception e) {
//    	  e.printStackTrace();
//      } 
//	}
//}

//output:
//new1.java:5: error: incompatible types: try-with-resources not applicable to variable type
//try(String s=new String("sachin")){
//    ^
//(String cannot be converted to AutoCloseable)
//1 error

//->here String class is not implemented AutoCloseable
//  interface.
//->compiler shouts this not Autocloseable

//->check by typing in cmd-> javap java.lang.string
//->here we see string class is not implemented the 
//  AutoCloseable.


//=>1. Behind the secens of try with resource
//SRS- software requirements specification
//->SRS-there is requirement to close the resources which 
//  are used.
//->SRS- they would represent to interface
//->when represent a interface it is a duty of classes to 
//  give implementation of those classes.

//typer in cmd: javap java.lang.AutoCloseable
//C:\Users\Ashishpaul\Desktop\java>javap java.lang.AutoCloseable
//Compiled from "AutoCloseable.java"
//public interface java.lang.AutoCloseable {
//	  public abstract void close() throws java.lang.Exception;
//}


//=>In which interface the SRS is brought?
//->there is interface called AutoCloseable.
//->tell the Resource to implement the Interface and give 
//  the body of close.
//->so jvm work with try with resource once control comes out
//  of try with resource whatever resource used with try with 
//  resource on those resources jvm will call close method.
//->tell resource developer to implement that interface when 
//  try with resource is used jvm will automatically close
//  the resource.

//=>2. checking whether BufferedReader implements the 
//  AutoCloseable interface

//->type in cmd: javap java.io.BufferReader
//->java.io.BufferedReader extends java.io.Reader
//->here BufferReader extends io.Reader

//->typer in cmd: javap java.io.Reader
//-> java.io.Reader implements java.lang.Readable,java.io.Closeable
//->io.Reader implements Closable interface.

//->typer in cmd: javap java.io.Closeable
//->java.io.Closeable extends java.lang.AutoCloseable

//->BufferedReader implements the AutoCloseable interface
