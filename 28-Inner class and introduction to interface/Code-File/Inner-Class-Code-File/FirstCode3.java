//3. Inner class is non-static member
class A1
	{
		public void show()
		{
			System.out.println("in show");
		}
		
        
		class B1
		{
			public void config()
			{
				System.out.println("in config");
			}
		}
	}
public class FirstCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       //creating object of class
				A1 obj1=new A1();
				//calling show method
				obj1.show();
				
				//we can access Class B which inside Class A from here
				A1.B1 obj2;
				//to access  the non static member we need to get object of class
                //Class B is non static member for that we need object of class A
				obj2=obj1.new B1();
				obj2.config();

	}

}

//>>if inner class is static we can use outer class name for access

//A.B obj2; //A.B irrespective of class b is static or not
//obj2=new A.B(); //using class A name
//obj2.config();

//>>if inner class is non static we have to use object of class

//A1.B1 obj2;
//obj2=obj1.new B1(); //using class A object(obj1)
//obj2.config();


