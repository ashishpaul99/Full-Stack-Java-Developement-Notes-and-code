//>>throwing Exception separately

import java.util.Scanner;
class UnderAgeException extends Exception
{
	public UnderAgeException(String message)
	{
		super(message);
	}
}
class OverAgeException extends Exception
{
	public OverAgeException(String message)
	{
		super(message);
	}

}


class Applicant3
{
	int age;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt();
	}
	//void verify() throws Exception
	void verify() throws UnderAgeException,OverAgeException
	{
		if(age <18)
		{
			UnderAgeException uae=new UnderAgeException("below 18 age group not eligible for license");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age > 60)
		{
			OverAgeException oae=new OverAgeException("Above 60 age group not eligible for license");
			System.out.println(oae.getMessage());
			throw oae;
		}
		
	 else
		{
			System.out.println("You're eligible");
		}
	}
}

class Rto3
{
	public void initiate()
	{
		Applicant3 a=new Applicant3();
		try
		{
		a.input();
		a.verify();
		}
		catch(UnderAgeException| OverAgeException e)
		{
			try
		{
		a.input();
		a.verify();
		}
		catch(UnderAgeException |OverAgeException e1)
		{
			System.out.println("Don't ever try again read rules");
			System.exit(0);
		}
			
			
		}
//		try
//		{
//		a.input();
//		a.verify();
//		}
//		catch(OverAgeException e)
//		{
//			try
//		{
//		a.input();
//		a.verify();
//		}
//		catch(OverAgeException e1)
//		{
//			System.out.println("Don't ever try again read rules");
//			System.exit(0);
//		}
	}
}


public class Exception31 {

	public static void main(String[] args) {
		Rto3 r=new Rto3();
		r.initiate();

	}

}