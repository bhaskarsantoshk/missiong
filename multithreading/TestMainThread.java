package multithreading;

public class TestMainThread  extends  Thread{
    public static void main(String[] atrgs){
        // getting reference to Main thread
        Thread t = Thread.currentThread();

        //getting name of the Main thread
        System.out.println(t.getName());

        // changing the name of Main thread
        t.setName("Geeks");
        System.out.println("After name change: " + t.getName());

        // getting priority of Main thread
        System.out.println("Main thread priority: "+ t.getPriority());

        // setting priority of Main thread to MAX(10)
        t.setPriority(MAX_PRIORITY);

        System.out.println("Main thread new priority: "+ t.getPriority());

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Main thread");
        }

        // Main thread creating a child thread
        ChildThread ct = new ChildThread();

        // getting priority of child thread
        // which will be inherited from Main thread
        // as it is created by Main thread
        System.out.println("Child thread priority: "+ ct.getPriority());

        // setting priority of Main thread to MIN(1)
        ct.setPriority(MIN_PRIORITY);

        System.out.println("Child thread new priority: "+ ct.getPriority());

        // starting child thread
        ct.start();

    }
}


class ChildThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Child thread");
        }
    }
}

/*

Relation between the main() method and main thread in Java

For each program, a Main thread is created by JVM(Java Virtual Machine).
The “Main” thread first verifies the existence of the main() method, and then it initializes the class.
Note that from JDK 6, main() method is mandatory in a standalone java application.

 */