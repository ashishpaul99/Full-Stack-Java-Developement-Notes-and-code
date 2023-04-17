//=>Synchronized Block Examples
//->Code before and after synchronized blocks are executed by 
//  multiple threads.
//->which ever thread gets lock of current object that thread
//  access the synchronized block.

//Example-1: 
//class Display
//{
//	public void wish(String name)
//	{
////	Code before synchronized block	
//		
//		
//		
////	writng task in synchronized block
//// ->here lock applied for the thread for executing this block
//		synchronized(this){
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
//	   }
//	}
//	
////	code after synchronized block
//	
//	
//}
//class MyThread extends Thread
//{
//	
//	Display d;  //->Has a relationship
//	String name;
//	
//	MyThread(Display d, String name){
//		this.d=d;
//		this.name=name;
//	}
//	
//	@Override
//	public void run() {
//		d.wish(name);
//		
//	}
//}
//public class Multithreading63 {
//
//	public static void main(String[] args) {
//
////		creating display object
//		Display d=new Display();
//		
////		creating MyThread object and passing arguments 
//		MyThread t1=new MyThread(d,"Ashish");
//		MyThread t2=new MyThread(d,"Sachin");
//		t1.start();
//		t2.start();
//		
//
//	}
//
//}

//output:
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Good Morning: Sachin
//	Good Morning: Sachin
//	Good Morning: Sachin
//	Good Morning: Sachin
//	Good Morning: Sachin

