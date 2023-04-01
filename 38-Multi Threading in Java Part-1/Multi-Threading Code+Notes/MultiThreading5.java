//4. What is thread?
//A. Seperate flow of execution is called "Thread". if there 
//   is only one flow then it is called "SingleThread" 
//   programming. 
// ->For every thread there would be a seperate job.

//B. In java we can define a thread in 2 ways
//   1. Implementing Runnable interface
//   2. extending Thread class


//->No dependency in tasks. they are independent tasks. 
//->Multi threading come into picture only when tasks are 
//  catagorized into two different tasks are independent to 
//  each other.

//=>Then how to tell to jvm execute each task with seperate 
//  line execution.
//1. Identify the task
//2. Write with in a class. this class user defined class.
//3. the object of the class get facility of thread when few 
//   things are taken from in built API. 
//4. By extending Thread class we can create a Thread by 
//   extending a Thread.
//->Whenever thread is extended whatever job is given for
//  thread the job has to place it by overriding method 
//  called run.
//->run method is pre-defined method present in thread class.

//->Public class Thread{
//	public void run() {
//		
//	}
//}

//->run method should override and task should be inside 
//  this method.
//					or
//  ->Override run() to define job for thread.
//eg: 
//	@Override                                   
//	public void run()                            
//	{                                            
//		for(int i=1;i<=10;i++) {                
//			System.out.println("Child Thread");  
//	    }
//	}

 
//3. Create object of that MyThead class in main and say 
//   t.start();/

//eg:
//	  MyThread t=new MyThread();
//    t.start();


//from line 32 to  44 is defining a thread
//from line 37 to 43 is task of thread

//->defining a thread(writing a class and extending a Thread)
//->job a thread or task of thread(code written inside run())

//=>defining a thread
//Task-1
class MyThread extends Thread{                         
	
//	task of a thread
	@Override                                   
	public void run()                            
	{                                            
		for(int i=1;i<=10;i++) {                
			System.out.println("Child Thread");  
	    }
	}
	
}
public class MultiThreading5 {

	public static void main(String[] args) {
		
		MyThread t=new MyThread();      //--> Line-1: Thread instantiation
//line-2 will create a new thread which is resposible to Execute run().
		t.start();                      // -->Line-2: starting a thread
//		Task-2
		for(int i=1;i<=10;i++) {        //-->Line-3 : // At this line 2 threads are there
			System.out.println("Main Thread"); //-->Line-4
		}

	}

}

//->see picture at 02:05:00
//->two .class available in java
//java Test.java->Test.class,MyThread.class
//->Control given java Test because it contain main method.

//MethodArea
//Step-1
//->Test.class loads and start the execution.
//->JVM will Test.class loads in method area.


//StackArea
//Step-2
//->From method area it will check whether main method is 
//available. that main method it will bring it to stack 
//area.
//->for JVM main method region is given on stack.
//->JVM loads all the main method code. it loads from 
//.class file in stack area.
//Step-3
//->After loading JVM will create line of execution(Thread)
//and for that JVM will give name as main.

//see picture at: 2:11:00
//step-4
//Behind the scenes
//1. Main thread is created automatically by JVM.
//2. Main thread creates child thread and starts the child thread.
//  ->t.start()


//=>Line-1 Execution
//->Execution of object creation is done by main thread.
//->MyThread object is created in Heap Area.
//->t is name of the object of type MyThread.
//->Main thread do this job.
//->Main thread is executs Line-1 in above code
//eg:
//	MyThread t=new MyThread();  --> Line-1
	
//->Whenever MyThread object is has to created. Respective 
//.class file present on Method Area. 
//->MyThread .class file is loaded.
//->Thread is parent of MyThread.
//->Thread .class file will load in method area.
//->Object is parent of thread
//->Objec class file will load in method area.

//=>Line-2 Execution
//->After executing line-1 it executes line 2
//         t.start();  -->Line-2

//->t is of MyThread type.
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
//->start method get is executed.



//=>Line-3: 
//-Control comes to Line-3
//->now contol comes to for loop
//->After Execution of t.start() at Line-3 there are 2 
//  threads.
//->when start() method is called two threads are created.
//->the two threads are
//  1. main thread
//  2. User-defined thread
//->two theads are there for execution.
//->the duty of the thread sheduler is to tell which thread 
//  to Execute.
//see picture at: 2:19:00
//->thread sheduler is present in stack area.

//            thread sheduler
//             _______|_______
//            |               |
//           t1              t2
//      main thread       User-defined thread


//=>Logic inside main method
//->the logic inside main method is executed by Main thread.
//->the logic inside main method is task for main method.
    
// public static void main(String[] args) {
//	
//			MyThread t=new MyThread();         //--> Line-1
//			t.start();                         // -->Line-2
//			//Task-2
//			for(int i=1;i<=10;i++) {           //-->Line-3
//			System.out.println("Main Thread"); //-->Line-4
//	}
//
//}

//=>Logic inside Run method
//-> the logic written inside run method is executed by 
//   User-defined thread.
//->the logic written inside run method is task for User 
//  defined thread

//		//task of a thread
//		@Override                                   
//		public void run()                            
//		{                                            
//			for(int i=1;i<=10;i++) {                
//			System.out.println("Child Thread");  
//    		}
//		}

//->two threads are fighting for CPU time.
//->it is totally depend on thread sheduler to allow which 
//  thread to execute.
//->99.9% of the time thread sheduler will have courtesy
//  on main
//->main thread will get a chance.
//->child thread will wait until main thread executes.
//->2 theads started and eagerly waiting for cpu time, 
//  sheduling is done by thread sheduler.
//->here two tasks are independent to each other.
//->Let output may vary but make sure cpu time is effciently 
//  used.

//=>Agenda of Multi tasking 
//->To use CPU time effectively, so that performance can be 
// improved.

//->Thread sheduler is software implemented based on few
//  algorithm.
//->this algo is confidential. non of the vender disclose 
//  this info.
//->SRS given by sun micro system system.
//->venders will give the implementation.
//                 JDK--->SUN MICRO SYSTEMS
//                         |
//                         |
//           IBM(JDK), Opensource(JDK),  Oracle(JDK)  


//=>Output of the program
//->we can predict possible outputs in multi threading.
//->here in output context switching is happening.

//1st time Execution ouput
// output:
//	 C:\Users\Ashishpaul\Desktop\java>java new2
//	 Main Thread
//	 Main Thread
//	 Main Thread
//	 Main Thread
//	 Main Thread
//	 Main Thread
//	 Main Thread
//	 Main Thread
//	 Main Thread
//	 Main Thread
//	 Child Thread
//	 Child Thread
//	 Child Thread
//	 Child Thread
//	 Child Thread
//	 Child Thread
//	 Child Thread
//	 Child Thread
//	 Child Thread
//	 Child Thread
	 
//	 2nd Execution
//	C:\Users\Ashishpaul\Desktop\java>java new2
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
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


	 









	





                  






