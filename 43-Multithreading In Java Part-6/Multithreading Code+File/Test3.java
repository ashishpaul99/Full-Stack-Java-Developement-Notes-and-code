//Example-2: Dead Lock Condition 

//->see picture at 34:00
//             Thread sheduler
//           _________|__________
//          |                    |
//         main               Thread-0 ->this thread is created when this.start() method 
//                                       is called in m1() method which is in class Test
//  main thread sleeps 
//  for 5 secs

//->see picture at 43:00

//           main thread             thread-0(child thread)
//            class-A             		class-B
//               |                   	   |
//               |                         |
//               |                         |
// synchronized d1(B b)     synchronized d1(A a)
//           a.last();                   b.last()
//           
// synchronized last() method   synchronized  last() method


//Code Explaination:
//-> d1() and d2() methods are synchronized.
//->last() methods in class A and B are synchronized.
//->if main thread wants to make a call to last() method 
//  of b then it needs lock of object-B. or C lock
//     b.last();
//->if child thread wants to make a call to last() method 
//  of a then it needs lock of object-A or A lock
//     a.last();
//->main thead have A- lock to execute d1()
//  method present in class-A and it also need B-lock to
//  execute last() method in class-B

//->Child thread have b-lock to execute d2()
//  method which presrent in class-B and it also need A.lock
//  to execute last() method in class-A

//->main thread and child thread waits forever in this case.
//->it results in dead lock.


//=>Role of thread-t1(main thread)
//t1 => starts d1(),since d1() is synchronized and a part of
//'A' class so t1 applies lockof(A) and starts the execution, 
//while executing it encounters Thread.sleep().so T.S gives
//chance for t2 thread.

//->After getting a chance again by Thread sheduler, it 
//tries to execute b.last(). but lock of b is with t2 thread,
//so t1 enters into waiting state.

//=>Role of thread-t2(Child thread)
//->t2 starts d2(),since d2() is synchronized and a part of 
//  'B' class so t2 applies lockof(B) and starts the 
//   execution, while executing it encounter Thread.sleep(),
//   so TS gives chance again for t1 thread.
//->After getting a chance again by TS, it tries to execute
// a.last but lock of a is with t1 thread, so t2 enters into
// waiting state.

//->Since both the threads are in waiting state and it would 
//  be waiting for ever,so we say the above pgm would result 
//  in "DeadLock".

//Note:
//->synchronized is the only reason why there is a deadlock,
//  so we should be careful when we use synchronized keyword,
//  if we remove atleast one synchronized word then the 
//  program wont enter into dead lock.


//Code:
class A {
	public synchronized void d1(B b){
		System.out.println("Thread-1 starts execution of d1()");
		try{
			Thread.sleep(5000);//5sec
		}
		catch (InterruptedException e){
		}
		System.out.println("Thread-1 trying to call B last()");
		b.last();
	}
	public synchronized  void last(){
		System.out.println("Inside A last() method");
	}
}	
class B {
		public synchronized void d2(A a){
			System.out.println("Thread-2 starts execution of d2()");
			try{
				Thread.sleep(5000);//5sec
			}
			catch (InterruptedException e){
			}
			System.out.println("Thread-2 trying to call A last()");
			a.last();
		}
		public synchronized void  last(){
			System.out.println("Inside B last() method");
		}
}
	public class Test3 extends Thread {
		A a=new A();
		B b=new B();
		public void m1(){
			this.start();
			a.d1(b);//->executed by main thread
        }
		public void run(){
			b.d2(a);//->executed by child thread
		}
	public static void main(String[] args){
			Test3 t=new Test3();
			t.m1();

 }
}
	
//output:
//	Thread-1 starts execution of d1()
//	Thread-2 starts execution of d2()
//	Thread-1 trying to call B last()
//	Thread-2 trying to call A last()


