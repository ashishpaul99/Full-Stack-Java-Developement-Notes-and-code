//Exceptional handling


//java programming-->executing means it is running.
//web application--> running

//see picture in notes
//.java file--> javac--> .class files(byte codes)
//-->jvm(executes)-->output

//there are two stages involved here
//stage-1 Compilation or Compile time(java file to .class file)
//stage-2 Execution or run time(.class file to output)
//application is running it means no compilation errors.
//compilation successful

//see picture
//1. compile time Error
//error in compile time because of language syntax 
//eg: 
//semi colon
//curly braces
//no need to worry because these errors we can rectify them

//2. run time error-
//during runtime we may get two errors
//a. run time error- due to logic error
//b. exception - because of faulty input by user and developer.
//developers need to worry when we get errors during run time.


//in between application get abruptly terminated that is called
//exception.

//eg- 10 lines are there. some problem in code. 
//at line 8 there me mistake. while running at 8th line
//application get abruptly terminated.


//Ineuron web application
//Internet - Connecting two devices.
//Web -  web is service on Internet.

//Web application-the application which required Internet 
//                 to run.
//contacts in mobile - no need internet to use.


//see pictures 38:00
//void disp()
//{
//	disp( );
//}

//-->when we call this method one stack will be created.
//inside method we can also another method
//when we compile we will not get any syntax error.

//while running we get stack over flow error during the run time.
//it is logical mistake of developer.

//our focus
//what are mistake we can get during runtime. 
//how to avoid that mistakes.


//1. 1-tier architecture(1970's)
//in early days - 1960s,70s see  pictures (41:01)
//->application is developed in one computer and in the same computer
//it is compiled and we use run also.
//->wherever development is happening there is only usage is happening.
//->if there is any abruption or abnormal termination in between
//then number users effected are less. so worry is less.


//2. tier architecture(1980's)
//if there is any abruption or abnormal termination in 
//between the numbers users effected are less.
//or
//if there is run time mistakes the numbers users effected are less.

//3. 1990-connect more computers along the world
//->Internet came in to picture.
//->before this the network system is Intra. only people 
//->within are connected by network.
//->the concept of www came.
//->device became more cheap.
//->as Internet architecture evolved. one system use to connect multiple
//people.
//the users of application are unlimited.
//one application can be accessed by many people.
//at that time if anyone give faulty input or mistakes in code. 
//it terminates abruptly or abnormally terminated. 
//number of users get effected are mores.
//java was evolving at that time.
//then they decided to have concept of exception handling.


