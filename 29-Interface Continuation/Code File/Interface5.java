//2. Difference between extends and Implements
//One class implements any numbers of interfaces at a time
interface One{
	void m1();
}

interface Two{
	void m2();
}

class Demo implements One,Two{
	public void m1() {
		System.out.println("Implement in m1");
		
	}
	public void m2()
	{
		System.out.println("Implement in m2");
	}
	
}
public class Interface5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
