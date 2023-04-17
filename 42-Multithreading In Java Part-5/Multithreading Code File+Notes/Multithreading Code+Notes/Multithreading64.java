//Example-2: Knowing whhich thread is executing outside 
//           the synchronized.

//-Displaying which thread is Executing

//->here Line-1 is not part of synchonized block both 
//threads are getting chance.

//class Display
//{
//	public void wish(String name)
//	{
////	Code before synchronized block	
//	System.out.println("Thread which is getting lock is:"+Thread.currentThread().getName()); //->Line-1	
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
//	@Override
//	public void run() {
//		d.wish(name);	
//	}
//}
//public class Multithreading64 {
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
//		t2.setName("Scahin");
//		
//		t1.start();
//		t2.start();
//	}
//}

//output:
//	Thread which is getting lock is:Scahin
//	Good Morning: Thread which is getting lock is:Ashish Thread
//	Sachin
//	Good Morning: Sachin
//	Good Morning: Sachin
//	Good Morning: Sachin
//	Good Morning: Sachin
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Good Morning: Ashish
