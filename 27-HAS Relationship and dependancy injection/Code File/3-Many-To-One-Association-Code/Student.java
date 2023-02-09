package in.ashish.bean;

public class Student {
	
		private String sId;
		private String sName;
		private String sAddr;
		
		
		//students are many joined in one branch
		Branch branch;


		// Injecting through setters and getters
		public String getsId() {
			return sId;
		}


		public void setsId(String sId) {
			this.sId = sId;
		}


		public String getsName() {
			return sName;
		}


		public void setsName(String sName) {
			this.sName = sName;
		}


		public String getsAddr() {
			return sAddr;
		}


		public void setsAddr(String sAddr) {
			this.sAddr = sAddr;
		}


		public Branch getBranch() {
			return branch;
		}


		public void setBranch(Branch branch) {
			this.branch = branch;
		}
		
		
		
		
		
		
		
		
		
		

	

}
