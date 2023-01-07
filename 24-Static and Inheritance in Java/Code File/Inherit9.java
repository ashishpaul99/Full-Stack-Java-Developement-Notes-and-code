class Parent
{
	int a,b,c;
	
	//constructor-1
	Parent()
	{
		a=10;
		b=20;
		System.out.println("Parent Constructor");
	}
	
//	constructor-2
	Parent(int a, int b)
	{
	
		this.a=a;
		this.b=b;
		System.out.println("Parent Paremetrized constructor");
	}
	
	
}

class Child extends Parent
{
	int x,y;
	
//	constructor-1
	Child()
	{
//		super()  this method included by jvm behind the secens
		this(111,222);
		x=100;
		y=200;
	}
	
//	constructor-2
	Child(int x, int y)
	{
		super(x,y);// this method is called explicitly
		this.x=x;
		this.y=y;
	}
	
	void disp()
	{
		System.out.println(a); //a and b accesed in child class
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class Inherit9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.disp();
		Child c1=new Child(1000,2000);
		c1.disp();

	}
	
//	output:
//	Parent Constructor
//	10
//	20
//	100
//	200
//	Parent Paremetrized constructor
//	1000
//	2000
//	1000
//	2000

}
