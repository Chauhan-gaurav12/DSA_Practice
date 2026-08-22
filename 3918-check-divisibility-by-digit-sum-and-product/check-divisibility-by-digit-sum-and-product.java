class Solution {
    public boolean checkDivisibility(int n) {
        if(n<1)
            return true;
        int sum=0;
        int num=n;
        int product=1;
        while(num>0){
            int temp=num%10;
            sum+=temp;
            product*=temp;
            num/=10;
        }

        if(n % (sum+product)==0)
            return true;
        return false;
    }
}