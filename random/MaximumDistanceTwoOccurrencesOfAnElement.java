package missiong.random;

import java.util.HashMap;

public class MaximumDistanceTwoOccurrencesOfAnElement {
    public static void main(String[] args){
        int arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        System.out.println(maxDistance(arr));
    }

    private static int maxDistance(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max_distance = -1;
        int distance =0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                    distance = i - map.get(arr[i]);
            }
            else{
                map.put(arr[i], i);
            }
            max_distance = Math.max(distance, max_distance);
        }

        return max_distance;
    }
}
