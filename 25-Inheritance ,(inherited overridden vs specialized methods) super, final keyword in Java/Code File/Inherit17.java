//b. Java Final Method
//If you make any method as final, you cannot override it.
//final method pariticipated in inheritance. final method get 
//inherited but we cannot override

class Vehicle1
{
	final void disp()
	{
		System.out.println("Vehicle1");
	}
}

class Car1 extends Vehicle1
{
	void disp() // we get error(final method get 
	             //inherited but we cannot override)
	{
		System.out.println("Car1");
	}
}
public class Inherit17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c=new Car1();
		c.disp();

	}

}
