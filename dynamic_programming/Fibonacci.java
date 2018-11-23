package dynamic_programming;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("get_fib(5) = "+ get_fibonacci_rec(5)); // 5
        System.out.println("get_fib(5) = "+ get_fibonacci_rec(9)); // 34
        System.out.println("get_fib(5) = "+ get_fibonacci(5)); // 5
        System.out.println("get_fib(5) = "+ get_fibonacci(9)); // 34
    }
    //Recursive
    static int get_fibonacci_rec(int n) {
        if(n==0 || n==1){
            return n;
        }
        return get_fibonacci_rec(n-1) +  get_fibonacci_rec(n-2);
    }
    static int get_fibonacci(int n) {
        if (n== 1 || n==0){
            return n;
        }
        int first = 0;
        int second = 1;
        for(int i = 2; i <= n; i++){
            int temp = second;
            second = first+second;
            first= temp;
        }
        return second;
    }
}
