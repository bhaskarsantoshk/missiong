package leetcode;

import java.util.HashMap;
import java.util.Arrays;

public class P1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap < Integer, Integer > map = new HashMap < > ();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        //System.out.println(map);
        int result[] = new int[2];
        result[0] = -1;
        result[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                if (nums[i] == target - nums[i]) {
                    if (map.get(nums[i]) > 1) {
                        result[0] = i;
                    }
                } else {
                    result[0] = i;
                }
            }
        }

        if (result[0] != -1) {
            int temp = target - nums[result[0]];
            for (int i = 0; i < nums.length; i++) {
                if (i != result[0] && nums[i] == temp) {
                    result[1] = i;
                }
            }

            Arrays.sort(result);
            //  System.out.println(result[0]+" "+result[1]);
            return result;
        }

        return null;



    }

    public static void main(String[] args) {
        int nums[] = {
                2,
                7,
                11,
                15
        };
        int target = 9;
        P1TwoSum obj = new P1TwoSum();
        int result[] = obj.twoSum(nums, target);
    }

}