//Example-5: class level lock is applied
//->when thread is applying class level lock can other thread 
//  get same class level lock even though it is applying on
//  different lock?
//->No

//Note:2 here we have 2 objects, 2 thread. the thread which
//gets a chance applied class level lock so output is regular.

//->here nature of output is regular.

//Note:lock concept applicable only for objects and class
//types, but not for primitive types. if we try to do it 
//would result in compile time error saying "unexpected type".

//eg:: int x=10;
//synchronized(x){//CE: unexpected type found:int required:reference
//}

class Display
{
	public void wish(String name)
	{
//	Code before synchronized block	
	
		
		
//	writng task in synchronized block
// ->here lock applied for the thread for executing this block

//	  ->class level lock is applied
		synchronized(Display.class){
//   	knowing thread which is getting lock 
		System.out.println("Thread which is getting lock is:"+Thread.currentThread().getName());//->Line-1	
		for (int i=1;i<=5 ;i++ )
		{
			
			System.out.print("Good Morning: ");
			try{
				Thread.sleep(2000);
			}
			catch (InterruptedException e){
			}

			System.out.println(name);
		}
	   }
//    knowing thread which is releasing lock 
    System.out.println("Thread which is releasing lock is:"+Thread.currentThread().getName());//->Line-1	
	}
	
//	code after synchronized block
	
	
}
class MyThread extends Thread
{
	
	Display d;  //->Has a relationship
	String name;
	
	MyThread(Display d, String name){
		this.d=d;
		this.name=name;
	}
	@Override
	public void run() {
		d.wish(name);	
	}
}
public class Multithreading67 {

	public static void main(String[] args) {

//    creating multiple display objects
		Display d1=new Display();
		Display d2=new Display();
		
//		creating MyThread object and passing arguments 
		MyThread t1=new MyThread(d1,"Ashish");
		MyThread t2=new MyThread(d2,"Sachin");
		
		t1.setName("Ashish Thread");
		t2.setName("Scahin Thread");
		
		t1.start();
		t2.start();
	}
}

//output:
//	Thread which is getting lock is:Ashish Thread
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Good Morning: Ashish
//	Thread which is releasing lock is:Ashish Thread
//	Thread which is getting lock is:Scahin Thread
//	Good Morning: Sachin
//	Good Morning: Sachin
//	Good Morning: Sachin
//	Good Morning: Sachin
//	Good Morning: Sachin
//	Thread which is releasing lock is:Scahin Thread

