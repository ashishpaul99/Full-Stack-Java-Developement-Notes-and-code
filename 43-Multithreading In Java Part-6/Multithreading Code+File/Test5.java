//4. Daemon Thread-
//->Daemon thread in Java is a low-priority thread that
//  performs background operations such as garbage collection,
//  finalizer, Action Listeners, Signal dispatches, etc. 
//->Daemon thread in Java is also a service provider thread
//  that helps the user thread.
//->The thread which is executing in the background is 
//   called "DaemonThread".
//eg: AttachListener,SignalDispatcher,GarbageCollector,....

//remember the Laymen example of movie
//1. producer
//2. director
//3. music director
//4. ....
//5. ....
//6. ....

//->hero and heroin ->main thread
//->make up artist  ->supporting thread

//=>4.1 MainObjective of Daemon Thread
//->The main objective of DaemonThread, to provide support
//  for Non-Daemon threads(main thread).
//eg:if main threads runs with low memory then jvm will call
//   GarbageCollector thread, to destroy the useless objects,
//   so that no of bytes of free memeory will be improved 
//   with this free memory main thread can continue its 
//   execution.

//->Usually Daemon threads having low priority,but based on
//  our requirement daemon threads can run with high priority also.
//->JVM => creates 2 threads
//a. Daemon Thread(priority=1,priority=10)
//b. main (priority=5)

//->while executing the main code, if there is a shortage of 
//memory then immediately jvm will change the priority of 
//Daemon thread to 10, so Garbage collector activates Daemon
//thread and it frees the memory after doing it immediately
//it changes the priority to 1, so main thread it will continue.




//=>4.2 How Daemon Thread works?


//           Thread Sheduler
//          ________|__________
//         |                   |
//        Main             Daemon Thread or supporting thread
//                         eg:Garbage collector Thread) 
//      Prority-5          Prority-10           


//->Thread sheduler gives chance to main thread.
//->main thread is starts execution.
//->when main thread is executed memory is used in heap region and 
//  heap is getting full and java make sures its application
//  won't fail due insufficientMemory.
//->what is insufficientMemory?
//->When heap area and stack area is full so that it will not
//  give the service to next client or user.
//->whenever there is insufficient memory problem occurs then
//  thread sheduler tell another thread to start it's
//  execution.

//Example-1: Garbage Collector
//->Garbage Collector is a Daemon thread that keeps running 
//  in the background. Basically, it frees up the heap memory 
//  by destroying the unreachable objects. Unreachable objects
//  are the ones that are no longer referenced by any part of 
//  the program.

//=>insufficient memory problem
//->whenever there is insufficient memory problem it activates
//  one high priority thread(Garbage Collector Thread).

//           Thread Sheduler
//          ________|__________
//         |                   |
//        Main             Daemon Thread(Garbage collector Thread) or supporting thread
//      Prority-5          Prority-10           

    
//->Grabage Collector Thread starts it's execution and it 
//  supports main thread and make sure that main thread 
//  will not in a problem of insufficient memory.
//->we can call Garbage collector thread as supporting thread.
//->if priority of garbage thread is not high then other 
//  threads come into picture with problem of insufficient
//  memory.

//=>No Insufficency Memory Problem
//->Once JVM knows the thread will not result in memory error
//  or Insufficient memory problem it immediatly change the 
//  priority of garbage thread to 1(Lower priority).
//           Thread Sheduler
//          ________|__________
//         |                   |
//        Main             Daemon Thread(Garbage collector Thread) or supporting thread
//      Prority-5          Prority-1

//->then Thread sheduler shifts it's focus to main thread.
//->then main thread continues it's execution.
//->technically the supporting thread or Garbage Thread collector
//  is called Daemon Thread.


//->JAVA is high level language and abstract