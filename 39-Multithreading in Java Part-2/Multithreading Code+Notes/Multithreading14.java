//Code-1
//Code Explaination
//1. MyThread2 object is created.
//2. start() method is heart of multi-threading.
//3. JVM checks for start() method in MyThread class.
//4. for this MyThread2 parent is at two level.
//     1. class level->Object is parent. there is no start method in object.
//     2. interface level
//->it throws ClassNotFoundException.
//->start() method is available in thread class.


//Code- creation of thread using Runnable interface

//    interface Runnable{
//    	public abstract void run();
//    		
//    	
//    }
//    class Thread implements Runnable{ //Adapter class
//    	public void start()
//    	{
//    		1. Register the thread with ThreadScheduler
//    		2. All other mandatory low level activities(memory level)
//    		3. invoke or call run() method
//    	}  
//      public void run() {
//    	  
//      }
//    }


//class MyThread2 implements Runnable{
//	
//	@Override
//	public void run(){
//		for(int i=1;i<10;i++) {
//			System.out.println("Child Thread");
//	}	
//}
//
//public class Multithreading13 {
//	public static void main(String[] args) {
//		MyThread2 t=new MyThread2();
//       
//		t.start();  //-->Line-1
//		
//		//task for main thread
//		for(int i=1;i<=10;i++) {
//			System.out.println("Main Thread");
//		}
//	}
//}

//output:
//	Error: Could not find or load main class Multithreading12
//	Caused by: java.lang.ClassNotFoundException: Multithreading12
