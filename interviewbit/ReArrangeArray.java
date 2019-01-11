package missiong.interviewbit;

import java.util.ArrayList;

public class ReArrangeArray {
    public void arrange(ArrayList<Integer> a) {
        int arr[] = new int[a.size()];
        for(int i=0;i<a.size();i++){
                arr[i] = a.get(i);
        }

        int n= a.size();

        for (int i=0; i < n; i++)
            arr[i] += (arr[arr[i]]%n)*n;

        // Second Step: Divide all values by n
        for (int i=0; i<n; i++)
            arr[i] /= n;

        a.clear();
        for(int x:arr){
            a.add(x);
        }
    }
}
