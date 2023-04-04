//see picture at 2:07:00
//Different approach for creating a Thread?
//A. extending Thread class ->Not suggestible

//        Runnable(Interface)
//              |
//              |   -->implements
//              |
//          Thread(Pre-defined class)
//              |
//              |    -->extends
//              |
//         MyThread(User-defined class)

//Code:
//MyThread t=new MyThread();
//t.start();

//-->see picture at 2:14:00
//->here extending another class is not possible.
//->inheritance is missing out.
//->Resuability is not possibile here.
//->Resuability is missing 
//->hence it is not good approach.
           


//B. implementing Runnable interface->Good Approach
          
         
//     Runnable(Interface)
//         |
//         |   -->implements
//         |
//     MyRunnable(user defined class)

//Code:
//MyRunnable r=new MyRunnable();
//Thread t=new Thread(r);
//t.start();

//->Inheritance facility is directy available here 
//  we say it is good apprach
//->one class simultainously Extend class and also implement
//  interface here.

//=>Which approach is the best approach?
//a. implements Runnable interface is recomended because our 
//   class can extend other class through which inheritance 
//   benift can brought in to our class.
//->Internally performance and memory level is also good 
//  when we work with interface.

//b. if we work with extends feature then we will miss out 
//inheritance benefit because already our class has inherited
//the feature from "Thread class", so we normally don't 
//prefere extends approach rather implements approach is 
//used in real time for working with "MultiThreading".