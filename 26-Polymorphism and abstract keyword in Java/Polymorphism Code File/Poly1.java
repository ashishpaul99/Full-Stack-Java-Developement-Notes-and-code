// 15th Nov Live Class Polymorphism and abstract keyword in Java

//1. Polymorphism

//Tight coupling - creating child type reference for child type object
class Parent1
{
	public void cry()
	{
		System.out.println("Parent crying");
	}
}

class Child1 extends Parent1
{
	public void cry()
	{
		System.out.println("Child1 cries at low voice");
	}
}

class Child2 extends Parent1
{
	public void cry()
	{
		System.out.println("Child2 cries at high voice");
	}
}

public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		
		c1.cry();
		c2.cry();

	}

}
