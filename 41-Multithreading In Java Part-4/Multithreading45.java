//Case-3:main thread or parent thread is interrupting child 
//thread. here Child thread is doing some task and enter into 
//sleeping state.
//->after child thread goes into sleep state interruption is
//  occurred.


//                Thread Sheduler
//         	      _______|________         
//         	     |                |
//    	    main thread        thread-0->( enters Sleeping after doing task)
//               |           (child thread)
//t.interrupt()  |                | 
//           	 |                |
//								  |
//						  sleeping state


//class MyThread extends Thread
//{
//	@Override
//	public void run() {
//		for(int i=1; i<=5;i++) {
//			System.out.println("I am a lazy thread "+i);
//				
//		}
//		System.out.println("Entering into sleeping state");
//		try {
//			Thread.sleep(3000);
//		}
//		catch(Exception e) {
//			System.out.println("I got interrupted");
//		}
//	}
//}
//public class Multithreading45 {
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

//output:
//	I am a lazy thread 1
//	I am a lazy thread 2
//	I am a lazy thread 3
//	I am a lazy thread 4
//	I am a lazy thread 5
//	Entering into sleeping state
//	I got interrupted
