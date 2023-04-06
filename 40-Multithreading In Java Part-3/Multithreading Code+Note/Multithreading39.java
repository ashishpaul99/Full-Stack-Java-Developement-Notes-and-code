//Case-5: If both the threads invoke t.join(),mt.join() then 
//the program would result in "deadlock".

//Example-5
//->for accessing current thread under execution by using
//  Thread.currentThread() method
//->calling on join method on thread object
//   Thread.currentThread().join()
//->joining thread on same thread.
//->main thread is waiting for main thread.
//->main thread will check on whom it has to join.
//->it has to join with same main thread after exectuitng.
//->we will see blank in output.
//->it results in infinite wait.
//->these infinite wait we call as dead lock.
//->when we work with multithreading make sure the waiting 
//  time should never be in infinite loop.
//->Output:Deadlock, becoz main thread is waiting for the 
//  main thread itself.

//class MyThread extends Thread
//{
//	static Thread mt;
//	@Override
//	public void run() {
//	   try {
//		   mt.join();//Child thread waits for waiting for Parent thread
//	   }
//	   catch(InterruptedException e) {
//		   e.printStackTrace();
//	   }
//	   for(int i=1; i<=5;i++) {
//		   System.out.println("child thread");
//	   }
//	}
//}
//public class Multithreading39 {
//
//	public static void main(String[] args) throws InterruptedException  {
//            Thread.currentThread().join();
//		}
//}

//output:
//	no output