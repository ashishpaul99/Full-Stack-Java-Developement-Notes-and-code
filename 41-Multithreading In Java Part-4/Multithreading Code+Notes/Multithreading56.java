//Lock Concept

//->there are 3 threads.
//->t1 thread make a call to m1() method.
//->t2 thread make a call to m2() method.
//->t3 thread make a call to m3() method.

//-->See picture at 1:46:00
//   Lock(t1)
//   Object-X
//     |             | 			|
//     |             | 			|
//     |             | 			|
//     |             | 			|
//     |             | 			|
//     t1           t2 		   t3
//    m1()         m2()        m3()
//synchronized  synchronized 

//class X{
//
//synchronized void m1(){}
//synchronized void m2(){}
//void m3(){}
//}

//->Interally for class one object willl be created. using 
//  that object internally lock will be applied.

//m1()->synchronized method
//m2()->synchronized method
//m3()-> normal method

//->t1 is applying up lock X-object
//->t2 has to wait for t1 to execute.
//->t3 don't need lock because it is not synchronized.

//KeyPoints
//=========
//1. if t1 thread invokes m1() then on the Object X lock will
//   applied.
//2. if t2 thread invokes m2() then m2() can't be called 
//   because lock of X object is with m1.
//
//3. if t3 thread invokes m3() then execution will happen 
//   because m3() is non-synchronized.
//-> Lock concept is applied at the Object level not at the
//   method level.
//7. Every object in java has a unique lock. Whenever we are 
//   using synchronized keyword then only lock concept will
//   come into the picture.
//8. If a Thread wants to execute any synchronized method on
//   the given object 1st it has to get the lock of that 
//   object.
//9. Once a Thread got the lock of that object then it's 
//   allow to execute any synchronized method on that object.
//10.If the synchronized method execution completes then 
//   automatically Thread releases lock.
//11.While a Thread executing any synchronized method the 
//   remaining Threads are not allowed execute any 
//   synchronized method on that object simultaneously. But 
//   remaining Threads are allowed to execute any 
//   non-synchronized method simultaneously. 
//->lock concept is implemented based on object but not based on
//  method.


//=>Synchronized Area vs NonSynchronized Area
//->Every object will have 2 area[Synchronized area and 
//  NonSynchronized area]
//1. Synchronized Area => write the code only to perform 
//   update,insert,delete.
//2. NonSynchronized Area => write the code only to perform 
//   select operation.
//example-1:
//class ReservationApp{
//			checkAvailablity(){
//			//perform read operation
//
//			}
//			synchronized bookTicket(){
//			//peform update operation
//
//			}
//}


//->see picture at 1:54:00
///Example-2
//->Object level lock is used in this application.
//->Many user use this application.
//->many users means many thread.

//       t1     t2      t3       t3
//       |      |       |        |
//       |      |       |        |
//       |      |       |        |
//       |	    |       |        |



//class RailwayReservationApp{
//	void serachTicket() {
//		//non sysnchronized region
//	}
//	void bookTicket() {
//       //synchronized region
//		
//	}
//}


//1. non sysnchronized region
//->this region operated by multiple threads simultaineously.
//->searching ticked is done in improper way. 
//->which is non sysnchronized.

//2. synchronized region is operated by one thread at a time.
//->All users cannot book ticket at a time. 
//->which is synchronized.
//->lock will be applied on bookTicket() method.

//=>Purpose of object level lock
//->One thread if it want to make a call to 
//  synchronized method then it needs object level lock. 

//=>Conclusion On Synchronization
//->If multiple threads are operating on multiple objects 
//  then there is no impact of Syncronization.
//->If multiple threads are operating on same java objects 
//  then syncronized concept is required(applicable).


