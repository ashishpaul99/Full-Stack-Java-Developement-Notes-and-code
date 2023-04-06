//scenario-3 Marraige
//->these action depenedt on each other.
//->without fixing venue wedding card printing will not 
//  happen. 
//->t2 has to wait for t1. t2 will tell till ti1 completes 
//  it joinwiht t1.
//            t1.join();
//->t1 is in waiting state.
//->after completing t1 task it joins with t2.
//->t3 wating for t2 join.
//        t2.join().
//->after t3 join with t2 and executed then it comes to 
//  dead state.
//->all these occurr during execution.
//->see picture at 2:04:00

//           Venue              wedding            wedding
//           fixing           card printing         card
//                                                distribution
//              |                  |                  |
//           t1 |               t2 |              t3  |
//              |                  |                  |
//              |                  |                  |        
//              |----------------->|----------------->|
//                    t1.join()    |      t2.join()   |
//         dead state          dead state         dead state
//

//->if t1 executes t2.join() then t1 should should wait till 
//  t2 finishes its execution.
//->t1 will be entered into waiting state untill t2 completes, 
//  once t2 completes then t1 can continue with its execution.

//->eg#1
//venue fixing =====> t1.start()
//wedding card printing =====> t2.start()=====> t1.join()
//wedding card distrubution =====> t3.start()=====> t2.join()

//Prototype of join()
//===================
//public final void join() throws InterruptedException
//public final void join(long ms)throws InterruptedException
//public final void join(long ms,int ns)throws InterruptedException

//->Note: While one thread is in waiting state and if one 
//  more thread interupts then it would result in 
//  "InteruptedException".InteruptedException is 
//  checkedException which should always be handled.


//Case-1: Parent thread waits for Child thread.

//->let's make Parent thread to wait for Child thread.
//->Parent hread waits for Child thread and join with it.
//->After line t.join() Parent thead Parent thread enters in 
//  waiting state and thread sheduer gives time for available 
//  thread(Child thread).
//->till the execution of child thread parent thread waits 
//  for it.
//->thows keyword->Checked exception.
//->Compiler telling exception may occurr we have to handle 
//  this Exception.
//->we have write throw throws InterruptedException in 
//  main signature.
//->we see delay of executing loop in MyThread class because
//  thread.sleep() method.

//	try {
//				//pause the execution for 2 sec->2000 milli seconds
//				Thread.sleep(2000);
//			}
//			catch(InterruptedException e) {
//				
//			}





//Example-1
//class MyThread extends Thread
//{
//	@Override
//	public void run() {
//		for(int i=0;i<5;i++) {
//			System.out.println("Child thread");
//			try {
//				//pause the execution for 2 sec->2000 milli seconds
//				Thread.sleep(2000);
//			}
//			catch(InterruptedException e) {
//				
//			}
//		}
//	}
//}
//public class Multithreading35 {
//
//	public static void main(String[] args) throws InterruptedException  {
//		MyThread t=new MyThread();
//		t.start();
//		
//		t.join();
//		for(int i=0;i<5;i++) {
//			System.out.println("Parent thread");
//		}
//	}
//}

//output:
//Child thread
//Child thread
//Child thread
//Child thread
//Child thread
//Parent thread
//Parent thread
//Parent thread
//Parent thread
//Parent thread