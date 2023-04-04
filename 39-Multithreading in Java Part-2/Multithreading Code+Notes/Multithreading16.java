//Code-3:Creating thread using runnable interface.
//->in this code we use public java.lang.Thread(java.lang.Runnable)
//  Constructor for creating thread using runnable interface.
// ->it calls start method of Thread class but it will invoke run method of MyRunnable class.
// ->the run method inside MyRunnable class get executed.
// ->implentation of Multi Threaidng is done in below code.

//->Previously thread constructor with zero parametrer start() method calls run method present in 
//  thread class.
//->but we want run method present in MyRunnable class.
//->tell to thread class to take start method from Thread 
//  class execute run method from my runnable.

//How to tell?
//->we have to ask develper who wrote the API code.

//Note-
//->Type in cmd javap java.lang.Thread
//->here we see constructor of thread
//1. public java.lang.Thread();
//->thread class start(), followed by thread class run()
//->previously we use this constructor to create a thread.
//->if we use this constructor and call start method it 
//  calls run method present in Thread class.

//2. public java.lang.Thread(java.lang.Runnable);
//->thread class start(), followed by implementation class of 
//  Runnable run()
//->if we create a Thread object like this it calls start()
//  Thread class but it will call run method form implementation
//  of runnable.


//Code Explaination
//->in this code we use public java.lang.Thread(java.lang.Runnable)
//  Constructor for creating thread using runnable interface.

//1.MyRunnable object is created.
//   MyRunnable r=new MyRunnable();

//2.creating Thread for MyRunnable run method()
// it calls start method of Thread class and invokes run 
// method of MyRunnable class. 
//   Thread t=new Thread(r);
//   t.start();
//3. Thread is created after line calling start method.
//   After this line 2 threads are there
// 1. Main Thread
// ->task in main method is executed by main thread.

// 2. User defined Thread
// ->task in run method of MyRunnable Class is executed by 
//   user defined thread.

//->Context switching in thread will happen beacuse of 
//  Multithreading.



//      interface Runnable{
//    	public abstract void run();
//    		
//    	
//      }
//      class Thread implements Runnable{ //Adapter class
//    	public void start()
//    	{
//    		1. Register the thread with ThreadScheduler
//    		2. All other mandatory low level activities(memory level)
//    		3. invoke or call run() method
//    	}  
//      public void run() {
//    	  
//      }
//    }


class MyRunnable implements Runnable{
	
	@Override
	public void run(){
		for(int i=1;i<5;i++) {
			System.out.println("Child Thread");
		}
	}	
}

public class Multithreading16{
	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();    //->Line-1
		
//		creating thread using thread constructor with 
//		parameter
		Thread t=new Thread(r);           
		t.start();
		
//		at this there are 
		
		for(int i=1;i<5;i++) {
			System.out.println("Main Thread");
		}	
	}
}

//output:
//Main Thread
//Child Thread
//Main Thread
//Main Thread
//Main Thread
//Child Thread
//Child Thread
//Child Thread
