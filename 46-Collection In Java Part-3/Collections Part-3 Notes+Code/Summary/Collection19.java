//->ArrayList follows Dynamic Array Data structure.
//->if we are structural modification then program will not stop.

//=>Concurrent or Structural modification - 
//->Modifying data while accessing it.
//->If there is data in collection while accessing the data/objects
//  in collection if attempt modify the collection that technically
//  we called as Concurrent or Structural modification.
//                             or
//->If there is data in collection while accessing the data/objects
//  in collection if modification is done to collection that technically
//  we called as Concurrent or Structural modification.


//=>Why Iterator is preferred instead of for loop?
//->If we attempt concurrent modification then program will not 
//  stop and it will keep on running. that's the reason we go we 
//   go with Iterator for accessing the data/objects in the collection.

//Example-1:Using for-loop for accessing the data/objects in the
//          collection and attempting concurrent or structural modification
//          while accessing the data.
//import java.util.*;
//
//public class Collection19 {
//
//	public static void main(String[] args) {
//		
//	 ArrayList al=new ArrayList();
//	 al.add(10);
//	 al.add(20);
//	 al.add(30);
//	 al.add(40);
//	 al.add(50);
//	 for(int i=0;i<al.size();i++) {
//	    System.out.print(al.get(i)+" "); //output: 10 20 30 40 50 
//// ->while accessing the data we are performing some modification
//	    al.add(60);
//	    
//	 }
//	 
//	}
//}

//output:
//->program will not stop. 
//->ArrayList follows Dynamic data structure. it keep on growing. 
//->Program will never fail but it will work for infinte times.
//->which is not at all good. that's the reason we go with iterator
//  concept.
//->Iterator will not allow to perform concurrent modification.



//1. Fail fast
//=>while accesing data/objects by using Iterator and attempting concurrent modification then
//  it will modify and loop will works for infinite times.
//->It gives ConcurrentModificationException.
//->Program is failing fastly. technically we call it as fail fast.
//->Program will terminate immedaitely.
//->here program was abnormally terminated.
//-> While attempting concurret modification then application
//   fail fast leading to abnormal termination or exception.
//->it will not allow concurrent modification.
//->it is failing fast with exception.

//->If we attempting concurrent modification while accessing 
//  the data/object in collection by using Iterator then program 
//  fails fastly.


//Example-2: Using Iterator for Accessing the data/objects in the 
//           Collection and attempting concurrent or structural
//           modification while accessing the data. 
//->While accessing the data by iterator and attempting concurrent 
//  modification then it will lead to an Exception and application
//  will fail fast. it will not allow you to perform concurrent
//  modification.



//import java.util.*;
//
//public class Collection19 {
//
//	public static void main(String[] args) {
//		
//	 ArrayList al=new ArrayList();
//	 al.add(10);
//	 al.add(20);
//	 al.add(30);
//	 al.add(40);
//	 al.add(50);
//	 System.out.println(al);      //output: [10, 20, 30, 40, 50]
//	 
////	 ->Program fail fast
//	 Iterator itr=al.iterator();
//	 while(itr.hasNext()) {
//		 Integer i=(Integer)itr.next();
//		 System.out.print(i+" ");  //output: 10 20 30 40 50 
//		 
////		 ->attempting concurrent or structural modification while accessing the data.
//		 al.add(77);
//		 
//	 }
//
//	}
//}

//output: 
//[10, 20, 30, 40, 50]
//10 Exception in thread "main" java.util.ConcurrentModificationException
//	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
//	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
//	at Collection19.main(Collection19.java:64)



//2. Fail safe - Modification fails without exception it is called fail safe.
//If Concurrent or structural modification is attempted the concurrent modification
//will not happen and exception also will not be simulated.
//->it will not allow to perform concuurent modification without
//  leading to any of the exception.
//->it is failing concurrent modification but safely.

//->we cannot perform fail safe in normal classes.
//->we need to perform on classes which are availble concurrent
//  package.
//->we have special package in java which is called concurrent
//  package. 
//->Concurrent package is sub package of util.
//->Under the concurrent package All classes of collections are 
//  present.
//->CopyOnWriteArrayList- it is entire Arraylist only. it is copy
//  of ArrayList.
//->Modification is done by iterator because of which Application 
//  will fail and will not allow concurrent modification but fail very 
//  safely.


//Example-2: Fail safe

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collection19 {

	public static void main(String[] args) {
		
	 ArrayList al=new ArrayList();
	 al.add(10);
	 al.add(20);
	 al.add(30);
	 al.add(40);
	 al.add(50);
	 System.out.println(al);      //output: [10, 20, 30, 40, 50]
	 
//     fail safe
	 CopyOnWriteArrayList cal=new CopyOnWriteArrayList();
	 cal.add(1000);
	 cal.add(2000);
	 cal.add(3000);
	 cal.add(4000);
	 
	 System.out.println(cal);              //output: [1000, 2000, 3000, 4000]
	 
	 Iterator itrr=cal.iterator();
	 while(itrr.hasNext()) {
		 System.out.print(itrr.next()+" "); //output: 1000 2000 3000 4000 
//		 Modifying data while accessing it
		 cal.add(5000);
	 }

	}
}

//output:
//	        [10, 20, 30, 40, 50]
//			[1000, 2000, 3000, 4000]
//			1000 2000 3000 4000 

//->we are not getting exception.
//->Program is not running for infinite time.
//->it is failing to run for infinte time.
//->it is failing safely. we call it fail safe.


//Assignment 
//1. Learn about Concurrent packages.


//2. Fail safe - While attempting concurret modification it 
//   will stop the concurrent modification without failing at run time and execution.







