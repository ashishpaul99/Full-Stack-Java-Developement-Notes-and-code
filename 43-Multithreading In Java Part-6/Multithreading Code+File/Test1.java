
//8th Dec Live Class Multithreading 06 And Summary revision of core Java
//Nithin sir |I did this lecture on 19/04/24

//Lock Concept
//->Synchronization
//->Synchronization applied on method level and block level.


//1. DeadLock
//->If 2 Threads are waiting for each other forever(without end)
//  such type of situation (infinite waiting) is called dead 
//  lock.
//->There are no resolution techniques for dead lock but 
//  several prevention(avoidance) techniques are possible.
//->Synchronized keyword is the cause for deadlock hence 
//  whenever we are using synchronized keyword we have to 
//  take special care.

//working with synchronization need a lock.
//Lets say 
//->Thread t1 applied lock and it is using the lock to 
//  execute the code.
//->Thread t2 waiting for the lock, so it can execute the 
//  code.

//->if thread t1 does not releases the lock then thread t2 
//  continues to waits forever.
//->these condition of waiting forever for lock we call it as
//  Dead Lock
//->make sure synchronized keyword is properly so that 
//  dead lock is avoided.


//Example-1: No Dead Lock Casee->Executing task without synchronization.


//Code explaination:
//->Threads sheduler give chance to main thread and main 
//  thread starts its execution.
//->we have two classes
//  1. class A
//  2. class B
//->two classes are exectued by threads.
//->class-A contains two methods 
//  1. d1(B b)
//  2. last()

//->class-B contain two methods 
//  1. d1(A b)
//  2. last()

//->Objects of class A and B
//        A a=new A();
//		  B b=new B();

//->when we tell t.m1()

//->m1 method in class Test will get executed by main thread.
//->at Line this.start(); current object start method is called.
//->here current object is Thread due to which one more thread 
//   will be created.

//   public class Test1 extends Thread {
//		A a=new A();
//		B b=new B();
//		public void m1(){
//			this.start();
//			a.d1(b);//executed by main thread
//        }
//		public void run(){
//			b.d2(a);//executed by child thread
//		}

//->a.d1(b) is executed by main thread.
//->b.d2(a) is executed by child thread.

//->Lock is not required in this case.
//->main threads executes object A
//->child thread executes object B


//->main thread sleeps for 5 secs then thread sheduler gives
//  chance to child thread.
//->if child thread sleeps for 5 sec thread sheduler gives
//  chance to main thread.
//->context is between two threads.
//->we cannot get expected output due to context switching.
//->cpu time is utilized properly for execution.

//->since methods are not synchronized,lock is not requried,
//  so no deadlock

//->see picture at 34:00
//             Thread sheduler
//           _________|__________
//          |                    |
//         main               Thread-0 ->this thread is created when this.start() method 
//                                       is called in m1() method which is in class Test
//  main thread sleeps 
//  for 5 secs

//->   Lock is not requires     Lock is not requires 
//         class-A             		class-B
//            |                   	   |
//            |                        |
//            |                        |
//         d1(B b)                  d1(A a)
//        last() method           last() method
                 



//class A {
//	public void d1(B b){
//		System.out.println("Thread-1 starts execution of d1()");
//		try{
//			Thread.sleep(5000);//5sec
//		}
//		catch (InterruptedException e){
//		}
//		System.out.println("Thread-1 trying to call B last()");
//		b.last();
//	}
//	public void last(){
//		System.out.println("Inside A last() method");
//	}
//}	
//class B {
//		public void d2(A a){
//			System.out.println("Thread-2 starts execution of d2()");
//			try{
//				Thread.sleep(5000);//5sec
//			}
//			catch (InterruptedException e){
//			}
//			System.out.println("Thread-2 trying to call A last()");
//			a.last();
//		}
//		public void last(){
//			System.out.println("Inside B last() method");
//		}
//}
//	public class Test1 extends Thread {
//		A a=new A();
//		B b=new B();
//		public void m1(){
//			this.start();
//			a.d1(b);//->executed by main thread
//        }
//		public void run(){
//			b.d2(a);//->executed by child thread
//		}
//	public static void main(String[] args){
//			Test1 t=new Test1();
//			t.m1();
//
// }
//}
	
//output:
//		Thread-1 starts execution of d1()->thread-1 executes
//		Thread-2 starts execution of d2()->thread-2 executes 
//		Thread-1 trying to call B last() ->thread-1 executes
//		Inside B last() method           ->thread-2 executes
//		Thread-2 trying to call A last() ->thread-2 executes
//		Inside A last() method           ->thread-1 executes


