//6. Hash Set
//->It will follow Hashing algorithm.
//->There will be Hash Function and associated Hash table with 
//  loading factor 75%.
//->Hash table will have buckets where data will be stored.
//->HashSet-> combination of Hash Function and Hash Table.
//->Data stored in hash table based on the formula.
//->Load factor of Hash table is 75% that means if 75 percent of 
//  the buckets in hash table are filled then automatically Hash 
//  table becomes double.
//->In order to avoid data collision the hash table becomes double.
//->Every time data is added based on the hash function the 
//  data goes and sit in the specific location in hash table.



//->see picture at 1:59:00
//6.2 Storing Data in Hash Table
//->Hash tables have buckets.
//->When data is given to Hash fuction it stores data in Hash
//  tables based on the fromula of hash fucntion.
//->eg:
//let say formula be x%10

//       Hash function(x%10)                      Hash table
//data                  fromula
//100 --> 1+0+0=1 ----> 1%10 =1          100               50
//50  --> 5+0=5   ----> 5%10=5            1		2	3	4	5	6	7	8	9	10    

//Data stored in hash table based on the formula.


//6.3 Searching data in Hash Table
//key be 200

//            Hashing Table
//  100 80  60  8   4   50  16  17  98  63
//-> 1	 2	3	4	5	6	7	8	9	10

//->Hash fucntion(x%10)
//key=200 --> x=2+0+0=2 --> 2%10=2 
//it checks 200 in index 2. 
//->here 10 objects in hash table. 
//->in order to search we had 1 comparision.
//->Time complexity O(1)
//->searching algorithm is very fast 
//->In order have fast searching algorithm go with HashSet and
//  Link HashSet.

//6.4 Conclusion
//->HashSet follows Hashing algorithm behind the scene it works
//  with combination of Hashing function and Hash Table. 
//->data will be stored in individual buckets present in hashtable.
//->whenever searching operation is perfromed because of the 
//  formula in hash function it goes and search in specific bucket 
//  only.


//6.5 Important Points on HashSEt
//->Order of insertion is not preserved.
//->HashSet will not maintain order of insertion.
//->Whenever there is need of searching operation it becomes fast.
//->In order to maintain order of insertion there is sub class(Child class)
//  of HashSet which is called LinkedHashSet

//6.6 Importance Points on LinkedHashSet
//->LinkedHashSet is sub class of HashSet and it also follows 
//  Hashing algorithm behind the scene.
//->LinkedHashSet maintains the order of inseriton.
//->Go with LinkedHashSet if you want to maintain order of 
//  insertion and also follow hashing algorithm.


//>these are the major 7 classes in collections
//->Later they added Vector and Stacks. 
//->stacks are child class of vector.

//Example-1: HashSet

//import java.util.*;
//public class Collection13 {
//
//	public static void main(String[] args) {
//		HashSet hs=new HashSet();
//		hs.add(100);
//		hs.add(50);
//		hs.add(150);
//		hs.add(25);
//		hs.add(125);
//		System.out.println(hs);
//	}
//
//}

//Output: [50, 100, 150, 25, 125]


//Example-2: LinkedHashSet
import java.util.*;
public class Collection13 {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(125);
		System.out.println(lhs);
	}
}

//Ouput: [100, 50, 150, 25, 125]
