import java.util.ArrayList;

//6. AutoBoxing and AutoUnboxing
//>> Until 1.4Version, we can't provide wrapper class objects in place of primitive and
//primitive in place of wrapper object.
//>> all the required conversions should be done by the programmer.
//
//>> But from jdk1.5 Version onwards,we can provide primitive in place of wrapper and in
//place of wrapper we can keep primitive also.
//>> All the required conversion will be done by the compiler automatically, this
//mechanism is called as "AutoBoxing" and "AutoUnBoxing".

public class Wrapper6 {

	public static void main(String[] args) {
		
//	example-1	
//		Boolean b1=Boolean.valueOf(true);
//		if(b1)
//		{
//			System.out.println("hello");
//		}
		
//  example-2 
//		in 1.5 version primitives are allowed to use in place of objects
//		ArrayList al=new ArrayList();
//		al.add(10);
//		here in 10 is int
		
//		Previously it accepts only objects in 1.4 version
		ArrayList al1=new ArrayList();
		//primitive to wrapper done by programmer
		Integer i1=new Integer(10);
		al1.add(i1);
		System.out.println(al1);
		

//		1. primitive type to wrapper
		Integer i2=Integer.valueOf(10);
//					or			
		Integer i3=new Integer(10);
		
		
//   ==>1. AutoBoxing- Automatic conversion of primtive type to wrapper object by the compiler is called
//		"AutoBoxing".
		
//		take primitive type. wrap it around. keep it up into wrapper object.
//		from JDK 1.5 version it is allowed
		Integer i4=10;//here 10 is primitive type
		System.out.println(i4);//10
		
//		compiler write code behind the scenes. after compilation code would be
//		Integer i4=Integer.valueOf(10);
		

		
//		Note: Autoboxing is done by the compiler using a method called "valueOf()".
		
//		2. AutoUnBoxing-
//		Automatic conversion of wrapper object to primtive type by compiler is called
//		"AutoUnBoxing".
		
//	    data is wrapped ad giving to primitive type
//		from JDK 1.5 autoUnboxing is possible
		Integer i5=new Integer(10);
		int i6=i5;//>>compiler write these code behind the scenes
		System.out.println(i6);//10
		
//		compiler converts Integer to int type using intValue() behind the scenes
//		compiler write code behind the scenes. after compilation code would be
//		int i6=i5.intValue();
		
		
//		Note: AutoUnboxing is done by the compiler using a method called "xxxValue()"
		
		
//		convert 10  to integer
		Integer i7=new Integer(10);// it is not inteligent. from JDK11 it is deprecated 
//		deprecated- don't use. this feature might remove in future in API
		Integer i8=Integer.valueOf(10);//static factory method // it is intelligent
		
		
		
		
		
		
//		

		
		
		

		
					
		
		
	}
	

}
