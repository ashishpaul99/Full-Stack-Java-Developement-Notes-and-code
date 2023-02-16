//by this we cannot achieve 100% abstration because class contains 
//abstract method and concrete method
abstract class Account
{
	//abstract mehtod
	public abstract void withDraw();
	public abstract void deposite();
	public abstract void checkBalance();
//	printing of passbook action same for all account
	//Concrete method
	public void printPassbook()
	{
		
	}
}
//all above operations are common for all accounts
class Saving extends Account
{
	
}

class Current extends Account
{
	
}

class Salary extends Account
{
	
}

public class Interface1 {

	public static void main(String[] args) {
		

	}

}
