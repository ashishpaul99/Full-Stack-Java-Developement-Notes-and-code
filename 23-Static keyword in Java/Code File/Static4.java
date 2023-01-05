//for every object memory for count will be created
class Demo2{
	int a;
	int b;
	
	static int count;
	Demo2()
	{
		count++;
	}
	Demo2(int a){
		this.a=a;
	}
	Demo2(int a, int b){
		this.a=a;
		this.b=b;
		count++;
	}
}
public class Static4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1=new Demo2();
		Demo2 d2=new Demo2(10);
		Demo2 d3=new Demo2(10,20);
		System.out.println(Demo2.count);
		

	}

}

//output: 2 -->here count will be 2 
