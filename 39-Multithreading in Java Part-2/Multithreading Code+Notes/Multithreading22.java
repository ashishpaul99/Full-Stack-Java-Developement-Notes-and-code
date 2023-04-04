//MyRunnable r=new MyRunnable();
//Thread t1=new Thread();
//Thread t2=new Thread(r);

//How many threads and what is the output in this case?

//Case-6:r.run();
//->No new thread will be created, but MyRunnable run() method
//  will executed just like normal method call.


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
//public class Multithreading22{
//	public static void main(String[] args) {
//		MyRunnable r=new MyRunnable();
//		Thread t1=new Thread();
//		Thread t2=new Thread(r);          
//		r.run();
////		task-1
//		for(int i=1;i<5;i++) {
//			System.out.println("Main Thread");
//		}	
//	}
//}

//output:
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread