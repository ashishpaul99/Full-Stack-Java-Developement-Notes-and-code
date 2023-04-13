//Note::
//1. If thread is interrupting another thread, but target 
//   thread is not in waiting state/sleeping state then there 
//   would be no exception.
//2. interrupt() call be waiting till the target thread 
//   enters into waiting state/sleeping state so this call 
//   wont be wasted.
//3. once the target thread enters into waiting state/sleeping 
//   state then interrupt() will interrupt and it causes the 
//   exception.
//4. interrupt() call will be wasted only if the Thread does 
//   not enters into waiting state/sleeping state.

//2. yield() join() sleep()

//1) Purpose
//a. yield()-To pause current executing Thread for giving the
//   chance of remaining waiting Threads of same priority.
//b. join()- If a Thread wants to wait until completing some 
//   other Thread and join with it.
//c. sleep()-If a Thread don't want to perform any operation 
//   for a particular amount of time then we should go for 
//   sleep() method.


//2) Is it static
// a. yield() yes
// b. join() no
// c. sleep() yes

//3) Is it final?
//    a. yield() no
//    b. join() yes
//    c.sleep() no
//4) Is it overloaded?
//	a.yield() no
//	b.join() yes
//	c.sleep() yes
//5) Is it throws IE?
//	a.yield() no
//	b.join() yes
//	c.sleep() yes
//6) Is it native method?
//	a.yield() yes
//	b.join() no
//	c.sleep()

//sleep(long ms) -->native
//sleep(long ms,int ns) -->non-native

//->More the .class file more the loading time.
