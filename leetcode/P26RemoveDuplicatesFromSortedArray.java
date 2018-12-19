package leetcode;

public class P26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len=1;
        if(nums.length == 0){
            return 0;
        }

        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i]){
                index++;
                nums[index]=nums[i];
            }
        }
       
        return index+1;
    }
}
