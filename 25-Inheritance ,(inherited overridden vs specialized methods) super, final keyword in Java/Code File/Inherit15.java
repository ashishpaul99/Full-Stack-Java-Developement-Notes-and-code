//10. Super Keyword

//super keyboard can be used to refer immediate parent class instance variable.
//super keyboard can be invoke immediate parent class method.

class Parent15
{
	int age=25;
}

class Child15 extends Parent15
{
	int age=28;
	void disp()
	{
		System.out.println(age);
		System.out.println(super.age); //refer immediate parent class 
									   //instance variable(age)
		
	}
}
public class Inherit15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child15 c=new Child15();
		c.disp();
		

	}

}
