//Hashtable
//->Hashtable is legacy class. it is there from the beginning java 1.0.
//->Later when Maps hierarchy are introduced Hashtable added to hierarchy.

//=>Difference between HashMap and Hashtable are same
//1. Hashtable 
//->Introduced in Java 1.0 version
//->Hastable methods are Synchronized(Multi-threading is not possible)
//->Hashtable is thread safe.
//->Low perfromance because of no Multi-threading.


//2. HashMap   
//->Introduced in java 1.4 version
//->HashMap  methods are non-synchronized(Multi-threading is possible)
//->HashMap not thread safe.
//->High perfromance because of Multi-threading

//->Prefer HashMap becuase of it's high perfromance.
//->Properties class is also legacy class.
//->Hashtable and properties class extends Dictionary(Abstract class).
//->Properties used in projects especially in jdbc environment.
//    a. JDBC
//    b. Spring Boot



// Dictionary(Abstract Class)      Map(I)
//           |                       |
//           |extends                |
//           |                       |  
//       Hashtable(C)-----------------
//           |
//           |extends
//           |
//      Properties


//->type in cmd => javap java.util.HashTable
//->see Hashtable  Methods
//->If we apply syncronized keyword is applied to method then
//  that method can run at a time by single thread.  
//->At a time only one thread can run the method.
import java.util.*;
public class Map8{
	public static void main() {
		Hashtable ht=new Hashtable();
		ht.put(1, "Ashish");
		ht.put(2,"Ravi");
		ht.put(3,"Paul");
		System.out.println(ht);
		
	}
}

//Output: Welcome to Passport details
//Enter key
//1
//Passport number:1 Info->Ashish 24 Babu Hyderabad