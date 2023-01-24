// In case the type of reference can be change.  
// if the type is of parent type.
class Parent3
{
	public void cry()
	{
		System.out.println("Parent crying");
	}
}

class Child31 extends Parent3
{
	public void cry()
	{
		System.out.println("Child31 cries at low voice");
	}
}

class Child32 extends Parent3
{
	public void cry()
	{
		System.out.println("Child32 cries at high voice");
	}
}
public class Poly3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child31 c1=new Child31();
		Child32 c2=new Child32();
		
		// In case the type of reference can be change.  
		// if the type is of parent type.
		Parent3 a=new Child31();
		
//		here Parent type of refernece is Parent3
//		variable name can be anything
		
		

	}

}
