//Case-1: Multiple threads are operating on same java objects
//->see picture at 58:00
//            Thread Sheduler
//          ________|__________
//         |        |          |
//       main       t1         t2
//      thread  
//       (5)       (5)        (5)
//         |
//         |
//    dead state

//->All threads are with same priority. becaause they are 
//  inherited.
//->Parent thread quickly enter into dead state no statement
//  in main to execute.
//->t1 thread executes tasks and sleeps for 2 sec.
//->when t1 enters into sleep state then context swiching 
//  will happen.
//->then t2 starts its exection on same object.
//->in this way time will be swaped between two threads and
//  it make sure all the time whatever allocate by os to 
//  java program is Completely utilized.


//Code Explaination:
//->for t1 thread we passed d and sachin
//MyThread t1=new MyThread(d,"sachin"); 
//t1.start();

//->On same display object another thread t2 is executed.
//with d and dhoni as arguments.
//MyThread t2=new MyThread(d,"Dhoni"); 
//t2.start();

//->after t1.start(); there are two threads
//    a. Main thread
//    b. Child thread-1(t1)
//->after t2.start(); there are three threads 
//    a. Main Thread
//    b. Child Thread-1(t1)
//    c. Child Thread-2(t2)

//Note::
//->As noticed there are 2 threads which are trying to operate
// on single object called "Display".
//->we need synchronization to resolve the problem of
// "Datainconsistency".

//Ouput: 
//->As noticed below the output is irregular because
//  at a time on a resource called wish() method.
//->2 threads are acting simulataneously.

//Code:

//class Display
//{
//	public void wish(String name)
//	{
//		for (int i=1;i<=10 ;i++ )
//		{
//			System.out.print("Good Morning: ");
//			try{
//				Thread.sleep(2000);
//			}
//			catch (InterruptedException e){
//			}
//
//			System.out.println(name);
//		}
//	}
//}
//class MyThread extends Thread{
//	Display d; //->Has-A Relationship 
//	String name;
//	MyThread(Display d,String name){
//		this.d=d;
//		this.name=name;
//	}
//	
//	@Override
//	public void run() {
//		d.wish(name);
//	}
//}
//public class Multithreading52 {
//
//	public static void main(String[] args) {
////	  ->Creating Object of display is created.
//	    Display d=new Display();   //->Line-1
//	    
////	  ->Creating Object of MyThread.
//	    MyThread t1=new MyThread(d,"sachin");  //->Line-2
//	    MyThread t2=new MyThread(d,"Dhoni");
//	    t1.start(); //-->Line-3
//	    t2.start(); //-->Line-4
//	}
//}

//output:
//	Good Morning: Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Dhoni


