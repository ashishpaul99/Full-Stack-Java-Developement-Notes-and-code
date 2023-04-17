//=>Thread Life cycle When thread calls wait method
//->see picture at 1:20:00


//                    Another waiting state <-------------------waiting state
//                     to get lock                                 |
//                              |                                  |
//           t.start()         \|/            cpu allocates        |   if Run method 
//                                            time for thread      |     completes
//  new/Born ---------> Ready/Runnable state---------------->running------------>Dead

//         |         |
//         |         |
//         |         |
//         |         |
//       main       child 
//      thread      thread

//->A thread is running state. that thread calls waits method.
//   obj.wait();        ->wait till lock is released 
//   obj.wait(100);     ->wait for sometime
//   obj.wait(100.10);  ->wait for exact time
//->When thread calls wait method. Thread enter into waiting
//  state.

//->after this Thread enters into another waiting state to
//  get lock.
//->till the notify thread gives lock the waiting thread will 
//  in another waiting state.
//->waitng thread is expecting a lock from notification thread.
//->When thread comes out of waiting state after getting lock
//  it enters into Runnable/Ready state.


//=>Possibilities of Thread to come out of waiting state and
//enter into Runnable/Ready state

//1. When thread gets lock or recives notification it comes 
//  out of waiting state.
//->if waiting thread gets notification it comes out of 
//  waiting state.
//2. if time expires then thread comes to waiting state.
//3. if thread got interrupted then it comes out of waiting 
//  state.