class myThreadRunnable1 implements Runnable{

    public void run(){
        System.out.println("This is my runnable interface");
    }
}

public class MyThreadRunnable {
    public static void main(String a[]){

        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        gun1.start();
    }
}