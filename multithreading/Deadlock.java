package multithreading;

public class Deadlock {
    public static void main(String[] args){
        try {
            System.out.println(
"You don't believe in me " +
        "unless you get to know me"
            );
            Thread.currentThread().join();


            System.out.println(
"I won't let you know me" +
        "unless you start believing in me"
            );
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
