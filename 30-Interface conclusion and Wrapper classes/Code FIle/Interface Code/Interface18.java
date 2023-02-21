//21st Nov Live Class Interface conclusion and Wrapper classes


//1. During the child object creation, only child class object will created but not the parent class object(but parent class constructor 
//is called to bring the properties of parent to child) 

//2. properties of parent are inherted while creating child object
class Parent 
{
	Parent()
	{
		
		System.out.println("Parent class constructor");
//		printing object address
		System.out.println(this.hashCode());
	}
	
}

class Child extends Parent 
{
	Child()
	{
//		placed by compilier
//		super();
		System.out.println("Child class Constructor");
		System.out.println(this.hashCode());
		
	}
	
	
}
public class Interface18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating child class object 
		//constructor be called at the time of object creation
		Child C=new Child();
//		gives address of child class
		System.out.println(C.hashCode());
		

	}

}

//next page continuation>> check interface19.java
