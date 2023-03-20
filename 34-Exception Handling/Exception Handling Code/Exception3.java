//1. Exception Handling-
//exception handling is process of handling exception in such
//a manner because of which abnormal termination application 
//should not happen.

//see notes
//Exception--> unwanted event--> runtime--> abnormal
// handling Exception--> abnorml termination not to be 
// happen

//keywords we use 
//try, catch, throws,throw, finally....
//see notes

//Runtime stack- anything in program brougth into run time 
//stack for execution.
//see picture

//thread will execute everything in run time stack.
//any activity we write inside method. it is brought into 
//to run time stack for execution. here thread will exceute that
//activity.

//if there is no mistake in logic and user given correct input 
//then there will be no exception.

//it user give wrong input or logic is wrong it throws exception.
//in which ever method exception or unwanted event occurs that 
//Particular method create Exception object.
//eg:
//1. if error occurred in add method then add method creates 
//exception object.
//2. if error occurred in main method then main method creates 
//exception object.


//see notes at 01:03:00
//in whichever stack frame where exception is occurred or generated
//that particular stack frame create one exceptional object.
//that exception will be thrown to jvm.
//->inside jvm there rts(run time system).
//->jvm internally use rts(run time system) it will do later 
//Activities.
//-> it will find out in same stack frame or code where 
//->method is present wheather developer the developer handled
//the exception or not.
//if we handle exception the matter will go to that part.
//if it not handled then matter jvm will give to 
//default exception handler.
//if it is still not handles os come into picture.
//if OS also fail then crash will happen.










public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
