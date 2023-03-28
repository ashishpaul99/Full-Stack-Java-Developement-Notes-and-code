//5. Run Time Error
//-> it occurs during run time of Application.

//Example-1: stack over flow
//see picture at : 1:00:00
//Run time stack
//->when control comes to main method. 
//->the stack frame of main method is created in run time 
//  stack.
//->Alpha method is called in main method so alpha() method 
//  stack is created in run time stack.
//->then control goes to alpha and inside alpha() method 
//  again alpha() method is called.
//->Until the capacity of run time stack the alpha method 
//  stacks are created.
//->at one it overflow.
//->here syntax is correct logic is wrong.

//class Test{
//	public static void alpha() {
//		alpha();
//	}
//}
//public class Exception26{
//	public static void main(String[] args) {
//		Test t=new Test();
//		Test.alpha();
//	}
//}

//output:
//	Exception in thread "main" java.lang.StackOverflowError
//	at Test.alpha(Exception26.java:21)......

				
//Example-2: out of memory
//->Arrays in java are fixed size.
//->it also demands contagious memory allocation.
//->those many contagious memory allocation is not available
//  it will be out of memory.
//->it will use disperse memory allocation arrays.
//->that much memory is not available in heap area.
//->Impossible to 1000000000*4=4GB contiguously on the heap.
//->if Execution of method is finished then deallocation of 
//  memory takes place.

//public class Exception26{
//	public static void main(String[] args) {
//		 int[] a=new int[1000000000];
//	}
//}

//output:
//	Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//	at Exception26.main(Exception26.java:40)

//->At run time of Application two things can happen or 
//two unwanted events can occur
//1. Run time error - OutOfMemoryError, StackOverflowError
//2. Exception-  NullPointerException, ArrayIndexOutOfBoundsException,
//               ArithmeticException

//6. If-else vs try-catch
//=>if you use if and else instead of try catch
//->the program will not be optimized.
//->we cannot propagated exception to other classes by if and
//else.
//->we can propagate exception to caller by Re-throwing 
//exception in try-catch.



