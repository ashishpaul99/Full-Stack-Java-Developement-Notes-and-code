// 4. toString()- we use toString() method to convert 
// from wrapper class to String

//toString() method is overloaded method 
 
//Wrapper object or primitive type--> string
public class Wrapper5 {

	public static void main(String[] args) {
//		==>object class toString() method
//		public java.lang.String toString();
		
//		4. toString()
//		To convert the Wrapper Object or primitive to String.
//		Every Wrapper class contain toString()
		
//		1. form1
//		public String toString()
//		1. Every wrapper class (including Character class) contains the above toString()
//		method to convert wrapper object to String.
//		2. It is the overriding version of Object class toString() method.
//		3. Whenever we are trying to print wrapper object reference internally this
//		toString() method only executed
		
//		1.1 Wrapper type to String type
//		Integer i=Integer.valueOf("10");
//	    System.out.println(i);//internally it calls toString() and prints the Data.
		
//		2. form2
//		public static String toString(primitive type)
//		1. Every wrapper class contains a static toString() method to convert primitive to
//		String.
		
//		2.1 Primitive type(int) to String type
//		String s1=Integer.toString(10);
//		System.out.println(s1);//10
		
//		2.2 Primitive type(boolean) to String type
//		String s2= Boolean.toString(true);
//		System.out.println(s2);//true
		
//		2.3 Primitive type (Character type) to String type
//		String s3=Character.toString('a');
//		String s4=Character.toString('b');
//		System.out.println(s3);
//		System.out.println(s4);
		
		//String concatenation
//		System.out.println(s3+s4);//ab
		
//		3. form3
//		Integer and Long classes contains the following static toString() method to convert
//		the primitive to specified radix String form.
//		=>public static String toString(primitive p,int radix)
//		here we can give radix from 2 to 36
		
//		String s5 =Integer.toString(6,2);
//		System.out.println(s5);//0110
//		
//		String s7=Integer.toString(7,2);
//		System.out.println(s7);//111 gives binary conversion of 7-0111
		
		
//		4. form4
//		Integer and Long classes contains the following toXxxString() methods.
//		public static String toBinaryString(primitive p);--> to converts primitive type to binary system
//		public static String toOctalString(primitive p);-->to converts primitive type to octal decimal number system
//		public static String toHexString(primitive p);-->to converts primitive type to hex decimal number system
		
//		1. primitive type data to binary string
		String s8=Integer.toBinaryString(7);
		System.out.println(s8);//111
//					or
		String s12 =Integer.toString(7,2);
		System.out.println(s12);//111

//		2. primitive type data to octal string
		String s9=Integer.toOctalString(10);
		System.out.println(s9);//12
		
//		3. primitive type data to Hex string
		String s10=Integer.toHexString(20);
		System.out.println(s10);//14
		
//		4. primitive type data to Hex string
		String s11=Integer.toHexString(11);
		System.out.println(s11);//b
		
//		==>alternative for form 3
		
		
//		Conclusion.
//		Primitive and string to wrapper==> valueOf()
//	    Wrapper type to primitive==> xxxValue()
//	    String type to primitive==> parseXXX()
//	    primitive type or Wrapper to string==>toString(), toBinaryString()
		
//	   String we have special memory called scp
		
//	 ==>we have valueOf() method in string class
//		to convert primitive type to string type
//		  public static java.lang.String valueOf(boolean);
//		  public static java.lang.String valueOf(char);
//		  public static java.lang.String valueOf(int);
//		  public static java.lang.String valueOf(long);
//		  public static java.lang.String valueOf(float);
//		  public static java.lang.String valueOf(double);
		
//		String data=String.valueOf('a'); //Static factory method. static because we are using class name
//		System.out.println(data);
		
		String data1= "ashish".toUpperCase();// instance factory method. instance beacause we are using string object
		System.out.println(data1);//ASHISH
		
//		What is a Factory Method in Java?
//		factory method in java Factory method is a 
//		creational design pattern which solves the 
//		problem of creating product objects without 
//		specifying their concrete classes. 
	
//		The Factory Method defines a method, which should be 
//		used for creating objects instead of using a direct 
//		constructor call ( new operator).
		

	}

}
