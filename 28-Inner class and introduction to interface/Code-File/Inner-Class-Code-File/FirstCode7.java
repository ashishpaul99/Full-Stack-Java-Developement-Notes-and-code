abstract class Computer3
{
	public abstract void config();
	
}
public class FirstCode7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer3 obj=new Computer3()
		//anonymous inner class
		{
			public void config()
			{
				System.out.println("It's working fine");
		
			}
		};
		obj.config();//output: It's working fine
	}

}

//we can't reuse anonymous inner class. it is used for only object instantiated at that time. 

//FirstCode$1.java class don't have name
