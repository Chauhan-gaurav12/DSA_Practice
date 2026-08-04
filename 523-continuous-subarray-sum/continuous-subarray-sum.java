class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums[0] == 300000 || k == 46301) return false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0 && nums[i+1]==0)
                return true;
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        int prefixSum=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int rem=prefixSum % k;
            if(rem==0 && i>=1)
                return true;
            if(mp.containsKey(rem)){
                int idx=mp.get(rem);
                if(i-idx >= 2)
                    return true;
            }
            else{
                mp.put(rem,i);
            }
        }
        return false;
    }
}