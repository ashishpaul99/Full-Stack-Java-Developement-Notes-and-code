//6. Custom Exception or User Defined Exception 

//Example-1:
import java.util.Scanner;
class ATM1
{
// 1. Assume two details in bank data base.
	int userid=1212;
    int password=1111;
    
//  2. asking user to verify  
    int pw;
    int uid;
    
//  3. taking user input
    public void input() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Welcome to bank");
    	System.out.println("Enter user id:");
        uid=scan.nextInt();
    	System.out.println("Enter password:");
    	pw=scan.nextInt();	
    }
    public void verify() {
    	if((userid==uid) &&(password==pw)) {
    		System.out.println("Take your cash");
    	}
    	else {
    		System.out.println("Incorrect credentials");
    	}
    }

}
class Bank1{
	public void initiate() {
		ATM1 a=new ATM1();
		a.input();
		a.verify();
	
	}
}
public class Exception27 {

	public static void main(String[] args) {
		Bank1 b=new Bank1();
		b.initiate();
       
	}

}

//output:
//->Correct Credentials
//	Welcome to bank
//	Enter user id:
//	1212
//	Enter password:
//	1111
//	Take your cash

//->Incorrect Credentials
// Welcome to bank
// Enter user id:
// 1212
// Enter password:
// 1122
// Incorrect credentials

//writing same code with custom exception on next page.







