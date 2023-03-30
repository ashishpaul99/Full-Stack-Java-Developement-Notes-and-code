//7. Java instanceof operator
//1. we can use the instanceof operator to check whether the 
//   given object is particular type or not.

//r is instance of X
//r->reference
//X->class/interfaceName
//eg:
 
//ArrayList al=new ArrayList();->inbuilt object where we can 
//                               keep any type of other objects
//  al.add(new Student());//0th position
//  al.add(new Cricketer());//1st position
//  al.add(new Customer())//2nd position 

//->in 0th place student object is there.
//->Student data can be collected by object.
//->for every in built classes or customized classes Object 
//  is related.
//->o instanceof Student-> o is instance of Student
//->it returns boolean value.
//-->o is object type 
//-->Student is Student type

//-->Object hold Student data in run time.
//-->it returns true in if block


//		Object o=al.get(0);
//		if(o instaceof Student) {
//				Student s=(Student)o;
   				//Perform operation Student
//   
//		}
//		else if(o instanceof Cricketer) {
//	   			Cricketer c=(Cricketer)o;
//    			//perform Cricketer specific operations
//		}
//		else if(o instanceof Customer) {
//	        Customer c=(Customer)o;
//    	    //perform Customer specific operations
//		}

//see diagram at: 2:22:00
//               Object(class)
//                 |
//                 |     
//                 |
//             Thread(class)----> Runnable(Interface)

//->Thread class extends Object implements Runnable interface.
  
//class Thread extends Object implements Runnable{
//	@Override
//	public void run() {
//		
//	}
//}
// 

//->Thread is instance of Object class, Thread and Runnable.
//->no relation between thread and String.
//->instanceof gives true when parent to child or child to paraent
//  relationship.

//Example-1:
//public class Instanceof1 {
//
//	public static void main(String[] args) {
////		Creating object of thread 
//		Thread t=new Thread();
//		System.out.println(t instanceof Object);//true
//		System.out.println(t instanceof Thread);//true
//		System.out.println(t instanceof Runnable);//true
////    System.out.println(t instanceof String);//->it gives compile time error
//	}
//}

//output:
//	true
//	true
//	true




//Example-2:
//->here it is not possible to create object of parent type  
//  and collected by child type reference.
//->Compiler gives error.


//public class Instanceof1 {
//
//	public static void main(String[] args) {
////		Creating object of thread 
//		Thread t=new Object();
//		System.out.println(t instanceof Object);
//		System.out.println(t instanceof Thread);
//		System.out.println(t instanceof Runnable);
//
//	}
//}

//output:
//	C:\Users\Ashishpaul\Desktop\java>javac new1.java
//	new1.java:5: error: incompatible types: Object cannot be converted to Thread
//	                Thread t=new Object();
//	                         ^
//	1 error


//Example-3:
//here child type of object is created and collected by 
//parent type reference.
//->here t is Object type.
//->There is relationship between object and string.

//->here Run time object is thread.
//->jvm checks runtime object. here run time object is
//  thread
//->thread is not instance of String.
//->there is no relation between thread and string.
//->it give compiler time error.

//public class Instanceof1 {
//
//	public static void main(String[] args) {
////		Creating object of thread 
//		Object t=new Thread();
//		System.out.println(t instanceof Object);//true
//		System.out.println(t instanceof Thread);//true
//		System.out.println(t instanceof Runnable);//true
//		System.out.println(t instanceof String);//false
//		System.out.println(null instanceof Object);//false
//
//	}
//}


//output:
//	true
//	true
//	true
//	false
//	false

//->if already known to compiler what type you are matching 
//  then go with instanceof.
//->if compiler don't know what type to match which comes at
//  run time then go for isInstance();

//--> class notes<--

//=> To use instanceof operator compulsory there should be 
//some relation between argument types (either child to 
//parent Or parent to child Or same type) Otherwise we will
//get compile time error saying inconvertible types.

//Example-2:
//->there is no relation between thread and String.
//public class Instanceof1 {
//	public static void main(String[] args) {
//          String s= new String("sachin");
//          System.out.println(s instanceof Thread);//CE
//          	
//	}
//}


//->there is no relationship between String and thread.
//->it gives compile time error.
//public class Instanceof1 {
//	public static void main(String[] args) {
//				//Creating object of thread 
//		    Thread t=new Thread( );
//			System.out.println(t instanceof String);//CE
//  }
//}

//output:
//	C:\Users\Ashishpaul\Desktop\java>javac Test.java
//	Test.java:5: error: incompatible types: Thread cannot be converted to String
//	                        System.out.println(t instanceof String);//CE
//	                                           ^
//	1 error

//Example-3
//=> Whenever we are checking the parent object is child type 
//or not by using instanceof operator that we get false.

//->when we check parent object to child the result is false
//->o instanceof String ->is object instance String type-> flase
//->String is instance of Object.

//public class Instanceof1 {
//public static void main(String[] args) {
//			Object o=new Object( );
//			System.out.println(o instanceof String ); //false
//   }
//}

//->runtime object is String. 
//->Checking String with String the result is true.
//->o instanceof String-> is string is of string type=>true

//public class Instanceof1 {
//	public static void main(String[] args) {
//				Object o=new String("ashok");
//				System.out.println(o instanceof String); //true
// }
//}


