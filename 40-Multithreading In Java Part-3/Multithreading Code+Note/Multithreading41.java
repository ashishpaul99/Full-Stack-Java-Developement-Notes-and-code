//3. sleep() Method
//->If a thread dont' want to perform any operation for a 
//  particular amount of time then we should go for sleep().
//->eg: ppt timer face->sleep() method is used.
//->after displaying R then thread sleeps for 3 sec.

//->t.join();       ->thread waits until other thread finishes execution.
//->t.join(100);    ->thread will wait 100 sec
//->t.join(100,0);  ->thread will wait 100ms 10 ns

//->Signatures of sleep method
//public static native void sleep(long ms) throws InterruptedException
//public static void sleep(long ms,int ns) throws InterruptedException

//->every sleep method throws InterruptedException, which is 
//  a checkedexception so we should compulsorily handle the 
//  exception using try catch or by throws keyword otherwise 
//  it would result in compile time error.

//          Thread t=new Thread(); //new or born state
//          t.start() // ready/runnable state

//->If Thread sheduler allocates cpu time then it would enter
//  into running state.
//->If run() completes then it would enter into dead state.
//->If running thread invokes sleep(1000)/sleep(1000,100) 
//  then it would enter into Sleeping state.
//->If time expires/ if sleeping thread got interrupted then 
//  thread would come back to "ready/runnable state".

//Example-1
//public class Multithreading41 {
//
//	public static void main(String[] args) throws InterruptedException {
//	System.out.println("R");
//	Thread.sleep(3000);
//	System.out.println("C");
//	Thread.sleep(3000);
//	System.out.println("B");
//	Thread.sleep(3000);
//	
//	System.out.println("Kohli");
//	
//	}
//
//}

//output:
//R
//C
//B
//Kohli

//Example-2
//public class Multithreading41 {
//
//	public static void main(String[] args) throws InterruptedException {
//		for (int i=1;i<=10 ;i++ ){
//			System.out.println("Slide: "+i);
//			Thread.sleep(2000);
//		}
//	}
//
//}

//output:
//	Slide: 1
//	Slide: 2
//	Slide: 3
//	Slide: 4
//	Slide: 5
//	Slide: 6
//	Slide: 7
//	Slide: 8
//	Slide: 9
//	Slide: 10


	
