//case 6:
//public void methodOne(int... x) => it can be replace as int[] x

//in this case we have to pass only array
class Demo6{
	
//	public void m1(int...x) {
//		System.out.println("var-args method");
//	}
//  >>public void method(int... x) => it can be replace as int[] x
	public void m1(int[] x)
	{
		System.out.println("int[] method");
		//printing elements in array
		for(int elem:x) {
			System.out.println(elem);
		}
	}
	
}
public class varargs6 {

	public static void main(String[] args) {
		
		Demo6 d=new Demo6();
		d.m1(new int[]{10,20,30});
		
		

	}

}

