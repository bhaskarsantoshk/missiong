package multithreading;
import java.lang.Thread;

class MultiThreadingDemo extends  Thread{
    public void run(){
        try{
            System.out.println("Thread "+ Thread.currentThread().getId() +" is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}


class MultiThreadingDemo2 implements Runnable{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

public class Multithread{

    public static void main(String[] args){
        int n=8;
        for(int i=0;i<n;i++){
            MultiThreadingDemo obj1= new MultiThreadingDemo();
            //obj1.start();
            //Thread obj2 = new MultiThreadingDemo(); //Works
            //Thread obj3 = new Thread(); //works but do not print anything
            //Thread obj4 = new MultiThreadingDemo2(); //Compiler error - Incompatible Types
            //Whole idea of multi threading is to create multiple threads for the same object for parallel execution
            MultiThreadingDemo2 mt = new MultiThreadingDemo2();
            Thread obj5 = new Thread(mt);
            obj5.start();
        }
    }

}

/*
Thread Class vs Runnable Interface

1. If we extend the Thread class,
our class cannot extend any other class because Java doesn’t support multiple inheritance.
But, if we implement the Runnable interface, our class can still extend other base classes.

2. We can achieve basic functionality of a thread
by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc.
that are not available in Runnable interface.
 */