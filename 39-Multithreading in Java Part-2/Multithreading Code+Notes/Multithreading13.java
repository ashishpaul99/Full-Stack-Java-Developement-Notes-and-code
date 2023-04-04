//7. Creation of Thread using Runnable interface
//1. Creating a thread using java.lang.Thread class
//		a. use start() from Thread class
//		b. override run() and define the job of the Thread.

//->Type in cmd javap java.lang.Runnable
//C:\Users\Ashishpaul>javap java.lang.Runnable
//Compiled from "Runnable.java"
//public interface java.lang.Runnable {
//      public abstract void run();
//     
//      }
//}

//->if interface contains one abstract method it called 
//  functional interface.
//->we can write lambada expression for the run method.

//->Why sun micro systems come up with creation of thread 
//  using Runnable interface?

//2. Creation of a Thread requirement to SUNMS is an SRS
//->SRS(Software Requirement Specifications)
//->Rules to create a thread
//->in java SRS is represeted as Interface.
//->They gave the requirement. 
//->directly implementing srs will be difficult for any
//  developer.
//->they give Thread class for reducing bruden of developer.
//->memory level activity is done by sun micro systems in 
//  Thread class.
//->here  thread class is adapter class.
//->Java adapter classes provide the default implementation of 
//  listener interfaces. If you inherit the adapter class, 
//  you will not be forced to provide the implementation of 
//  all the methods of listener interfaces. So it saves code.
//->here adapter class  and helper class is not abstract 
//  because sometimes they will not make abstract class 
//  to facilitate benfits
//->now developer duty is to give job or task for run method
//  which is present in Thread class.

//->type javap java.lang.Thread
//  see Thread implements runnable

//    interface Runnable{
//        	public abstract void run();
//    }
//    class Thread implements Runnable{ //Adapter class
//    	public void start()
//    	{
//    		1. Register the thread with ThreadScheduler
//    		2. All other mandatory low level activities(memory level)
//    		3. invoke or call run() method
//    	}  
//      public void run() {
//    	  //job for thread
//      }
//    }


//7.1 shortcuts of eclipse
//ctrl+shift+T => To open a defnition of any class
//ctrl + o => To list all the methods of the class
//->use ctrl+shift+t search for what is inside thread class.
//->use ctrl+o in thread class to search methods inside
//  thread class.



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