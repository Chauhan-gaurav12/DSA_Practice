class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)
            return false;
        int target = sum/ 2;
        // dp[i] will store if a sum of i is possible
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // Base case: a sum of 0 is always possible
        
        for (int num : nums) {
            // Traverse backwards to prevent using the same element multiple times
            for (int j = target; j >= num; j--) {
                if (dp[j - num]) {
                    dp[j] = true;
                }
            }
            // Optimization: Early exit if target is already achieved
            if (dp[target]) {
                return true;
            }
        }
        
        return dp[target];
    }
}