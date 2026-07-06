class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.indexOf(ch);
        if(n==-1){
           return word;
        }
        char []arr=word.toCharArray();
        reverse(arr,0,n);
        return new String(arr);
        
    }  
    void reverse(char[] arr,int left,int right){
        if(left>=right){
            return;
        }
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
       reverse(arr,left+1,right-1);
    } 
}