class ThreadPriority extends Thread {
    public void run(){
        System.out.println("Inside run method");
    }
 
    public static void main(String[] args){
        System.out.println("PROGRAM TO SET PRIORITY OF THREADS-");

        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();
 
        System.out.println("t1 thread priority : "+ t1.getPriority());
 
        System.out.println("t2 thread priority : "+ t2.getPriority());
 
        System.out.println("t3 thread priority : "+ t3.getPriority());
 
        // Setting priorities of above threads
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
 
        System.out.println("t1 thread priority : "+ t1.getPriority());
 
        System.out.println("t2 thread priority : "+ t2.getPriority());
 
        System.out.println("t3 thread priority : "+ t3.getPriority());
 
        System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
 
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
 
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
    }
}