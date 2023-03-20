//Write a program to compute length of string
//1. traditional of implementing interface
//interface CLS{
//	int getLength(String str);
//}
//
//class LOS implements CLS{
//	public int getLength(String str) {
//		int length=str.length();
//		return length;
//	}
//}
//public class Lambda3 {
//
//	public static void main(String[] args) {
//	   
//		LOS l=new LOS();
//		
//		System.out.println(l.getLength("ashish"));//output: 6
//
//	}
//
//}

//2. using anonymous class
//interface CLS{
//	int getLength(String str);
//}
//
//
//public class Lambda3 {
//
//	public static void main(String[] args) {
//	   
//		CLS cls=new CLS() {
//		  public int getLength(String str) {
//			  
//			  return str.length();
//		  }
//		  
//		};
//		
//		System.out.println(cls.getLength("ashish"));//output:6
//
//	}
//
//}

//3. implementing using lambda expression
//@FunctionalInterface
//interface CLS{
//	int getLength(String str);
//}
//
//
//public class Lambda3 {
//
//	public static void main(String[] args) {
//	 
////			CLS c= str->str.length();
////			System.out.println(c.getLength("Ashish")); //output: 6
////							or
//		
//			
//			
//	}
//
//}



