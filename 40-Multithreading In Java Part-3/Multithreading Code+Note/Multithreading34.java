
//2. join() Method
//->If the thread has to wait untill the other thread finishes
//  its execution then we need to go for join().


//Example-
//scenario-1
//            Hyder sir(java)       	     Nithin sir(JEE)
//                  |             		       		 |
//       10:00am    |           	  	 	10:00am  |      
//          |       | t1(waiting state) 	   |     |t2
//          |       |                          |     |
//        10:45     |                       10:45    |
//                                             |
//              Person-A                    12:00am Person-B
//                                                   |
//                                                   | t1.join()


//->hyder sir and nithin sir taking classes for different 
//  batches.
//->there are common firend in batch.
//->sessions are take from 10:00am to 10:45am
//->in case of nithin sir said session will be 
//  extended to 12:00am.
//->two common friends staying in same PG
//->Person A waits upto 12:00am for person-B after that the
//  will continue journey.
//->changing names to t1 and t2.
//->Let t2 finishes exection then t1 joins with t2. 
//                   t1.join()
//->t1 is in waiting state and joins with t2.
//->t2 calling join method. after t1 comes t2 joins.

//scenario-2
//->Another person-c approched person-A while in waiting state.
//->Person-c is disturbing Person-A. then Person-A and C will
//  continue there journey. 
//->it is an interruption.
//->it is called interruptedException.

// public final void join() throws InterruptedException

//->Note: While one thread is in waiting state and if one 
//  more thread interupts then it would result in 
//  "InteruptedException".InteruptedException is 
//  checkedException which should always be handled.



//waiting cases of t1
//1. till class gets over t1 waits.
//2. exactly 30min t1 waits
//3.exactly 30min 45 sec t1 will wait
//->these senarios may seen while waitng.
//->after waiting state is over then super state.

//->we have three methods to map.

//=>Prototype of join()
//1. public final void join() throws InterruptedException
//2. public final void join(long ms)throws InterruptedException
//3. public final void join(long ms,int ns)throws InterruptedException

//->ms-millil seconds
//->ns-nano seconds

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

public class Multithreading34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
