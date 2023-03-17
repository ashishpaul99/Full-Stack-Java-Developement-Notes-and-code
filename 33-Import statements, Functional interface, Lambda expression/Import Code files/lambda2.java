//Lambda expression example

//example 1-
//@FunctionalInterface
//interface Add{
//	void add();
//}
//public class lambda2 {
//
//	public static void main(String[] args) {
//	
////		we can write lambda expression
//		
//		Add a=()-> {
//			int num1=10;
//			int num2=20;
//			int res=num1+num2;
//			System.out.println(res);
//		};
//		
//		a.add();//30
//
//	}
//
//}

//example-2
//alternative
//if you are implementing lambda expression 
//then in parameters type of data is optional.

//@FunctionalInterface
//interface Add{
//	void add(int a, int b);
//}
//public class lambda2 {
//
//	public static void main(String[] args) {
//	
////		we can write lambda expression
//		
////		Add a1=(int a,int b)-> {
////			int res=a+b;
////			System.out.println(res);
////		};
////		
////		or 
//
//		   Add a1=( a, b)-> {
//			int res=a+b;
//			System.out.println(res);
//		   };
//
//		a1.add(10,20);//30
//	}
//
//}

//example-3: implementing multiple interfaces in same class by using
//	         anonymous.

@FunctionalInterface
interface Add{
	void add(int a, int b);
}

@FunctionalInterface
interface Sub{
	int sub(int num1);
}
public class lambda2 {

	public static void main(String[] args) {
		
		   Add a1=( a, b)-> {
			int res=a+b;
			System.out.println(res);
		   };
		   //if we use return statement then {} are mandatory
//		   Sub s=(num1)->{
//			   int res=num1-5;
//			   return res;//output: 5
//		   };
		   
//		   or
//		    >>if body is single statement
//		     no need of return statement
		   
		   Sub s=num1-> num1-5; //output: 5
		   
		   a1.add(10,20);//30
		   System.out.println(s.sub(10));
	}

}


//important points 

//1. to write lambda expression we use lambda operator(->) 
//2. operator divided into 2 parts
//-->to left of arrow operator mention the parameters required.
//-->to right of arrow operator write the body.



//3. if you are implementing lambda expression then in 
//parameters type of data is optional. or 
//left side pararmeters data type is optional.

//eg:
//Add a1=( a, b)-> {
//	int res=a+b;
//	System.out.println(res);
//};

//4. if there is only one parameter then brackets are optional.
//							or
//left side parameter is single then () and  type of data is optional

//eg:
//	Sub s=num1->{
//		   int res=num1-5;
//		   return res;
//	   };


//5. if there is only one line in body of lambda expression then
//curly braces are optional. 
//                         or
//right side if implementation or body has one statement then
//{} is optional

//eg:
//Demo d= ()->System.out.println("Hello world");

//6. while returning something return statement is optional.
//                                or
//right side in body if single line implementation then return
//statement is optional.

//eg:
//@FunctionalInterface
//interface Sub{
//int sub(int num1);
//}
//public class lambda2 {
//
//	public static void main(String[] args) {
//	
//	   Sub s=num1-> num1-5; //output: 5
//	   System.out.println(s.sub(10));
//   }
//
//}

//-->if body is single statement no need of return statement.
//inside lambda expression we can use return statement

//--> if want write return statement explicitly in lambda expression
//then {} are mandatory.

//{} is manadatory if there is more than one statement and also
//return statement explicitly used by developer


