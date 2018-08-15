package microsoft;
import java.util.*;

public class NthItemThroughSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while ( t!= 0){
          int m = in.nextInt();
          int n = in.nextInt();

          int a[] = new int[m];
          int b[] = new int[n];

          for(int i = 0; i < m ; i++) {
              a[i] = in.nextInt();
          }

          for (int i=0; i< n; i++) {
              b[i]=in.nextInt();
          }

          int N=in.nextInt();

          TreeSet<Integer> treeSet= new TreeSet<>();

          for(int i = 0 ; i < m ; i ++){
              for( int j = 0 ; j < n ; j ++){
                  treeSet.add( a[i] + b[j] );
              }
          }

          Iterator<Integer> iterator = treeSet.iterator();
          int count=1;
          int res=0;

          while(iterator.hasNext() && count <= N){
              res=iterator.next();
              count++;
          }

          System.out.println(res);
          t--;
        }
    }
}
