class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String>ans=new ArrayList<>();
        int []count=new int[26];
        fillout(words[0],count);
        for(int i=1;i<words.length;i++){
            int [] temp=new int[26];
            fillout(words[i],temp);
            for(int j=0;j<26;j++){
                count[j]=Math.min(count[j],temp[j]);
            }
        }
        for(int i=0;i<26;i++){
            if(count[i]>0){
                char ch = (char) (i + 'a');
                for(int j=0;j<count[i];j++){
                    ans.add(String.valueOf(ch)); 
                }
            }
        }
        return ans;
    }
    private void fillout(String s,int[]temp){
        for(char ch:s.toCharArray()){
            temp[ch-'a']++;
        }
    }
}