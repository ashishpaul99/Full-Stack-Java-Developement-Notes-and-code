//4. Constructor

class Student9{
	private String name;
	private int age;
	private String city;
	//constructor
	public Student9(String name,int age,String city) {
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
public class Encap9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creating object and passing arguments in it
//		the moment object is created constructor isinvoked or called
		Student9 std=new Student9("ashish",23,"hyderabad");
		
		System.out.println(std.getName());//output: ashish
		System.out.println(std.getAge());//output:23
		System.out.println(std.getCity());//output:hyderabad 
		

	}

}
