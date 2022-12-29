//3.Shadowing in java
//Naming conflict between local variable and instance varibale
class Student1{
	private int age;
	private String name;
	private String city;

	
//setting age and returning it
	void setAge(int age) {//here age is local variable
		age=age; //here age is instance variable
	}
	
//to return data whoever wants it
	int getAge()
	{
		return age;
	}
//2. setting name and returning it
	void setName(String name) {
		name=name;
	}
	String getName() {
		return name;
	}
//3. setting city and returning it
	void setCity(String city) {
		city=city;
	}
	String getCity() {
		return city;
	}
}
public class Encap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 std=new Student1();
		
		std.setAge(23);
		int age=std.getAge();
		System.out.println(age);//output:0
		
		std.setName("ashish");
		String name=std.getName();
		System.out.println(name); //output: null
		
		std.setCity("hyderabad");
		String city=std.getCity();
		System.out.println(city); //output: null
	}

}
