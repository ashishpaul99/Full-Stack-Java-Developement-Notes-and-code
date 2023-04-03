//see Picture at 1:11:00
//=>3. Response Time-
//->Anything we don on computer it is always in control of
//  processor.
//->all these are hardware devices.
//->OS makes them operational
//->Time allocation to every process is decided by OS.

//->see picture at 1:17:00
//->OS-->HardDisk------->Ram-----------> Microprocessor(cpu)

//       1.(.java file)
//       2.(.mp3  file)
//       3.(.mp4 file )


//Task-1: Executing java Code
//->to run java code by one click it moves to RAM.
//->In RAM there is some portion. in that portion java code 
//  will be executed.
//->this action is called loading.
//->Execution is done by JVM Under the control of CPU.
//->Instructions can't be executed by jvm but cpu spend time.
//->How much time CPU should spend time on this task.
//  that will told by OS.
//->CPU spends some seconds on this java code. 
//->Let say 3 min.

//Task-2: Listen music
//->Simultaineously listening song
//->.mp3 moves to RAM. 
//->How much time CPU should spend time on this task.
//  Let say 2 min.

//Task-3: Watching video
//->mp4 moves to RAM the moment we open video.
//->How much time CPU should spend time on this task.
//->Let say 3 min.

//->Time allocation to every process is decided by OS.
//->Switching between processes is done by OS.
//->time is measures for CPU in clock cycles(hz).
//->this Switching is known as Context Switching.
//->OS will give maximum time for cpu to do as task.
//->time effectively used when we using multi threading.

//->Let's say OS gives 3 min time to JAVA program to execute 
//  java program.
//->that 3 min time JVM give Thread Sheduler.
//->Switching between threads is taken under the guidance 
//  Thread sheduler.
//->the duty of thread sheduler is it will make sure the 
//  given time is effectively utilized
//->3 tasks are written in java program
//for excample:
//  3 mins are divides to three tasks 
//task-1->1 min
//task-2->1 min
//task-3->1 min
//see picture at: 1:24:00

//=>3.1 Agenda of Multi tasking at OS Level and Thread Level
//->To use CPU time effectively, so that performance can be 
//   improved.

//=>3.2 How does java supports Multi threading?
//->To work with multithreading, java developers will code 
//   only for 10% remaining 90% java API will take care..
//->use that API and write a code.
//->90% logic develeper already wwrote.
//->10% logic has to written by programmer.
//->What is the task the thread has to do as per the application
//  programmer has to do.
//->Context switching in thread based application is done
//  by JVM with support of thread sheduler.
//->Context switching in process based application is done by
//  OS.


//Challeges
//1. How to write a code by using multi threading?
//2. How to create a task?
//3. How to create a thread for each task?
//4. How to use thread related api in application?
//5. How to make sure the complete time given by cpu is 
//   effectively utillized.?

