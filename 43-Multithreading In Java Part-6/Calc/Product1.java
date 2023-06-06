//->Multiple employer names

class Alien1
{
	String name;
	int age;
	public void show() {
		System.out.println(name+":"+age);
		
	}
}
public class Product1 {

	public static void main(String[] args) {
	
		Alien1 aliens[]=new Alien1[3];
//		objects of 3 Aliens
		for(int i=0;i<3;i++) {
			aliens[i]=new Alien1();
		}
		
		try {
	
	    Alien1 obj=aliens[5];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception");
		}
	}

}
