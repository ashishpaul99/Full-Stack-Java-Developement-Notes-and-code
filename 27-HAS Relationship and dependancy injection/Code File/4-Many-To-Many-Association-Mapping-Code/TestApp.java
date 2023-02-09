package in.ashish.main;

import in.ashish.bean.Course;
import in.ashish.bean.Student;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		course should be ready fidrst
		
		Course c1=new Course("Al","JAVA",1000);
		Course c2=new Course("B1","Python",2000);
		Course c3=new Course("C1","Blockchain",3000);
		Course[] course=new Course[3];
		course[0]=c1;
		course[1]=c2;
		course[2]=c3;
		
		Student s1=new Student("10","Sachin","MI",course);
		Student s2=new Student("18","Kohli","RCB",course);
		Student s3=new Student("7","Dhoni","CSK",course);
		
        //getting all student details
		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();
		
		
	}

}

//output:
//	SID :10
//	SNAME :Sachin
//	SADDR :MI
//	Course Details
//	Course id :Al
//	Coures name :JAVA
//	Course cost:1000
//	----------------
//	Course id :B1
//	Coures name :Python
//	Course cost:1000
//	----------------
//	Course id :C1
//	Coures name :Blockchain
//	Course cost:1000
//	----------------
//	SID :18
//	SNAME :Kohli
//	SADDR :RCB
//	Course Details
//	Course id :Al
//	Coures name :JAVA
//	Course cost:1000
//	----------------
//	Course id :B1
//	Coures name :Python
//	Course cost:1000
//	----------------
//	Course id :C1
//	Coures name :Blockchain
//	Course cost:1000
//	----------------
//	SID :7
//	SNAME :Dhoni
//	SADDR :CSK
//	Course Details
//	Course id :Al
//	Coures name :JAVA
//	Course cost:1000
//	----------------
//	Course id :B1
//	Coures name :Python
//	Course cost:1000
//	----------------
//	Course id :C1
//	Coures name :Blockchain
//	Course cost:1000
//	----------------
