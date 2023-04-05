//4.The methods to prevent(stop) thead execution.
//->We can prevent Threads from Execution
//   1. yield()
//   2. sleep()
//   3. join()

//See life cycle of thread picture at 1:02:00

//           t.start()                      cpu allocates          if Run method 
//                                          time for thread          completes
//  new/Born ---------> Ready/Runnable state---------------->running------------>Dead

//         |         |
//         |         |
//         |         |
//         |         |
//       main       child 
//      thread      thread

//->Let's say thread sheduler allocating cpu time for child 
//  thread.
//->while executing child thread if it enter into someother 
//  state where it is not using cpu time effectively.
//->then thread sheduler give control to main thread.
//->at a time one thread will executed.

//=>When thread is in running state what all actions a thread 
//  can do to make sure CPU time can't be effectively use.

//see picture at 1:14:00
//->Assume telephone booth. inserting coins and speak.
//->there is owner and people are there in queue to speak.

//                                      speaking  waiting
//->      Owner------>Telephone<------- person-1, Person-2

//->Person-1 is speaking a lot and Person-2 waiting to share
//  important thing in phone.
//->Owner gives same priority to both.
//->Person-A gave chance to B to talk.
//->Another person-c is waiting.
//->no gaurantee Person-B gives chance to Person-A or Person-B



//=>We can prevent Threads from Execution
//  1. yield()
//  2. sleep()
//  3. join()
//1. yield() => It causes to pause current executing Thread 
//   for giving chance for waiting Threads of same priority.

//->public static native void yield()
//                          or

//yield()- pause or stop execution for sometime and check
//whehter there are any other threads are waiting if those
//thread priority and current thread priority is same
//give chance to other thread to execute.

//->If there are no waiting Threads or all waiting Threads 
//  have low priority then same Thread can continue its 
//  execution.
//->If all the threads have same priority and if there are 
//  waiting threads then we can't expect which thread will 
//  get chance it depends on Thread Scheduler.
//->The Thread which is yielded, it is totally depend
//  on Thread sheduler to get a chance to execute again. 
//->we can't expect exactly.

//         MyThread t= new MyThread() //new state or born state
//         t.start() // enter into ready state/runnable state
//->if ThreadScheduler allocates time for thread then thread 
//  enters into running state.
//->if running Thread calls yield() then it enters back into 
//  runnable state/Ready state.
//->if run() is finished with execution then it enters into
//  dead state.

//->Running thread if it encounter yield method it goes to 
//  Ready/Runnable (statesome other state waiting for control 
//  to come back).
   
//       Ready/Runnable state<-------------running

//->we don't know when thread sheduler give time back to 
//  first thread.

//Example-1: yield method
//Child thread priority-5
//Main thread priority-5
//->main thread always get chance.
//->we can see context switching in output beacuse yield 
//  method.

//->If we comment line-1, then we can't expect the output 
//  because both the threads have same priority then which
//  thread the ThreadScheduler will schedule is not in the 
//  hands of programmer.
//->if we don't comment line-1, then there is a possibility 
//  of main thread getting more no of times, so main thread
//  execution is faster than child thread will get chance.

class MyThread extends Thread
{
	public void run() {
		for(int i=0;i<=5;i++) {
		 		Thread.yield();   //----->Line-1
	        	System.out.println("Child thread");
	    }	
	}
}
public class Multithreading33 {

	public static void main(String[] args) {
	
        MyThread  t=new MyThread();
        t.start(); 
        for(int i=0;i<5;i++) {
        	System.out.println("Main thread");
        }
	}
}

//output:
//1st time Execution
//	Main thread
//	Main thread
//	Main thread
//	Main thread
//	Main thread
//	Child thread
//	Child thread
//	Child thread
//	Child thread
//	Child thread
//	Child thread

//2nd time Execution
//Main thread
//Main thread
//Child thread
//Child thread
//Main thread
//Main thread
//Main thread
//Child thread
//Child thread
//Child thread
//Child thread

//->Note: Some platforms wont provide proper support for 
//yield(),becuase it is getting the execution code from 
//other language prefereably from 'C'.
