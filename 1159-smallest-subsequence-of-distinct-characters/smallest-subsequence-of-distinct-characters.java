class Solution {
    public String smallestSubsequence(String s) {
        int[] freq=new int[26];
        boolean[] check=new boolean[26];
    // fill last Index 
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']=i; 
        }
        Stack<Character> st=new Stack<>();
    // trave;l to string
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i); // current character
        if(check[ch-'a'])continue;

        while(!st.isEmpty() && st.peek()>ch && freq[st.peek()-'a']>i){
            check[st.pop()-'a']=false;
        }
        st.push(ch);
        check[ch-'a']=true;
    }
        StringBuilder sb=new StringBuilder();
        for(char ch:st)
            sb.append(ch);
        
        // return ans

        return sb.toString();
    }
}