class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean []arr=new boolean[1001];
        for(int num:nums2){
            arr[num]=true;
        }
        int []ans=new int[Math.min(nums1.length,nums2.length)];
        int index=0;
        for(int num:nums1){
            if(arr[num]){
                ans[index++]=num;
                arr[num]=false;
            }
        }
        return Arrays.copyOf(ans,index);
    }
}