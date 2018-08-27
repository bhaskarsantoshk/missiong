package leetcode;
import java.util.List;
import java.util.ArrayList;

public class P448FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int i=0;

        while ( i < nums.length ){
            int x = nums[i];

            while (x > 0){
                int temp= nums[x-1];
                nums [x-1] = -1;
                x = temp;

            }

            i++;
        }

        for( i=0; i<nums.length ; i++){
            if(nums[i] > 0 ) {
                list.add(i + 1);
            }
        }

        return list;
    }

    public static void main(String[] args){
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1};
        P448FindAllNumbersDisappearedInAnArray obj = new P448FindAllNumbersDisappearedInAnArray();
        System.out.println(obj.findDisappearedNumbers(nums));
    }
}
