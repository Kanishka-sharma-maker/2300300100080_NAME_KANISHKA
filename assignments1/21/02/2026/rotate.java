public class rotate {

    public void rotate(int[] nums, int k) {

        int n = nums.length;   // array ka size
        k = k % n;             // agar k n se bada ho toh adjust

        int[] temp = new int[n];  // temporary array banaya

        // Step 1: elements ko rotate karke temp me daalna
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        // Step 2: temp se wapas nums me copy karna
        
    
       System.arraycopy(temp, 0, nums, 0, n);
    }

    
}
