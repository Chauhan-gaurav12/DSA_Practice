class Solution {
    public boolean detectCapitalUse(String word) {
        int capital=0;
        int len=word.length();
        for(char ch:word.toCharArray()){
            boolean bs=true;
            if(Character.isUpperCase(ch) )
                capital++;
        }
        if(capital==len)
            return true;
        else if(capital==0){
            return true;
        }
        // Case 3: Exactly 1 capital AND it is the first letter ("Google")
        if (capital == 1 && Character.isUpperCase(word.charAt(0))) return true;

        return false;
    }
}