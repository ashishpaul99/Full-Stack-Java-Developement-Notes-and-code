class Parent2
{
	public void cry()
	{
		System.out.println("Parent crying");
	}
}

class Child21 extends Parent2
{
	public void cry()
	{
		System.out.println("Child1 cries at low voice");
	}
}

class Child22 extends Parent2
{
	public void cry()
	{
		System.out.println("Child2 cries at high voice");
	}
}
public class Poly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Child21 c1=new Child21();
	 Child22 c2=new Child22();
	 
	 Parent2 ref;
	 ref=c1;
	 ref.cry();
	 
	 ref=c2;
	 ref.cry();

	}

}

//output:
//	Child1 cries at low voice
//	Child2 cries at high voice
//Remember
//int a;
//a=10;
//
//int b=20;

//both ways we can declare variables and intialize them
