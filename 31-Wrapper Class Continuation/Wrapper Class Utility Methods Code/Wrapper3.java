//3. parseXXX()-we use parseXXX() to convert string to primitive type
//String type -->ParseXXX()--> Primitive type
//String is object
public class Wrapper3 {

	public static void main(String[] args) {
		
//		form-1 : here string is input.
//		======
//	  >>public static primitive parseXXX(String s)
//	  >>Every wrapper class,except Character class has parseXXX() to convert String into
//		primitive type.
		
//		1. String type to primitive type
		int i=Integer.parseInt("10");
		System.out.println(i); //output : 10
		
//		2. String type to boolean type
	//  public static boolean parseBoolean(java.lang.String);
		boolean b=Boolean.parseBoolean("Ashish");
		System.out.println(b);//false
		
//		2. String type to double type
		double d1= Double.parseDouble("10.5");
		System.out.println(d1);//10.5
		
//		3. when we give string type input instead of integer type it
//		Through NumberFormatException
//		Integer i1=Integer.parseInt("ten");
//		System.out.println(i1);
		
//		form-2 : here input is string and radix
//		public static primitive parseXXXX(String s, int radix)
//      => range is from 2 to 36
				
				Integer i3=Integer.parseInt("100", 2);
				System.out.println(i3);//4
		
		

		

		
		
		

		
		
		
		
		

		
		
		
		
		

		

		
		
		
		
		
		

	}

}

//1. valueOf()- converts primitive type and string to wrapper type
		//2. xxxvalue() -converts wrapper type to primitive type
		//3. paraseXXX()-converts string type to primitive type

 

