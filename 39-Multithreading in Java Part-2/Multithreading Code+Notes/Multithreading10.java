//Case-7:
//->overridding start method and using super method to call 
//  start method of parent class(Thread).

//How many threads will be created and what is output?
//->2 threads will be created.
//->two threads are Executing
//1. main thread-> calls start method and Execute task in
//   main method.
//2. User defined thread-> which invoked run method and 
//   Executes task in run method.

//Code Explaination:
//=>Line-1
//->In main method we are making call to start method which
//  is present in user defined class(MyThread class).

//=>Line-3
//->Super.start();->it calls  the parent class object.
//->it calls start method present in Thread class.
//->it calls parent class start method.
//->all the logic in start method of MyThread get executed.
//->a new thread is created 
//->Job of thread to execute run() method which is present in
//  MyThread class.
//->then control comes main method and task in main method get
//  executed.
//->Context switching between threads will happen because of 
//  multi threading.



//->Thread class
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

//class MyThread extends Thread{
//	@Override
//	public void start()  //-->Line-2
//	{
//		//super calls parent object
//		//Thread is created.
//		super.start();   //-->Line-3
//		System.out.println("start method is called");
//	}
//	public void run(){
//		System.out.println("No argumenet run method");
//	}	
//}
//
//public class Multithreading10 {
//	public static void main(String[] args) {
//		MyThread t=new MyThread();
//  
//		t.start();  //-->Line-1
//		
//		//task for main thread
//		System.out.println("Main thread");
//	}
//}

//output:
//	start method is called
//	Main thread
//	No argumenet run method
