//2. InstantiationException -
//when there is no constructor in class with zero parameter it throws this exception.
//hence forth in the loaded class always zero constructor should be there

//example-1 
//int a;
//public Student(int a)
//{
//	this.a=a;
//	System.out.println("Student constructor is called");
//}

class Student2{

	int a;
	static{
		System.out.println("Student .class file is loading");
	}
	
	public Student2(int a){
		System.out.println("Student constructor is called");
	}

}

public class new3 {

	public static void main(String[] args)  throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		

		
		String className = args[0];

		Class c = Class.forName(className);
		Object obj=c.newInstance();
		Student std=(Student)obj;
		System.out.println(std);
	}

}

//output:

//Executing this program
///C:\Users\Ashishpaul\Desktop\java>javac Test.java
//Note: Test.java uses or overrides a deprecated API.
//Note: Recompile with -Xlint:deprecation for details.
//
//C:\Users\Ashishpaul\Desktop\java>java Test Student
//Student .class file is loading
//Exception in thread "main" java.lang.InstantiationException: Student
//        at java.base/java.lang.Class.newInstance(Class.java:671)
//        at Test.main(Test.java:32)
//Caused by: java.lang.NoSuchMethodException: Student.<init>()
//        at java.base/java.lang.Class.getConstructor0(Class.java:3617)
//        at java.base/java.lang.Class.newInstance(Class.java:658)
//        ... 1 more
//
//C:\Users\Ashishpaul\Desktop\java>