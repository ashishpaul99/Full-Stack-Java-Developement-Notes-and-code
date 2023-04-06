//Case-3 : Using public final void join(long ms,int ns)throws InterruptedException

//->In this Parent thread becomes more strict.
//  it waits for very less time.
//->Parent thread is waiting for Child thread.
//->This method is available in package java.lang.Thread.join(long time_in_ms, int time_in_ns).
//->join(long time_in_ms, int time_in_ns) method is 
//  applicable when currently executing thread wants to wait
//  for a particular amount of time in milliseconds with 
//  additional time also in nanoseconds until completing 
//  some other thread then we should go for 
//  join(long time_in_ms, int time_in_ns) method of Thread 
//  class.

//Example-1 : 

//class MyThread extends Thread
//{
//	@Override
//	public void run() {
//		for(int i=0;i<5;i++) {
//			System.out.println("Child thread");
//			try {
//				//pause the execution for 2 sec->2000 milli seconds
//				Thread.sleep(2000);
//			}
//			catch(InterruptedException e) {
//				
//			}
//		}
//	}
//}
//public class Multithreading35 {
//
//	public static void main(String[] args) throws InterruptedException  {
//		MyThread t=new MyThread();
//		t.start();
//		
//		t.join(100, 10);
//		for(int i=0;i<5;i++) {
//			System.out.println("Parent thread");
//		}
//	}
//}

//output:
//	Child thread
//	Parent thread
//	Parent thread
//	Parent thread
//	Parent thread
//	Parent thread
//	Child thread
//	Child thread
//	Child thread
//	Child thread
