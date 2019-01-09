package missiong.interviewbit;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.binarySearch;

public class NobleInteger {
    int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for (Integer x : A) {
            int lastIndex = binarySearchLastIndex(A, x);
            if (A.size() - lastIndex - 1 == x) {
                return x;
            }
        }
        return -1;
    }

    private int binarySearchLastIndex(ArrayList<Integer> a, Integer x) {
        int l = 0;
        int h = a.size() - 1;
        int result = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (a.get(mid) == x) {
                result = mid;
                l = mid + 1;
            } else if (a.get(mid) > x) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println((new NobleInteger()).solve(al));
    }
}
