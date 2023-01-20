//Rule-4: parameters of overridden method must be 
//same as that of parent else it will be considered 
//as  specialized method considering method overloading

class Parent14
{
	public int add()
	{
		return 10+2;
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
}

class Child14 extends Parent14
{
	
	//add method()-same name but different parameters 
	//overloading and specialized methods
	public int add(int a)
	{
		return a;
	}
}
public class Inherit14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
