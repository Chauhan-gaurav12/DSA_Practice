class Solution {
    public int minimumPushes(String word) {
        int []freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']+=1;
        }
        Arrays.sort(freq);
        int n=0;
        int res=0;

        // Iterate backwards from the highest frequency to the lowest
        for(int i=25;i>=0;i--){
            if(freq[i]==0)
                break;
            // Calculate the push cost (1 for first 8, 2 for next 8, etc.)
            int pushcost=(n/8)+1;
            res+=freq[i]*pushcost;
            n++;
        }
        return res;
    }
}