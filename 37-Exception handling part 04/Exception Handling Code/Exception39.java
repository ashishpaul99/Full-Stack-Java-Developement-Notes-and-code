//6. Rules of overriding associated with exception

//Rule-1: 
//While Overriding if the child class method throws any
//checked exception compulsorily the parent class method should
//throw the same checked exception or its parent otherwise 
//we will get Compile Time Error. There are no restrictions 
//on UncheckedException.

//->Exception is Partially checked exception
//->child class overridden method is throwing checked 
//  exception.
//->if child class method throws any checked exception 
//  then parent class method must throw same checked 
//  exception or it's parent Exception other wise it result 
//  Compile time error.

//->if parent class method throws Exception and child class 
//  method is not throwing exception then compiler will not give
//  any error 
//->check this from child not from parent.
//eg: below code gives Compile time error. 
// here parent class method is not throwing exception but 
//  Child class throws exception.
//class Parent
//{
//	public void m1() 
//	{
//		
//	}
//}
//class Child extends Parent
//{
//	@Override
//	public void m1() throws Exception {
//		
//	}
//}
//public class Exception38 {
//
//	public static void main(String[] args) {
//		
//
//	}
//}

//=>solution for above error

//class Parent
//{
//	public void m1 throws Exception() 
//	{
//		
//	}
//}
//class Child extends Parent
//{
//	@Override
//	public void m1() throws Exception {
//		
//	}
//}
//public class Exception39 {
//
//	public static void main(String[] args) {
//		
//
//	}
//}


//->the above rule is not applicable for unchecked exceptions.
//NullPointerException is unchecked exception.
//eg:1
//class Parent
//{
//	public void m1() 
//	{
//		
//	}
//}
//class Child extends Parent
//{
//	@Override
//	public void m1() throws NullPointerException {
//		
//	}
//}
//public class Exception39 {
//
//	public static void main(String[] args) {
//		
//        Parent p=new Child();
//        p.m1();
//	}
//}