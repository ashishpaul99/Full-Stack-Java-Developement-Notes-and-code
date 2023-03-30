//see in notes at: 1:02:00

//Rule-3: All resource reference by default are treated as 
//implicitly final and hence we can't perform reassignment 
//with in try block.

//->br is pointing to sample.txt.
//->next br is pointing to output.txt. it no longer pointing 
//  to sample.txt.
//->when control comes out of try block which resource is 
//  closed.import java.io.BufferedReader;
//->no possibility to close both resources.

//->see notes 1:08:00
//->here br is final variable. 
//-> Compiler gives error when when you re points other
//   file.
//->output::CE: can't reassign a value

//eg:
import java.io.BufferedReader;
import java.io.FileReader;
public class Exception34 {
	public static void main(String[] args) {	
      try(BufferedReader br=new BufferedReader(new FileReader("Sample.txt"))){
           br =new BufferedReader(new FileReader("output.txt"));
      }
    //->br.close() will execute automatically and resource 
    //will be closed.
      catch(Exception e) {
    	  e.printStackTrace();
      } 
	}
}

//output:
//C:\Users\Ashishpaul\Desktop\java>javac new1.java
//new1.java:8: error: auto-closeable resource br may not be assigned
//           br =new BufferedReader(new FileReader("output.txt"));
//           ^
//1 error

//-> Compiler gives error when when you re points other
//   file.
//->Compiler makes first resource to final. it is not possible
//  to reassign br.
//->it is made final because in order to avoid confusion 
//  for compiler to close resources.
//->eg: 
// try(final BufferedReader br=new BufferedReader(new FileReader("Sample.txt")))
