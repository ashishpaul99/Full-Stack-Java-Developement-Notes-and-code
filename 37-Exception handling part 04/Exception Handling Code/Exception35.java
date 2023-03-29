//Rule-4: until 1.6 version try should compulsorily be 
//followed by either catch or finally, but from 1.7 version 
//we can take only take try with resources without catch or 
//finally.

//->for one try there must be catch block or finally block.
//->when try-finally is written in code exception if exception
//  Occurs it results in abnormal termination.
//->try with resource purpose to avoid finally block.
//->if exception let it occur.

//eg: 
//try(R){
//	 valid
//   }

//->no need of catch block with try with resource for 
//  if abnormal has to termination happen. 

public class Exception35 {

	public static void main(String[] args) {
//		
//		try
//		{
//            //Exception occurs => abnormal termination
// 									 because no catch block
//		}
//		finally {
//			
//		}
//				vs
//        try(R){
//        	  //Exception occurs => abnormal termination 
//                                   because no catch block
//        }
          
	}
}
