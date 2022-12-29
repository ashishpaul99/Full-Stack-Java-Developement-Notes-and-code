//Constructor overloading

class Student12{
private String name;
	private int age;
	private String city;
//Constructor-1: Constructor with 3 parameters
	public Student12(String name, int age,String city) {
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
//Constructor-2:another constructor without parameters
	public Student12(){
		age=23;
		city="hyderabad";
	}
	
//Constructor-3:another constructor with one parameter
	public Student12(String name){
		this.name=name;
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
public class Encap12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1. calling constructor with 3 parameters(constructor-1)
//		Student12 std1=new Student12("ashish",23,"hyderabad");
//		System.out.println(std1.getName()); //output: ashish
//		System.out.println(std1.getAge());  //output: 23
//		System.out.println(std1.getCity());  //output: hyderabad
		
//	2. calling constructor with zero parameters(Constructor-2)
//		Student12 std2=new Student12();
//		System.out.println(std2.getName()); //output: null(name not present in constructor-2
//		System.out.println(std2.getAge());  //output: 23
//		System.out.println(std2.getCity()); //output: hyderabad 
//		
//	3.calling constructor with 1 parameter(Constructor-3)
		Student12 std3=new Student12("ashish");
		System.out.println(std3.getName());//output:ashish
		System.out.println(std3.getAge()); //output:0
		System.out.println(std3.getCity());//output:null
		

	}

}
 