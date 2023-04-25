//4.3 Check whether the thread is Daemon?
//->by using isDaemon() method we can check whether the 
//  thread is Daemon.

//->Checking main thread is Daemon thread

//public class Test6{
//	public static void main(String[] args) {
//
//	  System.out.println(Thread.currentThread().isDaemon()); //Checking main thread is Daemon or not
//
//	}
//}
//output: false

//->Checking whether child thread is Daemon Thread
//Code Explaination
//-> main thread is Daemon Thread.
//->whichever thread creates one more thread that thread get 
//  all facility of a thread from whom it got created.
//->here main thread is not Daemon Thread then child thread 
//  also not Daemon.


//class MyThread extends Thread{
//	
//}
//public class Test6{
//	public static void main(String[] args) {
//
//	  MyThread t1=new MyThread();
//	  t1.start(); //creating thread and executing
//	  
//	  System.out.println(t1.isDaemon()); // Checking child is Daemon or not
//	  
//
//	}
//} 
//
//output: false

//4.4 How to make a thread as Daemon thread?
//->Use setDaemon() to make a thread as Daemon thread. 
//class MyThread extends Thread
//{
//	
//}
//public class Test6 {
//
//	public static void main(String[] args) {
//      
//	MyThread t1=new MyThread();
//	t1.setDaemon(true);
//	t1.start();
//	System.out.println(t1.isDaemon());
//		
//	}
//}

//output: true


//=>Making thread as Daemon thread after thread is started.
//eg:
//->Once thread is started at any given point of time we don't
//  control to make the thread as Daemon.
//->it throws IllegalThreadStateException if we modify thread
//  once it is started.

//class MyThread extends Thread
//{
//	
//}
//public class Test6 {
//
//	public static void main(String[] args) {
//      
//	MyThread t1=new MyThread();
//	t1.start();
//	t1.setDaemon(true);  //thread is made Daemon thread after thread is started
//	System.out.println(t1.isDaemon());
//		
//	}
//}

//output:
//	Exception in thread "main" java.lang.IllegalThreadStateException
//	at java.base/java.lang.Thread.setDaemon(Thread.java:1403)
//	at Test6.main(Test6.java:78)


//4.5 Getting Priority of Daemon Thread


//class MyThread extends Thread
//{
//	public void run() {
//		System.out.println(Thread.currentThread().getPriority());
//	}
//}
//public class Test6 {
//
//	public static void main(String[] args) {
//      
//	MyThread t1=new MyThread();
//	t1.setDaemon(true);
//	t1.start();
//	System.out.println(t1.isDaemon());
//		
//	}
//}

//output:
//	true
//	5

//->In reality we don't write code for making thread as 
//  Daemon thread.
//->we prefer to use thread which are already Daemon in 
//  Application.

//Example-1
//Code Explaiantion:
//->In this case Main thread is not Daemon thread and Child 
//   thread Daemon.
//1. Main thread starts and finishes it's execution.
//2. Child thread starts execution and sleeps for 2 secs
//   after each loop.
//3. After this child thread finishes it's execution.

//->After Line-1 there are 2 threads.
//->both threads have prority as 5.
//	a. Main  Thread            ->Non-Daemon Thread ->Hero
//	b. Child Thread(Thread-0)  ->Daemon Thread     ->Makeup artist
//->main thread is Non-Daemon thread where as Child thread 
//  is DaemonThread, if the main thread finishes the execution 
//  then automatically the DaemonThread also will finish the 
//  execution.

//class MyThread extends Thread
//{
//		public void run(){
//			for (int i=1;i<=5 ;i++ ){
//				System.out.println("child thread");
//				try{
//					Thread.sleep(2000);//2sec
//				}
//				catch (InterruptedException e){
//					System.out.println(e);
//				}
//			}
//		}
//}
//public class Test6 {
//
//	public static void main(String[] args) {
//      
//	MyThread t1=new MyThread();
//	t1.setDaemon(true);
//	t1.start();  //->Line-1
//	
//	System.out.println("End of Main Thread");
//		
//	}
//}

//output:
//End of Main Thread
//child thread

//Example-2
//->In this case Main thread and Child thread Non-Daemon Thread.
class MyThread extends Thread
{
		public void run(){
			for (int i=1;i<=5 ;i++ ){
				System.out.println("child thread");
				try{
					Thread.sleep(2000);//2sec
				}
				catch (InterruptedException e){
					System.out.println(e);
				}
			}
		}
}
public class Test6 {

	public static void main(String[] args) {
      
	MyThread t1=new MyThread();
	t1.start();  //->Line-1
	
	System.out.println("End of Main Thread");
		
	}
}

//Output:
//	End of Main Thread
//	child thread
//	child thread
//	child thread
//	child thread
//	child thread



