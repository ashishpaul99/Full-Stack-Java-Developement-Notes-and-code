// =>2. Scenario to understand Inter Thread Communication
//Example-5: Person-1, Person-2 and Postman example.
//->see picture 45:00:00


//->there are two persons.
//->Person-2 told person-1 that he will send letter with
//  important information.
//->Person-1 assumes that letter came then he checks multiple 
//  times at post box from 5:10 pm to 10:00 am
//->Lets say at 1:00 pm post man dropped the letter in post 
//  box.
//->Person-1 checks the letter he finds it there. in that 
//  letter it is written don't disturb person-2 he is out of 
//  station and tells he will call back when he reaches to
//  home.


//->Let say person-1 is thread-1 and Person-2 is thread-2
//->resource is not available for thread-1 right away when 
//  he goes away contact.
//->here thread-1 is going to get resource many times due to
//  this performance is gone.
//->rather performing other work thread is busy in checking
//  for resource.


//->see picture at 52:00
//=>What is solution for this scenario?
//->Person-1 contract is fixed with postman. so need to check
//  in regular intervels. asking post man to give notification 
//  or shouting post or bell. here until post man notify about 
//  letter Person-1 wil do his work.
//->now two Person-1  and Postman should talk such way that 
//  both of the threads make use of resources properly.
//->whatever work person-1 is doing should indicate to postman
//  and the work done by postman should indicate to person-1.
//->he will notify person-1 when he keep letter.
//->postman should notify person-1 on postbox until this Person-1
//  enters into waiting state.
//->Person-1 is waitng at postbox object.
//->Postbox belongs to Person-1. he is the owner. 


//->see picture at 52:00
//=>same thing we can do in java
//->here thread t1 is person-1 and thread t2 is Postman and
//  postbox is called interThreadCommunication

//->now two threads t1 and t2 should talk such way that both
//  of the threads make use of resources properly.
//->whatever work thread t1 is doing should indicate to 
//  Thread-t2 and the work done by thread-t2 should indicate 
//  to thread-1.
//->Thread-2 will notify thread t1 when he keep letter.
//->Thread-t2 should notify thread-1 on postbox until this 
//  thread-t1 enters into waiting state.
//->Thread-t1 is waitng at postbox object.
//->two threads are communicating each other with the help of 
//  one resource this resource is called interThreadCommunication.

//->see picture at 1:05:00
//=>InterThreadCommunication(remember postbox example)
///->Inter-thread communication or Co-operation is all about 
//  allowing synchronized threads to communicate with each 
//  other.

//->Cooperation (Inter-thread communication) is a mechanism 
//  in which a thread is paused running in its critical 
//  section and another thread is allowed to enter (or lock)
//  in the same critical section to be executed.It is implemented 
//  by following methods of Object class.

//Two threads can communicate each other with the help of 
//these methods
//1. notify()
//2. notifyAll()
//3. wait()
