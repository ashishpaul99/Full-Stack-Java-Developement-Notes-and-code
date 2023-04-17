
//2. notify()/notifyAll()-
//->Thread which is performing updation should call notify(),
//  so the waiting thread will get notification so it will 
//  continue with its execution with the updated items.
//                         or
//->Which ever thread updates the resource/information to 
//  other thread, that thread should call "notify()/notifyAll()"
//                           or
//->notify()- send a notification to the waiting thread.
//->the lock applied by notify thread should release
//  so that other thread acquire the lock and read the 
//  information.
                               
//->thread which calls notify/notifyAll() may or may not 
//  release the lock immediately.
//->but lock will be released.
//
//->If a thread wants to call wait(),notify()/notifyall() 
//  then compulsorily the thread should be the owner of the
//  object otherwise it would result in "IllegalMonitorStateException".

//->We say thread to be owner of that object if thread has 
//  lock of that object.
//->It means these methods are part of synchronized block 
//  or synchronized method, if we try to use outside 
//  synchronized area then it would result in RunTimeException 
//  called "IllegalMonitorStateException".

//->if a thread calls wait() on any object, then first it 
//  immediately releases the lock on that object and it enters
//  into waiting state. 
//->if a thread calls notify() on any object,then he may or 
//  may not release the lock on that object immediately.
//->Except wait(),notify(),notifyAll() lock can't be relased 
//  by other methods.