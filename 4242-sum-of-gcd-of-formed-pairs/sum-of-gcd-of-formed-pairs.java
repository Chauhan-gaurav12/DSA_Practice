class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=-1;
        int []prefixGcd=new int[n];
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            prefixGcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefixGcd);
        long ans=0;
        for(int i=0,j=n-1;i<j;i++,j--){
            ans+=gcd(prefixGcd[i],prefixGcd[j]);
        }
        return ans;
    }
    int gcd(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }
}