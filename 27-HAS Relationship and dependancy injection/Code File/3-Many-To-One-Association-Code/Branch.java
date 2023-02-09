package in.ashish.bean;


//Dependent object
public class Branch {
	String bid;
	String bName;
	
	
	//injecting values through getters and setters
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	
	

}
