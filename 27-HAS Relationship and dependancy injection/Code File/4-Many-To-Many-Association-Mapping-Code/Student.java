package in.ashish.bean;

//Target object
public class Student {
	
	private String sid;
	private String sname;
	private String saddr;
	
	//Has-A Relationship
	Course[] course;
	
	//Constructor injection
	//injecting values using constructor(student details)
	public Student(String sid, String sname, String saddr, Course[] course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}
	
	public void getStudentDetails()
	{
		System.out.println("SID :"+sid);
		System.out.println("SNAME :"+sname);
		System.out.println("SADDR :"+ saddr);
		
		System.out.println("Course Details");
		for(Course c : course)
		{
			System.out.println("Course id :"+ c.cid);
			System.out.println("Coures name :"+ c.cname);
			System.out.println("Course cost:"+ c.cost);
			System.out.println("----------------");
		}
		
	}
	
	
	
	

}
