package leetcode;

public class P26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len=1;
        if(nums.length == 0){
            return 0;
        }

        int index=0;
        for(int i=1;i<nums.length;i++){
            if(a[index]!=a[i]){
                index++;
                a[index]=a[i];
            }
        }
       
        return index+1;
    }
}


// 1 1 2 3 3 3 4
// 1 2 3 4

