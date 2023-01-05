//checking order of execution
class Demo4{
	int a;
	int b;
	
	static int count;
	//Non static java block
	{
		count++;
		System.out.println("non static block");
	}
	Demo4()
	{
		this(100);
		System.out.println("constructor-1");
	}
	Demo4(int a){
		System.out.println(a);
		this.a=a;
   //System.out.println("constructor-2");
	}
	Demo4(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("constructor-3");
	
	}
}
public class Static6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d1=new Demo4();
		Demo4 d2=new Demo4(10);
		Demo4 d3=new Demo4(10,20);
		System.out.println(Demo4.count);

	}

}

//output: non static block
//100
//constructor-1
//non static block
//10
//non static block
//constructor-3
//3

