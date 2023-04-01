//2. Thread Based Multi-tasking-
//->Executing several tasks simulatenously where each task 
//  is a seperate independent part of the same Program, is 
//  called "Thread based MultiTasking".
//->Each independent part is called "Thread".
//->we will learn in java about multi-tasking.

//1. This type of multitasking is best suited at 
//   "Programatic level".
//->The main advantages of multitasking is to reduce the 
//  response time of the system and to improve the 
//   performance.
//2. The main important application areas of multithreading 
//   are
//a. To implement mulitmedia graphics
//b. To develop web application servers(will learn in JEE)
//c. To develop video games
//d. To develop animations

//3. Java provides inbuilt support to work with threads 
//through API called Thread,Runnable,ThreadGroup,ThreadLocal,...

//4. To work with multithreading, java developers will code 
//   only for 10% remaining 90% java API will take care..

//eg:
//->Writing few lines of java program.
//->Different set of doing different work.
//->doing different tasks.

//.java
//--------
//--------  task-1
//--------
//
//========
//========  task-2
//========
//
//++++++++
//++++++++  task-3
//++++++++

//->In java JVM manages all execution of code in java.

//2.1 Thread - the line of exectuiton technically we called 
//             as thread.
//->see picture at 48:28


//2.2 Single threading Execution-
//->Execution started at task-1
//->tasks executes after executing previous task.
//->while executing task-1 then task-2 and task-3 waits 
//  for execution.
//->more the waiting time, performance of the application 
//  would decreases.
//->here we have one line execution. 
//->it is called single thread.
//->the line of exectuiton technically we called as thread.
//->if we write a code in single thread style waiting time
//  increase and perfoemance will decrease.
//->see picture at 48:28

//2.2.1 Disadvantages of Single thread Execution:
//->more the waiting time, performance of the application 
//  would decreases.
//->if we write a code in single thread style waiting time
//  increase and perfoemance will decrease.

//2.3 Mulit-Threading Execution:-
//=>What we have to do?
//->if task is taking time to execute then 
//->Create line of execution for task-2 and task-3 and 
//  assign to task-2 and task 3 separately.
//->if we create a separate line of execution for every task
//  we do in out application, CPU time can be effectively 
//  utilized and this would increase the performance of the 
//  application because waiting time would be less.
//->here tasks are independent to each other. like that 
//  tasks are catergorized.

//-> see picture at: 48:32

//->the line execution is called thread.
//step-1
//->catergorize the tasks each task should indepent to 
//each other.

//step-2
//->for independent tasks we have to create seperate line 
//  of execution.
//->the line execution is called thread.

//Eg: see picture at: 48:32
//->here we have line exection for three tasks. 
//->so we called as Multiple-thread or Mulit-Threading.
//->In JVM manages all execution of code in java.
//->OS level multi tasking-independent tasks contolled by OS.
//->JVM controlls independent line of excution.
//->since JVM controls independent line of excution we call 
//  it as Light Weight.
//->Switching is happening between the threads. 
//->here JVM is controlling at thread level but not at the 
//  memory level.
//->since it is not directly under the controll of hardware 
//  unit we can it is Light Weight


//=>2.3.1 Light Weight- Threads are Light weight
//->Every task is uner the control by seperate thread.
//->where every thread is in hands of JVM.
//->since OS in not involved.
//->JVM is light weight in switching up the threads.
//->Multi Threading- switching is happening beteween threads.


//=>2.3.2 Advantage or Purpose of Multi threading-
//->Less the response time from application, more would be 
//  the perfomance.
//->To ustilize the CPU time effectively in application use
//  Multi task and each task assign to one thread and promote
//  "Multi-Threading".

//->see picture 1:07:00
//		   Java
//			  |
//			API(Thread, Runnable, ThreadLocal)->90% work done by API
//			  |
//		 Packages(java.lang)
//		    |
//	  .class files
//->In java Multi threadind is very easy.
//->java Language full of API.
//->API referes to collection of packages. 
//->In a packages we keep .class files.
//->Sun microsystem gave one API for multi-threading.
//->Thread,Runnable, ThreadLocal ..etc API's for multi-threading.
//->they are avialable in lang package.
//->90% logic develeper already wwrote.
//->10% logic has to written by programmer.
//->What is the task the thread has to do as per the application
//  programmer has to do.

//->Where multi threading is used.
//eg:
//Gamming Applications
//Zoom meeting application.







