class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int top=-1;
        int []stack=new int[n*2];
        int []res=new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(top!=-1 && nums[i%n]>=nums[stack[top]]){
                top--;
            }
            res[i%n]=(top==-1)? -1 : nums[stack[top]];
            stack[++top]=i%n;
        }
       return res;
    }
}