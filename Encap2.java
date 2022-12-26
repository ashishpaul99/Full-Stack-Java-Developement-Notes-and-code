//1. Data with security
class Student1{
	private int age;
	private String name;
	private String city;

	
//	accesing data from outside the class and set
//	to variables
//1. setting age and returning it
	void setAge(int a) {
		age=a;
	}
	
//to return data whoever wants it
	int getAge()
	{
		return age;
	}
//2. setting name and returning it
	void setName(String n) {
		name=n;
	}
	String getName() {
		return name;
	}
//3. setting city and returning it
	void setCity(String c) {
		city=c;
	}
	String getCity() {
		return city;
	}
}

public class Encap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 std=new Student1();
		//giving data to age varibale
//1. giving age
		std.setAge(23);
		//invoking age and printing it
		int age=std.getAge();
		System.out.println(age); //output: 28
//2. giving name
		std.setName("ashish");
		String name=std.getName();
		System.out.println(name);//output: ashish
//3. giving city
		std.setCity("hyderabad");
		String city=std.getCity();
		System.out.println(city);//output: hyderabad

		
	}

}
