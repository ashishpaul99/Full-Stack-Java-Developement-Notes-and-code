//8. Is it compulsory to write class name as file name?
//-> there is no compulsion to write class name as file name
//when class in not public.
//eg-1:
// class Revision2 {
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}

//->It compulsory to write class name as file name when the
//class is public.
//Eg-2:
//public class Revision2 {
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}


//9. Important points to keep in mind to build big projects.
//->when we build application we make sure the number of 
//classes should be same as number of file present from 
//developer perspective.
//->A class should have a single responsibility.
//->Make sure that a class should have single responsibility.
//->Make sure that a file should have one class that to it 
//should be public.
//->it is much better to maintain it

//10. why class should be public?
//->the reason it should be public in order to give access to
//  the outside world.
//->it is much better to maintain it.
//->we have multiple  files and folders in big project.
//->Make sure files access each other.
//->we try to create resuability components.
//->we build components which are reusable.
//->we have to make our class public so that other perople 
//  can use resuable components created in project.


//11. What if you don't want to share some class with everyone.
//->we can make class as Default.
//->this class only accesble with in particular pacakge.
//->1. Default class- A class with default access has no 
//  modifier preceding it in the declaration. 
//->Default access is simple in that only the code within the
//  same package can access code with default access. In other 
//  words, a class with default access can be seen only by 
//  classes within the same package.

//public class Revision2 {
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}
//
// class Revision{  //->Default class-> which accessble within 
//                                     the same package
                                        
//	
//}

//2. Private class-
//->If a class is restricted to particular class then make 
//  it as private.
//->We can make inner class private but not outer class.
//->the inner class which made private used only inside 
//->The private access modifier is accessible only within the
//  same class. 
//->We can't assign private to outer class and interface.
//->The best use of private keyword is to create a fully 
//  encapsulated class in Java by making all the data members
//  of that class private.

//eg:
//public class Revision2 {
//
//	public static void main(String[] args) {
//		
//
//	}
//	
//	 private class Revision{  //inner class which is private
//	 
//	 }
//
//}

//12. How to save data?
//->In order to save data we have to use Varaible.
//->Java is static typed language.
//->every varible should have pre-defined type.
//->java is Type safe language or strictly typed language.

//eg:
//public class Revision2 {
//
//	public static void main(String[] args) {
//		
//		int num=1;
//		double d=8.9;
//		float f=9.6f;
//		long l=8; //->here implicit conversion is happening.
//		          //->int is converted to long.
//		long a=4523444444444444l; //->we have specify 'l' for large values.
//	}
//}



//Is it advantage or Disadvatnage to have a language which 
//is strictly typed?

//=>Advantages of strictly type language
//->it will give error when wrong type of input is given to
//  variable.
//->it helps in memory management.



//12 Objects in Java
//->Object -> Every object has two things
//has part- variables
//does part- method

//->if you want to store data we have to use variables.
//->if you want to perform operation we have to use methods.


//->In JVM we have special area called heap.
//->In heap area object is created. 
//->we have specify new keyword to create a object.
//->The Java new keyword is used to create an instance of the class
//->After specifying new keyword we have to tell what variables 
//  and methods should object contains by specify class 
//  and bracket which is constructor.
//       Calc c=new Calc();

//Constructor-A constructor in Java is a special method that
//is used to initialize objects. The constructor is called 
//when an object of a class is created.

//->behind jvm will the constructor.

//->In order to call method in class we have to obejct 
//  reference.
//eg:  c.add();

//Understanding OOP's Concept
//=>Adding two numbers  

//class Calc{
//	//has part
//	int num1=5;
//	int num2=8;
//	int result;
//	
//	//does part
//	public void add(){
//		result=num1+num2;
//		System.out.println("Result "+result);
//	}
//}
//->keeping above code in other file(Calc.java) and call the
//  object from this file.

//Code-1:
//public class Revision2 {
//
//	public static void main(String[] args) {
//		//creating object of class Calc
//		Calc c=new Calc();
//		
//		//calling add method
//   		c.add();
//  		  or
// 		new Calc().add(); // alternative for above code.
//		
//	}
//}

//eg:
//int num=1;
//here int is type.
//num is variable.
//1 is value
//->here is num is primitive variable.

//same way
//Calc c=new Clac()

//->c is reference variable. it is reffering to Object.
//->Calc is type 

//Code-2: Intializing value of num1 and num2 
class Calc{
	//has part
	int num1;
	int num2;
	int result;
	
	//does part
	public void add(){
		result=num1+num2;
		System.out.println("Result "+result);
	}
}

public class Revision2 {

	public static void main(String[] args) {
		//creating object of class Calc
		Calc c=new Calc();
		
		//intializ
		c.num1=10;
		c.num2=5;
		
		//calling add method
		c.add();

		
	}
}








