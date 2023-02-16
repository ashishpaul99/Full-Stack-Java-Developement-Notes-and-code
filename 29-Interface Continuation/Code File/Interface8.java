//9. Interface Variable
//variable holds value and interface related to abstraction
interface IRemote //televison
{
//	srs
//	it's not possible to change srs
//	>>variable should be marked as final
//	this variable should be avialable to every implementation class
//	>>so we have mark it as public
//	variable should be directly avialable in every implemented class
//	>>Mark it as static
//	if variable is final and static compulsorly we have to intialize value
	
//	all shouble be part of srs
//	by default  varibables are public static and final in interface
//	behind scene code
//	public static final int MIN_VOLUME=0;
//	public static final int MAX_VOLUME=100;
	
//	how we code
	int MIN_VOLUME=0;
	int MAX_VOLUME=100;
	
}




public class Interface8 implements IRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IRemote.MAX_VOLUME);
		System.out.println(IRemote.MIN_VOLUME);

	}

}
