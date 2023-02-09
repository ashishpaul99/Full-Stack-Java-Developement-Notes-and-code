package in.ashish.main;

import in.ashish.bean.Employee;
import in.ashish.bean.Department;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e1=new Employee("10","Sachin", "MI");
	     Employee e2=new Employee("18","kohli", "RCB");
	     Employee e3=new Employee("7","Dhoni", "CSK");
	     
	   //creating employee object
	     Employee[] emps=new Employee[3];
	     emps[0]=e1;
	     emps[1]=e2;
	     emps[2]=e3;
	    
	     
	    
	     Department department=new Department("IPL14", "BCCI",emps);
	     department.getDepartmentDetails();
	     
	     
	     

	}

}

//output:
//	Department Details
//	===================
//	Department id: DEP1234
//	Department name: DEVELOPER
//
//	Employee Details are
//	=====================
//	Employee id: 10
//	Employee name: Sachin
//	Employee address: MI
//	Employee id: 18
//	Employee name: kohli
//	Employee address: RCB
//	Employee id: 7
//	Employee name: Dhoni
//	Employee address: CSK
