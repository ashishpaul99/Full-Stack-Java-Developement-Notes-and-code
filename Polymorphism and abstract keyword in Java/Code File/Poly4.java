class Plane
{
	public void takeoff()
	{
		System.out.println("Plane is taking off");
	}
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void landing()
	{
		System.out.println("Plane is landing");
	}
}

class PassengerPlane extends Plane
{
	public void fly()
	{
		System.out.println("PassengerPlane files at Medium height");
	}
	
}

class CargoPlane extends Plane
{
	public void fly()
	{
		System.out.println("CargoPlane files at low height");
	}
}

class FighterPlane extends Plane
{
	public void fly()
	{
		System.out.println("FighterPlane files at high height");
	}
}

//1 Specialized method and 2 inherited method 
//indirectly using parent   type reference you  call  child class specialised methods .
class Airport
{
	public void permit(Plane plane) {
	    //Plane=cp,pp,fp
		plane.takeoff();	//inherited method
		plane.landing();	//inherited method
		plane.fly();        //Specialized method
//		object creating happens in compile time
//		invoking is happening in run time
//		Polymorphism-one line doing Multiple tasks
//		same line invoking all the lines
//		Plane is parent of all three classes
//		1 is to many
//		Polymorsphism-creating parent type reference
//		lose coupling
		
		
	}
}

public class Poly4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PassengerPlane pp=new PassengerPlane();
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		Airport a =new Airport();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
		
		
		
		
		
//		Parent type holding child type object
//		Plane plane;
//		plane=pp;
//		plane.takeoff();//1:M>>same line doing multiple tasks
//		plane.fly();
//		plane.landing();
//				  				
//		
//		plane=cp;
//		plane.takeoff();
//		plane.fly();
//		plane.landing();
		
		
		

	}

}
