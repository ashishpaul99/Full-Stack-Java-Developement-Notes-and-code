		

//Java Collections Summary
//Classes               Internal Data Structure    Preserve the oreder        Permit null values      Duplicates
//													 of insertion                are allowed
//1. ArrayList              Dynamic Theory               yes                         yes                  yes                                                     
//2. LinkedList             Double LinkedList            yes 						 yes                  yes                                 								  
//3. Array Deque            Double Ended Queue           yes                         No                   yes                                 				
//3. Prirority Queue        Min-heap                     No							 No                   yes                                 									  
//5. TreeSet                Binary Search Tree           No							 No                   No                                 								  
//6. HashSet                HashTable(Hashing)           No							 yes                  No                                 									  
//7. LinkedHashSet          HashTable                    yes					     yes                  No                                 		



//->ArrayDeque, PriorityDeque and TressSet follows special internal 
//  data structure that's the reason it will not allow null data structure.
//->By nature Treeset sorts the data. if we add null value it effects
//  sorting.
//->PriorityQueue follows Min-heap data structure behind the scene. highest priority
//  element should be present at begining of the collection. if we give null value
//  it will not able to perfome min heap data structure manuplation.
