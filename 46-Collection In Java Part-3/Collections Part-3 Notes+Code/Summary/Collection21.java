
//Example-3: sorting complex data using sort()  method in Colections class.
//->it gives exception at runtime.
//->Application getting exception at runtime is bad.


//import java.util.*;
//
//public class Collection21 {
//	public static void main(String[] args) {
////		we can store heterogenous data in collection.
//		ArrayList al1=new ArrayList();
//		al1.add(24);
//		al1.add("Hyder");
//		al1.add("Infosys");
//		al1.add(507002);
//		System.out.println(al1); //output:[24, Hyder, Infosys, 507002]
//		
////		sorting above heterogenous data
//		Collections.sort(al1);
//		System.out.println(al1);
//	}
//}

//output: 
//	[24, Hyder, Infosys, 507002]
//			Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//				at java.base/java.lang.String.compareTo(String.java:141)
//				at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//				at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//				at java.base/java.util.Arrays.sort(Arrays.java:1107)
//				at java.base/java.util.Arrays.sort(Arrays.java:1301)
//				at java.base/java.util.ArrayList.sort(ArrayList.java:1721)
//				at java.base/java.util.Collections.sort(Collections.java:145)
//				at Collection20.main(Collection20.java:86)



//->Whenever the data is complex if sorting has to perform on 
//it then we have to go for comparator and Comparable interface
