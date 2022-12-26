import java.util.Arrays;

//21.8th Nov Live Class String programming, Encapsulation, GitHub Eclipse integration
//Part-1
public class string45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Palindrome 
//		String s1="NITIN";
//		String s2="";
//		for(int i=s1.length()-1;i>=0;i--) {
//			s2=s2+s1.charAt(i);
//			
//		}
////		System.out.println(s2);
//		if(s2.equals(s1)) {
//			System.out.println("it is palindrome");
//		}
//		else {
//			System.out.println("it is not palindrome");
//		}
		
//2. Anagram
//		String s1="Race";
//		String s2="carE";
		
//		make all leters to lower case
//		s1=s1.toLowerCase();
//		s2=s2.toLowerCase();
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
//		store them in an array/
//		char[] ch1=s1.toCharArray();
//		char[] ch2=s2.toCharArray();
//		
//		System.out.println(ch1);
//		System.out.println(ch2);
//		
//		sort them in order
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		System.out.println(ch1);
//		System.out.println(ch2);
		
//		comparing two arrays of characters
//		if(Arrays.equals(ch1, ch2)) {
//			System.out.println("it's anagram");
//		}
//		else {
//			System.out.println("it's not anagram");
//		}	
		
//3. Pangram
//Eg: THE QUICK BROWN FOX JUMPS OVER LAZY DOG
//	boolean flag=false;
//	String s1="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
////	replacing spaces
//	s1=s1.replace(" ", "");
//	System.out.println(s1);//output: THEQUICKBROWNFOXJUMPSOVERLAZYDOG
//
//// creating an array
//	char[] ch=s1.toCharArray();
//	
////creating empty array from 0 to 25 index
//	int[] ar=new int[26];
//	
////moving through array ch
//	for(int i=0;i<ch.length;i++) {
//		int index=ch[i]-65; // T-->84(ASCII), index=84-65=19
//		ar[index]++;    //ar[19]=0-->ar[19]++=1
////		ar[ch[i]-65];
//	}
//	
////moving through ar
//	for(int i=0; i<ar.length;i++) {
//		if(ar[i]==0) {
//			System.out.println("it's not pangram");
//			flag=true;
//		}
//	}
//	if(flag==false) {
//		System.out.println("it is pangram");
//		
//	}
		

	}
}
