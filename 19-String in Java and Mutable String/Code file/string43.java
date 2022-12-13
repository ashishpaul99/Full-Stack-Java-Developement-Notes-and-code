//StringBuffer 
public class string43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	final StringBuffer sb= new StringBuffer("sachin");
//	appending method
//	sb.append("tendulkar");
//	System.out.println(sb);//output: sachintendulkar
//	assigning sb to other object
//	sb=new StringBuffer("kholi");// output:  final local variable sb cannot be assigned.
	
//	Constructors
//	1. Public java.lang.StringBuffer();
//	2. Public java.lang.StringBuffer(int);
//	3. Public java.lang.StringBuffer(java.lang.string);
	
//>>Methods of StringBuffer()/StringBuilder:
//	1. public int length()
//	2. public int capacity()
	
//	1. Public java.lang.StringBuffer();
//	StringBuffer sb1=new StringBuffer();
//	length():method: No of characters
//	System.out.println(sb1.length());//output:0
//	capacity(): how many no of characters can stored?
//	System.out.println(sb1.capacity());//output:16
	
//	a. appending 16 characters
//	sb1.append("ashjkgfyuiodnmhn");
//	Length after appending 16 characters
//	System.out.println(sb1.length());//output: 16
//	System.out.println(sb1.capacity());//output: 16
	
//	b. appending 1 character to 16 characters
//	sb1.append("a");
//	Length after appending 16 characters
//	System.out.println(sb1.length());//output:17
//	System.out.println(sb1.capacity());//output:(16+1)*2=34
//	it increases its capacity>>capacity=(oldcapacity+1)*2
//	this the the way jvm got programmed for Stringbuffer
	
//	2. Public java.lang.StringBuffer(int);
//	StringBuffer sb2=new StringBuffer(100);
//	System.out.println(sb2.length());//output: 0(no characters)
//	System.out.println(sb2.capacity());//output:100
//	while StrinBuffer object  if integer number passed 
//	as argument that number will treated as capacity
	
//	eaxmple-2 
//	StringBuffer sb3=new StringBuffer(19);
//	System.out.println(sb3.length());//output: 0(no characters)
//	System.out.println(sb3.capacity());//output: 19
	
//	sb3.append("sachin");
//	System.out.println(sb3.length());//output:6
//	System.out.println(sb3.capacity());//output: 19
//	
//  3. Public java.lang.StringBuffer(java.lang.String)
//	StringBuffer sb4=new StringBuffer("sachin");
//	System.out.println(sb4.length());//output:6
//	System.out.println(sb4.capacity());//output:22 [lenght of the string(6)+default capacity(16)]
	//	if you supply any string the capacity will be 
//	(capacity:lenght of the string+default capacity)
	
//>>Methods of StringBuffer()/StringBuilder:
//	c. Public char charAt(int index)	
//	char :	s a c h i n
//	index:	0 1 2 3 4 5
//	StringBuffer sb=new StringBuffer("sachin");
//	System.out.println(sb.charAt(4)); //output: i
//	System.out.println(sb.charAt(-1));// Index -1 out of bounds for length 6
                                      //StringIndexOutOfBoundsException

	
//	d. Public char setCharAt(int index, char ch)
//	char  : s a c h i n t e n d u  l  k  a  r
//	index : 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
//	captializing t in character(t-->T)
//	t is replaced by T
//	StringBuffer sb=new StringBuffer("sachintendulkar");
//	sb.setCharAt(6, 'T');
//	System.out.println(sb);//output: sachinTendulkar
	
	
	}

}
