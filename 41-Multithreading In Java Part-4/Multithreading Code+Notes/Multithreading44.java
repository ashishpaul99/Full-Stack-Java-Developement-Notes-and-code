
//Case-2:main thread or parent thread is interrupting child 
//thread. here child is not entering in sleeping and waiting 
//state.
//->main thread calls interrupt method.
//->after child thread is executed it goes into dead state.
//->there is no use with interrupt call in this case.
//->interuppt call is wasted in this case.

//eg:snake and man movie. if person dies naturally it will 
//   not do anything it just goes away.

//          	   Thread Sheduler
//         	      _______|________         
//         	     |                |
//    	    main thread        thread-0->( No Sleeping /waiting state)
//               |           (child thread)
//t.interrupt()  |                | running state
//           	 |                |
//								  |
//                         

//Example-1:
//class MyThread extends Thread
//{
//	@Override
//	public void run() {
//		try {
//			for(int i=1; i<=5;i++) {
//				System.out.println("I am sleeping thread "+i);
//				
//			}
//		}
//		catch(Exception e) {
//			System.out.println("I got interrupted");
//		}
//	}
//}
//public class Multithreading44 {
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
//	}
//}
//
//output:
//	End of main method
//	I am sleeping thread 1
//	I am sleeping thread 2
//	I am sleeping thread 3
//	I am sleeping thread 4
//	I am sleeping thread 5
