//11. Final Keyword
//  final keyboard in java is used to restrict the Java user.  
//final can be variable, method and class.


//a. Java Final Class
//final class doesn't participate in inheritance
final class Vehicle
{
	void disp()
	{
		System.out.println("Vehicle");
	}
}

class Car extends Vehicle //final class we cannot inherit
  						  // we see error
{
	
}

public class Inherit16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.disp();

	}

}
