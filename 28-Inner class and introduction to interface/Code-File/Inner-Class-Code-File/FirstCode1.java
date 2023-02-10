//1. Inner class 
public class FirstCode1 {
	
	int num;
//	FirstCode knows about class A
//	Creating object of class A
	A obj2=new A();
//	we cannot call config method here
//	obj2.config; //gives error
//	calling a function is an action
//	action can be taken only in method
	
	public void show()
	{
		System.out.println("in show"+" "+ num);
//		config method
		obj2.config();
	}
	
	
    //we can create class inside a class
	//inner class
	class A
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Calling show method
		FirstCode1 obj1 =new FirstCode1();
		obj1.show();

	}

}
