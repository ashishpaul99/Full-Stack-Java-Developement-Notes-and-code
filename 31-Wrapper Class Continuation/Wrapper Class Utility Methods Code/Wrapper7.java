//Case-1
//Compiler is responsible for conversion of primitive to wrapper and wrapper to
//primitive using the concept of "AutoBoxing and AutoUnBoxing".

public class Wrapper7 {
	
	static Integer i1=10;//AutoBoxing

	public static void main(String[] args) {
		int i2=i1;//AutoUnboxing
		 m1(i2);

	}
	
	public static void m1(Integer i2) {
		int k=i2;//autoUnboxing
		System.out.println(k);//10
	}

}
