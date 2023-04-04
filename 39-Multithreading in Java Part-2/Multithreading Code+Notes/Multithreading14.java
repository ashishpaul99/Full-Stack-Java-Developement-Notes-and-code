//Code-1
//Code Explaination
//1. MyThread object is created.
//2. start() method is heart of multi-threading.
//3. JVM checks for start() method in MyThread class. start method is not present in MyThread class.
//  it also check in parent of MyThread class which is Object class. start method is not presnt in Object class also.

//                Object(class)
//                     |
//                MyThread(User defined class)------------------>Runnable
                    


//4. for this MyThread parent is at two level.
// 1. class level->Object is parent. there is no start method in object.
// ->JVM checks for start() method in MyThread class. start method is not present in MyThread class.
//   it also check in parent of MyThread class which is Object class. start method is not presnt in Object class also.
// 2. interface level-> 
//->JVM checks for start method in Runnable interface. it is not in Runnable interface.
//->since start method is not found in Object class and Runnable interface so, it throws ClassNotFoundException.
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


//class MyThread implements Runnable{
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
//		MyThread t=new MyThread();
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
