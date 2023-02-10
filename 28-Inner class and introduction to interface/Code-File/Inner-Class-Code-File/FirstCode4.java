//4. Overriding method generally
class Computer
{
	public void config()
	{
		System.out.println("in computer config");
	}
}
//override config method(inheritance)

class AdvComputer extends Computer
{
	public void config()
	{
		System.out.println("in AdvComputer config");
	}
}

public class FirstCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can have reference of super class and 
        //we can have object of sub class
        //parent type reference for child type of object
		Computer obj=new AdvComputer();
		obj.config(); //output: in AdvComputer config

	}

}

//output: in AdvComputer config
