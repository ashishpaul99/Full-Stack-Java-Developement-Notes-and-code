//if programmer have specified constructor 
//irrespective parameterized or non parameterized 
//jvm will not include default zero parameter constructor
class Student11{
private String name;
	private int age;
	private String city;
	//here constructor already specified by programmer 
   //since jvm will not include defaultzero parameter constructor
	
//	1.constructor with parameters
	public Student11(String name, int age) {
		this.name=name;
		this.age=age;
		this.city=city;
		
	}

	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
}
public class Encap11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student11 std1=new Student11("ashish",23);
		
	
		Student11 std2=new Student11();
//		this object calling constructor with zero parameter 
//		we get error. if programmer have specified constructor 
//		irrespective parameterized or non parameterized
//		jvm will not include default zero parameter constructor.

	}

}
