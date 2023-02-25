//22nd Nov Live Class Wrapper class continuation
//1.valueOf() method-To convert string or primitve type data 
//to wrapper object we use valueOf() method
//String or primitive data-->Wrapper object

//there are three types forms of valueOf() mehod persent in 
//Integer wrapper class object
// 1. public static java.lang.Integer valueOf(java.lang.String, int) throws java.lang.NumberFormatException;
// 2. public static java.lang.Integer valueOf(java.lang.String) throws java.lang.NumberFormatException;
// 3. public static java.lang.Integer valueOf(int);

public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Primitive type to wrapper type
//	 #case-1 integer and string as input
//	 ==>public static java.lang.Integer valueOf(int);
		
//		1.1 Int data to wrapper type
		Integer i1=Integer.valueOf(10);//here 10 is (integer)primitive type converted to wrapper type
		System.out.println(i1);//10
		
//		1.2 String data to wrapper type
//	 ==>public static java.lang.Integer valueOf(java.lang.String) throws java.lang.NumberFormatException;
		Integer i2= Integer.valueOf("10");	//here 10 is string data
		System.out.println(i2);//10
		
//		1.3 it gives NumberFormatException because here ten is string.
//		   valueOf() methods takes Integer type data
//		Integer i3=Integer.valueOf("ten");
//		System.out.println(i3);
		
//		#case-2 : here input is radix and base
//		Number system==> base-2(binary), base-8(octal), base-10(decimal), base-16(hexa)
//		==> 1. public static java.lang.Integer valueOf(java.lang.String, Radix) throws java.lang.NumberFormatException; 
		
//		1.4 100 base 2 into wrapper type
//		Integer i4=Integer.valueOf("100",2);
//		System.out.println(i4);//4
		
//==>100 base 2
//	 	1 		0		0
//base-1 1*2^2+0*2^1 + 0*2^0 =4
		
//		1.5. giving base which is unknown- it give exception  NumberFormatException
//		Integer i5=Integer.valueOf("100",37);
//		System.out.println(i5);// NumberFormatException: radix 37 greater than Character.MAX_RADIX
		
//   ==>type in cmd--> javap java.lang.Character--> check for MAX_RADIX and MIN_RADIX
//		we find MAX_RADIX and MIN_RADIX in Character wrapper class
//		public static final int MIN_RADIX;
//		public static final int MAX_RADIX;
		
//		here variables are static and final so it has to declared there itself
		
//		Finding MAX_RADIX and MIN_RADIX 
		System.out.println("MAX_RADIX:"+Character.MAX_RADIX);//MAX_RADIX:36
		System.out.println("MIN_RADIX:"+Character.MIN_RADIX);//MIN_RADIX:2
		
//		number system configured for jvm
//		Possibliblity of number we can give 2 to 36
//		here we use from 2 to 16
		
//		2. character type to wrapper type
//	    #In Character wrapper class valueOf( ) method takes only character as input
//		==>type in cmd--> javap java.lang.Character-->see valueOf()	 method
//		   >>public static java.lang.Character valueOf(char);
		Character c=Character.valueOf('a');
		System.out.println(c);//a
		
		
		
//		3. boolean type to wrapper type
//	    #In Boolean wrapper class valueOf( ) method takes boolean and string as input
//		==>type in cmd--> javap java.lang.Boolean-->see valueOf() method	
//		  >>public static java.lang.Boolean valueOf(boolean);
//		  >>public static java.lang.Boolean valueOf(java.lang.String);
//		  
		  //3.1 here boolean is input
		  Boolean b1=Boolean.valueOf(true);
		  System.out.println(b1);//true
		  
		  //3.2 here string as input
		  Boolean b2=Boolean.valueOf("sachin");//
		  System.out.println(b1);//false
		  
//		  4. Double to wrapper type
		  Double d1 = Double.valueOf(10.5);
		  System.out.println(d1);//10.5
		  
		  public static java.lang.Double valueOf(java.lang.String) throws java.lang.NumberFormatException;
		  public static java.lang.Double valueOf(double);
		
		

		
		

	}

}
