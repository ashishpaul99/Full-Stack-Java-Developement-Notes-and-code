//Case: multiple threads are operating on multiple objects

//->If multiple threads are operating on multiple objects 
//  then there is no impact of Syncronization.

//Display d1=new Display();
//Display d2=new Display();
//MyThread t1=new MyThread(d1,"yuvraj");
//MyThread t2=new MyThread(d2,"dhoni");
//t1.start();
//t2.start();



//How many threads are operating on how many objects?
//->here two threads are operating on two different objects.

//Code-1:
//class Display
//{
//	public void wish(String name)
//	{
//		for (int i=1;i<=5 ;i++ )
//		{
//			System.out.print("Good Morning: ");
//			try{
//				Thread.sleep(2000);
//			}
//			catch (InterruptedException e){
//			}
//
//			System.out.println(name);
//		}
//	}
//}
//class MyThread extends Thread{
//	Display d; //->Has-A Relationship 
//	String name;
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
//public class Multithreading55 {
//
//	public static void main(String[] args) {
////	  ->Creating Object of display is created.
//	    Display d1=new Display();   
//	    Display d2=new Display();
//	    
////	  ->Creating Object of MyThread.
//	    MyThread t1=new MyThread(d1,"sachin");  
//	    MyThread t2=new MyThread(d2,"Dhoni");
//	    
//	    
//	    t1.start(); 
//	    t2.start(); 
//	}
//}

//output:
//	Good Morning: Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: sachin
//	Dhoni

//Code-2:Using synchronized on above code
//->here we are getting same output for code with 
//  synchronization and without synchronization because
//  two threads are operating on two different objects.
//->If multiple threads are operating on multiple objects 
//  then there is no impact of Syncronization.

//class Display
//{
//	public void wish(String name)
//	{
//		for (int i=1;i<=5 ;i++ )
//		{
//			System.out.print("Good Morning: ");
//			try{
//				Thread.sleep(2000);
//			}
//			catch (InterruptedException e){
//			}
//
//			System.out.println(name);
//		}
//	}
//}
//class MyThread extends Thread{
//	Display d; //->Has-A Relationship 
//	String name;
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
//public class Multithreading55 {
//
//	public static void main(String[] args) {
////	  ->Creating Object of display is created.
//	    Display d1=new Display();   
//	    Display d2=new Display();
//	    
////	  ->Creating Object of MyThread.
//	    MyThread t1=new MyThread(d1,"sachin");  
//	    MyThread t2=new MyThread(d2,"Dhoni");
//	    
//	    
//	    t1.start(); 
//	    t2.start(); 
//	}
//}

//output:
//	Good Morning: Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: Dhoni
//	Good Morning: Dhoni
//	Good Morning: sachin
//	Good Morning: sachin
//	Dhoni

//Conclusion :
//->If multiple threads are operating on multiple objects 
//  then there is no impact of Syncronization.
//->If multiple threads are operating on same java objects 
//  then syncronized concept is required(applicable).
