package missiong.random;
import java.util.HashMap;
public class FindElementThatOccursKTimes {
    public static void main(String[] args){
        int a[]={1, 7, 4, 3, 4, 8, 7};
        int k= 2;
        System.out.println(elementThatOccursKTimes(a,k));
    }
    private static int elementThatOccursKTimes(int[] a, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hm.keySet().contains(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (hm.get(a[i]) == k) {
                return a[i];
            }
        }
        return -1;
    }
}