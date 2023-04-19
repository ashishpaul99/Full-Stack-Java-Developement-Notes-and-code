//2. Live Lock
//->Traffic signal example.
//->thread waits for lock it may wait for sometime and it gets
//  lock after sometime.

//3. DeadLock vs starvation(Live lock)
//1. DeadLock-Long waiting of a thread, where waiting never 
//ends is termed "deadlock".
//2. starvation(Live lock) -Long waiting of a thread, where 
//   waiting ends at certain point is called "starvation".

//eg:Assume we have 1cr threads, where all 1cr threads have 
//priority is 10,but one thread is there which has priority 1,
//now the thread with a priority-1 has to wait for long time
//but still it gets a chance,but it has to wait for long time, 
//this scenario is called "Starvation".

//->see picture at 52:00
//               ____________
//              |            |------>1   priority-10
//              |    Obj1    |------->2  priority-10
//              |____________|------->3  priority-10
//                     |              
//                     |--------------->1 cr thread-> priority-1

//Note::
//->Low priority thread has to wait untill completing all 
//   priority threads but ends at certain point which is 
//   nothing but starvation.
 




public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
