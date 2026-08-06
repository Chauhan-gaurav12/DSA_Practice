class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(helper(n) % t ==0){
                return n;
            }
            n++;
        }
    }
    private int helper(int n){
        int product=1;
        while(n>0){
            int temp=n%10;
            product*=temp;
            n/=10;
        }
        return product;
    }
}