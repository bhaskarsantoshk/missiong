package missiong.arrays;
public class BinarySearch {
 public static void main(String[] args) {
  int[] arr1 = {1,2,4,7,8,12,15,19,24,50,69,80,100};
  System.out.println("Key(12) found at: "+binSearch(arr1,12));
  System.out.println("Key(44) found at: "+binSearch(arr1,44));
  System.out.println("Key(80) found at: "+binSearch(arr1,80));
 }

 
 
 
 
 

 static int binSearch(int[] a, int key) {
  int l= 0;
  int r = a.length-1;
  while (l<=r){
   int mid = l + (r-l)/2;
   if (a[mid]== key){
    return mid;
   }
   else if (a[mid] < key){
    l = mid+1;
   }
   else{
    r = mid-1;
   }
  }
  return -1;
 }

 static int binary_search_rec(int[] a, int key, int low, int high) {
    if (low > high){
     return -1;
   }

   int mid = low + (high - low)/2;

    if(a[mid]== key){
     return mid;
    }
    else if(a[mid] > key){
     return binary_search_rec(a,key, mid+1, high);
    }
    else{
     return binary_search_rec(a, key, low, mid-1);
    }

 }
}
