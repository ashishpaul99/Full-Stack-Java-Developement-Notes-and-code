//TreeMap
//->It is also acting like a TreeSet.
//->values can be duplicated.
//->Keys must be unique.

import java.util.*;
public class Map9 {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(11, "Ashish");
		tm.put(22, "Ravi");
		tm.put(33,"Ashish");
		System.out.println(tm);
	}

}

//Output: {11=Ashish, 22=Ravi, 33=Surat}