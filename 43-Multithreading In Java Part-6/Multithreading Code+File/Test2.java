//Example-2: No Dead Lock Case->Executing task with synchronization
//d1() and d2() methods are synchronized.
//->see picture at 39:00
//             Thread sheduler
//           _________|__________
//          |                    |
//         main               Thread-0 ->this thread is created when this.start() method 
//                                       is called in m1() method which is in class Test
//  main thread sleeps 
//  for 5 secs


//            class-A             		class-B
//               |                   	   |
//               |                         |
//               |                         |
// synchronized d1(B b)     synchronized d1(A a)
//           a.last();                   b.last()
//           
//         last() method               last() method

//Code Explaination:
//->d1() and d2() methods are synchronized.
//->No need lock to call last methods of class-A and B.
//->output of the code is same as the previous one.


//Code:
//class A {
//	public synchronized void d1(B b){
//		System.out.println("Thread-1 starts execution of d1()");
//		try{
//			Thread.sleep(5000);//5sec
//		}
//		catch (InterruptedException e){
//		}
//		System.out.println("Thread-1 trying to call B last()");
//		b.last();
//	}
//	public void last(){
//		System.out.println("Inside A last() method");
//	}
//}	
//class B {
//		public synchronized void d2(A a){
//			System.out.println("Thread-2 starts execution of d2()");
//			try{
//				Thread.sleep(5000);//5sec
//			}
//			catch (InterruptedException e){
//			}
//			System.out.println("Thread-2 trying to call A last()");
//			a.last();
//		}
//		public void last(){
//			System.out.println("Inside B last() method");
//		}
//}
//	public class Test2 extends Thread {
//		A a=new A();
//		B b=new B();
//		public void m1(){
//			this.start();
//			a.d1(b);//->executed by main thread
//        }
//		public void run(){
//			b.d2(a);//->executed by child thread
//		}
//	public static void main(String[] args){
//			Test2 t=new Test2();
//			t.m1();
//
// }
//}
	
//output:
//	Thread-1 starts execution of d1()
//	Thread-2 starts execution of d2()
//	Thread-2 trying to call A last()
//	Inside A last() method
//	Thread-1 trying to call B last()
//	Inside B last() method
