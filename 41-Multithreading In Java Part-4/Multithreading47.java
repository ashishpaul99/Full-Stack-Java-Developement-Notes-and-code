//=>3. Creating thread using Runnable interface

//->More .class files more will be the loading time.
/*
  @FunctionalInterface
  interface Runnable{
      void run(){
      
      }
   }
   
 */

//class MyRunnable implements Runnable
//{
//	public void run() 
//	{
////		child thread task
//			for(int i=0;i<=5;i++) {
//				System.out.println("child thread");
//			}
//	}
//}
//
//public class Multithreading47 {
//
//	public static void main(String[] args) {
//		MyRunnable r=new MyRunnable();
//		Thread t=new Thread(r);
//		t.start();
//		
//	  ->main thread task
//		for(int i=0;i<=5;i++) {
//			System.out.println("Main Thread");
//		}	
//
//	}
//
//}

//output:
//	Main Thread
//	Main Thread
//	child thread
//	child thread
//	child thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	child thread
//	child thread
//	child thread

