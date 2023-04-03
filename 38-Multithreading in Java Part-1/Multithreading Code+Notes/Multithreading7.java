//case3:: Importance of Thread class start() method
//->For every thread, required mandatory activities like 
//  registering the thread with Threadscheduler will be taken 
//  care by Thread class start() method and programmer is 
//  responsible of just doing the job of the Thread inside 
//  run() method.
//->start() acts like an assistance to programmer.
//public void start()
//{
//    1. Register thread with ThreadScheduler
//    2. All other mandatory low level activities
//    3. invoke or calling run() method.
//}
//We can conclude that without executing Thread class start() method there is no
//chance of starting a new Thread in java.
//Due to this start() is considered as heart of MultiThreading.




//case4:
//If we are not Overriding run() method then Thread class run()
//method will be executed which has empty implementation and
//hence we wont get any output.
	
//->It is highly recomended to override run() method, 
//  otherwise don't go for MultiThreading concept.

//->What happens if run method is not overrided in User 
//defined class(MyThread1)?
	
///->MyThread1 Extends Thread class so run and start method 
//	in thread class will be inherited in MyThread1 class.
//->there is no logic inside run method of thread class.

//->thread class
//  public class Thread{
//    	 public void run() {
//    		 
//    	 }
//    	 public void start() {
//           // Logic internally available   		 
//    	 }
//  }

//Code
class MyThread1 extends Thread{                         
	
//overrided run method not presented in code. 
//the run method which in Thread clas will be inherited.
	
}
public class Multithreading7 {

	public static void main(String[] args) {
		
		MyThread1 t=new MyThread1();    
//		creating a new thread and starting a new thread which calls run( ) method.
		t.start();                     
//		Task-2
		for(int i=1;i<=10;i++) {        
			System.out.println("Main Thread"); 
		}

	}

}

//Conclusion
//->whenever multi-thread has to be there in code
// 1. Use thread class start() method only.
// 2. Override run method in defined job for thread.
