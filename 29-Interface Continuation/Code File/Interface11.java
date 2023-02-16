//Case-2 :  if two interfaces contain a method with same name 
//but different arguments in the implementation class we have  
//to provide implementation for both methods and these 
//methods acts as a overload methods
interface IDemo11
{
	void m1();
}

interface IDemo12
{
	void m1(int i);
}

//here method signature is different

class  CommonImpl1 implements IDemo11,IDemo12
{
	@Override 
	public void m1(){//valid(method with no argument)
		
	}
	
	@Override
	public void m1(int i){//valid (method with argument)
		
	}


} 
public class Interface11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
