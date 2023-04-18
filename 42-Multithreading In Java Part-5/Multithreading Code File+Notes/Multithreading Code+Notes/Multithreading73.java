//=>Inter Thread Communication  Example
//->The total information at any given point of time should 
//  be accessed only by one thread the data present in varible 
//  should given to main thread or the information stored in 
//  total variable should share with main thread.
//->here sum of 100 numbers logic is written in run() method.
//->keep logic part in synchronized block.
//example:
//        synchronized(this) {
//		System.out.println("Child thread started the calculation");
//		for(int i=1;i<=100;i++) {
//			total+=i;
//		}
//		System.out.println("Child thread giving notification call");
//		this.notify();
//	
//	   }
//->child thread starts calculates and gives total.
//->Once total is calculated it child thread should give 
//  notification main thread.
//->notify should called on object.
//->notify should called by ThreadB object which is current 
//  object.
//             this.notify();
//->When we start thread main thread should wait till the 
//  child thread get executed.
//->Main thread should wait on b(Object of ThreadB).
//->Main thread enters into waiting state util it get 
//  notification or lock from child thread.
//->After doing task ThreadB class child thread notify's
//  main thread.
//->until lock gets for main thread it is in another waitng 
//  state.
//->At Line-1 there are two threads.
//    a. Main  thread
//    b. Child thread
//->Priority of the two threads are same. it is 5.
//->Even though prorities are same preference is given to 
//  main thread.
//->At Line-2 Object level lock is applied on object b
//        synchronized(b){
//
//        }



//Code Explaination:
//step-1
//->when main thread calls wait method it enters into 
//  waiting state.
//eg:
//	synchronized(b) {
//		System.out.println("Main thread calling wait() method");
//		b.wait();
//		System.out.println("Main thread got notification call");
//		System.out.println(b.total);
//	}
//->main thread release the lock of b and enters into waiting 
//  state beacuse lock of b is required by one more thread.

//step-2
//->Child thread needs the lock of b.
//->b is not local in ThreadB class "this" is used.
//eg:
// synchronized(this) {
//		System.out.println("Child thread started the calculation");
//		for(int i=1;i<=100;i++) {
//			total+=i;
//	}
//->Child thread starts calculation.
//->In total variable the result available.

//step-3
//->child thread release the lock when it calls notify method.

//step-4
//->waiting thread or main thread gets the lock or recives 
//  the notification from child thread.

//Code: Inter Thread Communication 
class ThreadB extends Thread
{

  //the info in total variable should shared to main thread
	int total=0; 
	
//	calculating sum of 100 numbers
	@Override
	public void run() {
		synchronized(this) {
		System.out.println("Child thread started the calculation");//step-2
		for(int i=1;i<=100;i++) {
			total+=i;
		}
		System.out.println("Child thread giving notification call");//step-3
//->notify should called by ThreadB object which is current object.
		this.notify(); 
	
	   }
	}
}
public class Multithreading73 {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b=new ThreadB();
		b.start(); //-->Line-1
		
//	    two threads are present here->Main thread(5), Child therad(5)	
//		main thread should wait on b
		synchronized(b) {  //-->Line-2
			System.out.println("Main thread calling wait() method");//step-1
			b.wait();     //-->Line-3
			System.out.println("Main thread got notification call");//step-4
			System.out.println(b.total);
		}
	}
}

//output:
//	Main thread calling wait() method
//	Child thread started the calculation
//	Child thread giving notification call
//	Main thread got notification call
//	5050


//->see picture at 1:39:00
//Thread Sheduler
//  _________|_________
//|                   |
//main               Thread-0

//->there are two threads 
//a. Main thread
//b. Child thread(Thread-0)

//->both thread should spealk with b object and needs value total.
//->Main thread needs total after calculation.
//->Main thread calls wait() method. main thread enters into 
//waiting state.
//b.wait();
//->Child thread do the calculation.
//->then child thread calls notify method.
//b.notify();
//->Child thread send notification to main thread.
//->Lock may or may not release immediately.
//->Main thread waited for the lock to be released from the 
//other thread, once the lock is released it will use threadB
//total variable.


