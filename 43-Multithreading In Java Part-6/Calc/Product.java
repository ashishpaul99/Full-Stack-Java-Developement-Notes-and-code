//=>making product example
//->need of employes
//->need laptop for work
//->empolyee need to work with laptop and computer.
//->whatever company gives he has to take.
//->if you have one abstract method then class become abstract.
//->in interface we cannot define methods.

//->if you want seperate behaviour you need seperate class.


interface  Computer
{
	 void compile();
}

class Ipad implements Computer {
	public void compile() {
		System.out.println(" compiling code on Ipad");
	}
}
class Laptop implements Computer{
	public void compile() {
		System.out.println("Compiling code on laptop");
	}
}
class Desktop implements Computer{
	public void compile() {
		System.out.println("Compiling code on desktop");
	}
}

class Alien
{
	public void code(Computer obj) {
		
		obj.compile();
	}
}

public class Product{
	public static void main(String args[]) {
		
//		giving employer a Desktop to work
//		Computer machine =new Desktop();
		
//		giving employer a Laptop to work
//		Computer machine=new Laptop();
		
		
//		Computer machine=new Computer() {
//		public void compile() {
//			System.out.println("Portable compiling code");
//		}
//		};
		
		
//		above code using lambada expression
		Computer machine =()->System.out.println("Poratable compiling code");
		Alien obj=new Alien();
		obj.code(machine);
	}
}
