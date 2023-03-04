//Case 3: Autoboxing vs var-arg method
class Demo10
{
	public static void methodOne(Integer i) {
		System.out.println("AutoBoxing");

		}
		public static void methodOne(int... i) {

		System.out.println("var-arg method");

		}
}
public class varargs10 {

	public static void main(String[] args) {
		  
		int x=10;
		Demo10 d=new Demo10();
		d.methodOne(x);
		
//		1. int =====> implicit type casting===>long,float,double(match not found in this case)
//		then compiler perform Autoboxing
//		2. int =====> Autoboxing ===> Integer(exact match found)
		
//		1. compiler first check for nature of x
//		then it do implicit type casting
//		after type casting if march found then it binds value with it
//		primitive--> do implicit type casting-->found-->long,float,double
		
//		here there no match(methods) found which accepts long,float and double arguments
		
//		2. then compiler do AutoBxing
//		 int-->Autoboxing-->Integer
//		there method accepting Integer as argument. here match is found
		
//      3.  if there is no method accepting then it goes with method accepting var-args method 

	}

}
//
//output: 
//	AutoBoxing
