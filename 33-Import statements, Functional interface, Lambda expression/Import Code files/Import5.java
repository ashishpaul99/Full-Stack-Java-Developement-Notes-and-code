//==>Case 6:
//	Whenever we are importing a package all classes and interfaces present in that
//	package are by default available but not
//	sub package classes.
//	java
//	 |=> util
//	 |=> Scanner.class,ArrayList.class,LinkedList.class
//	 |=> regex
//	       |=> Pattern.class
	

//	To use Pattern class in our Program directly which import statement is required ?
//	a. import java.*;
//	b. import java.util.*;
//	c. import java.util.regex.*; //valid(implicit import)
//	d. import java.util.regex.Pattern;//valid(explicit import)

//	Note:
//	'*'=> it refers to only .class files not sub packages .class files
//	


//	  java(folder)
//	  	 -->util-it contain .class files and one folder regex
//	  	    -->Scanner.class, ArrayList.class,List.class,---
//	  		-->regex-in regex we have pattern class
//	  			-->pattern.class
		
		
//==>Case7:

//In any java Program the following 2 packages are not require to import because
//these are available by default to every java Program.
//1. java.lang package
//2. default package(current working directory)

//which .class files need not tell to jvm and compiler?
//javac designed to check load .class file in current working 
//directory(default Package)

//refer picture of java folder

//==>Case 8: CLass notes
//"Import statement is totally compile time concept" 

//if more no of imports are there then more will be the 
//compile time.

// but there is "no change in execution time".


//Difference between C language #include and java language import ?
//#include
//=======
//1. It can be used in C & C++
//2. At compile time only compiler copy the code from standard library and placed in
//current program.
//3. It is static inclusion
//4. wastage of memory
//Ex : <jsp:@ file="">
//import
//======
//1. It can be used in Java
//2. At runtime JVM will execute the corresponding standard library and use it's
//result in current program.
//3. It is dynamic inclusion
//4. No wastage of memory
// Ex : <jsp:include >
//Note:
// In the case of C language #include all the header files will be loaded at the time
//of include statement hence it follows static loading.
// But in java import statement no ".class" will be loaded at the time of import
//statements in the next lines of the code whenever we are
// using a particular class then only corresponding ".class" file will be loaded.
//Hence it follows "dynamic loading" or
// "load-on -demand" or "load-on-fly".

//==> live class notes
// c/c++==>#include<stdio.h> and java==> import java.lang.* are same?

//in c/c++==>#include<stdio.h>
//java==> import java.lang.*;	

//see picture for explanation

//both of this concepts are at compiler level
//==>c/c++-->#include<stdio.h>
//   3000+ functions are available
//   compiler bring all 3000+ functions to code.
//   it is bringing and keeping at compile time only.
//	so we this inclusion Static Inclusion. 
//	compiler only doing all.

//java==> import java.lang.*;
//  there are 300+ classes. 
//  javac is not make inclusion but it checks for the 
//  classes in packages.

//example: if we use System that time jvm will load 
//System class only when it is needed so we call it as 
//Dynamic inclusion.

//when a class is used in program then only it loads.
//whenever it is required jvm load .class files

//memory is effectively used in java

//==> 1. name of the jar file which contains these .class files
//jar file is converted into .exe file 
//what is the name of the jar file which contains these 
//.class files?
//>>jar called rt.jar. 
//(we call it as runtime.jar)

//==>JDK 1.5 versions new features :
//1. For-Each
//2. Var-arg
//3. Queue
//4. Generics
//5. Auto boxing and Auto unboxing
//6. Co-varient return types
//7. Annotations
//8. Enum
//9. Static import
//10. String builder



  
                 















		


