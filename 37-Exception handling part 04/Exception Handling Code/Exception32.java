

//30th Nov Live Class Exception handling part 04
//Nithin sir | I worked on 29/03/23

//=>Agenda
//->Exception Handling
//1. try with resources 
//2. try with multi-catch block
//3. Rules of Overriding associated with exception

//Topics left by nithin sir previously
//1. InstanceOf vs isInstanceOf(Object obj)
//2. How to create a user defined package and in real time 
//   project and in real time project how it is used?

//Live class notes
//>see picture in notes:17:21
//1. File concept-
//->Inside Hard desk files are stored.
//->.txt file in hard desk.
//->writing java code which has to read the text file which 
//  in hard disk.
//->to read we need medium. since it is connect to file this 
//  stream is called as FileReader(".text"). 
//  it is file reader object.
//->this file reader object is connected to Buffer reader.


//                        ------|     |
//			.java file---       |.txt |
//            			|-------|     |
//                      |
//                      |
//                 Buffer Reader
//                    medium

//1.1 Code Explanation
//1. Resource- an object which is used inside a code and 
//Performed operation.
//                        or
//->an inbuilt class for which object is created using that
//  object a call made to methods to perform some operation.
//->Buffer Reader is Resource.
//->it is prime duty to close the resources.
//->in finally block a logic is written to close the resource.

//<class notes>
//-> Until jdk1.6, it is compulsorily required to write 
//   finally block to close all the resources which are open 
//   as a part of try block.
//<class notes>

//code see in 23:50

//	BufferedReader br=null; <--Resource
//	try {
//   //risky code
//	br=new BufferedReader(new FileReader("sample.txt"));
//	
//	 //use br and perform read operation
//  }
//  catch(IOEexception e) {
//  //handling code
//     e.printStackTrace();
//    }
//    catch(Exception e) {
//     //handling code
//     e.printStackTrace();	
//    }
//    finally {
//    	closing the resource
//    	if(br!=null)
//    		br.close();
//    }

//=>1.2 Resources in real time project
//->In real time project there are around 30 resources or more.
//->inside finally block logic has to be written to close all
//  30 resources.
//->finally block will be more in lines.
//->code will be more, if we write logic to close many 
//  resources in finally block.

//=>1.3 Problem with writing a code for resource releasing or 
//  closing

//<class notes>
//=>Problems in the approach
//1. Compulsorily the programmer is required to close all 
//   opened resources which increases the complexity of the
//   program
//2. Compulsorily we should write finally block explicitly, 
//   which increases the length of the code and reviews 
//   Readability.
//3. To Overcome this problem SUN MS introduced 
//   try with resources in "1.7" version of jdk.
//<class notes>

//->if code is written using try-catch-finally there is 
//  disadvantages.
//->code will be more, if we write logic to close many 
//  resources in finally block.
//->which increases complexity and decreases readability.
//->check weather resource is not null. if it is not
//  null then close resource.
//eg:
//    finally {
//    	closing the resource
//    	if(br!=null)     //checking
//    		br.close();  //closing
//    }

//->Above code which would repeat multiple times our 
//  project with small change or with no change. 
//->such code we call it as "Boilerplate".



//=>1.4 Solution for the problem
//->To Overcome this problem SUN MS introduced 
//  try with resources in "1.7" version of jdk.
//->sun micro system team come with solution for the problem 
// in JDK 1.7 version.
//->in JDK 1.7 version they come up with a feature.
//  it is called try with resource.
//  try(R)-> try with resource.
//->if you use try-catch-finally  it is responsibility of 
//  developer to write boilerplate code to close up the 
//  resource.
//->if developer using JDK 1.7 version and above they have 
//  come up with a feature called try with resource.
//->try(R)-> try with resource will resolve the problem.
//->Problem is in finally block where code has to written 
//  for closing the resource.

//->class notes<-
//1.7 version Enhancements
//========================
//1. try with resource
//2. try with multicatch block
//->class notes<-

//=>1.5 How try with resources will make sure to close the 
//  resources?
//->no need to write code in finally by developer when we 
//  use try with resource feature.
//-> no need to write logic in finally block to close 
//   resources.
 

//1.5.A->Code written using try with resource - try(R)
//-> Resource automatically closed once control comes to 
//  end of the try block.
//->we don't need finally block which boilerplate logic
//  is written in it to close the resource.
//->automatically Resource will closed once control comes to 
//  end of the try block either normally or abnormally
//  we are not required code explicitly.

// try (BuuferReader br=new BufferReader(new FileReader("sample.txt")
//    {
//	  //->use br based on requirement.
      //->br will closed automatically once the control 
//        reaches to the end of try block.
//      ->automatically Resource will closed once control 
//        comes to end of the try block either normally or 
//        abnormally we are not required code explicitly.

//    }
//    -> at this line br will closed automatically
//    catch(IOEexception e) {
//    //handling code
//     e.printStackTrace();
//    }
//    catch(Exception e) {
//     //handling code
//     e.printStackTrace();	
//    }


//1.5 B->Code written using try-catch-finally
//->here resource is closed by writing logic in finally block
//->this is not good approach.
//	BufferedReader br=null; <--Resource
//	try {
//   //risky code
//	br=new BufferedReader(new FileReader("sample.txt"));
//	
//	 //use br and perform read operation
//  }
//  catch(IOEexception e) {
//  //handling code
//     e.printStackTrace();
//    }
//    catch(Exception e) {
//     //handling code
//     e.printStackTrace();	
//    }
//    finally {
//    	closing the resource
//    	if(br!=null)
//    		br.close();
//    }

//1.6 Advantage of try with resource
//1. Lines of code is less
//->JVM takes charge to close resource if we use try with 
//  resource.
//2. No readability disturbance.
//3. decreases complexity and increases readability












