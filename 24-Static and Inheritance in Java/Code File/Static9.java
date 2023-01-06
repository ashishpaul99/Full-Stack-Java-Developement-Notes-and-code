//When to use Static varibles and Instatnce variables
//Loan application for government to give loans for farmers
//Princple amount, time duration, simple interest-
//different for all farmers- so we have to use specific variables not static
//rate of interest is generic so here static variable is used for storing data
import java.util.Scanner;
class Farmer
{
	private float pa;
	private float td;
	private float si;
	
	//ri is generic hence it is stored in static
	private static float ri;
	
//Activity-1: asking farmers to enter principle amout and time duration required
	void input() {
		Scanner scan =new Scanner(System.in);
		System.out.println("kindly enter the principle amount");
		pa=scan.nextFloat();
		System.out.println("kindly enter time duration required");
		td=scan.nextFloat();
		
	}
	
	//rate of interest of bank 
	static{
		ri=2.5f;
	}
//Activity-2: calculate simple interest
	void compute(){
		si=(pa*td*ri)/100;	
	}
//Activity-3: display simple interest to farmer
	void disp() {
		System.out.println("SI is "+ si);
	}
}
public class Static9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Loan for farmer-1
		Farmer f1=new Farmer();
		f1.input();
		f1.compute();
		f1.disp();
//	Loan for farmer-2
		Farmer f2=new Farmer();
		f2.input();
		f2.compute();
		f2.disp();
		
		

	}

}
