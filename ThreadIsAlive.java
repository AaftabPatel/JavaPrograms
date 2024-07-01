public class ThreadIsAlive extends Thread{  
    public void run(){  
        try{  
            Thread.sleep(300);  
            System.out.println("run() method isAlive "+Thread.currentThread().isAlive());  
        }  
        catch (InterruptedException ie) {  
        }  
    }  
    public static void main(String[] args)  {  
        System.out.println("PROGRAM TO CHECK WHETHER A THREAD ISALIVE OR NOT-");
        ThreadIsAlive t1 = new ThreadIsAlive();  
        System.out.println("before starting thread isAlive: "+t1.isAlive());  
        t1.start();  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
    }  
}