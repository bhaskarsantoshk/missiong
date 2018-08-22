package leetcode;

public class P169MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(count == 0){
                candidate = nums[i];
                count = 1;
                continue;
            }
            else {
                if ( candidate == nums[i]){
                    count++;
                }
                else{
                    count--;
                }
            }
        }

        if ( count == 0 ){
            return -1;
        }
        count = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            if( candidate == nums[i] ){
                 count ++;
            }
        }

        if ( count > nums.length / 2){
            return candidate;
        }
        else{
            return -1;
        }
    }
}
