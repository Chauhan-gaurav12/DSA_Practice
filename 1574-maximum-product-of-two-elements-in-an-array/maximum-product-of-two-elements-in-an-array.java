class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max1=(nums[0]-1)*(nums[1]-1);
        int len=nums.length;
        int max2=(nums[len-1]-1)*(nums[len-2]-1);
        return Math.max(max1,max2);
    }
}