package leetcode;

public class P35SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left <= right ){
            int mid = left + ( right - left )/2;
            if(nums[mid] == target){
                return mid;
            }
            else if( nums[mid] > target ){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }

        return left;
    }

    public static void main(String args[] ){
        P35SearchInsertPosition obj = new P35SearchInsertPosition();
        int nums[]={1,3,5,6};
        int target = 5;
        System.out.println(obj.searchInsert(nums,target));

    }
}
