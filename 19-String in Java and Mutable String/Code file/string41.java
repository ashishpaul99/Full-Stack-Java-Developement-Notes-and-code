//9.10 Public String toString() Method
//user defined object(student)
class Student{
	String name="sachin";
	int id=10;
}

public class string41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		System.out.println(std);//output: Student@5a07e868
		//toString() Method
		System.out.println(std.toString());//output: Student@5a07e868
		
		System.out.println();
		
		String name=new String("dhoni");
		System.out.println(name);//dhoni
		//toString() Method
		System.out.println(name.toString());//dhoni
	}

}
