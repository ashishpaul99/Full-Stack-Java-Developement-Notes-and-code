//case-3 :  An interface can extend any number of interfaces at a time

interface One1
{
	void m1();
}

interface Two1
{
	void m2();
}

interface Three extends One,Two
{
	void m3();
}

//Implementation for above methods given in class Sample1
class Sample1 implements Three
{
	public void m1()
	{
		
	}
	public void m2()
	{
		
	}
	public void m3()
	{
		
	}
	
}


public class Interface7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
