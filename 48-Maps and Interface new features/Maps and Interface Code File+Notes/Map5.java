//8. Console based Application of Passport Inforamtion 
import java.util.*;
import java.util.Map.Entry;
;
 class Information{
	 private String name;
	 private int age;
	 private String fatherName;
	 private String city;
	 
	public Information(String name, int age, String fatherName, String city) {

		this.name=name;
		this.fatherName=name;
		this.age=age;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getFatherName() {
		return getFatherName();
	}
	public String getCity() {
		return city;
	}
	 
	@Override
	public String toString() {
		return name+" "+age+" "+fatherName+" "+city;
	}
	 
 }
public class Map5 {

	public static void main(String[] args) {
		
		
		
		
		Information info1=new Information("Ashish",24,"Babu","Hyderabad");
		Information info2=new Information("kumar",24,"sharan","Chennai");
		Information info3=new Information("federer",35,"fed","serbia");
       
		HashMap hm=new HashMap();
		hm.put("P1", info1);
		hm.put("P2", info2);
		hm.put("P3", info3);
		
		Set info=hm.entrySet();
		Iterator itr1=info.iterator();
		while(itr1.hasNext()) {
			Map.Entry data=(Entry) itr1.next();
			System.out.println("Passport Number:"+data.getKey()+" "+"Info:"+data.getValue());
			
			
		}
	}
}

//Output:
//Passport Number:P1 Info:Ashish 24 Ashish Hyderabad
//Passport Number:P2 Info:kumar 24 kumar Chennai
//Passport Number:P3 Info:federer 35 federer serbia

//9.Difference between HashMap(c) and LinkedHashMap(c)

//               Map(I)
//                |
//                |
//            HashMap(C)
//                |
//                |
//           LinkedHashMap(C)
  
//HashMap
//->introduced in java 1.2 version
//->it follows HashTable data structure internally.
//->Order of insertion is not preserved.
//->it is parent of LinkedHashMap

//LinkedhHashMap 
//->it is introduced in java 1.4 version
//->it follows HashTable and LinkedList data structure internally.
//->Order of insertion is preserved.
//->it is subclass of HashMap.