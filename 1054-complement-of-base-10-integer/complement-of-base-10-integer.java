class Solution {
    public int bitwiseComplement(int n) {
        // 0 complement always 1

        if(n==0)
            return 1;
        int mask=0;
        int temp=n;
        // Build a bitmask of 1s matching the bit length of n
        while(temp>0){
            mask=(mask<<1)|1;
            temp=temp>>1;
        }
        // XOR n with the mask to flip its bits
        return n^mask;
    }
}