//Operations on ArrayList

//=>Important things to observe when we use inbuilt methods.
//1. what data accepting by in built method. 
//2.What that method returns.

//ArrayList Important Points
//1. ArrayList stores large amount of data.
//2. it stores both homogenous and heterogenous.
//3. internally follows Dynamic array data structure.
//4. Indexed based accessing is allowed.
//5. Duplicates are allowed.
//6. efficient for insertion and deletion at rear end 
//7. it is from list interface.
//8. using inbuilt methods we can perform operation on it.




import java.util.ArrayList;

public class Collection5 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(11);
		al1.add(12);
		al1.add(13);
		al1.add(14);
		System.out.println(al1); //output: [11, 12, 13, 14]
		
//	  ->Checking wheather ArrayLsit contains particular object.
//		boolean res=al1.contains(14);
//		System.out.println(res); //output: true
//		            or
//		System.out.println(al1.contains(14)); //output: true
		
//	   ->finding index of object in ArrayList
//	     int index=al1.indexOf(12);
//	     System.out.println(index); //output:1
//		       or
//		 System.out.println(al1.indexOf(12)); output:1
		
//		->Checking wheather collection is empty
//		System.out.println(al1.isEmpty()); //output: false
		
//		->to ensure the capacity. 
//		->below linkedlist can store 10 objects but it occupied 4 places.
		al1.ensureCapacity(10);
		System.out.println(al1.size()); //output: 4
		
//		Capacity - How much you can have it
//		Size     - How much you already utilized
		
//		->trimming size - trims till object are occupied
		
		al1.trimToSize();
		System.out.println(al1.size());//output: 41
		
		System.out.println(al1.getClass());//output: class java.util.ArrayList

//		->Clearing data
		al1.clear();
//		System.out.println(al1); //output: []
		System.out.println(al1.size()); //output: 0
			

	}

}







