//1. ArrayList ->List(I)
//->it is in built class of collection API.
//->ArrayList internally it follows Dynamic Array Data Structure.
//->every inbuilt class follows specific data structure.
//->if classes is used to store data the data in the memory is 
//  stored by following structure.
//->ArrayList implements List interface.
//->ArrayList is dynamic in nature.
//->To use any of the collection classes we need to import.
//eg: import java.util.*;

//2.Dynamic Arary -> as we add the elements Dynamiclly at the 
//  rear end it will grow.
//->Last place of array we call it as rear end.
//->A Dynamic array automatically grows when we try to make an 
//  insertion.
//->Size will grow based on data.

//3. Important points.
//->1. In collection whatever data you add it stores as an object.
//->2. By using ArrayList we can store Homogenous data and Heterogenous
//     data.
//->3. we can add entire collection into another collection.
//->4. whenever method is accepting we must pass the arguments 
//     and when method is returning something we have to collect.
//->5. Size is growing and shrinking
//->6. we are able to add object in ArrayList at any given point.
//->   At front, middle and rear.
//->7. effecient and easy to add data in rear end.
//->8. when we add elements in middle it replaces the element 
//     at particular index by shifting the element present in
//     that place to the next index.

//eg:
//   Existing data[11, 12, 13, 14, 15]
//   After replacing data in 2nd index[11, 12, 28, 13, 14, 15]
//   After replacing data in front end[5, 11, 12, 28, 13, 14, 15]

//->replacing elements in front and middle is not recommended.
//->it is time cosuming.
//->it is not efficient because of shifting object to next index.

//->9. In ArrayListIndex based access is allowed.we can access the data by using index.








//Code Explaination:
//->ArrayList is in built class.
//->add() is a method which is accepting object.
//->homogenous data is allowed.
//->same type of data can be added.
//->In collection whatever data you add it stores as an object.

//al1-> 10,20,30

//->addAll accepts entire collections.
//->add method is accepts object and index both.

//Collection-1 & 2:
//->By using ArrayList we can store Homogenous data and 
//  Heterogenous data.

//Collection-3:
//->we can add entire collection into another collection.

//Collection-4:
//->we can replace the element in collection with other element.





import java.util.*;

public class Collection2 {

	public static void main(String[] args) {
		
//		Collection-1: Homogenous data is added
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1); //Output: [10, 20, 30]
		System.out.println("---------------");
		
//		Collection-2: Heterogenous data is added
		ArrayList al2=new ArrayList();
		al2.add("Ineuron");
		al2.add(28);
		al2.add('b');
		al2.add(18.5);	
		System.out.println(al2);
		
		System.out.println("----------------");//output: [Ineuron, 28, b, 18.5]
		
		
//		Collection-3: we can add entire collection into another
//		collection.
		ArrayList al3=new ArrayList();
		al3.addAll(al2);
		System.out.println(al3);
		
		System.out.println("----------------"); //output: [Ineuron, 28, b, 18.5]
		
//		Collection-4: we can replace the element in collection 
//		with other element.
		
		ArrayList al4=new ArrayList();
		al4.add(11);
		al4.add(12);
		al4.add(13);
		al4.add(14);
		al4.add(15);
		System.out.println("Existing data"+ al4);//output: Existing data[11, 12, 13, 14, 15]
		
		al4.add(2, 28);
		System.out.println("After replacing data in 2nd index"+al4);// output: After replacing data in 2nd index[11, 12, 28, 13, 14, 15]
		
		al4.add(0, 5);
		System.out.println("After replacing data in front end"+al4);
		
		al4.add(55);
		System.out.println("After replacing data in  rear end"+al4); //output: After replacing data in  rear end[5, 11, 12, 28, 13, 14, 15, 55]
		
		
		
		
		
		
         
	}

}


//output:


//[10, 20, 30]
//---------------
//[Ineuron, 28, b, 18.5]
//----------------
//[Ineuron, 28, b, 18.5]
//----------------
//Existing data[11, 12, 13, 14, 15]
//After replacing data in 2nd index[11, 12, 28, 13, 14, 15]
//After replacing data in front end[5, 11, 12, 28, 13, 14, 15]
//After replacing data in  rear end[5, 11, 12, 28, 13, 14, 15, 55]

