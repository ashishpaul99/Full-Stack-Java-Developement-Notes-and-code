//04 Nov Live class code
//Usign string methods
public class string4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
//9.2 Public int length()
	
//		String s="sachin";
//		System.out.println(s.length()); //here length is method
		
//output: 6
//Length of array
//		int[] arr= {10,20,30};
//		System.out.println(arr.length); //here length Property is variable of a calss
//output:3
		
//9.3 Public boolean equals(Object o) method
//		String s="java";
//		System.out.println(s.equals("java"));
//		output: true
		
//	comparing two strings by equal method
//		String s1="java";
//		String s2="java";
//		System.out.println(s1.equals(s2));
//	output: true
		
//	9.4 Public boolean equalsIgnoreCase() method
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
		
// 9.5 Public String substrin(int begin) and substring(int begin, int end)
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
//String s1 ="sachin";
//String s2=s1.toUpperCase();
//String s3=s1.toLowerCase();
//System.out.println(s1==s2);//false
//System.out.println(s1==s3);//true

	}

}
