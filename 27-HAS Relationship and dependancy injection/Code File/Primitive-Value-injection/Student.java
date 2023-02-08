//1. Primitive Value Injection
package in.ashish.main;

public class Student {
	 //Instance variable
	//here datatypes are object type
	//wrapper
//	java is  object oriented programming language so better to use object type 
		private String name;
		private Integer age;
		private Integer sid;
	//2 ways we can set values for instance variable-
		//1. Constructor to set a value (Right click>>source>>generate constructor using fields)
	    //the variable type are pre-defined object
		public Student(String name, Integer age, Integer sid) {
			super();
			this.name = name;
			this.age = age;
			this.sid = sid;
		}
		
		//2. Setter and Getter Injection
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Integer getSid() {
			return sid;
		}
		public void setSid(Integer sid) {
			this.sid = sid;
		}

		
		//we have to override to get info from tostring method
	    //rightclick>source>Generate to string
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", sid=" + sid + "]";
		}

}
