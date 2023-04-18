//=>Making main thread to sleep
//Example-1:making main thread sleep for 3 sec
//->delay of three seconds giving for main thread.
//->main thread is sleeping then thread sheduler gives chance
//  to child thread.
//->then child thread will do the calculation and immediately 
//  it will notify for waiting thread(main thread).
//->but in this case main thread is in sleeping state.
//         Thread.sleep(3000);
//->here main thread will not receive the notification 
//  because it is in sleeping state.
//->after that main thread wakes up and starts executing.
//->it calls wait method. 
//->child thread executed the task and went into dead state
//because of this reason main thread encounters infinite wait.

//	synchronized(b) {  
//			System.out.println("Main thread calling wait() method");//step-1
//			b.wait();     //-->Infinite wait
//			System.out.println("Main thread got notification call");//step-4
//			System.out.println(b.total);
//	}

//->this is infinite wait is called dead lock.


//Code
//class ThreadB extends Thread
//{
//
////  the info in total variable should shared to main thread
//	int total=0; 
//	
//// ->calculating sum of 100 numbers
//	@Override
//	public void run() {
//		synchronized(this) {
//		System.out.println("Child thread started the calculation");//step-2
//		for(int i=1;i<=100;i++) {
//			total+=i;
//		}
//		System.out.println("Child thread giving notification call");//step-3
////  ->notify should called by ThreadB object which is current object.
//		this.notify(); 
//	
//	   }
//	}
//}
//public class Multithreading75 {
//
//	public static void main(String[] args) throws InterruptedException {
//		ThreadB b=new ThreadB();
//		b.start(); //-->Line-1
//		
////		main thread is sleeping
//		Thread.sleep(3000);
//		
////	    two threads are present here->Main thread(5), Child therad(5)	
////		main thread should wait on b
//		synchronized(b) {  //-->Line-2
//			System.out.println("Main thread calling wait() method");//step-1
//			b.wait();     //-->Line-3
//			System.out.println("Main thread got notification call");//step-4
//			System.out.println(b.total);
//		}
//	}
//}


//output:
//	Child thread started the calculation
//	Child thread giving notification call
//	Main thread calling wait() method



//Example-2:making main thread wait for 1 sec

//Code:
//class ThreadB extends Thread
//{
//
////  the info in total variable should shared to main thread
//	int total=0; 
//	
//// ->calculating sum of 100 numbers
//	@Override
//	public void run() {
//		synchronized(this) {
//		System.out.println("Child thread started the calculation");
//		for(int i=1;i<=100;i++) {
//			total+=i;
//		}
//		System.out.println("Child thread giving notification call");
////  ->notify should called by ThreadB object which is current object.
//		this.notify(); 
//	
//	   }
//	}
//}
//public class Multithreading75 {
//
//	public static void main(String[] args) throws InterruptedException {
//		ThreadB b=new ThreadB();
//		b.start(); 
//		
////		main thread is sleeping
//		Thread.sleep(3000);
//		
////	    two threads are present here->Main thread(5), Child therad(5)	
////		main thread should wait on b
//		synchronized(b) { 
//			System.out.println("Main thread calling wait() method");
////		making main thread for 1 sec
//			b.wait(1000); //  
//			System.out.println("Main thread got notification call");
//			System.out.println(b.total);
//		}
//	}
//}

//ouput:
//	Child thread started the calculation
//	Child thread giving notification call
//	Main thread calling wait() method
//	Main thread got notification call
//	5050

//Example-3:making main thread wait for 1 sec and child thread sleep for 
//3 sec
//->main thread want notification in 1 sec.
//->child notifies after 3 sec.
//->notifying main thread after 3 sec after executing task
//->Main thread is another waiting state and waits for lock
//  once it gets lock it start executing.
//->

//Code:
class ThreadB extends Thread
{

//  the info in total variable should shared to main thread
	int total=0; 
	
// ->calculating sum of 100 numbers
	@Override
	public void run() {
		synchronized(this) {
		System.out.println("Child thread started the calculation");
		for(int i=1;i<=100;i++) {
			total+=i;
		}
		
//		notifying main thread after 3 sec od executing task
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			
		}
		System.out.println("Child thread giving notification call");
//  ->notify should called by ThreadB object which is current object.
		this.notify(); 
	
	   }
	}
}
public class Multithreading75 {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b=new ThreadB();
		b.start(); 
		
		
//	    two threads are present here->Main thread(5), Child therad(5)	
//		main thread should wait on b
		synchronized(b) { 
			System.out.println("Main thread calling wait() method");
//		making main thread for 1 sec
			b.wait(1000); //  
			System.out.println("Main thread got notification call");
			System.out.println(b.total);
		}
	}
}

//output:
//	Main thread calling wait() method
//	Child thread started the calculation
//	Child thread giving notification call
//	Main thread got notification call
//	5050

