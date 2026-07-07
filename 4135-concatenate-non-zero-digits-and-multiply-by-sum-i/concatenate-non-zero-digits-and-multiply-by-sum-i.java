class Solution {
    public long sumAndMultiply(int n) {
        long res=0;
        long sum=0;
        long p=1;
        while(n>0){
          int temp=n%10;
          
          if(temp!=0){
            res+=temp*p;
            sum+=temp;
            p*=10;
          }
          n/=10;
        }
        
        return res*sum;
    }
}