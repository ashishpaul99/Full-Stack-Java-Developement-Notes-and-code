//=>How to access the values which are present inside a collection?
//->Colection store data as object.
//->Every class under the collection follows specific data 
//  structure to store data.
//->behind scene given data is converted into object by autoboxing.
//eg: al.add(new Integer(10));
//    al.add(new Integer(10.5));


//->Different ways to access data present within collection
//1. Normal loop 
//for(int i=0;i=al1.size(); i++) {
//	
//}

//2. Iterators
//->By traversing it fetches the data.
//->the moment we activate iterator it stays at the collection door.
//->hasNext()-> checks whether there is next elememt after cursor or iterator.
//->next() -> Moving element and fetch it 
//->using special iterator we can access elements in reverse.
//->ListIterator which accepts index it is used to access the elements
//  in reverse.
//->we use iterator to access the data in industry.
//->by using iterator we can fetch the data in forward direction and reverse direction.
//-> al1.size()-> go how much ever is the size of collection.
    
//Example-1: 

//import java.util.ArrayList;
//public class Collection14 {
//
//	public static void main(String[] args) {
//		ArrayList al=new ArrayList();
//		al.add(10); //-> al.add(new Integer(10));->autoxing behind the scene
//		al.add(10.5);//->al.add(new Integer(10.5));
//		al.add('c'); //->al.add(new Character('c'));
//		al.add(10.5f);
//		System.out.println(al); //output: [10, 10.5, c, 10.5]
//
//	}
//
//}

//Example-2: Accessing data in collection using normal loop and for each loop

//import java.util.ArrayList;
//public class Collection14 {
//	public static void main(String[] args) {
//	ArrayList al1=new ArrayList();
//	al1.add(10);
//	al1.add(20);
//	al1.add(30);
//	al1.add(40);
//	al1.add(50);
//
////	System.out.println(al1);// output: [10, 20, 30, 40, 50]
//	
////	->Accessing data in collection using normal loop
//	for(int i=0;i<al1.size();i++) {
//	
////	->storing data as object 
//    Object o=al1.get(i);
////  System.out.print(o+" "); //output: [10, 20, 30, 40, 50]
////    		or 
//    System.out.print(al1.get(i)+" ");//output: 10 20 30 40 50 
//
//	
//	}
//	
////	->Accessing data in collection using for each loop
//	for(Object obj: al1) {
//		System.out.print(obj + " "); //output:10 20 30 40 50 
//	}
//	}
//}

//Example-3 : Accessing data in collection using Iterator.
//->By traversing it fetches the data.
//->the moment we activate iterator it stays at the collection door.
//->hasNext()-> checks whether there is next elememt after cursor or iterator.
//->next() -> Moving element and fetch it 
//->using special iterator we can access elements in reverse.
//->ListIterator which accepts index it is used to access the elements
//  in reverse.
//->we use iterator to access the data in industry.




//Code: Accessing data in collection using Iterator.

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.ListIterator;
//
//public class Collection14 {
//
//	public static void main(String[] args) {
//		ArrayList al1=new ArrayList();
//		al1.add(10);
//		al1.add(20);
//		al1.add(30);
//		al1.add(40);
//		al1.add(50);
//		
////		System.out.print(al1+" "); //output: [10, 20, 30, 40, 50] 
////		
//		Iterator itr=al1.iterator();
//		
//		while(itr.hasNext()) {
//			
////			->fetching data as objects 
//			
////			Object obj=itr.next();
////			System.out.print(obj+" "); //output: 10 20 30 40 50 
////			        or 
////			->fetching data as Object and converting it into integer
//			Integer i=(Integer)itr.next();
//			System.out.print(i+" "); //output: 10 20 30 40 50 
//			
//		}
//
//	}
//
//}

//2.1 ListIterator
//->using special iterator we can access elements in reverse.
//->ListIterator which accepts index it is used to access the elements
//  in reverse.
//->ListIteractor is there in two classes ArrayList and LinkedList.
//->In ListIterator we have to give the last index of the collection.
//->casting will be common operation when we are playing the iterator.
//->In ListIterator In order to travel over a collection hasPrevious
//  and Previous method is used.

//Example-4 : Accessing data in collection using ListIterator.

//import java.util.ArrayList;
//import java.util.ListIterator;
//
//public class Collection14 {
//
//	public static void main(String[] args) {
//		
//		ArrayList al1=new ArrayList();
//		al1.add(10);
//		al1.add(20);
//		al1.add(30);
//		al1.add(40);
//		al1.add(50);
//		
//		ListIterator litr=al1.listIterator(al1.size());
//		System.out.println(litr);
//		while(litr.hasPrevious()) {
//			System.out.print(litr.previous()+" ");
//		}
//	}
//}

//output: 50 40 30 20 10 


//=>What if I want to reverse or access data of other classes in reverse direction?

//->Index based accessing is not allowed in Array Deque.

//import java.util.ArrayDeque;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.ListIterator;
//
//public class Collection14 {
//
//	public static void main(String[] args) {
//		
//		ArrayDeque ad=new ArrayDeque();
//		ad.add(10);
//		ad.add(20);
//		ad.add(30);
//		ad.add(40);
//		ad.add(50);
//		
////		->Accessing data in collection of ArrayDeque class
////		Iterator itr=ad.iterator();
////		while(itr.hasNext()) {
////			System.out.print(itr.next()+" "); //output: 10 20 30 40 50 
////			
////		}
//		
////		->Accessing data in collection in reverse direction
////		->In array there is not List iterator so we are using Linkedlist
////		and adding Array Deque class data to LinkedList and we can reverse.
//		
//		LinkedList ll=new LinkedList();
//		ll.addAll(ad);
////		System.out.print(ll+" "); //output: [10, 20, 30, 40, 50] 
//		
//		ListIterator itr=ll.listIterator(ll.size());
//		
//		while(itr.hasPrevious()) {
//			System.out.print(itr.previous()+" "); //output: 50 40 30 20 10 
//		}
//		
//	
//	}
//}