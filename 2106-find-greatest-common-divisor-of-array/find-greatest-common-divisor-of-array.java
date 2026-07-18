class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)
                min=nums[i];
            if(nums[i]>max)
                max=nums[i];
        }
        return gcd(max,min);
    }
    int gcd(int num1,int num2){
       while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
       }
       return num1;
    }
}