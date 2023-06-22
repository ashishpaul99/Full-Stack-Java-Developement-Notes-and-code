
//1. Accessing objects in collections 
//                       Accessing objects        Accessing objects           Accessing objects      Accessing objects               Accessing objects              Accessing objects
//    Classes            by using for-loop      by using for each-loop        by using Iterator     by using ListIterator         by using desendingIterator      by using Enumeration

//1. ArrayList                  yes                     yes                         yes                  yes                                 No                             No 
//2. LinkedList                 yes                     yes 		            yes                  yes                                 yes 		                    No						  
//3. Array Deque                no                      yes                         yes                   No                                 yes	                        No			
//3. Prirority Queue            no                      yes			    yes                   No                                 No				                No					  
//5. TreeSet                    no                      yes			    yes                   No                                 yes		                    No						  
//6. HashSet                    no                      yes			    yes                   No                                 No			                    No						  
//7. LinkedHashSet              no                      yes			    yes                   No                                 No			                    No						  
                                                                       
//yes-> Allowed 
//No ->Not Allowed
 
//->Enumeration is allowed in Vector and stack class.
//->Index Based accessing is allowed in ArrayList and LinkedList.
//->In order objects in collection no need to indicate index 
//  based accessing so we for each loop is used to access the 
//  objects in collection.


//2. Java Collection Framework Hierarchy
//                         Iterable
//                            |
//							  |
//						Collection
//    ________________________|_____________________________
//   |                        |                    			|
// List(Interface)        Queue(Interface)    			Set(Interface)
//   |                       |      |                      |    |
//   |                       |    PriorityQueue(class)     |    |--HashSet(class)
//   |-ArrayList(class)      |                             |    |
//   |                     Deque(Interface)                |    |---LinkedList(class)
//   |-LinkedList(class)-----|                             |
//   |                       |                             |
//   |-Vector(class)      ArrayDeque(class)                |
//           | extends                                     |
//         stack                                        SortedSet(Interface)
//                                                         |
//                                                    Navigable(Interface)
//                                                         |
//                                                      TreeSet


//->There are three interfaces which comes under the collection
//  heirarchy.
//->List based classes- ArrayList, LinkedList, Vector, 
//  stack class extends vector class.
//->LinkedList have extra methods when compared with ArrayList 
//  because it is implements Deque interface.
//->LinkedList implements all the List interface and Deque interaface.
//->In java one class can implement multiple interfaces.

//->Deque Interface had some extra methods than Queue Interface.
//->Deque interface extends queue interface.
//->it has speacialized methods. as child specialized methods are
//  allowed.
//->Priority Queue has less methods than ArrrayDeque because 
//  Priority Queue directly implements Queue interfacea and
//  Array Deque implements Deque Interface directly.
//->Under Sorted there is another interface called navigable interface.
//->HashSet implements set interface directly.
//->LinkedHashSet is child of HashSet.

//=>Difference Between HashSet and LinkedHashSet.
//  HashSet      - it will not preserve the order of insertion.
//  LinkedHashSet- it will retain order of insertion.

//->Parent Interface is Collection. Collection implements  Iterable.
//->iterator method is present in all collection class.
//->add() method based on index we can not perform in Queue and
//  set based classes.
//->add() method with index is there only in the List interface.

//->if we create Linked list using List interface we can access 
//  the methods which are List interface.
//->Using Parent reference we cannot use specilaized methods in child class.

//Example-1: Lose coupling and tight coupling code

//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//      or 

import java.util.*;

public class Collection17 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList(); //tight coupling
		
		List list=new ArrayList();  //lose coupling -> List is parent of ArrayList class
		
		
		Queue q=new ArrayDeque();
		List li=new LinkedList();
		Deque ql=new LinkedList();
		Collection c=new LinkedList();
		
//	    ->peek method is presnet in Deque interface
		ql.peek();
		
		HashSet hs=new HashSet();  //->tight coupling
		Set se=new HashSet();      //->lose coupling
	
	}

}
