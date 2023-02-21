//2. can abstract class be instantiated/ object  be created?
//No, we cannot create object of because it is abstract 

//3. can abstract class contains constructor ?-->yes

//abstract class will have a constructor for initializing the instance variables. this instance variables needed by child and child 
//get those values by making call to constructor of parent class by super method



abstract class Person
{
	String name;
	Integer age;
	float height;
	
//Person constructor is used to initialize the instance variable
//or details of student(name , age, height)
	
	Person(String name,Integer age, Float height){
		this.name=name;
		this.age=age;
		this.height=height;
	}

}
class Student extends Person
{
	Integer sid;
	Float marks;
	String courseName;
	
	Student(String name,Integer age, Float height, Integer sid, Float marks, String courseName)
	{
//		calling parent class constructor and getting values from it
		super(name, age,height);
		this.sid=sid;
		this.marks=marks;
		this.courseName=courseName;
		
	}
	public void getStudentDetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(sid);
		System.out.println(marks);
		System.out.println(courseName);
	}
	
}
public class Interface19 {

	public static void main(String[] args) {
		
		
		
		Student s=new Student("Ashish", 23, 5.8f, 123, 85f, "java");
		s.getStudentDetails();
		

	}

}

//output:
//	Ashish
//	23
//	5.8
//	123
//	85.0
//	java

//we can write abstract class without any method

//instead of constructors we can use setters and getters for instializing instace variables 

//4. can Interface object be instantiated? 
//No, Interface contains abstract methods. interface does not contain implementation methods.

//5. can interface contains constructor ?
//No instance variable in interface so constructor is not required.


//Questions
//1. can refernce be created for abstract class?
//	from above example
//    Person p= new Person("ashish",23, 5.6f, 71,10,100)

//can referece be created for interface?
//		ISample sample= null;

//next page continuation>> check interface20.java




		

