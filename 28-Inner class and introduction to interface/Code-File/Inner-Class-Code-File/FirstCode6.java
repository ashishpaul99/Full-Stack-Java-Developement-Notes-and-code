//6. Making outer class abstract

abstract class Computer2
{
	//In abstract method we don't define things but we declare things
	public abstract void config();
	
}

class Laptop extends Computer
{
//	implementing body of abstract method
	public void config()
	{
		System.out.println("it's working");
	}
}
public class FirstCode6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer obj=new Laptop();
		obj.config(); //output: it's working

	}

}
