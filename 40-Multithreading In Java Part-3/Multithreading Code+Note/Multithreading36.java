//Case-2: Using  public final void join(long ms)throws InterruptedException
//method.
//->In this case parent thread will not wait for the child
//  thread. Parent thread get executes before child thread.
//->making Parent thread to wait for 1 sec.
//            t.join(1000);
//->After this line t.join(1000); Parent thread executes 
//  with 1 sec delay it will executed before Child thread.
//->here this method is used
//  public final void join(long ms)throws InterruptedException

//->If line-n1 is commented then we can't predict the 
//  output becoz it is the duty of the thread sheduler to 
//  assign C.P.U time.
//-> If line-n1 is not commented, then Parent 
//   thread(main thread) will enter into waiting state till
//   Child thread(child thread) finishes its execution.
//Output
//2 Threads
//a. Child Thread
//Child thread
//Child thread
//....
//b. Main Thread
//Parent thread
//Parent thread

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
//public class Multithreading36 {
//
//	public static void main(String[] args) throws InterruptedException  {
//		MyThread t=new MyThread();
//		t.start();
//		
//		t.join(1000);  //-->Line-1
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
