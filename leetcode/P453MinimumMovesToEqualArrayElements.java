package leetcode;

public class P453MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
            if(nums.length==0){
                return 0;
            }

            int min=nums[0];

            for (int x: nums){
                min = Math.min(min,x);
            }

            int res=0;

            for(int x: nums){
                res+= (x-min);
            }

            return res;
    }
}
