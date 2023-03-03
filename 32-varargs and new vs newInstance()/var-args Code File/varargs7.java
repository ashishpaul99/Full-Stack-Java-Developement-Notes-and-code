//Note::
//methodOne(int...x)
//=> we can call this method by passing a group of int values,so it
//becomes 1-D array.

//methodOne(int[]... x)
//=> we can call this method by passing a group of 1D int[], so it
//becomes 2-D array.

//>>giving 2 arrays as input
//>>here x should collect array of 1D which collects x and y 1D arrays
class Demo7{
//	x should collect array of 1D -->(int[]... x)
//	if we give x and y  1D arrays it becomes 2D
	public void m1(int[]...x)
	{
		System.out.println(x);//[[I@5a07e868-->2D array
		for(int[] a:x) {
			System.out.println(a);//x-[I@76ed5528,y-[I@2c7b84de-->1D array
			for(int elem:a) {
				System.out.println(elem);
			}
		}
	}
	
//	output:
//		[I@5a07e868
//		 10
//		 20
//		 30
//		 [I@76ed5528
//		 40
//		 50
}
public class varargs7 {

	public static void main(String[] args) {
		
		int x[]= {10,20,30};
		int y[]= {40,50};
		
		Demo7 d=new Demo7();
		d.m1(x,y);
//		x is 1D array
//		y id 1D array
		
	
	}

}
