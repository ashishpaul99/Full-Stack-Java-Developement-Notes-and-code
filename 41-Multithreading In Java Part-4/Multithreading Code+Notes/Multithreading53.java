//Example-1: Printer 

//see picture at 01:01:00
//		 Display
//     _____|_____
//    |           |
//   t1           t2
//  maths        science

//->Assume Display method as printer.
//->t1->maths department
//->t1 do task of printing maths paper.
//->t2->Science department
//->t2 do task of printig science book.
//->doing tasks simultaineously.
//->it will be problem if output is irregular.
//->even in multithreading sometime prime importnce is not 
//  given for effective utilization of cpu time but even 
//  cpu time get wasted.
//->importace is given to  one line execution to Completely 
//  finish its task.

//=>Problem occurs when multiple threads are simultaineously 
//  working together.
//->in above example Data inconsistency problem occurs if two 
//  threads executing simultaineously.

//Laymen example
//->see picture at 1:05:00
//->Biryani plate example
//->keep biryani plate on road. dogs are comming either sides
//  and eat it.
//->All dogs pulling from all sides. biryani get messed up.
//->this problem occurs many dogs are pulling.
//->this problem is called BiryaniInconsistencyProblem.
//->Display method is like biryani plate. two thread are two
//  dogs.
//->Data inconsistency problem is occurred.
//->solution for this problem.
//->make sure to allow one dog at time to eat.


//->see picture at 1:14:00
//		          Display
//             _____|_____
//Lock(t1)    |           |
//            |           |
//            |           |
//            |           |
//            |           |
//Release     t1           t2
//Lock(t1) maths        science

//=>Solution for the problem
//->At a time make sure one thread to operate on the object.

//=>Exection of thread t1
//->In order to do this put a lock when one threads(t1) starts
//  executing and allow thread to complete task completely.
//->If thread sheduler want to assign task to other thread(t2) 
//  due to execution of previous thread(t1) is lazy it is not 
//  possible for assigned thread(t2) to do task while one 
//  thread(t1) is doing it. beacause the previous thread(t1)
//  is locked.
//->until one thread executes(t1) task Completely the other 
//  thread(t2) will be in waiting state.
//->when execution started the thread get locked.
//->After completing the task  t1 thread releases the lock 
//  and comes out.

//=>Execution of thread t1
//->after exection of the thread t1 the thread t2 get chance
//  to execute.
//->then before exetuion thread t2 get locked.
//->After completing the task  t2 thread releases the lock 
//  and comes out.

//How to apply Lock on threads?
//->Apply Lock on method on which thread multiple threads 
//  are operated.
//->In below example threads are acted on wish() method.
//->here lock is applied on wish() method.
//->by writing synchronized before method type we lock the
// threads.

//eg:
//	public synchronized void wish(String name)
//		{
//			for(int i=1;i<=5;i++) {
//				System.out.print("Good Evening:");
//				try {
//					Thread.sleep(2000);
//				}
//				catch(InterruptedException e) {
//			
//				}
//				System.out.println(name);
//	  	}

//Disadvantages of Locking threads
//->One thread has to wait till the other thread completes 
//  its execution.
//->Ṭhis locking concept increases waiting time.
//->when waiting time get increased performance is low.

//=>StringBuffer(synchronized) vs StringBuilder(1.5v)
//->StringBuffer is synchronized.
//->At a time one thread will be operated on StringBuffer 
//  object.
//->One thread has to wait the thread to complete the task.
//->here performance is low.
//->to overcome this problem StringBuilder is introduced in 
//  1.5 version. 
//->if only one thread is operated that thread is safe.
//  data inconsistency problem will never come.
