//=>Generics in Java
//->The Java Generics programming is introduced in J2SE 5 to deal 
//  with type-safe objects. It makes the code stable by detecting 
//  the bugs at compile time.
//
//->Before generics, we can store any type of objects in the collection,
//  i.e., non-generic. Now generics force the java programmer to store a
//  specific type of objects.

//Example-1: Storing only string data in collection

//->ArrayList<String> al1=new ArrayList() -> telling ArrayList to
//  store collection of string type.
//->it only stores string in ArrayList collection when we write above
//  Line.

//import java.util.*;
//
//public class Collection22 {
//	public static void main(String[] args) {
////		we can store heterogenous data in collection.
//		ArrayList<String> al1=new ArrayList<String>(); //it only accepts string type data
//		al1.add("24");
//		al1.add("Hyder");
//		al1.add("Infosys");
//		al1.add("507002");
//		System.out.println(al1); //output:[24, Hyder, Infosys, 507002]
//		
//    //->sorting above data
//		Collections.sort(al1);
//		System.out.println(al1); //output: [24, 507002, Hyder, Infosys]
//
//	}
//}

//Example-3: Storing only Integer data in collection
//
//import java.util.*;
//
//public class Collection22 {
//	public static void main(String[] args) {
////		we can store heterogenous data in collection.
//		ArrayList<Integer> al1=new ArrayList<Integer>(); //it only accepts string type data
//		al1.add(500);
//		al1.add(200);
//		al1.add(300);
//		al1.add(600);
//		
//		System.out.println(al1); //output:[500, 200, 300, 600]
//		
////		sorting above data
//		Collections.sort(al1);
//		System.out.println(al1); //output: [200, 300, 500, 600]
//
//	}
//}


//Example-2:Adding only Certain type of data(Student type data)
//and restricting other data.
//->here it restricts if other data is added to collection.
//->we cannot sort below data using Collections.sort().
//->Collection.sort() works when data/objects in the collection
//  are simple.
//->here the data is complex so go with Comparator and Comparable
//    interface.

import java.util.*;
class Student
{
	private int age;
	private int marks;
	private String name;
	
//	->constructor
	public Student(int age, int marks, String name) {
		this.age=age;
		this.marks=marks;
		this.name=name;
	}
	
//	->Generating setters and getters
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}

}

public class Collection22 {
	public static void main(String[] args) {

		Student s1=new Student(24,75,"Ashish");
		Student s2=new Student(24, 85,  "Naveen");
		Student s3=new Student(26,89, "Deb");
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
//		al.add(100);      //getting error while adding them
//		al.add("adsfkj"); //getting error while adding them
		 
		System.out.println(al); //output: [Student@76ed5528, Student@2c7b84de, Student@3fee733d]
//      ->it is giving the hash code.
		

	}
}

//->Collection.sort() works when data/objects in the collection
//  are simple.
//->if objects are complex we use Comparator and Comparable Interface
//->Whenever the data is complex if sorting has to perform on 
//  it then we have to go for comparator and  interface.





