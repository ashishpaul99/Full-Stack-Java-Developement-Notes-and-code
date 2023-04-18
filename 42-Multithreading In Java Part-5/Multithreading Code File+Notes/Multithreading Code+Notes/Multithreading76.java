//=>Producer and Consumer Problem Example to understand 
//  synchronization

//->see pictue at 2:25:00
//                          _________
//                         |         |
//   Producer------------> |  item   |<-----------consumer
//    notify()             |_________|             wait()
//->there is one queue.
//->refernce of the object is q
//->there is one thread called Producer.
//->there is another thread called consumer.
//->Producer produce the item.
//->Cosumer consumes the item.
//->consumer waits for the item until it produce.
//->producer notify's when the item is produced.
//->wait() and notify() method is invoked on Queue object.
//->Queue is in built class in java.
//->if method has to available for every class then it should
//  come from its parent.
//->Object is parent for every class in java. 

//Code explaination:
//->produce the item to the queue and notify to the consumer.
//->consumer thread wait if queue object is empty and
//  when the item comes to queue it has to come out of 
//  waiting state.




//Producer => produce the item and update in the Queue
//Consumer => consume the item from the Queue

//class Producer extends Thread{
//		Producer(){
//			synchronized(q){
//				produce the item and update it to queue
//				q.notify();
//			}
//		}
//	}
//	class Consumer extends Thread{
//		Consumer(){
//	synchronized(q){
//		if(q is empty){
//			q.wait();
//		}else{
////			consume the item from the queue
//		}
//	}
//}

//=>Differnece Between notify and notifyAll()
//->see picture at 2:36:00

//                          _________
//          t1-------------|         |-----------t2
//          t3-------------|  Obj    |-----------t4
//          t4-------------|_________|-----------t5    

//->multiple  threads acting on object.
//->if notify calls on object then notification will be sent 
//  to all the threads, but only one thread will get a chance
//  for execution,which thread totally depends on Thread sheduler.

//->see picture at 2:45:00
//1.notify() is used to give norification to one thread. if 
//  there are multiple waitIng threads, then one thread will 
//  get a chance, reaming threads should wait for further 
//  notification but which thread will get a chance it totally 
//  depends on T.S
//->But which Thread will be notify(inform) we can't expect 
//  exactly it depends on JVM.

//	eg: 	              waiting state
//				   |
//          	                   | obj.wait(); 6 threads are waiting
//                    obj.notify() |
//				   |
// 	                        Running state
//Among 6 threads which thread will get a chance we don't 
//have control over that it is decided
//by JVM(threadscheduler).

//2. notifyAll() is used to give to notification to all 
//  waiting threads. all waiting threads will be notified 
//  and it will be exeuted one by one.
//                        or
//->We can use notifyAll() method to give the notification
//  for all waiting Threads of particular object. All waiting 
//  Threads will be notified and will be executed one by one,
//  because they required lock.

//->remember train example benguluru  to Belgaum
//eg:				 waiting state
//					|
//					| obj.wait(); 6 threads are waiting
//		       obj.notifyAll()  |
//                                      |
//                                   Running state

//Note: On which object we are calling wait(), notify() and 
//notifyAll() methods that corresponding object lock we have
//to get but not other object locks.


//->When notifyALL() method is called on objects Obj1 and Obj2
//  all is call for how many thread notification will be send. 

//scenario-1
//                          _________
//          t1-------------|         |-----------t2
//          t3-------------|  Obj1   |-----------t4
//          t4-------------|_________|-----------t5 

// Obj1.notifyAll()- it gives notification to all threasds. 

//scenario-2
//                          _________
//          t1-------------|         |-----------t2
//          t3-------------|  Obj2   |
//                         |_________|


//=>IllegalMonitorStateException Example

//Example-1 
//=>we have two stack objects.
//->if you use s2 inside synchroized block of s1 it result
//  throws IllegalMonitorStateException

//import java.util.*;
//
//public class Multithreading76 {
//
//	public static void main(String[] args) throws InterruptedException {
//		Stack s1=new Stack();
//		Stack s2=new Stack();
//		
//		synchronized(s1){
//
//			s2.wait(); //RE: IllegalMonitorStateException
//
//		}
//		
//	}
//}


//Example-2: valid case
//->it is allowed use s2 inside the synchronized block of s2.
import java.util.*;

public class Multithreading76 {

	public static void main(String[] args) throws InterruptedException {
		Stack s1=new Stack();
		Stack s2=new Stack();
		
//		synchronized(s1){

//			s2.wait(); //(valid)

//		}
		
		synchronized(s2){   

			s2.wait();

		}
	}
}

//=>Question based on lock
//1. If a thread calls wait() immediately it will enter into
//   waiting state without releasing any lock.(false)
//2. If a thread calls wait() it releases the lock of that 
//   object but may not immediately (false)
//3. If a thread calls wait() on any object,it releases all 
//   locks acquired by that thread and enters into waiting 
//   state(false).
//4. If a thread calls wait() on any object,it immediately 
//   releases the lock of that particular object and entered
//   into waiting state(true).
//5. If a thread calls notify() on any object,it immediately releases the lock of
//   that particular object(invalid)
//6. If a thread calls notify() on any object,it releases 
//   the lock of that object but may not immediately(true)

