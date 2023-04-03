//ThreadScheduler
//==============
//->If multiple threads are waiting to execute,then which 
//  thread will execute 1st is decided by ThreadScheduler 
//   which is part of JVM.
//->In case of MultiThreading we can't predict the exact output only possible output
//  we can expect.
//->Since jobs of threads are important,we are not interested 
//  in the order of execution it should just execute such 
//  that performance should be improved.
//->we can shedule the thread.

//->t.start(); =>this line will create a new thread which 
// is resposible to Execute run().

//=> Inside the start( ) method
//class Thread
//{
//	publlic void start() {
//		1. Register the thread with Thread Sheduler.
//		2. All other mandatory low level activities.
//        -> All memory level activites which should be done 
//           at low level
//		3. Invoke or call run() method.
//       ->it invokes run() method which in MyThread
//	}
//}

//=>Inside start method which is in thread class all these 
//  logic will be executed.
//		1. Register the thread with Thread Sheduler.
//      ->this tells one thread is presnet keep track of 
//        that thread.
//		2. All other mandatory low level activities.
//        -> All memory level activites which should be done 
//           at low level
//		3. Invoke or call run() method.
//       ->it invokes run() method which in MyThread


//->When JVM calls start() method the it checks in MyThread 
//  class. but start() method is not Present in MyThread but 
//  it is present in Thread class.
//->there is no start() method in MyThread class.
//->it checks in Parent class of MyThread. here Thread is 
//  Parent of MyThread.
//->start method is available in Thread class.
//Code-
//     public class Thread{
//    	 public void run() {
//    		 
//    	 }
//    	 public void start() {
//           // Logic internally available   		 
//    	 }
//     }

//->Start method calls user-defined run method which is overrided
//  in MyThread class.
//Code-
//	@Override                                   
//	public void run()                            
//	{                                            
//		for(int i=1;i<=10;i++) {                
//			System.out.println("Child Thread");  
//	    }
//	}

//->Immediately after creating thread object thread will no 
//  be Created.
//->the thread creation is done based on which start method is
//  been executed by thread.
//->Always thread class start method executes then the thread 
//  will be registered with thred sheduler. 
//->for that thread all low level activities which should get 
//  will be there and that thread internally make a call
//  to run method.
//->Since thread class start doing all these logic we call
//  this start method is heart of Multithreading.

//class Thread
//{
    //Heart of Multi-threading
//	publlic void start() {
//	   1. Register the thread with Thread Sheduler.
//	   2. All other mandatory low level activities.(Memory level)
//        -> All memory level activites which should be done 
//           at low level
//	   3. Invoke or call run() method.
//       ->it invokes run() method which in MyThread
//	}
//}

//->if thread class start method is not execute then thread 
//  will not register for thread sheduler.
//->if thread not been register for thread sheduler then CPU
//  will not effectively ustilize.

//->What happens when we call t.run( )method?
//if we call run() method directly then it call run method 
//present in user defined class(MyThread) here start method 
//is no being executed then thread will not be registered 
//with thread shedueler so multi threading wil not be 
//implemented in the program.
//->it is single threaded code.
//code-

//case2: diff b/w t.start() and t.run()
//->if we call t.start() and seperate thread will be created 
//  which is responsible to execute run() method.
//
//->if we call t.run(), no seperate thread will be created 
//  rather the method will be called just like normal method 
//  by main thread.
//->if we replace t.start() with t.run() then the output of 
//  the program would be
//output:
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread

//->in output same thread is getting executing.
//->we will not see context switching in output.

//Code-
class MyThread1 extends Thread{                         
	
//	task of a thread
	@Override                                   
	public void run()                            
	{                                            
		for(int i=1;i<=10;i++) {                
			System.out.println("Child Thread");  
	    }
	}
	
}
public class Multithreading6 {

	public static void main(String[] args) {
		
		MyThread1 t=new MyThread1();      
		t.run();                     
//		Task-2
		for(int i=1;i<=10;i++) {        
			System.out.println("Main Thread"); 
		}

	}

}

//output:
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Child Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread


