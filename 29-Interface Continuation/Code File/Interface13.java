//example-1
//JVM become ambiguous
interface IDemo31
{
	int x=8888;
}

interface IDemo32
{
	int x=9999;
}
public class Interface13 {

	public static void main(String[] args) {
		
//		1-Compile
//		System.out.println(x); //we get error :x cannot be resolved to a variable

//		2-compile
		System.out.println(IDemo31.x); //output: 8888
		System.out.println(IDemo32.x); //output: 9999
	}

} 
