//Small Project-we can make project without oops. but it is not efficient
import java.util.Scanner;

class Rectangle
{
	float length;
	float breadth;
	float area;
	
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
//		taking length
		System.out.println("enter length of rectnagle");
		length=scan.nextFloat();
		
		System.out.println("enter breadth of rectangle");
		breadth=scan.nextFloat();
	}
	
	public void compute()
	{
		area=length*breadth;
		
	}
	public void output() {
		System.out.println("the area of rectangle is"+area);
	}
}

//sqaure 
class Square
{
	float length;
	float breadth;
	float area;
	
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
//		taking length
		System.out.println("enter length of square");
		length=scan.nextFloat();
	}
	
	public void compute()
	{
		area=length*length;
		
	}
	public void output() {
		System.out.println("the area of square is"+area);
	}
}

class Circle
{
	float radius;
	float pi=3.14f;
	float area;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
//		taking length
		System.out.println("enter raidus of cicle");
		radius=scan.nextFloat();
	}
	
	public void compute()
	{
		area=pi*radius*radius;
		
	}
	public void output() {
		System.out.println("the area of circle is"+area);
	}
	
}
public class Abstract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		Square s=new Square();
		Circle c=new Circle();
		
		r.input();
		r.compute();
		r.output();
		
		s.input();
		s.compute();
		s.output();
		
		c.input();
		c.compute();
		c.output();
		

	}

}
