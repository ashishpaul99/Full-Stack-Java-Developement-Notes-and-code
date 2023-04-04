//MyRunnable r=new MyRunnable();
//Thread t1=new Thread();
//Thread t2=new Thread(r);

//How many threads and what is the output in this case?

//case-2:t2.start();
//->it calls start method of thread class and invoke run()
//  method of MyRunnable class.

//->a new thread will be created, which is responsible for 
//  executing MyRunnable run();

//   After this t2.start(); 2 threads are there
// 1. Main Thread
// ->task in main method is executed by main thread.

// 2. User defined Thread
// ->task in run method of MyRunnable Class is executed by 
//   user defined thread.

//Code:

//public interface Runnable{
//		public abstract void run();
//}
//
//public class Thread implements Runnable{
//	public void start(){
//		1. register Thread with ThreadScheduler
//		2. All other mandatory low level activites
//		3. invoke run()
//}
//	public void run(){
//		//empty implementation
//	}
//}

//no need to write above code

//class MyRunnable implements Runnable{
//	@Override
//	public void run(){
////		task-2
//		for(int i=1;i<5;i++) {
//			System.out.println("Child Thread");
//		}
//	}	
//}
//public class Multithreading18{
//	public static void main(String[] args) {
//		MyRunnable r=new MyRunnable();
//		Thread t1=new Thread();
//		Thread t2=new Thread(r);          
//		t2.start();
////		task-1
//		for(int i=1;i<5;i++) {
//			System.out.println("Main Thread");
//		}	
//	}
//}

//output:
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread