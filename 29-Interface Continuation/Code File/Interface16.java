//In real time coding we always have interface , abstract class and concrete class
interface IDemo3
{
	//SRS(100% abstract)
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}

//AdapterClass give dummy implementation for all methods
abstract class AdapterClass implements IDemo3
{
	
		public void m1(){}
		public void m2(){}
		public void m3(){}
		public void m4(){}
		public void m5(){}
		
	
	
//	service not given  to all methods
//	avoid object creation for class making class abstract
}

//giving implementation for m3 method

class TestApp extends AdapterClass
{
	public void m3()
	{
		System.out.println("I can give implementaion to m3");
	}
}
public class Interface16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDemo3 demo=  new TestApp() ;
		demo.m3();

	}

}



//output:
//	I can give implementation to m3

//avoid object creation for class by making class as abstract
