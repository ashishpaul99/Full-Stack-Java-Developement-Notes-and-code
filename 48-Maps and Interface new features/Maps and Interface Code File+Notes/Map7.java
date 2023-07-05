//Garabge Colector
//->Whenever there is an object if no one is reffering jvm will 
//  invoke the garabage collector and collect the object from the 
//  heap area.
//->While collecting object from heap area an activity is done behind the scenes.
//->Deallocating memory from heap.
//->For doing it there is code internally.
//->while garabage collector collects the object from heap to deallocate 
//  the memory from the heap internally it makes use of finalize method.



//=>Code Explaination:

//->Intially e is reffering Employee object.
//->e is holding to null
//->now no one is reffering Employee object
//->it is pointing to null.

//->Invoking garbage collector by using garbage collector method.
//    System.gc();
//->Internally garabge collector calls finalize method of object class.
//->Garabge collector internally uses finalize method.
//->Garabge collector is one of the thread which collects the 
//  object which is not referred by any refernece.
//->In order to collect the object which has no reference there is
//  is code present in garabage collector.
//->There are methods available where logic of collecting object
//  is present.
//->Whenever garabge collector collects the object it will 
//  execute those methods.
//->Garbage collects calls finalize method to clean the object.
//->After calling garbage collector if finalize method is executed
//  that means garbage collector internally calls finalize method.
//->Whenever garbage collector collects objects from heap memory 
//  it takes help from finalize methods.


//Example-1: Checking wheather finalize method is called when 
//           garabage collector do it's activity
//import java.util.*;
//import java.util.Map.Entry;
//class Employee
//{
//	private int empid;
//	private String name;
//	private String empAdd;
//	
////	setters
////	getters
//	
//	@Override
//	public String toString() {
//		return "Ashish";
//	}
//	
//	@Override
//	public void finalize()
//	{
//		System.out.println("Garabge collector collected the object");
//	}
//	
//}
//
//
//public class Map7 
//{
//	public static void main(String[] args) 
//	{
//		Employee e=new Employee();
//		
////		statement
////		statement
//		e=null;  //it is eligible for garbage colletion
//		
//		
//		System.gc(); //calling garbage collector
//		             //->saying garabge collector to there is something to collect
//              
//		System.out.println("Last Line");
//	}
//
//}

//Output: Garabge collector collected the object

//Example-2:HashMap dominates the Garbage Collector
//->When there is HashMap in program while garabage collector
//  method is called then HashMap dominates garbage collector.
//->HashMap is not allowing garabage collector to do it's work.
//->garbage collector not able to call finalize method.
//->In this case finally method is not called.
//->That is the reason we have a concept of weakHashMap


//import java.util.*;
//import java.util.Map.Entry;
//class Employee
//{
//	private int empid;
//	private String name;
//	private String empAdd;
//	
////	setters
////	getters
//	
//	@Override
//	public String toString() {
//		return "Ashish";
//	}
//	
//	@Override
//	public void finalize()
//	{
//		System.out.println("Garabge collector collected the object");
//	}
//	
//}
//
//
//public class Map7 
//{
//	public static void main(String[] args) 
//	{
//		Employee e=new Employee();
//		HashMap hm=new HashMap();
//		hm.put(e, "Ashish");
////		statement
////		statement
//		e=null;  //it is eligible for garbage colletion
//		
//		
//		System.gc(); //calling garbage collector
//		             //->saying garabge collector to there is something to collect
//              
//		System.out.println("Last Line");
//	}
//
//}

//Example-3:WeakHashMap dominates the Garage collector 
import java.util.*;
import java.util.Map.Entry;
class Employee
{
	private int empid;
	private String name;
	private String empAdd;
	
//	setters
//	getters
	
	@Override
	public String toString() {
		return "Ashish";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Garabge collector collected the object");
	}
	
}


public class Map7 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		WeakHashMap hm=new WeakHashMap();
		hm.put(e, "Ashish");
//		statement
//		statement
		e=null;  //it is eligible for garbage colletion
		
		
		System.gc(); //calling garbage collector
		             //->saying garabge collector to there is something to collect
              
		System.out.println("Last Line");
	}

}

//Output:
//	Last Line
//	Garabge collector collected the object


//=>Difference Between HashMap and WeakHashMap
//1. HashMap - HashMap will dominate the garbage collector.
//2. WeakHashMap - WeakHashMap is about the garbage collection.
//   ->WeakHashMap will not the dominate garbage collector.




//->HashTable is legacy class.