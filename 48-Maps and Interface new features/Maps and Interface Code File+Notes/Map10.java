//=>Difference beteween HashMap and IdebtityHashMap
//In order to compare in HashMap we use equals().
//In order to compare in IdentityHashMap we use "==" symbol.
//->In String Buffer and String Builder equal method compares
//  refernces.
//->If we want to compare actual content using equals method
//  that particular class needs to override.
//->String equals() methods is overriding that reason it is comparing
//  actual content.
//->In IdentityHashMap Equals method is not overriden in 
//  IdentityHashMap class that's the reason equals() method
//  is not used to compare the content.


import java.util.*;

class Ineuron{
	int i;
	public Ineuron(int i) {
		this.i=i;
	}
	public String toString() {
		return i+" ";
	}
}
public class Map10 {

	public static void main(String[] args) {
		
		Hashtable ht=new Hashtable();
		ht.put(11, "Ashish");
		ht.put(12,"ravi");
		ht.put(13, "Surat");
		System.out.println(ht);//Output: {13=Surat, 12=ravi, 11=Ashish}
		
		Hashtable ht2=new Hashtable();
		ht2.put(new Ineuron(11),"Ashish");
		ht2.put(new Ineuron(12),"Ravi");
		ht2.put(new Ineuron(13),"Surat");
		System.out.println(ht2); //Output: {11 =Ashish, 13 =Surat, 12 =Ravi}
		
	}

}
