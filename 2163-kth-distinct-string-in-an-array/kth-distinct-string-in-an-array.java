class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String ,Integer> st=new HashMap<>();
        for(String s: arr){
            st.put(s,st.getOrDefault(s,0)+1);
        }
        int count=0;
        for(String key:arr){
            if(st.get(key)==1){
                count++;
                if(count==k){
                    return key;
                }
            }
        }
        return "";
    }
}