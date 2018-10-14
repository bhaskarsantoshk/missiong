package codeforces;
import java.util.*;

public class CFContest1065PA {
 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);

  int t = in .nextInt();

  while (t != 0) {
   long s = in .nextLong();
   long a = in .nextLong();
   long b = in .nextLong();
   long c = in .nextLong();

   long x = a * c;
   long y = s / x;

   long z = a * y;
   long k = b * y;

   long temp = z + k;

   long rem = s % x;

   long f = rem / c;



   System.out.println(f + temp);

   t--;
  }

 }
}
