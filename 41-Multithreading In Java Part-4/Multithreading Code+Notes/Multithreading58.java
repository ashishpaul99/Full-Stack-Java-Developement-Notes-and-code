//Example-1: Normal methods 
//->seep picture at 2:10:00
//                 Display
//            _______|_______
//           |               |
//      displayNumber  displayCharacter
//           |               |
//           |               |
//           |               |
//           t1              t2
//       MyThread1       MyThread2

//->two threads operated on same display object.
//->there are two thread objects MyThread1 and MyThread2.
//->one thread operates in displayNum and and another thread
//  operates on displayChar.
//->output is irregular in this case
//->here we are not used synchronized keyword.


//class Display{
//	
//	public void displayChar() {
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
//	public void displayNumber() {
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
//public class Multithreading58 {
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
//	A1B2C3D4E5FGHIJK