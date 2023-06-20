//4. Proirity Queue
//->it follows Min-Heap Data Structure to store data.
//->it implements Queue(I) interface.
//->All collection classes present in util package.
//->In order to use any class in java we have to create object 
//  of the class.

//->we can add entire collection to other collection.
//->Index based accessing is not allowed.
//->Order of insertion is maintained in ArrayList, LinkedList
//  and ArrayDeque.
//->Order insertion is not maintained in Priority Queue
//->Priority Queue is used when we want element with high priority 
//  is available at the begining of the collection.
//->In entire collection element with high priority available 
//  at the begining of the collection.
//   eg: 10,50,100,125,55
//->In above sequence 10 has highest rank so it is available at 
//  the begining.
//->Priority Queue follows min-heap data structure.
//->min- heap
//->input:    100 50 150 25 75 125 175
//->output: [25, 50, 125, 100, 75, 150, 175]

//->it is not in sorting order.
//->whichever is the highest priority element automatically
//  that will come above all.



//How min-heap data structure works?

//step-1: 100 will be added at the beginning because it rank is
//        high.
//->In entire collection element with high priority available 
//at the begining of the collection.

//step-2: 50 Comes to the left of 100 and comparision is made.
//-> in min-heap data strcuture whichever lower numbers comes up
//   and upper numbers comes down.
//see picture at 27:04
//->here 100 is higher number than 50 it comes to down and 50
//   goes to up.
//->swapping is done between 100 and 50.

//               100              swapping                50
//           50                 -------------->      100   





//Step-3: 150 added and comes to right of 50 and it is compared with 50.
//here 150 is higher than 50 and 150 is at down so need to swap.1

//eg:           50
//        100          150   ==>no swapping


//step-4: 25 added left to 100. 25 is lower than 100. 
//so 25 goes to up and 100 comes to down.
//->whichever lower numbers comes up and upper numbers comes down.
//->swaping is done betweeb 100 and 25.
//eg:           50            swapping                 50
//        100          150   -------------->     25          150
//     25                                   100

//step-5: 50 and 25 gets swapped 
//               25
//      50                150 ==>Swapping
//100

//->swaping happens at parent level not on sibiling level.

//step-6: 75 added to left of 50 and no swapping is done because 75 is greater than 25. 75 will be donw to 50.

//               25
//      50                150
//100         75

// step-7: 125 added to left of 150
//->swapping is done between 125 and 150.
//->whichever lower numbers comes up and upper numbers comes down.
   
//               25                  swaping                  25
//      50                150     ----------->       50               125
//100         75      125                     100         75     150        

//step-8: 175  is added to right to 150. 175 is higher than 150 and it is in down  to 152.
//so need to swap.

//                 25
//       50                 125          ==>no swaping is done
//  100        75       150     175

//final output: 25 50 125 100 75 150 175

//              25                           0th level     
//       50                 125              1st level
//  100        75       150        175       2nd level    


import java.util.*;

public class Collection9 {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		System.out.println(pq);//output: [25, 50, 125, 100, 75, 150, 175]
//   ->Order insertion is not maintained in Priority Queue
		
//	 ->Duplicates are allowed in priority queue.
		pq.add(25);
		System.out.println(pq);//output: [25, 25, 125, 50, 75, 150, 175, 100]	
	}

}

//ouput:
//	[25, 50, 125, 100, 75, 150, 175]
//	[25, 25, 125, 50, 75, 150, 175, 100]

//->Irrespective of inserting data if we want high priority of the element 
//should come at front the collection then we have go with 
//Priority queue.




//Conclusion:
//->Internally every collection class follows a particular 
//  data structure.
//->Priority class follows Min-heap data structure.
//->highest priority element comes above all or begining of the list
//  in priority queue.
//->whichever lower numbers comes up and upper numbers comes down.

