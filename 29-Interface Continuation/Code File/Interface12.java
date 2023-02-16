//case 3: if two interfaces contains a method with same signature 
//but different return types then it is not possible to implement 
//both interface simultaneously

interface Demo1
{
	void m1();
}

interface Demo2
{
	int m1();
}

class CommonImpl2 implements Demo1, Demo2
{
	@Override
	public void m1()
	{
	
	}
	
	@Override
	public int m1()    
	{
		
	}
}


public class Interface12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
