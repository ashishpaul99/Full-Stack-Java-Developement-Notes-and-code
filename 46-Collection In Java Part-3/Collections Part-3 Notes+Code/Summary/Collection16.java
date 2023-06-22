//1. Vector class
//->Vector class is part of legacy classes.
//->Enumerator works like iterator but methods and interface
//  class name is different.
//->In Enumeration In order to travel over collection hasMoreElements() 
//  and nextElements() methods are used.
//->Enumeration is part of vector class.
//->elements():Enumeration - vector

//Example-1 : Accessing objects from collection by using Enumerator.
import java.util.Vector;
import java.util.Enumeration;

public class Collection16 {

	public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	
	System.out.println(v);//output: [10, 20, 30, 40]
	
//	->Enumerator
	
	Enumeration em=v.elements();
	while(em.hasMoreElements()) {
		System.out.println(em.nextElement());
	}
	
	

	}

}
