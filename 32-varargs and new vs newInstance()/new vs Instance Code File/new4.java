//3. IllegalAccessException- 
//when constructor is private it throws this exception.

//example-2
//Private Student()
//{
//	System.out.println("Student constructor is called");
//}

class Student3{

	
	static{
		System.out.println("Student .class file is loading");
	}
	
	private Student3(){
		System.out.println("Student constructor is called");
	}

}
public class new4  throws ClassNotFoundException, InstantiationException, IllegalAccessException{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//exection of above program
//C:\Users\Ashishpaul\Desktop\java>javac Test.java
//Note: Test.java uses or overrides a deprecated API.
//Note: Recompile with -Xlint:deprecation for details.
//
//C:\Users\Ashishpaul\Desktop\java>java Test Student
//Student .class file is loading
//Exception in thread "main" java.lang.IllegalAccessException: class Test cannot access a member of class Student with modifiers "private"
//        at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:394)
//        at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:674)
//        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:492)
//        at java.base/java.lang.reflect.ReflectAccess.newInstance(ReflectAccess.java:128)
//        at java.base/jdk.internal.reflect.ReflectionFactory.newInstance(ReflectionFactory.java:341)
//        at java.base/java.lang.Class.newInstance(Class.java:677)