package codeforces;
import java.util.*;

public class CFContest1058PA {
 public static void main(String args[]) {
  Scanner in = new Scanner(System.in);
  
  int n = in .nextInt();
  
  int sum = 0;
  while (n != 0) {
   sum += in .nextInt();
   n--;
   
  }
  String s = "EASY";
  
  if (sum != 0) {
   s = "HARD";
  }
  System.out.println(s);
 }
}
