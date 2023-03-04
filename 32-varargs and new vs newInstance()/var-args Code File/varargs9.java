//case2::Widening vs var-arg method

class Demo9{
	public static void methodOne(long l) {
		System.out.println("widening");

		}
		public static void methodOne(int... i) {

		System.out.println("var-arg method");

		}
}

public class varargs9 {

	public static void main(String[] args) {
	
		int x=10;
		Demo9 d=new Demo9();
		d.methodOne(x);//(ptimitive type) int-->implicit typecasting--> long(binding happens by  compiler)
		
	}

}

//output:
//	widening
