//Rule-5:
//Advantage of try with resources concept is finally block 
//will become dummy because we are not required to close
//resources explicitly.
	
//->finally is resource releasing logic.
//->till JDK 1.6 version finally is hero
//->in JDK 1.7 version it is zero.
//public class Exception36 {
//
//	public static void main(String[] args) {
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
//	}
//}

//Rule-6: try with resource nesting is also possible.

//try(R1){
//	try(R2){
//		try(R3){
//		
//		}
//	}
//}
