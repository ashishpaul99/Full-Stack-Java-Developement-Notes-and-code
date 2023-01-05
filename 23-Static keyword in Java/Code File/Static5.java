//which content is common in all constructors 
//write in non static block
class Demo3{
	int a;
	int b;
	
	static int count;
	//Non static java block
	{
		count++;
		
	}
	Demo3()
	{
		
	}
	Demo3(int a){
		this.a=a;

	}
	Demo3(int a, int b){
		this.a=a;
		this.b=b;
	
	}
}
public class Static5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d1=new Demo3();
		Demo3 d2=new Demo3(10);
		Demo3 d3=new Demo3(10,20);
		System.out.println(Demo3.count);
		
	}

}
//output:3
