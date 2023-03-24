//Unchecked Exception
//Checked Exception

//see notes 2:15:00
//1. All classes Exception are presnt in java.lang package
//->Usually in catch block exception class name is mentioned.
//-> these class used are in built classes.
//->we have not used import statement while using Exception 
//names in catch block.
//->all the classes of Exception present in java.lang package. 
//->so no need to import this package.

//here xxx is exception class name
//				catch(xxx e)
//				     |
//				 class name(In built classes)
//				     |
//				  no import
//				     |
//				  java.lang
				 
    

//Unchecked Exception
//Checked Exception

//2. Partially checked Exception class
//->such a class whose child classes both is checked and 
//  unchecked.
//->if there is parent class whose child classes both 
//  checked and also Unchecked then we call 
//  Partially checked Exception class
//-> Exception is parent of all Exception.
//->it is parent of Checked and Unchecked Exception also.
//->it is called partially checked Exception class
     
     
//eg:
//1. Unchecked exceptions-
//   ArrayIndexOutOfBoundsException 
//2. Checked Exception-
//   InterruptedException
//   NullPointerException

//See notes at 2:23:00-picture

//3. Exception Hierarchy 
//->Parent of all classes in java is Object. 
//->all exception under runtime are Unchecked exceptions.
//->Interrupted and IO Exceptions are Checked Exceptions.
//->Exception class is partially checked Exception class.

//->what if there is exceptions which none of these handles?
//->in this case java allows to create own exception.
//they are called User Defined Exception or Custom Exception.


         
