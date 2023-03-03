//2. var-args in java

	
//	>>Var arg method

//	It stands for variable argument methods.
//	In java language,if we have variable no of arguments, then compulsorily new
//	method has to be written till jdk1.4.
	
//	But jdk1.5 version, we can write single method which can handle variable no of
//	arguments(but all of them should be of same type).
	
//	Syntax:: methodOne(dataType... varaibleName)
//	... => It stands for ellipse
	
//	we have keep three dots only
	
//	in JDK 1.5 version var-args concept is available
//	it is also called ellipse approach. 
//	single method accepts multiple arguments of same type.
//	we can pass any number of arguments.
	
//	>> JVM internally uses Array representation to hold the values of
//	of x.
	
//	memory map
	
class Demo2{
	public void add(int...x) {
		
//		1. checking
//		System.out.println("var-args aprroach");
//	  >>output:
//		var-args aprroach
//		var-args aprroach
//		var-args aprroach
		
		//2. printing x array
//		System.out.println(x);
//		Output:
//		[I@5a07e868
//		[I@76ed5528
//		[I@2c7b84de
		
		//3. printing values in x array by for each loop
//		for(int elem:x) {
//			System.out.println(elem);
//			
//		}
//		System.out.println();
		
//	 >>output:
//			10
//
//			10
//			20
//
//			10
//			20
//			30
		
//		4. sum of elements in array x
//		4.1 with for loop
//		int total=0;
//		for(int i=0;i<x.length;i++){
//		total+=x[i];
//		}
//		System.out.println("The sum is "+total);
//       >>ouput:
//    	   The sum is 10
//    	   The sum is 30
//    	   The sum is 60  
		
//		4.2 with for each loop
		int total =0;
		for(int data:x){total+=data;}

		System.out.println("The sum is "+total);
//		>>output:
//			The sum is 10
//			The sum is 30
//			The sum is 60
		
//		5. case-1
//		valid signatures
//		1.public void methodOne(int... x);
//		2.public void methodOne(int...x);
//		3.public void methodOne(int ...x);
		
//		invalid signatures
//		1. public void methodOne(int x...);
//		2. public void methodOne(int. x..);
//		3. public void methodOne(int. ..x)
		
		
//		6. case-2 : 
//		We can mix normal argument with var argument
//		public void methodOne(int x,int... y)
//		public void methodOne(String s,int... x)
		
//		7. case-3
//		While mixing var arg with normal argument var arg should be always last.
//		m1(int... x,int y); //invalid
		
//		first argument should be normal argument but second one will be var-arg
//		m1(int x, int...y);//valid

		
//		case4
//		In an argument list there should be only one var argument.
//		In a method call var-argument should always be one.we cannot have two.
//		m1(int...a, int...b);//invalid
//		m1(int...a)//valid
		
		

		
		
		
		
		
			
		
	}
}

public class varargs2 {

	public static void main(String[] args) {
			Demo2 d=new Demo2();
			d.add(10);
			d.add(10,20);
			d.add(10,20,30);
		
	}
	
	

}


