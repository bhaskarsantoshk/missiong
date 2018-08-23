package leetcode;

public class P198HouseRobber {
    public int rob(int[] nums) {
        int temp[] = new int[nums.length];
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        if( len == 1){
            return nums[0];
        }
        if( len == 2 ){
            return Math.max(nums[0] , nums[1]);
        }

        if( len == 3){
            return Math.max ( nums[0] + nums[2] , nums[1]);
        }

        temp[0] = nums[0];
        temp[1] = Math.max(nums[0], nums[1]);
        temp[2] = Math.max (  nums[0] + nums[2] , nums[1] );

        for( int i=3; i < len ; i++){
            temp [i] = Math.max ( temp[i-2] + nums[i] , temp[i-1] );
        }

        int max = 0;

        for(int i=0 ; i< temp.length ; i++){
            max = Math.max( max, temp[i] );
        }

        return max;
    }
}
