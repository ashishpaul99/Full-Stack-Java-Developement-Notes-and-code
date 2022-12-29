class Student13{
private String name;
	private int age;
	private String city;
//Constructor-1: Constructor with 3 parameters
	public Student13(String name, int age,String city) {
		this.name=name;
		this.age=age;
		this.city=city;
	}
	public Student13(){
		this("Nithin");
		age=28;
		city="bangalore";
	}
	public Student13(String name){
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
public class Encap13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student13 std1=new Student13("ashish",23,"hyderabad");
		System.out.println(std1.getName());//output: ashish
		System.out.println(std1.getAge()); //output: 23
		System.out.println(std1.getCity());//output: hyderabad
		
		
		Student13 std2=new Student13();
		System.out.println(std2.getName());//output: NIthin
		System.out.println(std2.getAge()); //output: 28
		System.out.println(std2.getCity());//bangalore
		
		Student13 std3=new Student13("nithin");
		System.out.println(std3.getName());
		System.out.println(std3.getAge());
		System.out.println(std3.getCity());
		

	}

}
