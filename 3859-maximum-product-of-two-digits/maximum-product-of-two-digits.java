class Solution {
    public int maxProduct(int n) {
        int len=Integer.toString(n).length();
        int [] arr=new int[len];
        int i=0;
        while(n>0){
            arr[i]=n%10;
            n/=10;
            i++;
        }
        Arrays.sort(arr);
        return (arr[len-1]*arr[len-2]);
    }
}