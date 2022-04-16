class myThread1 extends Thread{
    public void run(){
        System.out.println("my thread 1 is running");
        System.out.println("Im happy now");
    }
}

public class myThread{
    public static void main(String a[]){
        myThread1 t1 = new myThread1();
        t1.start();
    }
}