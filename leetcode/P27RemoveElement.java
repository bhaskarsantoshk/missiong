package leetcode;

public class P27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for( int i=0 ; i < nums.length ; i++ ){
            if(nums[i] != val ){
                nums[index]=nums[i];

                if(index != i){
                   nums[i] = val;
                }
                index ++;
            }
        }

        return index;
    }
}
