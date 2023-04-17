//Example-3: Knowing which thread is getting lock and which thread is releasing lock.

//->Displaying which thread is get lock inside synchronized lock

//->here Line-1 is part of synchonized block only one
//  thread are get chance to execute at a time.

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
////		knowing thread which is getting lock 
//	    System.out.println("Thread which is getting lock is:"+Thread.currentThread().getName());//->Line-1	
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
////		knowing thread which is releasing lock 
//      System.out.println("Thread which is releasing lock is:"+Thread.currentThread().getName());//->Line-1	
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
//public class Multithreading65 {
//
//	public static void main(String[] args) {
//
////		creating display object
//		Display d=new Display();
//		
////		creating MyThread object and passing arguments 
//		MyThread t1=new MyThread(d,"Ashish");
//		MyThread t2=new MyThread(d,"Sachin");
//		
//		t1.setName("Ashish Thread");
//		t2.setName("Sachin Thread");
//		
//		t1.start();
//		t2.start();
//	}
//}

//output:
//Thread which is getting lock is:Ashish Thread
//Good Morning: Ashish
//Good Morning: Ashish
//Good Morning: Ashish
//Good Morning: Ashish
//Good Morning: Ashish
//Thread which is releasing lock is:Ashish Thread
//Thread which is getting lock is:Sachin Thread
//Good Morning: Sachin
//Good Morning: Sachin
//Good Morning: Sachin
//Good Morning: Sachin
//Good Morning: Sachin
//Thread which is releasing lock is:Sachin Thread
