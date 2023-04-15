//Example-1:
//Code Explaination:
//->Logic in Display class executed thread.
//->Has-A-Realtionship is used.
//->Display method contains one method which wishes the user.
//->the logic which is written in Display should executed by
//  thread.
//->with object wish method is called.
//         d.wish(name);
//->here d is just refrence.
//->Inside MyThread constructor intialization of d and name 
//  is done.
//->while making call to object MyThread object or when
//  MyThread object is created two things has to pass

//  MyThread(Display d,String name){
//		this.d=d;
//		this.name=name;
//	}

//->at Line-1 and Line-2 object of Display and MyThread is 
//  created.

//->see picture at 52:47:00
//	Display class
//	     |
//	 wish(String name){
//		
//	 }

//->for t1 thread we passed d and sachin
//		MyThread t1=new MyThread(d,"sachin"); 
//      t1.start();

//Code:
//class Display
//{
//	public void wish(String name)
//	{
//		for(int i=1;i<=5;i++) {
//			System.out.print("Good Evening:");
//			try {
//				Thread.sleep(2000);
//			}
//			catch(InterruptedException e) {
//			
//			}
//			System.out.println(name);
//	  }
//	}
//}
//class MyThread extends Thread{
//	Display d; //->Has-A Relationship 
//	String name;
//  ->MyThread Constructor
//	MyThread(Display d,String name){
//		this.d=d;
//		this.name=name;
//	}
//	
//	@Override
//	public void run() {
//		d.wish(name);
//	}
//}
//public class Multithreading51 {
//
//	public static void main(String[] args) {
////	  ->Creating Object of display is created.
//	    Display d=new Display();   //->Line-1
//	    
////	  ->Creating Object of MyThread.
//	    MyThread t1=new MyThread(d,"sachin");  //->Line-2
//	    t1.start();
//	    
//	}
//}


//output:
//Good Evening:sachin
//Good Evening:sachin
//Good Evening:sachin
//Good Evening:sachin
//Good Evening:sachin


