import java.util.Scanner;

//>>7th Nov Live Class Mutable String and String programming
public class string44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//#Append methods of string Buffer
//	5. Public StringBuffer insert(int index.String)
//		StringBuffer sb=new StringBuffer("abcdefg");
//		sb.insert(3,"XYZ");
//		System.out.println(sb);//output: abcXYZdefg
//	6. Public StringBuffer insert(int index,int i)
//		StringBuffer sb=new StringBuffer("abcdefg");
//		sb.insert(3,444);
//		System.out.println(sb);//output:abc444defg
//#Method for deleting data
//	7. Public STringBuffer delete(int begin,int end)
//		it deletes the character from specified index to end-1
//		StringBuffer sb=new StringBuffer("sachinrameshtendulkar");
//		sb.delete(6, 12);
//		System.out.println(sb);//output: sachintendulkar
//8. Public StringBuffer deleteCharAt(int index)
//		it delete character at specified index
//		StringBuffer sb=new StringBuffer("sachinTtendulkar");
//		deleting t at index 
//		sb.deleteCharAt(7);
//		System.out.println(sb);//output: sachinTendulkar
//	9.Public String Buffer reverse()//reversing string
//		StringBuffer sb=new StringBuffer("sachin");
//		sb.reverse();
//		System.out.println(sb);//output: nihcas
//	10. Public void setLength(int length):
//		it consider only specified no of characters 
//		and remove all the remaining character
//		StringBuffer sb=new StringBuffer("sachintendulkar");
//		sb.setLength(6);
//		System.out.println(sb);//output:sachin
//	11. Public void trim to Size()
//		capacity trimed to length data
//		StringBuffer sb=new StringBuffer(1000);
//		System.out.println(sb.capacity());//output:1000
//		
//		sb.append("sachin");
//		System.out.println(sb.capacity());//output:1000
//		
//        sb.trimToSize();
//        System.out.println(sb.capacity());//output:6
//	12. Public void ensure capacity(int capacity)
//		it is used to increse the capacity dynamically 
//		based on our requirements
		
//		StringBuffer sb =new StringBuffer();
//		System.out.println(sb.capacity()); output:16(default capacity)
//		increasing capacity at runtime
//		sb.ensureCapacity(1000);
//		System.out.println(sb.capacity());//output: 1000
		
//	2. Method chaining
//#example-1
//		String name="sachin";
//		String data=name.toUpperCase();
//		int count=data.length();	
//		System.out.println(count);//output:6
		
		//method chaining
		//System.out.println(name.toUpperCase().length());//output: 6
		
//#example-2
//		StringBuffer sb =new StringBuffer("virat");
//		sb.append("kohli").        //-->viratkohli
//		insert(10, "anushka").     //>>viratkohlianushka
//		reverse().                 //akhsunailhoktariv 
//		append("IND").		       //akhsunailhoktarivIND
//		insert(sb.length(),"RCB"). //akhsunailhoktarivINDRCB
//		reverse().                 //BCRDNIviratkohlianushka
//		delete(0,6);				//viratkohlianushka
//	
//		System.out.println(sb);  //output: viratkohlianushka

//#example-3
//	   StringBuffer sb1=new StringBuffer("dhoni");
//	   sb1.length().append("csk"); //ouput: Cannot invoke append(String) on the primitive type int
//	   return type of length() method is integer
//	   method is not applicable on integer type data it gives error

//Problems
//1. copy one string to another string
//		String s1="ineuron";
//		String s2=" ";
//		for(int i=0;i<s1.length();i++) {
//			s2=s2+s1.charAt(i); //one by one characters are copying of s1 in s2
//		}
//		System.out.println("First String is "+s1);
//		System.out.println("copy of first string "+s2);
//	output: First String is ineuron
//	        copy of first string  ineuron
//	2. Lower case to upper case and upper case to lower case
//		logic
//		char ch='a';//97-32=65(A)
//		System.out.println(ch);//ouput: a
//		ch=(char) (ch-32);
//		System.out.println(ch);//output: A
//		

//#code
//>>Lower case to upper case 
//		taking string as input
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter string");
//		String s1=scan.nextLine();
//		String s2=" ";
//		for(int i=0;i<s1.length();i++) {
//		    s2=s2+(char)(s1.charAt(i)-32);
//		}
//		System.out.println(s2);//output: INEURON
		
//>> Upper case to Lower case
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter string");
//		String s1=scan.nextLine();
//		String s2=" ";
//		for(int i=0;i<s1.length();i++) {
//		    s2=s2+(char)(s1.charAt(i)+32);
//		}
//		System.out.println(s2);//output:  ineuron
		
		
//3. To convert small to capital and vice versa
//	to convert InEUron int iNeuRoN
//		how to check capital or small letter
//		String s1="InEUrOn";
//		String s2=" ";
//	  
//		for(int i=0;i<s1.length();i++) {
//			if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
//				s2=s2+(char)(s1.charAt(i)-32);
//			}
//			else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') {
//				s2=s2+(char)(s1.charAt(i)+32);
//			}
//			
//		}
//		System.out.println(s2);//output:  iNeuRoN

//4. Possible ways to reversing a string
//>>1. iNeuron --> norueNi
//		iNeuron Java--> Java iNeuron
		
//		String s1="iNeuron";
//		String s2="";
//		for(int i=s1.length()-1;i>=0;i--) {
//			s2=s2+s1.charAt(i);
//		}
//		System.out.println("original string "+s1);
//		System.out.println(" After reversing "+s2);//output: norueNi
		
		
//output: original string iNeuron
//        After reversing  norueNi
		
//>>2. iNeuron Java --> noruenI avaj 
//	method 1
//		String s1="iNeuron java";
//		String s2="";
//		for(int i=s1.length()-1;i>=0;i--) {
//			s2=s2+s1.charAt(i);
//		}
//		System.out.println("original string "+s1);
//		System.out.println(" After reversing "+s2);
//	method-2 using split method
//		String s1="Ineuron java";
//		String s2="";
//		String sarr[]=s1.split(" ");
//		for(String elem: sarr)
//		{
//			for(int i=elem.length()-1;i>=0;i--)
//			{
//				s2=s2+elem.charAt(i);
//			}
//			s2=s2 +" ";
//			
//		}
//		System.out.println(s2);  //output: noruenI avaj 
		
//3. Ineuron java --> java ineuron
		String s1="Ineuron java";
		String s2=" ";
		String sarr[]=s1.split(" "); 
		for(int i=sarr.length-1;i>=0;i--) {
			s2=s2+sarr[i]+" ";
		}
		System.out.println(" ");
		System.out.println(s2); //output:  java Ineuron 
		
		

		
		
		
	}

}
