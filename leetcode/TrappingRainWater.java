package missiong.leetcode;

public class TrappingRainWater {


    public int trap(int[] height) {
        int water = 0;
        int length = height.length;
        int maxFromLeft= 0;
        int maxFromRight[] = new int[length];
        int maxSeenSoFar = 0;
        for(int i=length-1;i>=0;i--){
            if(height[i]>maxSeenSoFar){
                maxFromRight[i] = height[i];
                maxSeenSoFar = height[i];
            }
            else{
                maxFromRight[i] = maxSeenSoFar;
            }
        }

        for(int i=0;i<length;i++){
            water+= (Math.max(Math.min(maxFromLeft, maxFromRight[i])-height[i],0));
            maxFromLeft=Math.max(height[i], maxFromLeft);
        }

        return water;
    }
}