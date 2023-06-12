//3. Arary Deque
//->it will work like dynamic array data structure.
//->it internally follows Double eneded Queue data structure.
//->Qeue - FIFO
//->Index based accessing is not allowed in Array Deque.
//->Double eneded Queue -> insertion and deletion happens at 
//  front end and reat end.

//    front end <--------------->rear end 
//    Insertion/                 Insertion/Deletion
//    Deletion

//->Duplicates are allowed in Array Deqeue.
//  eg:ArrayDeque ad= new ArrayDeque();
//		ad.add(30);
//		ad.add(30);


//=>Important Points on Array Deqeue
//1. It follows Double ended queue data structure.
//2.Good for insertion/deletion at front end and rear end.
//3.it is implementing deque(I) interface.


//Eaxmple-1

import java.util.ArrayDeque;
public class Collection7 {

	public static void main(String[] args) {
		ArrayDeque ad= new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(30);
		System.out.println(ad);  //output: [10, 20, 30, 30]
		
		ad.addFirst(6);
		ad.addLast(4);
		System.out.println(ad); //output: [6, 10, 20, 30, 30, 4]
		
		ArrayDeque ad1=new ArrayDeque();
		ad1.add(80);
		ad1.addAll(ad);
		System.out.println(ad1); //output: [80, 6, 10, 20, 30, 30, 4]
	}

}
