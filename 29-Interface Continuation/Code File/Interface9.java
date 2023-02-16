//9.1 Interface variable example
//Local variable wins over static and final variable
interface ISample2
{
	int a=10;//public static final 
}

public class Interface9 implements ISample2 {

	public static void main(String[] args) {
		
		int a=20;//--> //if variable local variable then Local varibable printed over static final variable
//	    a=20;//we get error : The final field ISample1.a cannot be assigned
		System.out.println(a);//20
		System.out.println(ISample2.a);//10
		

	}

}

//output: 
//20
//10


