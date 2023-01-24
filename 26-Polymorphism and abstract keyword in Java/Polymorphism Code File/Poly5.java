//Polymorphism- code flexibility
//for child type of object refrence type is of parrent
//using parent reference we can call overriden and inherited methodod child class
class Parent4
{
	public void cry()
	{
		System.out.println("Parent crying");
	}
}
class Child41 extends Parent4
{
	public void cry()
	{
		System.out.println("Child41 crying");
	}
//	Specialized method
	public void eat()
	{
		System.out.println("Child41 eats less");
	}
}

class Child42 extends Parent4
{
	public void cry()
	{
		System.out.println("Child42 crying");
	}
//	Specialized method
	public void eat()
	{
		System.out.println("Child42 eats more");
	}
}

public class Poly5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parent type reference for child object
		Parent4 p1=new Child41();
//	1. using parent type reference you can call child class inherited methods.
		p1.cry(); //overriden method
		
//	2. directly using parent type reference you cannot called child class specialised methods .
//		p1.eat(); //Specilized method
		
//	3. changing behavior-down casting
//		P1 type changed to child type 
		((Child41)p1).eat();//down casting-now we can call speacilaized method
		

		
		Parent4 p2=new Child42();
		p2.cry();
		
	
	}

}
