// case-2 : We can mix normal argument with var argument
//		public void methodOne(int x,int... y)
//		public void methodOne(String s,int... x)

//>>first argument should be normal argument
//but second one will be var-arg

class Demo3{
	public void m1(String data, int... x) {
		System.out.println("var-args");
	}
}
public class varargs3 {

	public static void main(String[] args) {
		Demo3 d=new Demo3();
		d.m1("sachin");
		d.m1("kohli",10);
		d.m1("dhoni", 7,8);
		
		

	}

}
