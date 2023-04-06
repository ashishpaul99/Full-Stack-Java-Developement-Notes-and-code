//=>Life of thread when join() method is called

//see picture at 2:31:00
//->the thread which is running make a call to join method.
//->the thread will enter into waiting state.
//1. Possiblities of thread to enter into waiting state.
//   a. t.join();
//   b. t.join(100);
//   c. join(100,10);

///->t.join();       ->thread waits until other thread finishes execution.
//->t.join(100);    ->thread will wait 100 sec
//->t.join(100,0);  ->thread will wait 100ms 10 ns

//->from waiting state it comes to Runnable state
                                             
//                                         t.join();
//                                         t.join(100);
//                                         t.join(100,10);
//Ready/Runnable state<-------Waiting state<-----------Running state

//->MyThread t=new MyThread();

//2. Possibility of thread to enter into waiting state to 
//   Runnable state.
//a. if t finishes the executing 
//b. when waiting time over
//c. if interruption occurrs
//->if interruption occurrs then thread will come form 
//  waiting state to runnable/Ready state

//c. Sleep()
//Example-6