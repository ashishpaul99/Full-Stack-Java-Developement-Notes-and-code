//14th Nov Live Class Inheritance ,(inherited vs overridden vs specialised methods) super, final keyword in Java
//>>UML to code
//  inherited methods
//	overridden methods
//	Specialized methods
class Plane
{
	public void takeoff() {
		System.out.println("Plane is taking off");
	}
	
	public void fly() {
		System.out.println("Plane is flying");
	}
	
	public void landing() {
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane
{
//	overridden methods
	public void fly() {
		System.out.println("CargoPlane flies at lower height");
	}
	
	
//	Specialized methods
	public void carryGoods() {
		System.out.println("CargoPlane carries goods");
	}
}

class PassengerPlane extends Plane
{
//	overridden methods
	public void fly() {
		System.out.println("PassengerPlane flies at Medium height");
	}
	
	
//	Specialized methods
	public void carryPassengers() {
		System.out.println("PassengerPlane carries Passengers");
	}
}

public class Inherit10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		cp.takeoff();    //inherited method
		cp.fly();	     //overridden method
		cp.carryGoods(); //specialized method
		cp.landing(); 	 //inherited method
		
		
		pp.takeoff();			//inherited method
		pp.fly();				//overridden method
		pp.carryPassengers();   //specialized method
		pp.landing();	        //inherited method
		

	}

}

//output: 
//	Plane is taking off
//	CargoPlane flies at lower height
//	CargoPlane carries goods
//	Plane is landing
//	Plane is taking off
//	PassengerPlane flies at Medium height
//	PassengerPlane carries Passengers
//	Plane is landing
