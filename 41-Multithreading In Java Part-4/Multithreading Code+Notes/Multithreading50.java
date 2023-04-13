//Alternative for previous code
//->Only one .class file is present.
//->Lambada Expression mapping to Runnable interface.
//	new Thread(() -> {
//			
//				for(int i=1;i<=5;i++) {
//					System.out.println("Child thread");
//				}
//			
//		}).start();

//Code:

//public class Multithreading50 {
//
//	public static void main(String[] args) {
//		new Thread(() -> {
//			
//				for(int i=1;i<=5;i++) {
//					System.out.println("Child thread");
//				}
//			
//		}).start();
//		
//		
//	
//		
////		main thread task
//		for(int i=0;i<=5;i++) {
//			System.out.println("Main Thread");
//		}	
//	}
//
//}

//output:
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Main Thread
//	Child thread
//	Child thread
//	Child thread
//	Child thread
//	Child thread
