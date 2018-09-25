package microsoft;
import java.util.*;

public class ClosestNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t!=0){
            int n=in.nextInt();
            int m=in.nextInt();
            int sign=1;
            if(n<0){
                sign = -1;
                n *= sign;
            }
            if(m<0){
                m*=-1;
            }
            int q = n/m;
            int x = q* m;
            int y = (q+1) * m;
            int dx = Math.abs(x-n);
            int dy = Math.abs(y-n);
            int res = 0;
            if(dx == dy){
                res = Math.max(Math.abs(x),Math.abs(y));
            }
            else if(dx>dy){
                res = y;
            }
            else{
                res = x;
            }
            System.out.println(sign*res);
            t--;
        }
    }
}
