//The ClassNotFoundException occurs when the classpath
//doesn't get updated with the required JAR files.

//new => requried class details known to compiler but not available at jvm then it
//would result in "NoClassDefFoundError"

//newInstance() => requried class details not available at jvm then it would result
//in "ClassNotFoundException"

class Student6
{
	
	static {
		System.out.println("Student .class file is loading");
		
	}
	public Student6()
	{
		
		System.out.println("Student constructor is called");
	}
}
public class new6 {
	static{
	      System.out.print("Test.class file");
	  }


	public static void main(String[] args) throws Exception {
		
		// String className=args[0];
				// Class c=Class.forName(className);
				// Object obj=c.newInstance();

				// Student5 std=(Student5)obj;
				// System.out.println(std);
				        // or
				String className=args[0];
				Object obj=Class.forName(args[0]).newInstance();

				System.out.println(obj.getClass().getName());


	}

}
