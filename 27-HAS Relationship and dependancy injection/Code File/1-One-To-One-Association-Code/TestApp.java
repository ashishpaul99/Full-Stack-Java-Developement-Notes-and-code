package in.ashish.main;

import in.ashish.beam.Account;
import in.ashish.beam.Employee;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//account object have to create first
		Account account=new Account("ABC1235","Ashish","saving");
		

		
		//Constructor Injection
		Employee employee=new Employee("1247","SACHIN", "MI",account);
		employee.getEmployeeDetails();
		
		

	}

}
