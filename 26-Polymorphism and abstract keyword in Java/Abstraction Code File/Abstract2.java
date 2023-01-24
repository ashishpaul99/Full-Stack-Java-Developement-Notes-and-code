//abstract class which has atleast one abstract method
//it can have both concrete and abstract method
abstract class Loan1
{
//	interest is different for different loans
	abstract public void dispInt();
//	this note is same for all
	public void WelcomeNote()
	{
		System.out.println("Welcome to java bank");
	}
}

class HomeLoan1 extends Loan1
{
//	public void dispInt() {
//		System.out.println("RI is 12%");
//	}
	
}
class EducationLoan1 extends Loan1
{
	public void dispInt() {
		System.out.println("RI is 10%");
	}
}
public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. we can create reference of abstract class
		Loan1 loan=new HomeLoan1();
		loan.dispInt();
		loan.WelcomeNote();
		
		Loan1 loan1=new EducationLoan1();
		loan1.dispInt();
		loan1.WelcomeNote();
		
//		2. we cannot create object of abstract class.
//		Loan1 loan=new Loan1();
		
//		 3. Abstraction should not affect polymorphism
	}

}
