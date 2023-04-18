//5. Creating thread using anonymous inner class

//code expaianation:
//->creating object of class which implements Runnable and
//  overriding abstract method present in the class.
//  The reference is collection in Runnable type.
//->two .class files are created when we use annonymous inner
//  class.

//Runnable r=new Runnable() {
//			@Override
//			public void run() {
//				for(int i=1;i<=5;i++) {
//					System.out.println("Main thread");
//				}
//			}
//		};


//Code:

//public class Multithreading49 {
//
//	public static void main(String[] args) {
//
//		Runnable r=new Runnable() {
//			@Override
//			public void run() {
//				for(int i=1;i<=5;i++) {
//					System.out.println("Child thread");
//				}
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
//	Child thread
//	Child thread
//	Child thread
//	Child thread
//	Child thread

//alternative:

//code expaianation:
//->here creating object of thread for that thread passing 
//  Runnable interface object. here annonymous class object 
//  is passed.
//public class Multithreading49 {
//
//	public static void main(String[] args) {
//
//		Thread t=new Thread(new Runnable(){
//			@Override
//			public void run() {
//				for(int i=1;i<=5;i++) {
//					System.out.println("Child thread");
//				}
//			}
//		});
//		
//		
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
//	Child thread
//	Child thread
//	Child thread
//	Child thread
//	Child thread

//Alternative above code:

//Code Explianation
//->creating object of thread and pass implementation class 
//  of Runnable interface that to anonymous inner class 
//  object by mehtod chaining called start() method.

//new Thread(new Runnable(){
//			@Override
//			public void run() {
//				for(int i=1;i<=5;i++) {
//					System.out.println("Child thread");
//				}
//			}
//		}).start();



//Code:
//public class Multithreading49 {
//
//	public static void main(String[] args) {
//
//		new Thread(new Runnable(){
//			@Override
//			public void run() {
//				for(int i=1;i<=5;i++) {
//					System.out.println("Child thread");
//				}
//			}
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
