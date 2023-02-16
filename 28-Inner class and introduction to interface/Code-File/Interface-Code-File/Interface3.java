//SRS
//In specification we have implementation
interface ISample 
{
	//100% abstraction
	//methods by default "public and abstract"
	void m1();
	void m2();
	
}

/*>>conventions followed by developers when giving api[Implementation (Impl)]
>>this class should give implementation for Isample
>>implements keyword is used
>>SampleImpl gives implementation for methods in Isample*/

class SampleImpl  implements ISample
{
	@Override// indication to compiler  that these methods are overriden methods
	public void m1() {
		System.out.println("Hey Implementation is given for m1");
	}
//	if impl is not given for m2 then it comes as it is
//	it is coming from interface by default it is public and abstract
//	if a class contains abstract method then class should made abstract
// same access modifier should be retain while overridng an a method
	@Override 
	public void m2()
	{
		System.out.println("Hey Implementation is given for m2");
	}
}
public class Interface3 {

	public static void main(String[] args) {
		
		ISample sample=new SampleImpl();//Lose coupling
		sample.m1();
		sample.m2();

	}

}

//output: 
//Hey Implementation is given for m1
//Hey Implementation is given for m2














//I followed by name--> in order to know it is interface this 
//convention is followed by many developers

//Rules of overriding 
//1. Method signature never be changed
//2. retain same access modifier while overriding a method
