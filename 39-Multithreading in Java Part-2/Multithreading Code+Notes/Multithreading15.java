//Code-2: Thread is created by thread class start method() 
//which calls run method present in thread class. 
//in order create thread we need run method present 
//in MyRunnable class.

//->for creating thread create object of thread class.
//->start() method is available in thread class.
//->In order to create thread make a call to start method
//  in which Thread class.
//->if thread is created by t. this t will call run method 
//  with zero parameter.
//->it calls run method present in thread class.
//->but we want run method present in MyRunnable class.
//->tell to thread class to take start method from Thread 
//  class execute run method from my runnable.

//How to tell?
//->we have to ask develper who wrote the API code.

//Note-
//->Type in cmd javap java.lang.Thread
//->here we see constructor of thread
//1. public java.lang.Thread();
//->thread class start(), followed by thread class run()
//->previously we use this constructor to create a thread.
//->if we use this constructor and call start method it 
//  calls run method present in Thread class.

//2. public java.lang.Thread(java.lang.Runnable);
//->thread class start(), followed by implementation class of 
//  Runnable run()
//->if we create a Thread object like this it calls start()
//  Thread class but it will call run method form implementation
//  of runnable.


//    interface Runnable{
//    	public abstract void run();
//    		
//    	
//      }
//      class Thread implements Runnable{ //Adapter class
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

//
//class MyRunnable implements Runnable{
//	
//	@Override
//	public void run(){
//		for(int i=1;i<5;i++) {
//			System.out.println("Child Thread");
//		}
//	}	
//}
//
//public class Multithreading15{
//	public static void main(String[] args) {
//		MyRunnable r=new MyRunnable();
//		
//		Thread t=new Thread();
//		t.start();
//		
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
