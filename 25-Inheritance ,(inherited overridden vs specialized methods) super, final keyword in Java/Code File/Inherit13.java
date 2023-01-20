//Rule-3: Return type of overridden method in child class can be
//different as that of parent if it is Co-variant return type
class Interest
{
	
}

class InterestPersonalLoan extends Interest
{
	
}


//here is-A relationship or Parent-child relationship is there
//that's the reason different return type is allowed for overriding and 
//overriden method

//>> we call it as Co-varient return type
class Loans
{
	//overriding method
	//here return type is Interest
	public Interest interest()
	{
		//object of interest class is created
		Interest it=new Interest();
		return it;
	}
}

class PersonalLoan extends Loans
{
	//Overridden method
	//here return type is InterestPersonalLoan
	public InterestPersonalLoan interest()
	{
		InterestPersonalLoan ipl=new InterestPersonalLoan();
		return ipl;
	}
}


public class Inherit13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
