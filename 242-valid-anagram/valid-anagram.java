class Solution {
    public boolean isAnagram(String s, String t) {
        int l1=s.length(),l2=t.length();
        if(l1!=l2)
            return false;
        int []size=new int[26];

        for(int i=0;i<l1;i++){
            size[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<l2;i++){
            size[t.charAt(i)-'a']-=1;
        }

        for(int i=0;i<26;i++){
            if(size[i]!=0)
                return false;
        }
        return true;
    }
}