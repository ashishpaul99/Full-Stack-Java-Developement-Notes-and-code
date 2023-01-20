// c. Java Final Variable

class Vehicle2
{
	int i=10;
    void disp()
	{
    	i=20;
    	System.out.println(i);
		System.out.println("Vehicle1");
	}
}

class Car2 extends Vehicle2
{
	
}
public class Inherit18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 c=new Car2();
		c.disp();


	}

}
