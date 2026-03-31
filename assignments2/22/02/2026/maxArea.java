class Solution {
    public int maxArea(int[] height) {
        int first=0;
        int last=height.length-1;
        int maxWater=Integer.MIN_VALUE;
        while(first<=last){
            int containerHeight=Math.min(height[first],height[last]);
            int containerWidth=last-first;
            int water=containerHeight*containerWidth;
            maxWater=Math.max(maxWater,water);
            if(height[first]<height[last]) first++;
            else last--;
        }

        return maxWater;
    }
       
    
}