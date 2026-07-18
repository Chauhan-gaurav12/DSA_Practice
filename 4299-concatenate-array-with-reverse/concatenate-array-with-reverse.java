class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int [] arr=new int[2*n];
        int pos=2*n-1;
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[pos--]=nums[i];
        }
        return arr;
    }
}