//=>Synchronized block

//->if few lines of code is required to get synchronized then
//  it is not recomeneded to make method only as synchronized.
//->If we do this then for threads performance will be low, 
//  to resolve this problem we use "synchronized block", due 
// to synchronized block performance will be improved.

//-->see picture at 2:20:00
//->banglore region->near mg road->bomb blast minors story
//->within in bangalore security as to be kept.

//->if problem occurrs in few lines of code by synchronized 
//over method entire code under method m1 is blocked.
//->Lets say code of region-2  is making problem or lead to
//  data inconsistency then instead of making whole method
//  synchronised make that particular region as sysnchronized
//  and decide lock and lock it.
//->that region will operated by only thread completely. 
//->Other regions are operated by multiple threads.
//->we increase the performance of the application by making 
//  that particular region as sysnchronized.
//->response time will be less compared to putting lock 
//  at method level.
//->these way of putting lock for particular set of code
//  we called as synchronized lock.
//->it is lock at block level so it is called synchronized 
//  block. 

//void m1() {

//	------
//  ------   region-1
//  ------

//  ------
//  ------   region-2
//  ------

//  ------
//  ------   region-3
//  ------

//}

//-> Two Levels of locks
//a. Object level locks
//b. Class level locks

//1. Current object level lock
//->this refers to current object lock.
//->get current object lock and execute the region
//Synchronized(this){
//	
//}

//2. Class level lock
//->get class level lock and Execute the region.
//synchronized(Display.class) {
//	
//}

//3. someother object lock
//->get object of d level lock and Execute the region.
//synchronized(d) {
//	
//}


//->If a thread got a lock of current object, then it is 
//  allowed to execute that block
//	a. synchronized(this){
//	.....
//	.....
//	.....
//	}
//2. To get a lock of particular object: B
//  b.synchronized(B){
//  .....
//  .....
//  .....
//  }
//
//->If a thread got a lock of particular object B, then it 
//  is allowed to execute that block.

//c. To get class level lock we have to declare synchronized
//   block as follow
//	synchronized(Display.class){
//	....
//	....
//	....
//	}
//->If a thread gets class level lock, then it is allowed to 
//  execute that block

//Example-1:

//public class Multithreading62 {
//	public static void main(String[] args){
//		int x=48;
//		synchronized(x){
//			System.out.println(x);
//		}
//   }
//}

//output:
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	int is not a valid type's argument for the synchronized statement
//
//	at Multithreading62.main(Multithreading62.java:102)


//Example-2:
//public class Multithreading62 {
//	public static void main(String[] args){
//		Integer x=48;
//		synchronized(x){
//			System.out.println(x);
//		}
//   }
//}

//output:48


