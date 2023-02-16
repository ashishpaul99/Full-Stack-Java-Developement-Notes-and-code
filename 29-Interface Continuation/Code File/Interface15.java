
interface IDemo22
{
	//SRS
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}

class DemoImpl1  implements IDemo22
{
	public void m1()
	{
		
	}
	public void m2()
	{
		
	}
	public void m3()
	{
		System.out.println("m3");
	}
	public void m4()
	{
		
	}
	public void m5()
	{
		
	}
}
public class Interface15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		not possible to implement only m3 and call it
		IDemo22 demo= new DemoImpl1();
		demo.m3();
		

	}

}

//Continuation--interface16
