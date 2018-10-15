package arrays;
import java.util.Arrays;

public class MoveZerosToLeft {
 static void move_zeros_to_left_in_array(int[] A) {
  //TODO: Write - Your - Code
  int i = A.length - 1;
  int index = A.length - 1;
  while (i >= 0) {
   if (A[i] != 0) {
    A[index] = A[i];
    if (index != i) {
     A[i] = 0;
    }
    index--;
   }

   i--;
  }
 }

 public static void main(String[] args) {
  int[] v = new int[] {
   1,
   10,
   -1,
   11,
   5,
   0,
   -7,
   0,
   25,
   -35
  };
  System.out.println("Original Array: " + Arrays.toString(v));
  move_zeros_to_left_in_array(v);
  for (int i = 0; i < v.length; i++) {
   System.out.print(v[i] + ", ");
  }
 }
}
