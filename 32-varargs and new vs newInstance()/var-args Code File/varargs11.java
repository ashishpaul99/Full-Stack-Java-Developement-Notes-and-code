class Demo11
{
	public static void methodOne(Long l) {
		System.out.println("Long");
	}
}
public class varargs11 {

	public static void main(String[] args) {
		int x=10;
		Demo11 d=new Demo11();
		d.methodOne(x); //CE: can't find the method
		
//		1. int =====> implicit type casting(widening)===>long,float,double(match not found)
		
//		2. int =====> Autoboxing ===> Integer(match not found) 
//		then again it has do type casting. compiler again do widening on Integer.
// 		widening- child reference can be collected by parent type which is called as "Implicit typecasting"
		
//		3. Integer-->type casting(widening)--> Number,object(parent of integer)
//		compiler search for number and object.(match not found)
		
//		here call will not be resolved because match not found.
//		it gives compilation error. 
		//CE: can't find the method
		
//		widening on integer--> 
//		widening- child reference can be collected by parent type which is called as "Implicit typecasting"
		
		
//		Note:
//			Widening followed by Autoboxing is not allowed in java, but Autoboxing followed by
//			widening is allowed.
//		whenever a compiler tries to bind method call first prefernce is given to autoBoxing then widening.

	}

}
