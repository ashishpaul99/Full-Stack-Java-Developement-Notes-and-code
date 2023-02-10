//2. Making inner class static and access the method inside it
class A
	{
		public void show()//non 
		{
			System.out.println("in show");
		}
		
//		we can make inner class as static
		static class B
		{
			public void config()
			{
				System.out.println("in config");
			}
		}
	}
public class FirstCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of class
		A obj1=new A();
		//calling show method
		obj1.show();
		
//		we can access Class B which inside Class A from here
		A.B obj2;
		obj2=new A.B(); //after making class b static we can access like this
						//we access constructor of B with the help of A
		obj2.config();
//	>> we get error if we call config method like this
//		B obj2;//creating reference
//		obj2=new B(); //creating object
//		obj2.config();/

	}

}
