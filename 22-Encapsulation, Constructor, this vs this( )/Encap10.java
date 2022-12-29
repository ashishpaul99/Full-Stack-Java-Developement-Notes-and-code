//if constuctor is invoked after creating object
//if programmer not specified constructor in class then 
//jvm will include default constructor with zero parameters
class Student10{
private String name;
	private int age;
	private String city;
	//constructor
	
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
public class Encap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if constuctor is invoked after creating object
		//if it is not in class then jvm will include default constructor
		Student10 std=new Student10();
//		std.disp();
		

	}

}
