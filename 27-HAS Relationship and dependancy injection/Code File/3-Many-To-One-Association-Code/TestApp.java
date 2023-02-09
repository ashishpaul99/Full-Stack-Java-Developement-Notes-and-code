package in.ashish.main;

import in.ashish.bean.Branch;
import in.ashish.bean.Student;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		creating branch object
		Branch branch =new Branch();
		branch.setBid("B123");
		branch.setbName("BCCI");
		
//	    student1
		Student s1=new Student();
		s1.setsId("10");
		s1.setsName("ashish");
		s1.setsAddr("MI");
		s1.setBranch(branch);
		
//		student2
		Student s2=new Student();
		s2.setsId("18");
		s2.setsName("kohli");
		s2.setsAddr("RCB");
		s2.setBranch(branch);
		
//		student3
		Student s3=new Student();
		s3.setsId("7");
		s3.setsName("Dhoni");
		s3.setsAddr("CSK");
		s3.setBranch(branch);
		
//		get student details
		System.out.println("Student Details");
		System.out.println("ID :"+ s1.getsId());
		System.out.println("NAME: "+ s1.getsName());
		System.out.println("Addr : "+ s1.getsAddr());
		//method chaining
		System.out.println("Branch Id: "+ s1.getBranch().getBid());
		System.out.println("Branch name :"+ s1.getBranch().getbName());
		
		System.out.println("==========================================");
		System.out.println("ID :"+ s2.getsId());
		System.out.println("NAME: "+ s2.getsName());
		System.out.println("Addr : "+ s2.getsAddr());
		System.out.println("Branch Id: "+ s2.getBranch().getBid());
		System.out.println("Branch name :"+ s2.getBranch().getbName());
		
		System.out.println("==========================================");
		System.out.println("ID :"+ s3.getsId());
		System.out.println("NAME: "+ s3.getsName());
		System.out.println("Addr : "+ s3.getsAddr());
		System.out.println("Branch Id: "+ s3.getBranch().getBid());
		System.out.println("Branch name :"+ s3.getBranch().getbName());
		
		
		
		
		
		

	}

}
