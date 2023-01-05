//same variable(count) is used multiple times

class Demo1{
	int a;
	int b;
	
	int count;
	Demo1()
	{
		count++;
	}
}
public class Static3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1();
		Demo1 d3=new Demo1();
		
		

	}

}
