//->Make an appplication when key is given then it has return 
//  whole data/value of the key.
//->Console based appliaction


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

class Info{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	public Info(String name, int age, String fatherName, String city)
	{
		this.name=name;
		this.age=age;
		this.fatherName=fatherName;
		this.city=city;
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getFatherName() {
	   return getFatherName();
	}
	
	@Override 
	public String toString() {
		return name+" "+age+" "+fatherName+" "+city;
	}
	
}
public class Map6 {

	public static void main(String[] args) {
		Info i1=new Info("Ashish",24,"Babu","Hyderabad");
		Info i2=new Info("Luke",24,"Mark","Chennai");
		Info i3=new Info("john",24,"peter","Bengaluru");
		
		HashMap hm=new HashMap();
		hm.put(1,i1);
		hm.put(2,i2);
		hm.put(3,i3);
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Passport details");
		System.out.println("Enter key");
		Integer k=scan.nextInt();
	
//		Accessing entrySet
		Set data=hm.entrySet();
		Iterator itr3=data.iterator();
		
		boolean flag=false;
		while(itr3.hasNext()) {
			Map.Entry passport=(Entry)itr3.next();
			Integer key=(Integer)passport.getKey();	
			if(k==key)
			{
			  System.out.println("Passport number:"+passport.getKey()+" "+"Info->"+passport.getValue());
			  flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Passport number not found");
		}
	}

}

//output:
//Welcome to Passport details
//Enter key
//1
//Passport number:1 Info->Ashish 24 Babu Hyderabad



//Alter-1: using system.exit(0) ->In order to terminate the loop
//Set info=hm.entrySet();
//Iterator itr1=info.iterator();
//while(itr1.hasNext()) {
//	Map.Entry Passport=(Entry) itr1.next();
//	Integer key=(Integer)Passport.getKey();
//	if(k==key) {
//		System.out.println("Passport Number:"+Passport.getKey()+" "+"Info:"+Passport.getValue());
//	    System.exit(0); //->terminating the program
//	}
//	
//
//}

//Alter-2 ->Using flag 
//boolean flag=false;
//
//Set set=hm.entrySet();
//Iterator itr=set.iterator();
//while(itr.hasNext())
//{
//	Map.Entry passport=(Entry) itr.next();
//	Integer key=(Integer) passport.getKey();
//	if(k==key)
//	{
//	System.out.println(" : Info : "+ passport.getValue());
//	flag =true;
//	//break;
//	//System.exit(0);
//	}
//	
//}
//if(flag==false)
//{
//System.out.println("Passport number not found");
//}

