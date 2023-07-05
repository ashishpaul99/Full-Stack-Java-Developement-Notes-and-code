//=>Interface New Feature Introduced in Java-9
//Feature-3: Private method in interface.
//->Private memebers of class will not participate in inheritance.
//->Private method will not be inherited in implementing class.
//->Private method cannot be accessed outside interface.
//->Outside interface we cannot call private method.
//->Private methods can be used within interface.
//->For internal purpose interface they allowed it.
//->we can access private methods inside interface.
//->Private methods can used withtin interface.



//Example-4: Private method inside interface

//interface Hyder
//{
//	void teaches();      //public abstract void teaches();
//	void writesCode();   //public abstract void wirtesCode();
//	
//   private void disp3(){
//	   System.out.println("Private method in interface");
//   }
//  
//	
//}
//class Student implements Hyder{
//	public void teaches() {
//		System.out.println("Hyder teaches Java");
//	}
//	
//	public void writesCode() {
//		System.out.println("Hyder write code");
//	}
//
//}
//
//public class Map12 {
//
//	public static void main(String[] args) {
//		
////		->Creating object of implementing class
//          Student s=new Student();
//          s.teaches();
//          s.writesCode();
//   
//    
//	}
//}

//Feature-4: we can write  private static method inside interface is allowed.
//->we can access private static method inside static method.
//->we can access prvate method through other methods.
//->Private methods are allowed for internal purpose.




//Example-4:  private static method inside interface is allowed
//interface Hyder
//{
//	void teaches();      //public abstract void teaches();
//	void writesCode();   //public abstract void wirtesCode();
//	static void disp1() {
//		System.out.println("Static method inside interface");
//		disp2();
//		
//	}
//	
//   private static void disp2(){
//	   System.out.println("Private method in interface");
//   }
//  
//	
//}
//class Student implements Hyder{
//	public void teaches() {
//		System.out.println("Hyder teaches Java");
//	}
//	
//	public void writesCode() {
//		System.out.println("Hyder write code");
//	}
//
//}
//
//public class Map12 {
//
//	public static void main(String[] args) {
//		
////		->Creating object of implementing class
//          Student s=new Student();
//          s.teaches();
//          s.writesCode();
//   
//    
//	}
//}