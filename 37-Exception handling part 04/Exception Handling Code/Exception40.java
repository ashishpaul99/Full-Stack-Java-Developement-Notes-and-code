
//6.1 Rules w.r.t Overriding
//Rule 
//While Overriding if the child class method throws any
//checked exception compulsorily the parent class method should
//throw the same checked exception or its parent otherwise 
//we will get Compile Time Error. There are no restrictions 
//on UncheckedException.

//case-1
//Parent: public void methodOne() throws Exception
//Child: public void methodOne()
//output: valid

//case-2: Child class thorws exception but parent class
//method is not thowing unchecked exception compiler gives 
//error. 
//parent: public void methodOne(){}
//child : public void methodOne() throws Exception{}
//output: invalid

//case-3-child and parent class method throwing same 
//        exception.
//parent: public void methodOne()throws Exception{}
//child : public void methodOne()throws Exception{}
//output: valid
//

//case-4: child and parent class methods are throwing same
//        Checked Exception.
//parent: public void methodOne()throws IOException{}
//child : public void methodOne()throws IOException{}
//output: valid

//case-5: IOException is parent of FileNotFoundException,
//        EOFException 
//parent: public void methodOne()throws IOException{}
//child : public void methodOne()throws FileNotFoundException,EOFException{}
//output: valid

//case-6: IOException is parent of FileNotFoundException but
//for InterruptedException parent is Exception
//parent: public void methodOne()throws IOException{}
//child : public void methodOne()throws FileNotFoundException,InterruptedException{}
//output: invalid

//case-7: IOException is parent of FileNotFoundException 
//for ArithmeticException is unchecked the rule is not 
//applicable. so it is valid
//parent: public void methodOne()throws IOException{}
//child : public void methodOne()throws FileNotFoundException,ArithmeticException{}
//output: valid

//case-8: All exception thrown by child class methods are 
//unchecked Exceptions so rule is not applicable.
//parent: public void methodOne()
//child : public void methodOne()throws ArithmeticException,NullPointerException,RuntimeException{}
//output: valid

//case-9: IOException is child of Exception according the 
//        rule it invalid.
//        ->when child class method throws exception then 
//          Parent class method must throw same Exception or 
//          parent Exception. 
//parent: public void methodOne()throws IOException{}
//child : public void methodOne()throws Exception{}
//output: invalid

//case-10: Throwable is parent of EXception and IOException
//         is child of EXception it is valid.
//parent: public void methodOne()throws Throwable{}
//child : public void methodOne()throws IOException{}
//output: valid

