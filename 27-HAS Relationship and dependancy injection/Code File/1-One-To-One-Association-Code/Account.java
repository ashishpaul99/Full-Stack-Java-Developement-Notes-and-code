package in.ashish.beam;

//Dependent object
public class Account {

	 String accNo;
	 String accName;
	 String accType;
	
	//Injecting values through Constructor
	public Account(String accNo, String accName, String accType) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
	}
	
	
}
