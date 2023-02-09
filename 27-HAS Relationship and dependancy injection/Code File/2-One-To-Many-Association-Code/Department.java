package in.ashish.bean;

public class Department {
	String did;
	String dname;
	
	//many employees mapped to one department
	
	private Employee[] emps;
  
    //Injecting values through constructor
    //Constructor injection 
	public Department(String did, String dname, Employee[] emps) {
		super();
		this.did = did;
		this.dname = dname;
		this.emps = emps;
	}
	public void getDepartmentDetails()
	{
		System.out.println("Department Details");
		System.out.println("===================");
		System.out.println("Department id: "+ did);
		System.out.println("Department name: "+ dname);
		System.out.println();
		System.out.println("Employee Details are");
		System.out.println("=====================");
		for(Employee employee: emps) {
			System.out.println("Employee id: "+ employee.eid);
			System.out.println("Employee name: "+ employee.ename);
			System.out.println("Employee address: "+ employee.eaddr);
			
		}
	}
	
	
	

	
}
