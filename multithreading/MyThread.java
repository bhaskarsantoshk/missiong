package multithreading;
import java.lang.Thread;

public class MyThread extends Thread {
    String word;

    public MyThread(String rm){
        word=rm;
    }

    public void run(){
        try{
            for(;;){
                System.out.println(word);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Sleep interrupted");
        }
    }

    public static void main(String[] args){
        Thread t1= new MyThread("First Thread ");
        Thread t2 = new MyThread("Second Thread");

        t1.start();
        t2.start();
    }
}
