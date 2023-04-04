//How many threads are created and what is the output?
//->two threads are created here
//  1. Main Thread
//  2. User defined Thread

//Code Explaination
//->here start() method of thread class is called and invokes
//run() method of Thread class which have no implementation.


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
//class MyThread extends Thread{
//	@Override
//	public void run(){
////		task-2
//		for(int i=1;i<5;i++) {
//			System.out.println("run method is called");
//		}
//	}	
//}
//public class Multithreading26{
//	public static void main(String[] args) {
//		MyThread t=new MyThread();
//		
//		Thread t1=new Thread();
////		Creates a new thread because Thread class start() 
////		method is called
//		t1.start();
//		
////		task-1
//		for(int i=1;i<5;i++) {
//			System.out.println("Main Thread");
//		}	
//	}
//}