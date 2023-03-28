//In Order to create Custom Exception we have to create class

//Example-4: Rto Application to apply for License 
import java.util.Scanner;
class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super(msg);
	}
}

class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super(msg);
	}
}
class Applicant
{
	int age;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your age:");
		age=scan.nextInt();	
	}
	void verify() throws Exception
	{
		if(age < 18) {
			UnderAgeException ua=new UnderAgeException("below 18 age group not eligible for license");
			System.out.println(ua.getMessage());
			throw ua;
		}
		if(age>60) {
			OverAgeException oa=new OverAgeException("Above 60 age group not eligible for license");
            System.out.println(oa.getMessage());
            throw oa;
		}
		else {
			
			System.out.println("you're eligible");
		}
	}
}
class RTO{
	public void initiate()
	{
		Applicant a=new Applicant();
		try {
		a.input();
		a.verify();
		}
		catch(Exception e1) {
			System.out.println("try again");
			try {
				a.input();
				a.verify();
				}
				catch(Exception e2) {
					System.out.println("Don't try again");
//					terminating application
					System.exit(0);
				}
		}
	}
	
	
	
}
public class Exception30 {

	public static void main(String[] args) {
		RTO r=new RTO();
		r.initiate();

	}

}

//we can write like 
//void verify() throws UnderAgeException, OverAgeException
//or 
//void verify() throws Exception

