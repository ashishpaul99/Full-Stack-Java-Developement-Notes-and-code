//Case-2

public class Wrapper8 {
	static Integer i1;//at runtime valur assigmned to i1=null
						
					  //jvm will give value for i1
	                  //this varible get space in method area.
	                  //method area belongs to heap area.
					  //heap area is under controll of jvm
					  
	                  

	public static void main(String[] args) {
		
		int i2=i1; //int i2=i1.valueOf():: NullPointerException
		System.out.println(i2);
		
		//it gives NullPointException
		

	}

}
