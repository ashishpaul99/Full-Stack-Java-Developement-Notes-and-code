//Case-9:
//->After starting the Thread, we are not supposed to start 
//  the same Thread again,then we say Thread is in 
//  "IllegalThreadStateException".
//->it is run time problem
//->already thread is started.
//->Again you cannot make thread to start.
//->it throws run time exception.

//No argumenet run method
//Exception in thread "main" java.lang.IllegalThreadStateException
//        at java.base/java.lang.Thread.start(Thread.java:793)
//        at new2.main(new2.java:17)


//class MyThread extends Thread{
//	
//	public void run(){
//	
//		System.out.println("No argumenet run method");
//	}	
//}
//
//public class Multithreading12 {
//	public static void main(String[] args) {
//		MyThread t=new MyThread();
//       
//		//calling start() of MyThread
//		t.start();  //-->Line-1
//		
//		//calling start() of thread
//		t.start();
//		
//		//task for main thread
//		System.out.println("Main thread");
//	}
//}

//output:
//	No argumenet run method
//	Exception in thread "main" java.lang.IllegalThreadStateException
//	        at java.base/java.lang.Thread.start(Thread.java:793)
//	        at new2.main(new2.java:17)




