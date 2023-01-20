//Rule-2 : Return type of overridden method must 
//be same as that of overriding method in parent class
class Parent12
{
	//overriding method
	//here return type of add method is int
	public int add()
	{
		System.out.println("Parent");
		return 10+2;
	}
	
}

class Child12 extends Parent12
{
	
	//overridden method
	//here return type of add method is void
	public void add() //return type cannot be changed
	{
		System.out.println("child");
	}
	
	
}
public class Inherit12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
