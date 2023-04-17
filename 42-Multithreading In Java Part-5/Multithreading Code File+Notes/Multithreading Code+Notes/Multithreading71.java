//=>Important points on Inter Thread Commnication

//->yield(), sleep(), join() methods are present in Thread 
//  class.
//        Type in cmd -> javap java.lang.Thread

//->wait(),notify(),notifyAll() methods are present in Object
//  class.  
//        Type in cmd -> javap java.lang.Object
//->Method prototype of wait(),notify(),notifyAll()
//1. public final void wait()throws InterruptedException
//2. public final native void wait(long ms)throws InterruptedException
//3. public final void wait(long ms,int ns)throws InterruptedException
//4. public final native void notify()
//5. public final void notifyAll()

//=>Note-
//  yield(),sleep(),join() => can't release the lock.
//  wait(),notify(),notifyAll() => will release the lock,
//  otherwise inter thread communication can't happen.

//->Once a Thread calls wait(), notify(), notifyAll() methods 
//  on any object then it releases the lock of that particular
//  object but not all locks it has.




//Interview Question
//->Method like wait(),notify(),notifyAll() are present 
//  inside Object class, y not in Thread class?
//                   or
//->Eventhough these methods in multithreading environment 
//  why this methods are not a part of Thread class?
//  Why they are part of Object class?

//Answer:

//->Thread will call wait(),notify(),notifyAll() on Objects 
//  like PostBox,Stack,Customer,Student,....
//-> obj.wait(),obj.notify(),obj.notifyAll()
//->These methods should be available for every object in 
//  java,if the method has to available for every object in 
//  java then those methods should come from "Object" class. 



