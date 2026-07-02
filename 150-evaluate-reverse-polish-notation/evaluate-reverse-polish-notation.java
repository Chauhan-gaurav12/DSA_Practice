class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String str = "+-*/";
        for(String ch:tokens){
            if(str.contains(ch)){
                int d2=st.pop();
                int d1=st.pop();
                int res=0;
                if(ch.equals("+")){
                    res=d2+d1;
                }
                else if(ch.equals("-"))
                    res=d1-d2;
                else if(ch.equals("*"))
                    res=d2*d1;
                else if (ch.equals("/"))
                    res=d1/d2;
                st.push(res);
            }
            else
                st.push(Integer.parseInt(ch));
        }
        return (int) st.pop();
        
    }
}