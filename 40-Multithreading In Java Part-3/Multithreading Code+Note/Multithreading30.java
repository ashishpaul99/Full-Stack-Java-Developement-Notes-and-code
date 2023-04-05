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

//                      OS
//                       | 3sec
//                  JVM<-----CPU

//                  Thread sheduler
//                 _______|________
//                |                |
//           main thread        Thread-0(child thread)
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

//							Thread
// 							   |extends
//                             |
//                           MyThread

//->MyThread is creating by "mainThread", so priority of 
//  "mainThread" will be shared as a priority for "MyThread".


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



