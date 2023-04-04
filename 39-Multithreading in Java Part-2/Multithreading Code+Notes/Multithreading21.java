//MyRunnable r=new MyRunnable();
//Thread t1=new Thread();
//Thread t2=new Thread(r);

//How many threads and what is the output in this case?

//Case-5:r.start();
//->r is type of MyRunnable.
//->there is no start method in MyRunnable class.
//->it results compile time error.


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
//
//class MyRunnable implements Runnable{
//	@Override
//	public void run(){
////		task-2
//		for(int i=1;i<5;i++) {
//			System.out.println("Child Thread");
//		}
//	}	
//}
//public class Multithreading21{
//	public static void main(String[] args) {
//		MyRunnable r=new MyRunnable();
//		Thread t1=new Thread();
//		Thread t2=new Thread(r);          
//		r.start();
////		task-1
//		for(int i=1;i<5;i++) {
//			System.out.println("Main Thread");
//		}	
//	}
//}

//output:
//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		The method start() is undefined for the type MyRunnable
//
//		at Multithreading21.main(Multithreading21.java:45)
