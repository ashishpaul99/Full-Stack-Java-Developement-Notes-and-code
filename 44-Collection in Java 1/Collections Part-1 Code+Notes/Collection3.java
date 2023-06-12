//2. LinkedList -
//->it is part of two interfaces List and Dequeue
//->it internally follows doubly linked list data structure.
//->Homogenous and Heterogenous data can also be stored.
//->every data in collection stored as object.

//->see picture at 1:11:00
//->nodes
//->ram->collection of bytes
//->wherever byte is the value get added and linked with nodes


//              node-1  ------------->   node-2 -------------> node-3 
//               10     <-------------    20    <------------    40



//Important points
//1. here when we add data no shifting takes place but it takes 
//   new node and link with it.
//->ll1.add(1,30);


//              node-1  ------------->   new node  ----------> node-2 -------------> node-3 
//               10     <-------------       30       <---------   20    <------------    40

//->It is efficent and faster way to add  object to collection.

//2. based on index we can add data in collection.
//3. we can add entire collection into another collection.
//4. There two methods which are not present ArrayList but
//   present in LinkedList.
//->Adding element in First - addFirst()
//->Adding element in Last  - addLast()

//5. both of the classes we can store Heterogenous and Homogenous
//   data.

//6. whenever in a collection if data has to add at front end, 
//   rear end and given position then LinkedList is recommended.
//7. LinkedList uses disperse memory allocation. no need of bytes
//   to available continously.
//8. LinkedList is efficent than ArrayList.
//9.It is recommended use LinkedList to perform insertion operation.
//10. Duplicate data is allowed in ArrayList and LinkedList.
//eg:
//	LinkedList ll1=new LinkedList();
//	ll1.add(10);
//	ll1.add("ineuron");
//	ll1.add(20);
//  ll1.add(20);
//	System.out.println(ll1);

//output: [10, ineuron, 20, 20]



//Example-1:LinkedList Example

import java.util.*;
public class Collection3 {

	public static void main(String[] args) {
	  LinkedList ll1=new LinkedList();
	  ll1.add(10);
	  ll1.add("ineuron");
	  ll1.add(20);
	  System.out.println(ll1);
	  
//	 Adding data at front
	 ll1.addFirst("Ashish");
	 System.out.println(ll1);
	 
//	 Adding data at middle
	 ll1.add(1, "Hyd");
	 System.out.println(ll1);
	 
//	 Adding data at Last
	 ll1.addLast("infosys");
	 System.out.println(ll1);


	}

}

//output:
//	[10, ineuron, 20]
//	[Ashish, 10, ineuron, 20]
//	[Ashish, Hyd, 10, ineuron, 20]
//	[Ashish, Hyd, 10, ineuron, 20, infosys]

