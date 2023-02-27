

//2. XXXValue() Method
//to convert to wrapper object to primitive type
//	wrapper type ==> primitive type
//Integer to byte, short, int, long , float, double 
//we have 6 wrapper classes of number type
//number type-byte, short, int, long , float, double 
//In each wrapper class there are 6 xxxValue() methods
//  public byte byteValue();
//  public short shortValue();
//  public int intValue();
//  public long longValue();
//  public float floatValue();
//  public double doubleValue();

//we cannot convert Boolean and Character to  byte, short, int, long , float, double
//xxxValue() method not applicable for character and boolean

public class Wrapper2 {

	public static void main(String[] args) {
		
//		1. Primitive type---> Wrapper type
		//creating wrapper object by constructor
		//here data is primitive 
		Integer i=new Integer(130);//Primitive type---> Wrapper
		
//		2. converting wrapper to primitive
		System.out.println(i.byteValue());//-126
//		result= minrange+(total-maxrange-1)
//		result=-128 + 130-127-1=-126
		
		System.out.println(i.shortValue());//130
		System.out.println(i.intValue());//130
		System.out.println(i.longValue());//130
		System.out.println(i.floatValue());//130.0
		System.out.println(i.doubleValue());//130.0
		
		
		
//		3. Charcter type(wrapper type) to char type(primitve type)
//		Character class contains charValue() to get Char primitive for the given
//		Character Object.
		//		type in cmd--> javap java.lang.Character
//		>>public char charValue();
//		3.1 Primitive type to wrapper type
		Character c=new Character('a');
		
//		3.2 Wrapper type to primitive type
		char c1=c.charValue();
		System.out.println(c1);//a
		
//		4. Boolean type to boolean type
//		Boolean class contains booleanValue() to get boolean primitive for the
//		given boolean Object.
//		type in cmd--> javap java.lang.Boolean
//		public boolean booleanValue();
//		4.1 Primitive type(boolean) to wrapper type(Boolean type)
		Boolean b1= new Boolean("true");
		
//		4.2 Wrapper type(Boolean type) to Primitive type (boolean type)
		boolean b2=b1.booleanValue();
		System.out.println(b2);//true
		
		
		
		
		
		
		

		
		
		

	}

}
