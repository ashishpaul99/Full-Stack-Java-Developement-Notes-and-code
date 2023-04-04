//=>Information of threads
//->Getting name of the threads
//->Thread t=new Thread(Runnable r)

//Code Explaination:
//1. calling a method using class name. it is static method.
//  String name=Thread.currentThread().getName();

//Example-1
//Code:
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
//	
//	
//}
//public class Multithreading28{
//	public static void main(String[] args) {
//		String name=Thread.currentThread().getName();
//		//gives name of the thread which executes main thread
//		System.out.println("Main method is executed by-"+ name);
//  
////		//getting name of thread
//		MyThread t=new MyThread();
//		System.out.println(t);
//		
////		//gives the name of child thread which executes MyThread class
//	     System.out.println("Name of child thread is"+t.getName());//Thread-0
//	}
//}

//output:
//Main method is executed by-main
//Thread[Thread-0,5,main]  
//Name of child thread isThread-0

//Thread[Thread-0,5,main]  ->name of the thread,   ,name of the method body is executed


//Example-2
//class MyThread extends Thread{
//	
//	@Override
//	public void run() {
//		String name=Thread.currentThread().getName();
//		System.out.println("run() is executed by -"+ name);
//	}
//}
//public class Multithreading28{
//	public static void main(String[] args) {
//		String name=Thread.currentThread().getName();
//		//gives name of the thread which executes main
//		//thread
//		System.out.println("Main method is executed by-"+ name);
//	    
//		
//		MyThread t=new MyThread();
//		t.start();
//		
//
//		
//	}
//}

//output:
//	Main method is executed by-main
//	run() is executed by -Thread-0

