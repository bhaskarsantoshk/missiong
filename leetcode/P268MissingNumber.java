package leetcode;

public class P268MissingNumber {
    public int missingNumber(int[] nums) {

        int x=0;
        for (int i=0;i<nums.length;i++){
            x^=nums[i];
        }

        for(int i=0;i<=n;i++){
            x^=i;
        }

        return x
    }
}
