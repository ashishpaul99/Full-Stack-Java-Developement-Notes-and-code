//5. Overriding method using anonymous inner class
//Providing implementation or definition at the time of creating object
//we are overriding method at the time of creating object of class
class Computer1
{
	public void config()
	{
		System.out.println("in computer config");
	}
}
public class FirstCode5 {

	public static void main(String[] args) {
		//we are overriding method at the time of creating object of class
		Computer obj=new Computer()
		//it is inner class. they don't have name. they are
        //they are called anonymous inner class
		{
			public void config(){ //method is overriden
				System.out.println("Something new");
			}
		};
	    
		obj.config();//output: Something new
                    

	}

}
