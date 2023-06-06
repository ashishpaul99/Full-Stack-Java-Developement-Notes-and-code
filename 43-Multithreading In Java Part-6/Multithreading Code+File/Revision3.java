//Code 4:
//Passing values after creating object by using Constructor
//->this means current object.

//=>This Keyword in Java
//->There can be a lot of usage of Java this keyword. In Java, 
//  this is a reference variable that refers to the current
//  object.
//
//class Calc4 {
//
//	//has part
//	private int num1;
//	private int num2;
//	private int result;
//	
//	public Calc4(int num1, int num2)
//	{
//		this.num1=num1;
//		this.num2=num2;
//	}
//	
//	//does part
//	public int getNum1() {
//		return num1;
//	}
//
//	public void setNum1(int num1) {
//		this.num1 = num1;
//	}
//
//	public int getNum2() {
//		return num2;
//	}
//
//	public void setNum2(int num2) {
//		this.num2 = num2;
//	}
//
//	public int getResult() {
//		return result;
//	}
//
//	public void setResult(int result) {
//		this.result = result;
//	}
//
//	public void add(){
//		result=num1+num2;
//
//   }
//}
//
//
//public class Revision3 {
//
//	public static void main(String[] args) {
//
//		//creating object of class Calc
//		Calc4 c=new Calc4(10,15);
//		
//		//intializing values
//		c.setNum1(10);
//		c.setNum2(5);
//		
//		//calling add method
//		c.add();	
//		
//		System.out.println(c.getResult()); // output: 15
//
//	}
//}

//output: 15

//Code-5: Calculator to multiple operation.
//->here we are using inheritance.


class Calc5 {

	//has part
	protected int num1;
	protected int num2;
	protected int result;
	
//	public Calc5(int num1, int num2)
//	{
//		this.num1=num1;
//		this.num2=num2;
//	}
	
	//does part
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void add(){
		result=num1+num2;

   }
}

class ClacPro extends Calc5{
	public void sub() {
		result=num1-num2;
	}
}


public class Revision3 {

	public static void main(String[] args) {

		//creating object of class Calc
		Calc5 c=new Calc5(10,15);
		
		//intializing values
		c.setNum1(10);
		c.setNum2(5);
		
		//calling add method
		c.add();	
		
		System.out.println(c.getResult()); // output: 15

	}
}
