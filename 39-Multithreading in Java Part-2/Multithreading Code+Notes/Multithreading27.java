//=>Alternate approach to define a Thread(not recomended)

//->Thread t=new Thread(Runnable r)
//->Any class which implements runnable interface that 
//  runnable object can pass as parameter.//public interface Runnable{
//->we can pass t as parameter to thread class.

//       Runnable(Interface)
//              |
//              |   -->implements
//              |
//          Thread(Pre-defined class)
//              |
//              |    -->extends
//              |
//         MyThread(User-defined class)

//->MyThread Extends Thread class which implements runnable 
//  interface.
//->internally there is realationship between Thread and 
//  runnable interface.
//->MyThread is in directly object of runnable.



//Code Explaination
//->we can pass t as parameter to thread class.
//->Afer passing t to thread constructor as parameter.
//->Thread class start() method will be called and MyThread
//  run method will be invoked.




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
//	@Override
//	public void run(){
////		task-2
//			System.out.println("run method is called");
//	}	
//}
//public class Multithreading27{
//	public static void main(String[] args) {
//		MyThread t=new MyThread();
//		
//		Thread t1=new Thread(t);
////		Creates a new thread because Thread class start() 
////		method is called
//		t1.start();
//		
////		task-1
//			System.out.println("Main Thread");
//	}
//}

//output:
//	Main Thread
//	run method is called

