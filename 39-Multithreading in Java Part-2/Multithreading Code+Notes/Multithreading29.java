//-->Setting name of thread
//Example-3
//class MyThread extends Thread{
//	
//}
//public class Multithreading29{
//	public static void main(String[] args) {
//		String name=Thread.currentThread().getName();
//		//gives name of the thread which executes main
//		//thread
//		System.out.println("Main method is executed by-"+ name);
//	    
//		
//		MyThread t=new MyThread();
//		t.start();
//		//setting thread name
//		Thread.currentThread().setName("My thread");	
//		System.out.println("name of main thread changed to "+Thread.currentThread().getName());
//	}
//}

//output:
//	Main method is executed by-main
//	name of main thread changed to My thread

//Example-4 Before changing name
//class MyThread extends Thread{
//	
//}
//public class Multithreading29{
//	public static void main(String[] args) {
//		String name=Thread.currentThread().getName();
//		//gives name of the thread which executes main
//		//thread
//		System.out.println("Main method is executed by-"+ name);
//	    
//		MyThread t=new MyThread();
//		
//		System.out.println(10/0);
//  }
//}

//->In out we see exception is occurring in main method

//output:
//Main method is executed by-main
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Multithreading28.main(Multithreading28.java:149)

//Example-6: after changing name of the thread

//class MyThread extends Thread{
//	
//}
//public class Multithreading28{
//	public static void main(String[] args) {
//		String name=Thread.currentThread().getName();
//		//gives name of the thread which executes main
//		//thread
//		System.out.println("Main method is executed by-"+ name);
//	    
//		
//		Thread.currentThread().setName("ashish");
//		
//		
//		System.out.println(10/0);
//  }
//}

//->in output we see the name of the main method changed to 
//  main to ashish.

//output:
//Main method is executed by-main
//Exception in thread "ashish" java.lang.ArithmeticException: / by zero
//	at Multithreading28.main(Multithreading28.java:149)

//Example-7 : changing name of two threads.

class MyThread extends Thread{
	@Override
	public void run() {
		Thread.currentThread().setName("second thread");
		System.out.println("child thread name changed to "+Thread.currentThread().getName());
	}
	
}
public class Multithreading29{
	public static void main(String[] args) {
//		String name=Thread.currentThread().getName();
//		//gives name of the thread which executes main
//		//thread
//		System.out.println("Main method is executed by-"+ name);
	    
		MyThread t=new MyThread();
		t.start();
		
		Thread.currentThread().setName("First thread");
		System.out.println("Main method changed to "+Thread.currentThread().getName());
  }
}

//Output:
//Main method changed to First thread
//child thread name changed to second thread


