//=> using this keyword to differentiate instacnce and local 
//   variable
//-> this- a current object
//A<-B<-C =>mult level inheritance

public class Cal4 {

		private int num1;
		private int num2;
		private int result;
		
		public Cal4(int num1, int num2) {
			this.num1=num1;
			this.num2=num2;
			
		}

		
		 void add() {
			result=num1+num2;
			System.out.println(result);	
		}


}
