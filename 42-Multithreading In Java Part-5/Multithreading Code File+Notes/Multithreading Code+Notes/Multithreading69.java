
//Two threads can communicate each other with the help of 
//these methods
//1. notify()
//2. notifyAll()
//3. wait()

//1. wait()- 
//->Thread which is expecting notification/updation should
//  call wait(), immediately the Thread will enter into 
//  waiting state.
//                            or
//->which ever thread wants to get the resource/information
//from another thread, then that thread should call "wait()".
//->wait() method thread should be owner.
//                              or
//->The wait() method causes current thread to release the 
//  lock and wait until either another thread invokes the 
//  notify() method or the notifyAll() method for this object,
//  or a specified amount of time has elapsed.  

//->The current thread must own this object's monitor, so it
//  must be called from the synchronized method only otherwise 
//  it will throw exception.
                               
//->Automatically the thread which calls wait() would realese 
//  the lock, so other thread can use that lock and perform 
//  some updation operation.
//->Lock will be applied on synchronized region.
//->all these methods works only in synchronized.