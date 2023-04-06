//Case-4:Child thread waiting Parent thread.
//->Waiting of Child Thread untill Completing Main Thread
//->we can make main thread to wait for child thread as well 
//  as we can make child thread also to wait for main thread.
//->need reference for Parent thread.
//->Child thread join with main thread.
//->using reference child thread calls join method.
//->after line t.start() 2 thread are there.
//->making main thread to sleeping state then child get 
//  chance to execute.

//Example-1:
class MyThread extends Thread
{
	static Thread mt;
	@Override
	public void run() {
	   try {
		   mt.join();//Child thread waits for waiting for Parent thread
	   }
	   catch(InterruptedException e) {
		   e.printStackTrace();
	   }
	   for(int i=1; i<=5;i++) {
		   System.out.println("child thread");
	   }
	}
}
public class Multithreading38 {

	public static void main(String[] args) throws InterruptedException  {
		
//     Parent thread object
		MyThread.mt=Thread.currentThread();
		
		MyThread t=new MyThread();
		t.start();
		
		
		for(int i=0;i<5;i++) {
			Thread.sleep(2000);
			System.out.println("Parent thread");
		}
	}
}


//->two thread are executed in output.
//->Main thread
//  a. Parent thread
//->Child thread
//  b. child thread


//output:
//	Parent thread
//	Parent thread
//	Parent thread
//	Parent thread
//	Parent thread
//	child thread
//	child thread
//	child thread
//	child thread
//	child thread
