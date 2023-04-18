//=>Previous code whithout synchronization
//->here main thread will get a chance
//->it execute and enters into dead state.

//Code:
//class ThreadB extends Thread{
//	int total=0;
//	@Override
//	public void run() {
//		for(int i=1;i<=100;i++) {
//			total+=i;
//		}
//	}
//}
//public class Multithreading74 {
//
//	public static void main(String[] args) {
//		ThreadB b =new ThreadB();
//		b.start();
//		System.out.println(b.total);
//	}
//
//}

//output:0

//example-2.: making main thread to sleep and let child thead
//execute.
//->here the task is executed in 2sec
//->the same task is exexcuted in 1 sec also.
//->waiting 1 sec is waste of time hence we use synchronization.
//->cpu time is effectives utilized by synchronization.


//Code:
//class ThreadB extends Thread{
//	int total=0;
//	@Override
//	public void run() {
//		for(int i=1;i<=100;i++) {
//			total+=i;
//		}
//	}
//}
//public class Multithreading74 {
//
//	public static void main(String[] args) throws InterruptedException {
//		ThreadB b =new ThreadB();
//		b.start();
//		
////	  ->main thread sleeps for 2 secs 
//		Thread.sleep(2000);
//		System.out.println(b.total);
//	}
//
//}

//output: 5050

//Example-3: doing task using join method.
//->here main thread  need total but other code is not required.
//->when join method is used main thread should wait for all
//  the execution ḥappens.
//->join is not good approach.

//->if b.join() method is used, then main thread will enter
//  into waiting state,then child will execute for loop,till 
//  then main thread has to wait.

//Code:
//class ThreadB extends Thread{
//	int total=0;
//	@Override
//	public void run() {
//		for(int i=1;i<=100;i++) {
//			total+=i;
//		}
//		
////		1 lakh line code
//	}
//}
//public class Multithreading74 {
//
//	public static void main(String[] args) throws InterruptedException {
//		ThreadB b =new ThreadB();
//		b.start();
//		
////     ->main thread waiting for other thread to join
//		b.join();
//		System.out.println(b.total);
//	}
//
//}

//output: 5050


//=>ative count method-this method hleps to find number of 
//active thread present.

//Example-4:using ative count method
//type in cmd->javap java.lang.Thread
//->public static int activeCount();
//->active threaads 

//Code:
class ThreadB extends Thread{
	int total=0;
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			total+=i;
		}
		
//		1 lakh line code
	}
}
public class Multithreading74 {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b =new ThreadB();
		b.start();
		
		//active count method 
		System.out.println("No of threads active:"+Thread.activeCount());
		b.join();
		System.out.println(b.total);
	}

}

//output:
//No of threads active:2
//5050
