package multithreading;

public class Deadlocking {
    public static void main(String[] args){
        try {
            System.out.println(
   "You don't believe in me unless you know me well"
            );
            Thread.currentThread().join();

            System.out.println(
   "I won't let you know me well unless you start believing in me"
            );
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
