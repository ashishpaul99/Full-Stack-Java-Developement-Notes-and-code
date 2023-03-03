
public class snnipets {

	public static void main(String[] args) {
//		Snippets
		Integer i1= new Integer(10);
		Integer i2= new Integer(10);
		System.out.println(i1==i2);//false
		
		Integer x = 10;
		Integer y = 10;
		System.out.println(i1==i2);//true
		
		Integer a =Integer.valueOf(10);
		Integer b =Integer.valueOf(10);
		System.out.println(i1==i2);//true
		
		Integer i1 =10;
		Integer i2 =Integer.valueOf(10);
		System.out.println(i1==i2);//true
		
//		Note:
//		When compared with constructors it is recommended to use valueOf() method to create
//		wrapper object.

	}

}
