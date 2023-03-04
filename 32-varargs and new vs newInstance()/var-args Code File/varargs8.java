//CASE 1- Widening vs AutoBoxing

//for method binding compiler comes into picture
//Overloading: Compile time polymorphism
//compiler checks for exact match. 
//there is chance of binding int with long and int
//it resolve these thing behind the secens

//see picture
//implicit type casting----->
//byte-->short-->int-->long-->float--->double
//w.r.t character we int

//if exact match not available compiler do these things
//1. compiler checks for nature(primitive or wrapper)
//     nature x is primitive. 
//     it will do (implicit) type casting w.r.t int then it becomes long.
//     if it find long then x is given to method which have long as argument.
//     it prints widening
//      Long(binding happens by compiler)

//>> for method binding complier come into picture
      
class Demo8{
	public static void methodOne(long l) {
		System.out.println("widening");

		}
		public static void methodOne(Integer i) {
		System.out.println("autoboxing");

		}
}

public class varargs8 {

	public static void main(String[] args) {
		
		int x=10;
		Demo8 d=new Demo8();
		d.methodOne(x);// primtive ====> do type casting====> found ==>long(binding happens by compiler)
		

		
		
	}

}

//output:
//	widening
