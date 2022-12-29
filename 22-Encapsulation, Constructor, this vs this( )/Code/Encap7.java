class Car{
	private String name;
	private int cost;
	public String getName( ) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
public class Encap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.setName("BMW");
		System.out.println(c.getName());
		
		c.setCost(50000);
		System.out.println(c.getCost());
		

	}

}
