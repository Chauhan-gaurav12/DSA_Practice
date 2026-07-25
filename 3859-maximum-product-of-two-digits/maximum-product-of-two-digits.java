class Solution {
    public int maxProduct(int n) {
        int max=n%10;
        n/=10;
        int Smax=n%10;
        n/=10;
        if(max<Smax){
            int temp=max;
            max=Smax;
            Smax=temp;
        }
        while(n>0){
            int digit=n%10;
            if(digit>max){
                Smax=max;
                max=digit;
            }
            else if(digit>Smax){
                Smax=digit;
            }
            n/=10;
        } 
        return max*Smax;
    }
}