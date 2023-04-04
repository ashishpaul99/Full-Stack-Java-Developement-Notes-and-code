//Case-6: Overriding of start() method 
//->If we override start() then our start() method will be 
//executed just like normal method,but no new Thread will be 
//created and no new Thread will be started.
//->Multi threading is not implemented in this case.

//->It is never recomended to override start() method.
//->Overriding run method is our prime duty for giving task.

//How many threads are there in code and what is the output?
//->here start() method present in MyThread class is called.
//->there is no possiblity of creating new thread and informing
//  about it to thread sheduler.
//->since our class start() method is called, no new thread
  //is created.
//->Start method in MyThread is executed by main thread only.
//->Multi threading is not implemented here.
//->Multi threading is implemented only if the start method 
//  in Thread class is called.
//->Overriding run method is our prime duty for giving task.

    

//Code Explaination
//->Main thread calls the start() method which in MyThread 
//  class.
//->then start method in MyThread will be excuted and then the
//  task in main method get executed.
//->there is no context switchin in threads in these case 
//  because of single thread.

//class MyThread extends Thread{
//	@Override
//	public void start()
//	{
//		System.out.println("start method is called");
//	}
//	public void run(){
//		System.out.println("No argumenet run method");
//	}	
//}
//
//public class Multithreading9 {
//	public static void main(String[] args) {
//		MyThread t=new MyThread();
//  //->since out class start() method is called, no new thread
//  //is created.
//		t.start();
//		
//		//task for main thread
//		for(int i=0;i<5;i++) {
//			System.out.println("Main thread");
//		}
//	}
//}

//output:
//start method is called
//Main thread
//Main thread
//Main thread
//Main thread
//Main thread
