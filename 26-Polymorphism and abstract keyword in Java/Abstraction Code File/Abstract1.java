//1. Abstraction
// >>In one class if one method is also abstract 
//  then must and should declared as abstract
abstract class Plane
{
//	1. abstract methods : Abstract method are such methods which has only 
    //method signature but body and implementation is not there.
    
	abstract public void takeoff();
	abstract public void fly();
	
	abstract public void landing();
	public void aiport()
	{
		System.out.println("All planes need airport");
	}
}

class PassengerPlane extends Plane
{
	public void takeoff()
	{
		System.out.println("PassengerPlane needs medium runway to taking off");
	}
	public void fly()
	{
		System.out.println("PassengerPlane files at Medium height");
	}
	public void landing()
	{
		System.out.println("PassengerPlane needs medium runway to land");
	}
	
}

class CargoPlane extends Plane
{
	public void takeoff()
	{
		System.out.println("CargoPlane needs longer runway to taking off");
	}
	public void fly()
	{
		System.out.println("CargoPlane files at low height");
	}
	public void landing()
	{
		System.out.println("CargoPlane needs longer runway to landing");
	}
}


class Airport
{
	public void permit(Plane plane) {
	    //Plane=cp,pp,fp
		plane.takeoff();	
		plane.landing();	
		plane.fly();  
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PassengerPlane pp=new PassengerPlane();
		CargoPlane cp=new CargoPlane();
		
		Airport a =new Airport();
		a.permit(cp);
		a.permit(pp);
	
		

	}

}
