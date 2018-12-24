package missiong.interviewbit;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {

    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int []current_range = new int[2];
        current_range[0] = -1;
        current_range[1] = -1;
        boolean changeFlag = true;
        int []max_range = new int[2];
        max_range[0] = -1;
        max_range[1] = -1;

        int current_sum = 0;
        int total_sum = 0;

        for (int i=0;i<A.size();i++){
            if(A.get(i)>=0){
                if(changeFlag==true){
                    current_range[0]=i;
                    changeFlag = false;
                }
                current_range[1] = i;
                current_sum+=A.get(i);
            }
            else{
                changeFlag = true;
                current_range[0]=-1;
                current_range[1] = -1;
                current_sum = 0;
            }

            if(total_sum<=current_sum){
                if(current_sum == total_sum){
                    if(current_range[1]-current_range[0] > max_range[1]-max_range[0]){
                        max_range[0] =current_range[0];
                        max_range[1] = current_range[1];
                    }
                }
                else{
                    total_sum= current_sum;
                    max_range[0] =current_range[0];
                    max_range[1] = current_range[1];
                }
            }
        }
        if(max_range[0]<0 && max_range[1]<0){
            return result;
        }
        for(int i=max_range[0];i<=max_range[1];i++){
            result.add(A.get(i));
        }


        return result;
    }


    public static void main(String[] args){
        ArrayList<Integer> a= new ArrayList<>();
        //Test Case 1
        a.add(-1);
        a.add(-1);
        a.add(-1);
        a.add(-1);
        //Test Case 2
//        a.add(-54961);
//        a.add(3510);
//        a.add(-50805);
//        a.add(-82137);
//        a.add(-39096);
//        a.add(-47421);
//
        //Test Case 3
//        a.add(1);
//        a.add(2);
//        a.add(5);
//        a.add(-7);
//        a.add(2);
//        a.add(5);

        System.out.println(maxset(a));
    }
}
