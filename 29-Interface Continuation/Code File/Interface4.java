/* Whenever we are implementing an interface method  compulsory  
for every method of the interface we should provide 
implementation otherwise we have to declare class as 
abstract class  in that case  child is responsible to provide 
implementation for remaining method.*/
interface ISample1
{
	void m1();
	void m2();
}

abstract class SampleImpl1 implements ISample
{
	@Override
	public void m1()
	{
		System.out.println("Hey Implementation is given for m1");
	}
	
	//other  method not implemented here
	//it is implemented in child class
	
}

class SubSampleImpl1 extends SampleImpl1 
{
	@Override
	public void m2()
	{
		System.out.println("Hey Implementation is given for m2");
	}
	
}


public class Interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubSampleImpl1 sample=new SubSampleImpl1(); //tight coupling
//		SampleImpl1 sample=new SubSampleImpl1(); //lose coupling
		
		sample.m1();
		sample.m2();
	

	}

}

//output:
//	Hey Implementation is given for m1
//	Hey Implementation is given for m2	
