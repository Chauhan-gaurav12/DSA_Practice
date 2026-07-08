class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
            return 0;
        Arrays.sort(nums);
        int i=0;
        int dif=0;
        while(i<nums.length-1){
            dif = Math.max(dif, nums[i + 1] - nums[i]);
            i++;
        }
        return dif;
    }
}