//Example-3: static synchronized methods -> Class Level Lock
//->here Class level lock is used.
//class Display{
//	
//	public static synchronized void displayChar() {
//		for (int i=65;i<=75 ;i++ )
//		{
//
//			System.out.print((char)i);
//			try{
//				Thread.sleep(2000);
//			}
//			catch (InterruptedException e){
//				
//			}
//		}
//	}
//	
//	public static synchronized void displayNum() {
//		for(int i=1;i<=5;i++) {
//			System.out.print(i);
//			try {
//				Thread.sleep(2000);
//			}
//			catch(InterruptedException e){
//			
//			}
//		}
//	}
//		
//			
//}
//
////Thread-1
//class MyThread1 extends Thread{
//	Display d;
//	MyThread1(Display d){
//		this.d=d;
//	}
//	@Override
//	public void run() {
//		d.displayNum();
//	}
//}
//
////Thread-2
//class MyThread2 extends Thread{
//	Display d;
//	MyThread2(Display d){
//		this.d=d;
//	}
//	@Override
//	public void run() {
//		d.displayChar();
//	}
//}
//
//
//public class Multithreading60 {
//	public static void main(String[] args){
//		//one object
//		Display d1=new Display();
//		
//		//two threads
//		MyThread1 t1= new MyThread1(d1);
//		MyThread2 t2= new MyThread2(d1);
//		
//		
//		t1.start();
//		t2.start();	
//   }
//}

//output:
//	12345ABCDEFGHIJK