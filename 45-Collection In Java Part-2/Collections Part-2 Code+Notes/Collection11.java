//5. TreeSet
//->it follows Binary search tree data structure to data.
//->output is ascending sorted order.
//->If data has to be ascending sorted order after inserting
//  data we can go with TreeSet.
//->it will not maintain the order of the data.
//->it gives the result in the form of ascending sorted order.

//->eg: 100 50 150 25 75 125 175
//->In case of binary tree set the second data is directly compared 
//  with the first data. 
//->if second data is less than first data it takes left side of first data.
//->if second data is more than first data it takes right side of first data.


//5.1 How data is stored in TreeSet?
//step-1: 100 is inserted
//step-2: 50 is added after 100 and it is compared with 100. 
//->50 is smaller than 100 so it occupies left side of 100.
//->if second data is less than it takes left side of first data.
//->if second data is more than 100 it takes right side of first data.

//step-3: 150 is greater than 100 hence it occupies right side 
//        space.

//				100
//		  50             150

//step-4: 25  is less than 100 and 50 so it takes left side space of 50.

//				100
//		  50             150
//   25

//step-5: 75 is less than 100 and greated than 50 so it takes 
//        right side of 50.

//				100
//		  50             150
//   25       75
                      
//step-6: 125 greater than 100 and less than 150 so it occupies 
//space left side to 150,

//				 100
//		  50              150
//   25       75      125 

//step-7: 175 is greater than 100 and greater than 150 so it 
//occupies space right side to 150.

//				 100
//		  50              150
//   25       75      125       175


//=>Output when we data insertion is given to TreeSet

//				 100
//		  50              150
//   25       75      125       175

//->output: [25, 50, 75, 100, 125, 150, 175]

//->TreeSet follows in-oder traversal.
//->Left Value Right
//->if we want to iterate the values from collection of TreeSet
//  we have to follow in order traversal way.
//see picture at 1:09:33 ->LVR
//->in order, pre oreder and post order treversal.

//->see picture at 1:05:52
//5.2 Searching element in TreeSet class
//key=200

//Collection - 25, 50, 75, 100, 125, 150, 175


//				 100
//		  50              150
//   25       75      125       175

//seraching 200 in collection.
//->step-1: first it goes to 100. 200 is greated than 100.
//          then it goes to right(150).
//->step-2: 200 compared to 150. 200 is greater than 150.
//			then it goes to right.
//->step-3: 200 is compared with 175. 200 is greater than 175
       
//->key not found.
//->7 objects are present in the collection.
//->In order to search a key 3 comparisons are made. 
//->Time complexity - O(log2N)

//5.3 Conclusion:
//->by following Binary Search Tree data strucutre if tree become 
//  balanced tree then searching  operation is very easy.
//->if data is stored in structure if you want to get 
//  or iterate the data we have to follow in-order travesral.

//5.4 Methods in TreeSet

//Ceiling method-
//->if object is present it will give the object.
//->if object is not present it will give nearest higher object.
//eg: ts.ceiling(50)

//floor method -
//->if object is present it will give the object.
//->if object is not present it will give nearest Lower object.
//eg: ts.floor(50)

//higher method
//->it gives higher value of the object. it will not check the 
//the object is present or not in collection.
//eg: ts.higher(50)

//Lower method
//-> it gives lower value of the object. it will not check the 
//the object is present or not in collection.
//eg: ts.lower(50)

//Example-1:
import java.util.*;

public class Collection11 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);// output: [25, 50, 75, 100, 125, 150, 175]

		
		System.out.println(ts.ceiling(50)); //output:50
		System.out.println(ts.higher(50));  //output:75
		System.out.println(ts.floor(50));   //output:50
		System.out.println(ts.lower(50));   //output:25
		System.out.println("-------------------");
		
		System.out.println(ts.ceiling(40));  //output:50
		System.out.println(ts.higher(40));   //output:50
		System.out.println(ts.floor(40));    //output:25
		System.out.println(ts.lower(40));    //output:25
		
		
	}

}


//output:
//	       [25, 50, 75, 100, 125, 150, 175]
//			50
//			75
//			50
//			25
//			-------------------
//			50
//			50
//			25
//			25