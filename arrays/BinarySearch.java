package arrays;

public class BinarySearch {
 public static void main(String[] args) {
  int[] arr1 = {
   1,
   2,
   4,
   7,
   8,
   12,
   15,
   19,
   24,
   50,
   69,
   80,
   100
  };
  System.out.println("Key(12) found at: " + bin_search(arr1, 12));
  System.out.println("Key(44) found at: " + bin_search(arr1, 44));
  System.out.println("Key(80) found at: " + bin_search(arr1, 80));
 }

 static int bin_search(int[] a, int key) {
  //return binary_search_rec(a, key, 0, a.length - 1);
  int low = 0;
  int high = a.length - 1;
  while (low <= high) {
   int mid = low + (high - low) / 2;

   if (a[mid] == key) {
    return mid;
   } else if (a[mid] > key) {
    high = mid - 1;
   } else {
    low = mid + 1;
   }
  }
  return -1;
 }

 static int binary_search_rec(int[] a, int key, int low, int high) {
  if (low > high) {
   return -1;
  }
  int mid = low + ((high - low) / 2);

  if (a[mid] == key) {
   return mid;
  } else if (a[mid] > key) {
   return binary_search_rec(a, key, low, mid - 1);
  } else {
   return binary_search_rec(a, key, mid + 1, high);
  }

 }
}
