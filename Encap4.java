//Resolving shadowing problem
//the shadowing problem is resolved using this keyword 
class Student2{
	private int age;
	private String name;
	private String city;

	
//setting age and returning it
	void setAge(int age) {//here age is local variable
		this.age=age; //here age is instance variable
	}
	
//to return data whoever wants it
	int getAge()
	{
		return age;
	}
//2. setting name and returning it
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
//3. setting city and returning it
	void setCity(String city) {
		this.city=city;
	}
	String getCity() {
		return city;
	}
}
public class Encap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Student2 std=new Student2();
		
		std.setAge(23);
		int age=std.getAge();
		System.out.println(age);//output:23
		
		std.setName("ashish");
		String name=std.getName();
		System.out.println(name); //output: ashish
		
		std.setCity("hyderabad");
		String city=std.getCity();
		System.out.println(city); //output: hyderabad
	}

}

//output: 
//23
//ashish
//hyderabad
