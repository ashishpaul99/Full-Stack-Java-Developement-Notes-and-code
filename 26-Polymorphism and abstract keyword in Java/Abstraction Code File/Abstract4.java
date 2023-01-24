//Project using Inheritance, Polymorphism and Abstactation
import java.util.Scanner;
abstract class Shapes
{
	float area;
	abstract public void input();
	abstract public void compute();
	public void output()
	{
		System.out.println("The area is"+ area);
	}
}

class Rectangle1 extends Shapes
{
	float length;
	float breadth;
	
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
//		taking length
		System.out.println("enter length of rectangle");
		length=scan.nextFloat();
		
		System.out.println("enter breadth of rectangle");
		breadth=scan.nextFloat();
	}
	
	public void compute()
	{
		area=length*breadth;
		
	}

}


class Square1 extends Shapes
{
	float length;
	float breadth;
	
	
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

}

class Circle1 extends Shapes
{
	float radius;
	float pi=3.14f;
	
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
	
	
}

class Geomentry
{
	public void permit(Shapes s)
	{
		s.input();
		s.compute();
		s.output();
	}
	
}
public class Abstract4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 r=new Rectangle1();
		Square1 s=new Square1();
		Circle1 c=new Circle1();
		
		Geomentry g= new Geomentry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
		
		

	}

}
