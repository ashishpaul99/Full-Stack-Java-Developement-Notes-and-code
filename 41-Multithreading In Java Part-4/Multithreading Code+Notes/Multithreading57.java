//=>there are two types of locks
//a. Objecy level lock
//b. Class level lock

//a. Object level Lock :
//->Every object in java has a unique lock. Whenever we are 
//  using synchronized keyword then only lock concept will
//  come into the picture.
//->it is needed when One thread if it want to make a call to 
//  synchronized method

//eg
//	class X{
//			synchronized void m1(){
//
//          }
//    }

//->Let say t1 thread is making call to m1()  method which is 
//  synchronized method then Object level lock is applied on 
//  thread t1.

//b. Class level lock:
//->CLass level lock is internally used by a thread if
//  a thread is making call to static synchronized method.

//1. Every class in java has a unique level lock.
//2. If a thread wants to execute static synchronized method 
//   then the thread requires "class level lock".
//3. While a Thread executing any static synchronized method 
//   the remaining Threads are not allow to execute any 
//   static synchronized method of that class simultaneously.
//4. But remaining Threads are allowed to execute normal 
//   synchronized methods, normal static methods, and normal 
//   instance methods simultaneously.
//5. Class level lock and object lock both are different and
//   there is no relationship between these two locks.


//->see picture at 2:02:00
//   Lock(t1)                Lock(t4)
//   X.class                  X object
//		|		 |		|		|		|	
//		|		 |		|		|		|	
//		|		 |		|		|		|	
//		|		 |		|		|		|	
//                 t1  	        t2  	      t3  	    t4  	    t5  
//               m1()           m2()        m3()      m4()      m5()
//             static         static
// synchronized synchronized

//eg:
//	class X{
//		static synchronized m1(){} //->class level lock
//		static synchronized m2(){} //->class level lock
//		static m3(){}			   //->no lock required
//		synchronized m4(){}        //->object level lock
//		m5(){}                     //->no lock required
//
//	}

//m1()->static synchronized ->class level lock is required.
//m2()->static synchronized ->class level lock is required.
//m3()->static method       ->no lock required
//m4()->synchronized method ->Object level lock is required.
//m5()->Normal method       ->no lock required


//->there are 5 methods.
//->Lets assume each operated on each method.
//->m1 and m2 are static synchronized method.
//->whenever a method is static and sychronized then lock is 
//  class level lock.
//->if method is static it is class level data.
//->Lock of t1 is in class level (X.class level).
//->t1 invoked m1() method. if t2 want to invoke m2()
//  method it is not possible because t1 is locked by class
//  level lock.

//t1=> m1() => class level lock applied and chance is given
//t2=> m2() => enter into waiting state
//t3=> m3() => gets a chance for execution without any lock
//t4=> m4() => object level lock applied and chance is given
//t5=> m5() => gets a chance for execution without any lock
