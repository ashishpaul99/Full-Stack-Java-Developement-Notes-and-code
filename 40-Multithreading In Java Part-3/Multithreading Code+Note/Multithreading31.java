//2. How to give priority for thread?

//->we have a method called setPriority()
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

//                          Thread Sheduler
//                          _______|________
//                         |                |
//  thread priority-       5                10

//->for high priority thread CPU time will be allocated.


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
//public class Multithreading31 {
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
