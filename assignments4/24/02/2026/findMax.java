 public class findMax {
    public int findMax(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        int minIndex=left;
        int maxIndex=(minIndex-1+nums.length)%nums.length;
        return nums[maxIndex];

        
    }
}