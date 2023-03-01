import java.nio.Buffer;

public class Wrapper9 {

	public static void main(String[] args) {
//		case-3
//		Integer i1=10;//AutoBoxing
//		Integer i2=i1;//AutoBoxing
//		i1++;//11>>(i1=1+1)
//		System.out.println(i1);//11
//		System.out.println(i2);//10
//		System.out.println(i1==i2);//false
//		wrapper classes are immutable if you make a change it creates 
//		new object and make changes on it
		
		
//		case-4
		Integer x=new Integer(10);
		Integer y=new Integer(10);
		System.out.println(x==y);
//		2 objects pointing by different reference
		
//		case-5
//		Integer x=new Integer(10);
//		Integer y=10;//AutoBoxing : Integer y=Integer.valueOf()
//		System.out.println(x==y);
//		false - 2 objects never points to same object
		
//		case-6
//		Integer x=new Integer(10);
//		Integer y=x;//AutoBoxing
//		System.out.println(x==y);//true
//		reference is reused so pointing to same object
		

		
		
		
		
		
//		>>compiler uses valueOf() for AutoBoxing
//		valueOf() method implemented intelligent way in wrapper classes.
		
//		for all wrapper classes JVM maintain buffer of objects.
		
//		Buffer of Objects
		
// 1. At the time of loading the .class file jvm will
//    use buffer with I already the objects which are 
//    predefined
		
//2. At the time of loading the .class file jvm will 
//	 create buffer of object to be used during AutoBoxing
//	 (range: -128 to +127)--> range  of byte
		
//	it create buffer of objects with capacity of -128 to 127. this many objects are 
//	available for every wrapper class
		
//		factors methods are intelligent and there is 
//		Specialty in memory utilization
		
//		memory utilization will be effective 
		
//		x and y points 10 in buffer of objects
//		a and b point to 100 in buffer of objects
		
//		1000 not available in buffer of objects
//		so new object get created.
//		i and j points different objects contain 1000.
//		1000 is not part of buffer
		
//		Integer x=new Integer(10);// memory come from heap
		
//		Integer y=10; --> memory come from buffer.
		
//		Note:
//			1. To implement AutoBoxing concept in wrapper class a buffer of object will be
//			created at the time of class loading.
//			2. During AutoBoxing,if an object has to be created first jvm will check whether
//			the object is already available inside buffer
//			or not.
//			3. If it is available, then JVM will reuse the buffered object instead of creating
//			a new Object.
//			4. If the Object is not available inside buffer, then jvm will create a new object
//			in the heap area, this approach improves the
//			performance and memory utilization
		
//		But this buffer concept is applicable only for few cases
//		1. Byte => -128 to +127
//		2. Short => -128 to +127
//		3. Integer=> -128 to +127
//		4. Long => -128 to +127
//		5. Character => 0 to 127
//		6. Boolean => true,false
//		In the remaining cases new object will be created.
		
		
//		case-7
		
//		Integer x = 10;
//		Integer y = 10;
//		System.out.println(x == y);//true
//		
//		
//		Integer a = 100;
//		Integer b = 100;
//		System.out.println(a == b);//true
//		
//		Integer i = 1000;
//		Integer j = 1000;
//		System.out.println(i == j);//false
		
		
//		
//		Integer i1=128;
//		Integer i2=128;
//		System.out.println(i1==i2);//false
//    >>128 not available in Buffer. so new objects are created.
		
		
//		Integer i3=127;
//		Integer i4=127;
//		System.out.println(a==b);
//	  >>127 is available in Buffer. same object is reused. 
//		both objects pointing to same object.
		
//		Boolean b1=true;
//		Boolean b2=true;
//		System.out.println(b1==b2);//true
//	  >>true is available in Buffer. same object is reused.
//		both objects pointing to same object.
		
//		Double d1=10.0;
//		Double d2=10.0;
//		System.out.println(d1==d2);//false
//	  >>no buffer objects available for double
//		so new objects are created.
		
		
		
		
		
		
		
		
		
		
		
	}

}
