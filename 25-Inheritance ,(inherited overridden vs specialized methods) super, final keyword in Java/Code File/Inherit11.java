//>>Rules to overriden method
//Rule-1 : We can increase visibility of overriden method but we cannot reduce visibility
class Parent11
{
	void disp() //default access
	{
		
	}
	
	public void disp2() 
	{
		
	}
	
	
}

class Child11 extends Parent11
{
	public void disp() //we can increase visibility of overriden method
	{
		
	}
	
//	void disp2()  // we cannot reduce visibility of overriden method
//	{
//		
//	}
}
public class Inherit11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child11 c11=new Child11();
		c11.disp();
		c11.disp2();

	}

}
