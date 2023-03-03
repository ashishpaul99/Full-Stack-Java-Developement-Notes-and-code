//case5:

//We can overload var arg method, but var arg method will get a call only if none of
//matches are found.
//(just like default statement of switch case)

class Demo4{
//	Compiler refers to method signature
	public void m1(int... x)//m1(int[] x)-->m1 treated as int array x
	{ 
		System.out.println("var-arg method");
	}
	
	public void m1(int x)//m1(int x)--> m1 treat as int 
	{
		System.out.println("int method");
		
	}
}
public class varargs4 {

	public static void main(String[] args) {
		
		Demo4 d=new Demo4();
//		1.it calls  var-arg method
		d.m1();//d.m1(new int[]{})-->behind the scenes
//		no methods accepts zero Arguments. var-arg get a chance
		
//		2. it calls var-arg method
		d.m1(10,20);//d.m1(new int[]{10,20})<--behind the secens
//		no methods accepts two Arguments. var-arg get a chance
		
//		3. Here we have method specifically catch one argument (int method)
//		compiler always try to bind for exact match
//		it calls for int method-->m1(int x)
		d.m1(10);//exact match
		
//		--> var-arg approach is used like default statement in switch
//		when there are nobody to execute these var-args get executes
		
		
	}

}
//output:
//	var-arg method
//	var-arg method
//	int method

