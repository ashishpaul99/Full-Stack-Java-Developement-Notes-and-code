//Example-4 :  multiple threads are operating on multiple objects
//->here threads multiple threads are operating on multiple 
//  objects we notice irregular output.
//->synchronized(this) is object level lock for d1 and d2 
//  objects.

//->Output-Irregular output becoz two object and two threads
//  acting on two different objects

//Code:
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
////   	knowing thread which is getting lock 
//		System.out.println("Thread which is getting lock is:"+Thread.currentThread().getName());//->Line-1	
//		for (int i=1;i<=5 ;i++ )
//		{
//			
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
////    knowing thread which is releasing lock 
//    System.out.println("Thread which is releasing lock is:"+Thread.currentThread().getName());//->Line-1	
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
//	@Override
//	public void run() {
//		d.wish(name);	
//	}
//}
//public class Multithreading66 {
//
//	public static void main(String[] args) {
//
////    creating multiple display objects
//		Display d1=new Display();
//		Display d2=new Display();
//		
////		creating MyThread object and passing arguments 
//		MyThread t1=new MyThread(d1,"Ashish");
//		MyThread t2=new MyThread(d2,"Sachin");
//		
//		t1.setName("Ashish Thread");
//		t2.setName("Scahin Thread");
//		
//		t1.start();
//		t2.start();
//	}
//}

//output:
//Thread which is getting lock is:Scahin Thread
//Good Morning: Thread which is getting lock is:Ashish Thread
//Good Morning: Ashish
//Good Morning: Sachin
//Good Morning: Sachin
//Good Morning: Ashish
//Good Morning: Sachin
//Good Morning: Ashish
//Good Morning: Sachin
//Good Morning: Ashish
//Good Morning: Sachin
//Ashish
//Thread which is releasing lock is:Scahin Thread
//Thread which is releasing lock is:Ashish Thread

