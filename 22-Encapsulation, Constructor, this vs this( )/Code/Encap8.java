//2. Common setter
class Student8{
	private String name;
	private int age;
	private String city;
	
//common setter
	public void setData(String name,int age,String city) {
		this.name = name;
		this.age=age;
		this.city=city;
	}

//common getter not possible - return statement returns return only one value
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
public class Encap8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student8 std=new Student8();
		std.setData("ashish",23,"hyderabad");
		
		System.out.println(std.getName());//output: ashish
		System.out.println(std.getAge());//output: 23
		System.out.println(std.getCity());//output: hyderabad
		
		
		

	}

}
