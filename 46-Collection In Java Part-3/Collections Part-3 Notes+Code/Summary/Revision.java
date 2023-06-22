

//Revision of previous class
//->Only ArrayList and LinkedList supports the index based access.

//1. Accessing data in collection by using normal loop and for each loop.
//import java.util.ArrayList;
//
//public class Collection15 {
//
//	public static void main(String[] args) {
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add(50);
//		
//		System.out.println(al);//output: [10, 20, 30, 40, 50]
//		
////		->Accessing data in collection by using normal loop
////		for(int i=0;i<al.size();i++) {
////			Object obj=al.get(i);
////			System.out.print(obj+" "); //output: 10 20 30 40 50 
////		}
////		
////		->Accessing data in collection by using for each loop
//		for(Object obj: al) {
//			System.out.print(obj+" "); //output: 10 20 30 40 50 
//		}
//	}
//}

//2. Accessing data in collection by using Iterator
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class Collection15 {
//
//	public static void main(String[] args) {
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add(50);
//		
//		System.out.println(al);//output: [10, 20, 30, 40, 50]
//        
//		Iterator itr=al.iterator();
//		while(itr.hasNext()) {
//		 ->fetching data as Object and converting it into integer
//			Integer i=(Integer)itr.next();
//			System.out.print(i+" "); //output: 10 20 30 40 50 
//			
//			     or
//	     ->fetching data as objects 
//			Object obj=itr.next();
//			System.out.print(obj+" "); //output: 10 20 30 40 50 
//		
//		           or
//		  System.out.print(itr.next()+" "); //output: 10 20 30 40 50 
//			
//		}
//		
//
//	}
//}


//3. Accessing the data in reverse order from collection by using ListIterator

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.ListIterator;
//
//public class Revision {
//
//	public static void main(String[] args) {
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add(50);
//		
//		System.out.println(al);//output: [10, 20, 30, 40, 50]
//         
//		ListIterator litr=al.listIterator(al.size());
//		while(litr.hasPrevious()) {
//			System.out.print(litr.previous()+" "); //output: 50 40 30 20 10 
//		}
//  
//
//	}
//}






import java.util.Iterator;
import java.util.LinkedList;
public class Revision {

	public static void main(String[] args) {
		LinkedList ll1=new LinkedList();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		ll1.add(50);
		
		System.out.println(ll1);//output: [10, 20, 30, 40, 50]
         
		Iterator ditr=ll1.descendingIterator();
		while(ditr.hasNext()) {
			Integer i=(Integer)ditr.next();
			System.out.print(i+" ");           //output: 50 40 30 20 10 
//			         or
//			System.out.print(ditr.next()+" "); //output: 50 40 30 20 10 
		}
	}
}