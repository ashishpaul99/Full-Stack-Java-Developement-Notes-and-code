//this code should run in cmd for class name as 
//command line argument for creating object
//cmd--> javac varargs13.java
//         java varargs13 Student(giving as argument)

//>>for executing below code-->type in cmd

//C:\Users\Ashishpaul\Desktop\java>javac Test.java
//Note: Test.java uses or overrides a deprecated API.
//Note: Recompile with -Xlint:deprecation for details.

//C:\Users\Ashishpaul\Desktop\java>java Test Student
//Student .class file is loading
//Student constructor is called
//Student@24d46ca6 -->hashcode send by hashing algorithm


class Student
{
	
	//static block executes at time of class loading
	static {
		System.out.println("Student .class file is loading");
		
	}
	public Student()
	{
		
		System.out.println("Student constructor is called");
	}
}
public class new1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//	 1. create an object of student class 
//		Student std1 =new Student();
		
//   2. alternative for creating object
		//take the input of the className for which object has to created at the runtime
        //in args[0] the class for which object has to be created available
		
		String className =args[0];
		
//	2.1 Load the class file explicitly by forName() method
        //forName method available in Class
		Class c= Class.forName(className);
		
//	 3. for the loaded class object is created using zero parameters constructor only
//		what if zero parameter constructor not there?
//	    it result in InstantiationException
//		hence forth in the loaded class always zero constructor should be there
		
		Object obj=c.newInstance();
		
//		newInstance constructor always excepts zero parameter
		
//	   >>we will see newInstance method in Class
//		 type in cmd--> java.lang.class
//		 public T newInstance() throws java.lang.InstantiationException, java.lang.IllegalAccessException;
		
//	  >>if you keep constructor is private then also it shout
		
//	  4. Performing type casting to get Student object
	     Student std=(Student)obj;
	     System.out.println(std);
	     
	     
//	     >>when we give class as string it gives ClassCastException.
	     
//	     here object is string type which is converted into student type.
//	     no relationship between string and student so it throws ClassCastException. .
//	     String ==> Student
	     
//	     giving String as argument
//	     C:\Users\Ashishpaul\Desktop\java>javac Test java.lang.String
//	     error: Class names, 'Test,java.lang.String', are only accepted if annotation processing is explicitly requested
//	     1 error
//
//	     C:\Users\Ashishpaul\Desktop\java>javac Test.java
//	     Note: Test.java uses or overrides a deprecated API.
//	     Note: Recompile with -Xlint:deprecation for details.
//
//	     C:\Users\Ashishpaul\Desktop\java>java Test java.lang.String
//	     Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class Student (java.lang.String is in module java.base of loader 'bootstrap'; Student is in unnamed module of loader 'app')
//	             at Test.main(Test.java:23)
	    
	}

}

// we create object by new keyword. 
//the information of class known to jvm and compiler.

//alternative for creating object
//take the input of the classname for which object has to created at the runtime
//cmd--> javac varargs13.java
//         java varargs13 Student(giving as argument)

//invalid ways to create a object 
//args[0] obj1=new args[0];
//className obj2=new className();

//>>Behind the scenes when we create object

//>>1. these actions happens when we initialize objects
//1. new will create memory on heap area

//2. Student ==> JVM will search for student .class file in current 
//   working directory. 
//   if found load the .class file data int method area.

//3. During the loading of .class file
//	a. static variables get memory set with default value  
//	b. static block get executed 

//4. In the heap area, for the requried object memory for instance variables is given
//jvm will set the default values to it.
//a. Execute the instance block if available.
//b. call the constructor to set the meaningfull values to the instance variables.

//5. JVM will give address of the object to hashing algorithm 
//which generates  the hashcode for the object and that 
//hashcode will be returned as the reference to the programmer.

///6. Three exceptions in this program
//1. ClassNotFoundException - when class is not found it throws this exception
//2. InstantiationException - when there is no constructor in class with zero parameter it throws this exception.
//							hence forth in the loaded class always zero constructor should be there
//example-1 
//int a;
//public Student(int a)
//{
//	this.a=a;
//	System.out.println("Student constructor is called");
//}

//3. IllegalAccessException- when constructor is private  it throws this exception.
//example-2
//Private Student()
//{
//	System.out.println("Student constructor is called");
//}
