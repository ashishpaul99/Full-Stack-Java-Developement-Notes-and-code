//=>Collection Class

//->There is class in java which is called collection class.
//->Collection.sort() works when data/objects in the collection
//  are simple.

//->Difference between Collection and Collections.
//i. Collection
//->Collection is an interface and framework.
//->Collection is heierarchy.
//->set of Interfaces and classes.


//ii. Collections
//->Collections is individual class.

//=>Few more important inbuilt methods of collection class.

//1. Sort() Method-
//->sort() method is called using collection class directly. it is
//static method.
//->it sorts the simple data in collection. 
//->Collection.sort() works when data/objects in the collection
//  are simple.

//import java.util.*;
//public class Collection23 {
//
//	public static void main(String[] args) {
//		ArrayList al=new ArrayList();
//		al.add(30);
//		al.add(20);
//		al.add(50);
//		al.add(10);
//		al.add(40);
//		System.out.println(al); //output: [30, 20, 50, 10, 40]
//		
//		Collections.sort(al);
//		System.out.println(al); //output: [10, 20, 30, 40, 50]
//	}
//}

//Output: [30, 20, 50, 10, 40]
//		  [10, 20, 30, 40, 50]


//2. binarySearch()
//->Binary search is used to search for object and returns index of the object.
//->binarySearch() methods returns index.
//->Binary search is performed when data is in sorted order.
//->here we are searching 40 which is 3 index.

//import java.util.*;
//public class Collection23 {
//
//	public static void main(String[] args) {
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add(50);
//		System.out.println(al); //output: [30, 20, 50, 10, 40]
//		
//		int index=Collections.binarySearch(al, 40);
//		System.out.println("Index "+index); //output: Index 3	
//	}
//}

//3. shuffle() method
//->Shuffle() method is used to shuffle the data in the collection.

//import java.util.*;
//public class Collection23 {
//
//	public static void main(String[] args) {
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add(50);
//		System.out.println(al); //output: [30, 20, 50, 10, 40]
//		
//		Collections.shuffle(al);	
//		System.out.println(al);
//	}
//}

//output:
//	[10, 20, 30, 40, 50]
//	[50, 30, 20, 10, 40]

//4. min() method
//import java.util.*;
//public class Collection23 {
//
//	public static void main(String[] args) {
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add(50);
//		System.out.println(al); //output: [30, 20, 50, 10, 40]
//		
////	   ->minimum in collection
//		System.out.println(Collections.min(al));//output: 10
//		
////	   ->Maximum in collection
//		System.out.println(Collections.max(al)); //output:50
//	}
//}

//output:
//	       [10, 20, 30, 40, 50]
//			10
//			50


//5. frequency() method
//->it gives how many times an objects is presernt in collections.

import java.util.*;
public class Collection23 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(40);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al); //output: [30, 20, 50, 10, 40]
		
		
		System.out.println("40 is repeated "+Collections.frequency(al, 40)+" times in collection"); //output:40 is repeated 2 times in collection 
	}
}