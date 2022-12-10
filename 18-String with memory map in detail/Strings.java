import java.util.*;


public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// strings lecture
//		String s1= "sachin";
//		System.out.println(s1);
//		
//		String s2=new String("Dhoni");
//		System.out.print(s2);
//		
//>>case-1
//a) Immutable strings
//		String s1="sachin";
//		s1.concat("tendulkar");  //string is immutable if you use concat method another
								 //object is created and change happens in new object
//		System.out.println(s1);
//output:
//		sachin

	
//b) mutable strings
//		StringBuilder s1=new StringBuilder("sachin");
//		s1.append("tendulkar");//on the same object modification is done so mutable
//		System.out.println(s1);
//output:
//	sachintendulkar

//>>case-2
//a) Immutable strings.
//		String s1="sachin";
//		String s2=new String("sachin");
//		System.out.println(s1==s2);// checks wheather s1 and s2 points same objects
//		System.out.println(s1.equals(s2));// string class equal method will compare the 
////		                                  //content present inside the string
//		output:
//			false
//			true
//		
 //b)mutable strings
//		StringBuilder s1=new StringBuilder("sachin");
//		StringBuilder s2=new StringBuilder("sachin");
//		System.out.println(s1==s2);// checks wheather s1 and s2 points same objects
//		System.out.println(s1.equals(s2)); // StringBuilder class equal method will compare the 
//		        						   //value stored in reference(address of object) variable
		        						   //not the content of string builder
		
//		output:
//			false
//			false
//	>>case-3
//	String s1=new String("sachin");//2 copy of objects created in heap area and scp.
//								   //memory for direct literal given in string constant pool.
//	String s2="sachin";//memory for direct literal given in string constant pool.
//	System.out.println(s1);
//	System.out.println(s2);
//	output:
//		sachin
//		sachin

//>>case-4
//		2 objects created in heap area with ref s1 and  s2
//		one object is created in scp with the ref as s3 and s4
//	String s1=new String("dhoni");
//	String s2=new String("dhoni");
//	System.out.println(s1==s2);
//	
//	String s3="dhoni";
//	String s4="dhoni";
//	System.out.println(s3==s4);
//output:
//	false
//	true

		
// >>case 5
//		String s=new String("sachin");
//		s.concat("tendulkar");
//		s=s.concat("IND");
//		s="sachintendulkar";
//	    System.out.println(s);
//OUTPUT: sachintendulkar

//>>case-6
//		String s1=new String("sachin");
//		s1.concat("tendulkar");
//		s1+="IND";
//		String s2=s1.concat("MI");
//		System.out.println(s1);
//		System.out.println(s2);
//OUTPUT:
//	sachinIND
//	sachinINDMI

//7. Checking data present in scp or not
//		String s1=new String("sachin"); //one in heap(s1) and the other one in scp
//		String s2=s1.intern(); //(s1)heap object reference checks wheather data present in scp or not
//		System.out.println(s1==s2);//false s1 and s2 not refering same object
//		
//		String s3="sachin";
//		System.out.println(s2==s3);//true s2 and s2 refering to same object 
//	output:
//		false
//		true
//8. String class collector
//	example-1
//		char[] a= {'a','s','h','i','s','h'};
//		String s=new String(a);
//		System.out.println(s);
//	output:
//		ashish
		
//	example-2
//		byte[] b= {65,66,67,68,69};//unicode value are taken for this number
//		String s=new String(b);//
//		System.out.println(s);
//	output:
//		ABCDE
		
//	example-3
//		StringBuffer sb=new StringBuffer("sachin");
//		System.out.println("StringBuffer data is :"+sb);
//		
//		String s=new String(sb);
//		System.out.println("string buffer data is "+sb);
		
		
//9. Using string methods
//		String s=new String("sachin");
//		System.out.println(s[3]);
//output: CE(The type of the expression must be an array type but it resolved to String)
//9.1 Using CharAt method
//		String s=new String("sachin");
//		System.out.println(s.charAt(2));
//	output: c
//		System.out.println(s.charAt(-1));
//		System.out.println(s.charAt(500));
//		
//	output: java.lang.StringIndexOutOfBoundsException:
		
//9.2 Length (method)
	
//		String s="sachin";
//		System.out.println(s.length()); //here length is method
		
//output: 6
//Length of array
//		int[] arr= {10,20,30};
//		System.out.println(arr.length); //here length Property is variable of a calss
//output:3
		
//9.3 Equals method
//		String s="java";
//		System.out.println(s.equals("java"));
//		output: true
		
//	comparing two strings by equal method
//		String s1="java";
//		String s2="java";
//		System.out.println(s1.equals(s2));
//	output: true
		
//	9.4 equalsIgnoreCase() method
//		String s1="java";
//		System.out.println(s1.equalsIgnoreCase("JAVA")); //it checks only data is same or not 
//		                                                  // but not bother about case of the data
//assignment 
//		String u="ashishpaul99";//(not case sensitive)
//		String p="Ashish@777";//(case sensitive)
//		
//		Scanner scan=new Scanner(System.in);
////	taking and comparing username and password
//		System.out.println("enter username");
//		String username=scan.nextLine();
//		System.out.println(username);
//		System.out.println(username.equals(u));
//
////	taking and comparing username and password
//		System.out.println("enter password");
//		String Password=scan.nextLine();
//		System.out.println(Password);
//		System.out.println(Password.equalsIgnoreCase(p));
//	output:
//		enter username
//		ashishpaul99
//		ashishpaul99
//		true
//		enter password
//		Ashish@777
//		Ashish@777
//		true
		
// 9.5 substrin(int begin) and substring(int begin, int end)
//		
//		  SachinINDMI
//index   012345678910
		
//       String s="SachinINDMI";
//       
//       System.out.println(s.substring(9));
//       System.out.println(s.substring(0,9));//it give end-1(8-1=7) elements

//9.6 Public String replace(char old,char new) method
//		replacing b with a
//		String s="sbchin";
//		System.out.println(s.replace('b', 'a'));
	//>>output: sachin
//		replacing every occurances with some char
//		String s="ababab";
//		System.out.println(s.replace('b', 'a'));
     //>>output:aaaaaa
		
//9.7  Public String toLowerCase() and toUpperCase()
//		String name="sAchIn"; //mixedcase
//		>>convert data in upper case
//		System.out.println(name.toUpperCase());//uppercase data not stored in varibale name
//	     output: SACHIN
//		>>convert data in Lower case
//		System.out.println(name.toLowerCase());
//		output:sachin 
//9.8 Public String trim():
//1. trim will not remove spaces in between
//		String s="sachin IND";
//		
//		System.out.println(s.length());
//		System.out.println(s.trim());
//		System.out.println();
//		output: sachin IND 
		
//2. it trims begining and end
//		String name=" sachin ";
//		System.out.println(name.length());//8
//		System.out.println("before");
//		System.out.println(name);
		
//		System.out.println("after");
//		System.out.println(name.trim());// it trims begining and end
//		output:
//		8
//		before
//		 sachin 
//		after
//		sachin
//	9.9) Public int indexOf(char ch) and lastIndexOf(char ch)
//		index of character in string
//	1. Indexof(char ch)
//			String s="hyderAbbas";
//			System.out.println(s.length());
//		    System.out.println(s.indexOf('A'));
//		    output: 5 (index of 'A')
//		    System.out.println(s.indexOf('r'));
//		    output: 4 (index of 'r')
		    
//		    System.out.println(s.indexOf('b'));
//		    output:6(index of 'b')
		    
//   2.  lastIndexOf(char ch)
//		    System.out.println(s.lastIndexOf('s'));
//		    output: 9(index of s from Last)
		    
//		    System.out.println(s.lastIndexOf('b'));
//		    output:7(index of s from last) 
		    
//		    System.out.println(s.lastIndexOf('A'));
//		    output:5(index of 'A')
		    
//		    System.out.println(s.lastIndexOf('Z'));
//		    output:-1(index of 'A')
//Examples questions
//1. Predict output
String s1 ="sachin";
String s2=s1.toUpperCase();
String s3=s1.toLowerCase();
System.out.println(s1==s2);
System.out.println(s1==s3);

		  
	}

}
