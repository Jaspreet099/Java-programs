public class threadPriority extends Thread{
    public void run(){
    System.out.println("Priority of thread is:" + Thread.currentThread().getPriority());
    }
    public static void main(String[] args){
        threadPriority t1 = new threadPriority();

        t1.setPriority(Thread.MAX_PRIORITY);
        // t1.setPriority(Thread.MIN_PRIORITY);
        // t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
    }
}

