//41-Multithreading part 04 | 6th Dec Live Class 
//->Nithin sir

//1. Interupting a Thread
//->the method public void interrupt() is used to interrupt 
//  a thread.
//->If thread is in sleeping state or in waiting state we can
//  interupt a thread.

//=>When Interrupted exception is thrown?
//->Note: While one thread is in waiting state and if one 
//  more thread interupts then it would result in 
//  "InterruptedException".InterruptedException is 
//   checkedException which should always be handled.


//=>How one thread can interuppts another thread and How 
//  interrupteException would be generated?


//Case-1:main thread or parent thread is interrupting child 
//       thread. here child thread enter into sleeping
//       state after doing a task.

//->see picture at 20:49(Image-1 in github)
//          	   Thread Sheduler
//         	      _______|________         
//         	     |                |
//    	    main thread        thread-0(child thread)->(Sleeping /waiting state)
//               |                |
//t.interrupt()  |                | running state
//           	 |                |
//                          Interrupted Exception

//Code Explaination
//->here both thread have same priority we cannot predict 
//  which thread get a chance.
//->telling to main thread.
//    t.interrupr();
//->main thread or parent thread is interrupting child thread.

//->there are two threads 
//  a. main thread
//  b. child thread
//->main thread finishes its execution.
//->child thread sleeps for 3 sec after each execution.
//->these thread is still in running state.
//->whichever thread tells interrupt even its finished its 
//  execution it will never get into dead state it will wait
//  for the other thread get into waiting and sleeping state.
//->if the other thread get into sleeping or waiting state
//  immediately interrupt call will be executed due to which
//  it results in interrupted Exception.

//eg: snake take revenge on a person movie. if sleeps sanke 
//will bite him.

//Example-1:
//class MyThread extends Thread
//{
//	@Override
//	public void run() {
//		try {
//			for(int i=1; i<=5;i++) {
//				System.out.println("I am sleeping thread "+i);
//				
//				Thread.sleep(3000);
//			}
//		}
//		catch(InterruptedException e) {
//			System.out.println("I got interrupted");
//		}
//	}
//}
//public class Multithreading43 {
//
//	public static void main(String[] args) {
//		MyThread t=new MyThread();
//		t.start();
//		
////	   ->main thread or parent thread is interrupting child thread.
//		t.interrupt();
//		
////		->at this line threre are 2 threads.
//		System.out.println("End of main method");
//
//	}
//
//}

//output:
//	End of main method
//	I am sleeping thread 1
//	I got interrupted
