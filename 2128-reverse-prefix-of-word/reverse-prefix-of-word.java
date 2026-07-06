class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.indexOf(ch);
         if(n==-1){
            return word;
         }
        Stack <Character> st=new Stack<>();
        //int nk=word.indexOf(ch);
        StringBuilder sb=new StringBuilder();
        //word=word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                st.push(word.charAt(i));
                break;
            }
            st.push(word.charAt(i));
        }
        if(st.size()==0){
            return sb.append(word).reverse().toString();
        }
        else{
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            for(int i=word.indexOf(ch)+1;i<word.length();i++){
            sb.append(word.charAt(i));
             }
      
        }
        return sb.toString(); 
        
    }   
}