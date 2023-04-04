////Case-8: Life Cycle of a Thread
//MyThread t=new MyThread(); // Thread is in born state
//t.start();                 //Thread is in ready/runnable state
//->if Thread scheduler allocates CPU time then we say thread
//  entered into Running state.
//->if run() is completed by thread then we say thread 
//  entered into dead state.
//->Once we created a Thread object then the Thread is said 
//  to be in new state or born state.
//->Once we call start() method then the Thread will be 
//  entered into Ready or Runnable state.
//->If Thread Scheduler allocates CPU then the Thread will 
//  be entered into running state.
//->Once run() method completes then the Thread will entered 
//  into dead state.


//see picture at 51:04

//           t.start()                      cpu allocates          if Run method 
//                                          time for thread          completes
//  new/Born ---------> Ready/Runnable state---------------->running------------>Dead

//->1. Born state
//->thread object is created 
//    MyThread t =new Mythread();

//2. Ready state 
//->we call start method. the thread is in runnable or
//   Ready state.
//     t.start();
//->it is ready for running.

//3.Running state
//->CPU will allocate time for thread.  
//->now thread is in running state.

//4. if Run method completes the thread then no use of thread.
//->After finishing of Execution of thread then no use of 
//  thread.
//->this state is called Dead state.
