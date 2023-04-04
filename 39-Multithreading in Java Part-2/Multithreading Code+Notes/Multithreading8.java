//2nd Dec Live Class Multithreading Part-2
//Nithin sir | I worked on 4/3/23

//case-5:Overloading of run() method
//->we can overload run() method but Thread class start() 
//  will always call run() with zero argument.
//->if we overload run method with arguments, then we need 
//  to explicitly call argument based run method and it will 
//  be executed just like normal method.
//eg::
//class MyThread extends Thread{
//		public void run(){
//			System.out.println("no arg method");
//		}
//		public void run(int i){
//			System.out.println("zero arg method");
//		}
//}
//class ThreadDemo{
//		public static void main(String... args){
//			MyThread t=new MyThread();
//			t.start();
//		}
//}
//Output:: No arg method.

//=>1. Which run() method is called by JVM in below code?
//->the run method with zero arguments will be invoked.
//->start() method calls run method with zero parameters.


//class MyThread extends Thread{
//	public void run(){
//		System.out.println("No argumenet run method");
//	}
//	
//	public void run(int i)
//	{
//		System.out.println("int arg run method");
//	}
//}
//
//
//public class Multithreading8 {
//
//	public static void main(String[] args) {
//		MyThread t=new MyThread();
//		//Creating a new thread and starting a new thread which
//        //calls run() method.
//		t.start();
//		
//		//task for main thread
//		for(int i=0;i<5;i++) {
//			System.out.println("Main thread");
//		}
//	}
//}

//output:
//Main thread
//Main thread
//Main thread
//Main thread
//Main thread
//No argumenet run method

//2. How to call run method with parameter?
//we can call run() method with parameteres by giving 
//parameter to run method in run() method with zero parameter.
//
//class MyThread extends Thread{
//	public void run(){
//		System.out.println("No argumenet run method");
//		run(5);
//	}
//	
//	public void run(int i)
//	{
//		System.out.println("int arg run method");
//	}
//}
//
//
//public class Multithreading8 {
//
//	public static void main(String[] args) {
//		MyThread t=new MyThread();
//		//Creating a new thread and starting a new thread which
//        //calls run() method.
//		t.start();
//		
//		//task for main thread
//		for(int i=0;i<5;i++) {
//			System.out.println("Main thread");
//		}
//	}
//}

//Code Explaination
//->intially start method is called.
//->start method calls run method with zero parameters.
//->run method with zero parameter calls run method with 
//  parameters.
//->Code:
//	public void run(){
//		System.out.println("No argumenet run method");
//		run(5);
//	}


//3. we call run() method explicitly with parameter from 
//   main method.
//->Explicitly making call to run method.
//Code Explaiantion:
//->intially start method is called.
//->after calling start method in main method 
//->Run method with parameters is called.
//->Explicitly making call to run method with parameter
//->it is executed by main thread.
//->Code:
//		Explicitly making call to run method.
//		t.run(5);

//class MyThread extends Thread{
//	public void run(){
//		System.out.println("No argumenet run method");
//		run(5);
//	
//	}
//	
//	public void run(int i)
//	{
//		System.out.println("int arg run method");
//	}
//}
//
//
//public class Multithreading8 {
//
//	public static void main(String[] args) {
//		MyThread t=new MyThread();
////		Creating a new thread and starting a new thread which
////      calls run() method.
//		t.start();
//		
////		Explicitly making call to run method with parameter
////		it is executed by main thread.
//		t.run(5);
//		
//		//task for main thread
//		for(int i=0;i<5;i++) {
//			System.out.println("Main thread");
//		}
//	}
//}

//->Context switch will happpen beteween thread done by JVM 
//using concept thread sheduler context switching which is 
//called multi threading.

//Output 1: 
//int arg run method
//No argumenet run method
//int arg run method
//Main thread
//Main thread
//Main thread
//Main thread
//Main thread

//Output 2:
//No argumenet run method
//int arg run method
//Main thread
//Main thread
//Main thread
//Main thread
//Main thread

//->we can predict possible outputs in multi threading.
