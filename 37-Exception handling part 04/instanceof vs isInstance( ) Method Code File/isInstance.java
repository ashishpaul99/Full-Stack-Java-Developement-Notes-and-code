//7.1 Difference between instanceof and isInstance( ) :
//a. instanceof
//->instanceof an operator which can be used to check whether 
//  the given object is particular type or not We know at the 
//  type at beginning it is available.
    
//  eg: String s = new String("sachin");
//      System.out.println(s instanceof Object );//true

//->If we know the type at the beginning only use instanceof.

//b. isInstance( )
//->isInstance( ) is a method , present in class Class , 
//  we can use isInstance() method to checked whether the 
//  given object is particular type or not. 
//->We don't know the type at beginning it is available 
//  Dynamically at Runtime.




//Example-1:
//Class.forName(args[0]);//->this method loads the class

public class isInstance {

	public static void main(String[] args) throws Exception {
//		1.here we know type to compare
//		  ->here test is instance of Test
		  Test t=new Test();
		  System.out.println(t instanceof Test);
		
//		2. here we don't with what type to compare.
//		  ->load the class and check whether this class is 
//		    instance of t object.
//		  ->here Test.class will be loaded and checking whether
//		    Test class is instance Test
		System.out.println(Class.forName(args[0]).isInstance(t));
		
		//here give type in arguments 
		//1. if we give string as type it gives flase
//		   ->String.isInstace(Test)
//		   ->String is not instance of t object.
//		   ->no relationship between string and Test
//		   ->Test is not type of String type
		//2. if we give Object as type it gives true
//		    ->Object.isInstace(Test)
//		->there is relationship between Object and t

	}

}

//output:

//here give type in arguments 
//1. if we give string as type it gives flase

//C:\Users\Ashishpaul\Desktop\java>javac Test.java
//
//C:\Users\Ashishpaul\Desktop\java>java Test java.lang.String
//true
//false

//2. if we give object as type it gives true
//C:\Users\Ashishpaul\Desktop\java>java Test java.lang.Object
//true
//true

//java Test Test //true
//java Test String //false
//java Test Object //true

