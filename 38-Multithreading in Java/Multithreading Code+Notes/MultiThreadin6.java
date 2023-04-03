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

//->Inside thread class all these logic will be executed.


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





      

