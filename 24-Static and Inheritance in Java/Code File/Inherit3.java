//3. Multiple inheritance is allowed
//class-1
class Demo11{
	
	String name="hyder";
	int age=28;
	
	void disp() {
		System.out.println("Demo1 "+age+name);
	}
	
}

//class-2
class Demo12 extends Demo11
{
	//code inherited from Demo11 to Demo12 behind secens
    //Demo11 is parent class and Demo12 is child class

}

//class-3
class Demo13 extends Demo12
{
	//code inherited from Demo12 to Demo13 behind secens
	 //Demo12 is parent class and Demo13 is child class
}
public class Inherit3 {

	public static void main(String[] args) {
//		Creating object
		Demo13 demo=new Demo13();
		demo.disp();
		demo.
		

	}

}
