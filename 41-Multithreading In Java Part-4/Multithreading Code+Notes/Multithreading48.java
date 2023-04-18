//=>4. Creating thread using Lambda expression

//code expaianation:
//->object of runnable interface is created.
//Runnable r=()->{
//
//				for(int i=0;i<=5;i++) {
//				System.out.println("child thread");
//			}
//		};


//Code:
/*
  @FunctionalInterface
  interface Runnable{
      void run(){
      
      }
   }
   
 */

//public class Multithreading48 {
//
//	public static void main(String[] args) {
//
////->Runnable interface run method. run method will accept not
////  any argument.
////->object of runnable interface
//		Runnable r=()->{
//
//			for(int i=0;i<=5;i++) {
//				System.out.println("child thread");
//			}
//		};
//		
//		Thread t=new Thread(r);
//		t.start();
//		
////		main thread task
//		for(int i=0;i<=5;i++) {
//			System.out.println("Main Thread");
//		}	
//	}
//}

//output:
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	child thread
//	child thread
//	child thread
//	child thread
//	child thread
