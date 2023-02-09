package in.ashish.bean;

//Dependent object
public class Employee {
	String eid;
	String ename;
	String eaddr;
	
//	Injecting values through constructor
	public Employee(String eid, String ename, String eaddr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
	}
	

	
	

}
