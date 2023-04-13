//=>Synchronization in Java
//1. synchronized is a keyword applicable only for methods and blocks
//2. if we declare a method/block as synchronized then at a time only one thread
//can execute that method/block on that
//object.
//3. The main advantage of synchronized keyword is we can resolve data
//inconsistency problems.
//4. But the main disadvantage of synchronized keyword is it increases waiting
//time of the Thread and effects performance
//of the system.
//5. Hence if there is no specific requirement then never recommended to use
//synchronized keyword.
//6. Internally synchronization concept is implemented by using lock concept.
//->Synchronization in Java is the capability to control the
//  access of multiple threads to any shared resource.
//->Java Synchronization is better option where we want to 
//  allow only one thread to access the shared resource.
//
//=>Why use Synchronization?
//->The synchronization is mainly used to
//1. To prevent thread interference.
//2. To prevent consistency problem.

//Code:Program to demonstrate the need of synchronization
//class Display
//{
//	public synchronized void wish(String name)
//	{
//		for (int i=1;i<=5 ;i++ )
//		{
//			System.out.print("Good Morning: ");
//			try{
//				Thread.sleep(2000);
//			}
//			catch (InterruptedException e){
//			}
//
//			System.out.println(name);
//		}
//	}
//}
//class MyThread extends Thread{
//	Display d; //->Has-A Relationship 
//	String name;
//	MyThread(Display d,String name){
//		this.d=d;
//		this.name=name;
//	}
//	
//	@Override
//	public void run() {
//		d.wish(name);
//	}
//}
//public class Multithreading54 {
//
//	public static void main(String[] args) {
////	  ->Creating Object of display is created.
//	    Display d=new Display();   //->Line-1
//	    
////	  ->Creating Object of MyThread.
//	    MyThread t1=new MyThread(d,"sachin");  //->Line-2
//	    MyThread t2=new MyThread(d,"Dhoni");
//	    t1.start(); //-->Line-3
//	    t2.start(); //-->Line-4
//	}
//}

//output:
//	Good Morning: sachin
//	Good Morning: sachin
//	Good Morning: sachin
//	Good Morning: sachin
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: Dhoni
//	Good Morning: Dhoni
//	Good Morning: Dhoni
//	Good Morning: Dhoni
