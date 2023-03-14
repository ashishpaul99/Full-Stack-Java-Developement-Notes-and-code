//1. ClassNotFoundException -
//when class is not found it throws this exception. 
//when we give unknown class as argument it throws ClassNotFoundException.

class Student1
{
	static {
		System.out.println("Student .class file is loading");
		
	}
	public Student1()
	{
		
		System.out.println("Student constructor is called");
	}
}
public class new2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		String className = args[0];

		Class c = Class.forName(className);
		Object obj=c.newInstance();
		Student std=(Student)obj;
		System.out.println(std);

	}

}

//execution
//C:\Users\Ashishpaul\Desktop\java>javac Test.java
//Note: Test.java uses or overrides a deprecated API.
//Note: Recompile with -Xlint:deprecation for details.
//
//C:\Users\Ashishpaul\Desktop\java>java Test dog
//Exception in thread "main" java.lang.ClassNotFoundException: dog
//        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
//        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
//        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
//        at java.base/java.lang.Class.forName0(Native Method)
//        at java.base/java.lang.Class.forName(Class.java:383)
//        at java.base/java.lang.Class.forName(Class.java:376)
//        at Test.main(Test.java:29)
//
//C:\Users\Ashishpaul\Desktop\java>
