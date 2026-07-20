class Solution {
    public String smallestSubsequence(String s) {
        // first we create a last index array of string 
        int n=s.length();
        int [] lastIndex=new int[26];
        for(int i=0;i<n;i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        // we will create a steck to check lexicographically order
        Stack<Character> st=new Stack<>();
        // also we will create a array for checking that comming element is already in the stack 
        boolean []visit=new boolean[26];

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(visit[ch-'a']) continue;

            while(!st.isEmpty() && st.peek()> ch && lastIndex[st.peek()-'a'] >i ){
                visit[st.pop()-'a']=false;
            }
            st.push(ch);
            visit[ch-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for (char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
}