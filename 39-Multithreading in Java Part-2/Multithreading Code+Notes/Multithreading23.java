//MyRunnable r=new MyRunnable();
//Thread t1=new Thread();
//Thread t2=new Thread(r);

//case1: t1.start()
//case2: t2.start()
//case3: t2.run()
//case4: t1.run()
//case5: r.start()
//case6: r.run()

//Questions

//1. In which of the above cases a new Thread will be created
//which is responsible for the execution of MyRunnable run()
//method ?
//t2.start();


//2. In which of the above cases a new Thread will be created?
//t1.start();
//t2.start();

//3. In which of the above cases MyRunnable class run() will
//   be executed?
//t2.start();
//t2.run();
//r.run();