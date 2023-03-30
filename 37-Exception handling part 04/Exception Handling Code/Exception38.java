//4. throw vs throws
//throw =>handle the exception using catch block and throw it
//        back the exception object to the caller.
//throws=>method signature and commonly used if the exception 
//        is "CheckedException".


//5. CheckedException vs UnCheckedException
//CheckedException => compiler will check for the handling 
//code only then compilation is successful.
//eg:IOException,SQLException,..... are all checked exceptions.

//UnCheckedException => compiler will not check for the handling 
//code,but jvm will come into picture and possibility of 
//"Successful" or "abnormal" termination.
//eg: RunTimeException and its child classes Error and its 
//    child classes are all "UncheckedException".

//-> Runtime exception and error are unchecked exceptions.
//in Exception hierarchy
