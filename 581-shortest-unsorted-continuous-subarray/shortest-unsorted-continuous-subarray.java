class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(nums[i] > nums[i+1]){
                min=Math.min(min,nums[i+1]);
                max=Math.max(max,nums[i]);
            }
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        // find index of left boundary
        int left=0;
        while(nums[left] <= min){
            left++;
        }
        int right=n-1;
        while(nums[right] >= max){
            right--;
        }
        return right-left+1;
    }
}