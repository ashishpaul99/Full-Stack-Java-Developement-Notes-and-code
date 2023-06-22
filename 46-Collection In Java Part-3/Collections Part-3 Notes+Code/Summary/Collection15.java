//2.2 DesendingIterator
//->we have desending iterator in LinkedList, ArrayDeque and TreeSet.
//->The descendingIterator() method of java.util.LinkedList 
//  class is used to return an iterator over the elements in
//  this LinkedList in reverse sequential order.
//->Desending itrator by nature it comes starts fetching data from reverse direction.
//->In DesendingIterator Inorder to travel over collection hasNext()
//  and next() methods are used.
//->at the begining it points to last position of collection and start
//  reversing.
//->Integer is child of Object class
//->thats the reason we have downcast it.
     

//->descendingIterator()- Iterator - LinkedList
//->method name- descendingIterator
//->Iterator - return type
//->LinkedList 


//Example-1:Accessing 
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection15 {

	public static void main(String[] args) {
		
		LinkedList ll1=new LinkedList();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		ll1.add(50);
		System.out.println(ll1); //output: [10, 20, 30, 40, 50]
	
	  Iterator ditr=ll1.descendingIterator();
	  while(ditr.hasNext()) {
//		->fetching data as Object and converting it into integer
//		  Integer i=(Integer)ditr.next();//-> downcast casting(industial standard)
//		  System.out.print(i+" "); //output: 50 40 30 20 10 
		  
//		       or
		  System.out.print(ditr.next()+" "); //output: 50 40 30 20 10 
	  }

	}
}

//=>Real time Example of Collections
//Why collection in java?
//->when we give data html collects it and give it to java.
//->the data given by client is collected by java.
//->In java in order to collect the data collection is used.
//->we write one more class which is resposible to connect to the
//  database.
//->the data given to another class and then it is stored in 
//  database.
//->if we search for data. then java program goes to database 
//  and it get the data. 
//->we write collection(eg-ArrayList) and data is stored in it.
//->it given to servlet from servlet to data is given to html.





