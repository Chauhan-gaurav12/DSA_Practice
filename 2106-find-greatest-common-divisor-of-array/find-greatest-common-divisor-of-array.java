class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
        return gcd(max,min);
    }
    int gcd(int num1,int num2){
        if(num2==0)
            return num1;
        return gcd(num2,num1%num2);
    }
}