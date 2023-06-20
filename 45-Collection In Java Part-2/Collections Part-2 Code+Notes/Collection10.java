//=>Searching operation on Collection classes.

//ArrayList ->Dynamic array
//al-> 100 50 150 25 75 125 175
//      0  1   2   3 4   5   6 

//->we have to search 200 in ArrayList.
//key= 200;
//->searching is done by accessing each element and compare with key.
//->time complexity of searching operation in ArrayList is O(n).
//->searching operation is time consuming in ArrayList.

//2. LinkedList -> Doubly LinkedList
//eg:
// 100   50  150  25  75   125  175
//->Stored in node and linked with each other.
//->we have to search 200 in LinkedList.
//  key= 200;
//->How much ever elements is that much comparision is made.
//->in above linked list there are 7 objects so 7 comparisions
//  has to made.
//->here we have to go every node and compare.
//->so time complexity is O(n);

//3. Array Deque ->Double end Queue
//-> it also Dynamic in nature.
//->it also demands contigeous memory allocation.
//->eg: 100 50 150 250 75 175

//->we have to search 200 in ArrayDeque
//key:200

//->->How much ever elements is that much comparision is made.
//->so time complexity is O(n);


//4. Priority Queue
//->it follows min-heap data structure.
//               25
//       50             125
// 100        75    125        175

//->we have to search 200 in Prority Queue
//key:200
//->see in picture 56:08
//->In this case while searching it will go every node and 
//  compare the key.
//->How much ever elements is that much comparision is made.
//->so time complexity is O(n);


//Every class have it's Efficiency
//1. ArrayList
//->ArrayList is efficient to perform insertion operation at
//  rear end.  
//->it follows Dynamic Array data structure. how many added to 
//  it the size get increases according to it.

//2. LinkedList -> it follows Doubly LinkedList data structure.
//->where we can make use of disperse memory allocation and it can 
//link each other wherever node is present.

//3. Array Deque-> it follows Double end deque

//4. Priority Queue
//->Priority to follows min heap data structure.
//->where the highest priority element available at the 
//  beggining the collection.

//->Above all of them are good for insertion operation but when it
//  comes to quick search operation all these classes fails.

//->That is when we have binary search tree data structure which 
//   also called balanced binary search tree data structure.

