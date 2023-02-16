//Case-1 :  If two interfaces contain a method with same signature and same   return type in the 
//implementation class only one method  implementation is enough.
interface IDemo1
{
	void m1();
}

interface IDemo2
{
	void m1();
}

//no worry about m1 coming from any interface
//only one method come into picture
class CommonImpl implements IDemo1,IDemo2
{
//	it is legal
	public void m1() { //valid
		
	}
}
public class Interface10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
