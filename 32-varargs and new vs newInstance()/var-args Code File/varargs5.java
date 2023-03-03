
class Demo5{
	public void m1(int... x) {
		System.out.println("var-arg method");
	}
}
public class varargs5 {

	public static void main(String[] args) {
		
		Demo5 d=new Demo5();
		d.m1(10,20,30);
		d.m1(new int[] {10,20,30});

	}

}

//output:
//var-arg method
//var-arg method
