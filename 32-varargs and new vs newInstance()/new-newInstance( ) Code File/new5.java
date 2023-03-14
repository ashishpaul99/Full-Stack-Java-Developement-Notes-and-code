
//Difference between ClassNotFoundException & NoClassDefFoundError :


//1. For hard coded class names at Runtime in the corresponding .class files not
//available we will get NoClassDefFoundError ,
//which is unchecked

//Test t = new Test( );
//In Runtime Test.class file is not available then we will get NoClassDefFoundError


//2. For Dynamically provided class names at Runtime , If the corresponding .class
//files is not available then we will get the
//RuntimeException saying "ClassNotFoundException".
//
//Ex : Object o=Class.forname("Test").newInstance( );
//At Runtime if Test.class file not available then we will get the
//ClassNotFoundException , which is checked exception.

//NoClassDefFoundError-
//new reqired class details known to compiler but not available at jvm. 
//the it would result in NoClassDefFoundError

//The NoClassDefFoundError is an error when the required 
//class definition is not available at runtime.

//new => requried class details known to compiler but not available at jvm then it
//would result in "NoClassDefFoundError"
//
//newInstance() => requried class details not available at jvm then it would result
//in "ClassNotFoundException"

class Student5
{
	
	static {
		System.out.println("Student .class file is loading");
		
	}
	public Student5()
	{
		
		System.out.println("Student constructor is called");
	}
}
public class new5 {

    static {
      System.out.print("Test.class file");
    }

	public static void main(String[] args) {
		Student5 std=new Student5();
		System.out.println(std);
		
	}

}

// 1. Both Student class and Test class is loaded
// C:\Users\Ashishpaul\Desktop\java>javac new5.java

// C:\Users\Ashishpaul\Desktop\java>java new5

// Test.class fileStudent .class file is loading
// Student constructor is called
// Student5@2c7b84de


// 2. after  compiling and deleting student class file we get  ClassNotFoundException

// C:\Users\Ashishpaul\Desktop\java>javac new5.java

// C:\Users\Ashishpaul\Desktop\java>java new5
// Test.class fileStudent .class file is loading
// Student constructor is called
// Student5@2c7b84de

// C:\Users\Ashishpaul\Desktop\java>java new5
// Test.class fileException in thread "main" java.lang.NoClassDefFoundError: Student5
//         at new5.main(new5.java:21)
// Caused by: java.lang.ClassNotFoundException: Student5
//         at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
//         at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
//         at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
//         ... 1 more
