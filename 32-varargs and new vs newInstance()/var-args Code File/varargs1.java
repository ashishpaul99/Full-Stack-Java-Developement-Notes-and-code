//method overloading- method name is same. but change in argument type
//method overloading- Compiler only binds method calls
//Compile time polymorphism
//method overloading concept is available from JDK 1.0 version


//form JDK 1.4 version if the arguments are changing you need to write 
//different methods to handle that requirements.

//JDK 1.4--> change in the no. of arguments new method should be written.

//if a method handle two arguments if we give one more arguments it is 
//difficult handle. 

//lenght of code increases when we write new method. 
//readibilty of code will be difficult

//>> this was the problem till JDK 1.4 version.

//But jdk1.5 version, we can write single method which can handle variable no of
//arguments(but all of them should be of same type).

//we write one method that method will handle any type arguments given to it.
//but the expectation of that method arguments type should be same.

//if arguments are same type don't write multiple methods 

class Demo{
	public void add(int x) {
		System.out.println(" ");
	}
}

public class varargs1 {

	public static void main(String[] args) {
		
		Demo d=new Demo();
//		d.add();//not possible without argument
		d.add(10);//possible
//		d.add(10,20);//not possible add methods accepts only one arguments
		System.out.println();
		
//		we need to give additional power to varible to x such that it should accept 
//		one or two or three arguments also
		
		
		
		
		

	}

}
