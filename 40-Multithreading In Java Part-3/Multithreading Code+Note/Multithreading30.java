//=>5th Dec Live Class Multithreading In Java Part 03
//Nithin sir | I worked on 5/4/23

//1. Priority of the executed by Thread sheduler

//->this Thread.currentThread().getPriority() method is used 
//  for Priority of thread.

//->We can set and get priority values of the thread using 
//  the following methods
//a. public final void setPriority(int priorityNumber)
//b. public final int getPriority()


//see picture at 27:24:00

//                   OS
//                    | 3sec
//	            JVM<-----CPU
                      |
////            Thread sheduler
//             _______|________
//            |                |
//       main thread        Thread-0(child thread)
//

//->we have two threads main thread and thread-0(child thread).
//->CPU given for application from the OS to the thread 
//  sheduler.
//->OS will tell to JAVA program basically.
//->Lets say OS will give 3 sec of CPU time to finish 
//  particular work.
//->this 3 sec JVM given to thread sheduler. Thread sheduler
//  it duty of thread sheduler which thread should execute.

//=>On what basis thread sheduler will decide for executing 
//  thread in given time(3 sec).
//->Based on priority it will decide.
//->given example at 27:24 on priority
//->traffic example->Circle
//  ->local MLA, 4 persons, MP, CM, PM of country, PM of other country
//  ->priority based on designation is given in example.

//->based on priority thread sheduler will decide which 
//  thread get execute.
//->if priority of main thread and thread-0 is 5 here
//  both threds have same priority.
//->if both the thread have same priority then, thread 
//  sheduler uses algorithm which is vendor dependent.
//->Algorithm will not be disclosed by vender.



//1.1 DefaultPriority:
//->The default priority for only main thread is "5",
//  where as for other threads priority will be inherited 
//  from parent to child. Parent Thread priority will be 
//  given as Child Thread Priority.
//->here main thread and child thread have same priority.
//->Thread sheduler decide which thread should be executed.
//->JVM will create main thread and is only starts with 
//  default priority(5)

//=>Why child thread priority is assigned to 5?
//->the parent child thread is main thread. hence the 
//  priority is inherited from main thread to child thread.
//  see picute at: 41:10


//Example-1 
//->here by default both the thread priority is same.

//class MyThread extends Thread
//{
//	public void run() {
//		System.out.println("Priority of Child thread is "+Thread.currentThread().getPriority());
//	}
//	
//}
//public class Multithreading30 {
//
//	public static void main(String[] args) {
//		
//        System.out.println("Priority of main thread is "+Thread.currentThread().getPriority()); 
//        MyThread t=new MyThread();
//        t.start();
//	}
//
//}

//output:
//	Priority of main thread is 5
//	Priority of Child thread is 5

//2. How to give priority for thread?

//->we have method called setPriority()
//->here priority of child is given as 10.
//Code:
//      MyThread t=new MyThread();
//      ->Priority for thread is given
//        t.setPriority(10);

//->main thread priority is 5 by default.
//->After line t.start(); there are two threads with priority 
//  10 and 5.

//=>which thread executed first?
//->here child thread priority is set to 10.
//->by default main thread priority is 5..
//->Since priority of child thread is more than main thread, jvm will execute child
//thread first whereas for the parent thread priority is 5 so it will get last chance..
//->more the priority quickly thread sheduler will allocate
//  the cpu time.
//->OS should support sheduling algorithm. 
//->if OS is not supporting then it results in improper
//  outputs.


//2.2 ThreadPriorities
//->For every Thread in java has some priority.
//->valid range of priority is 1 to 10,it is not 0 to 10.
//->if we try to give a differnt value the it would result in
//  "IllegalArgumentException".

//2.2.1 What priority we can give to thread?
//->Minimum, Normal and Maximum value setPriority of Thread
//  Thread.MIN_PRIORITY = 1
//  Thread.MAX_PRIORITY = 10
//  Thread.NORM_PRIORITY = 5

//->Type in cmd -> javap java.lang.Thread
//there are three vaiables.
//  public static final int MIN_PRIORITY=1;
//  public static final int NORM_PRIORITY=5; //Normal priotiy
//  public static final int MAX_PRIORITY=1;

//->we can given Minimum , Maximum and Normal priorty as 1, 10 and 5.

//->Thread class does not have priorities like Thread.LOW_PRIORITY,Thread.HIGH_PRIORITY.
//->Thread scheduler allocates cpu time based on "Priority".
//->If both the threads have the same priority then which 
//  thread will get a chance as a program we can't predict 
//  becoz it is vendor dependent.
//->We can set and get priority values of the thread using 
//  the following methods
//a. public final void setPriority(int priorityNumber)
//b. public final int getPriority()


//Example-2

//class MyThread extends Thread
//{
//	public void run() {
//		System.out.println("Priority of Child thread is "+Thread.currentThread().getPriority());
//		
////		for(int i=0;i<=5;i++) {
////        	System.out.println("Child Thread");
////        }
//	}
//	
//}
//public class Multithreading30 {
//
//	public static void main(String[] args) {
//		
//        System.out.println("Priority of main thread is "+Thread.currentThread().getPriority()); 
//        MyThread t=new MyThread();
//       //->Priority for thread is given
//        t.setPriority(10);
//        t.start();
////     =>at this line there are two threads with priority 
////       10 and 5.	
////        for(int i=0;i<=5;i++) {
////        	System.out.println("Main Thread");
////        }
//	}
//}

//output:
//	Priority of main thread is 5
//	Priority of Child thread is 10

//->for cracked windows verion we will not expected output.

//Example-2
//->The allowed priorityNumber is from 1 to 10,if we try to 
//. give other values it woudld result in "IllegalArgumentException".

//->set priority of the thread to 100.
//->if we set 100 there will be no compile time error
//   but it results in run time error.
//->it throws IllegalArgumentException Exception

//=>Type in cmd javap java.lang.Thread
//   see setPriority method
//->public final void setPriority(int);
//->it accepts integer


class MyThread extends Thread
{
	public void run() {
		System.out.println("Priority of Child thread is "+Thread.currentThread().getPriority());
		
	}
	
}
public class Multithreading30 {

	public static void main(String[] args) {
		
        System.out.println("Priority of main thread is "+Thread.currentThread().getPriority()); 
        MyThread t=new MyThread();
       //->Priority for thread is given
        t.setPriority(100);
        t.start();

	}
}

//output:
//Priority of main thread is 5
//Exception in thread "main" java.lang.IllegalArgumentException
//	at java.base/java.lang.Thread.setPriority(Thread.java:1138)
//	at Multithreading30.main(Multithreading30.java:185)

