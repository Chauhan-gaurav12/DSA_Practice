class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        for (char c : chars.toCharArray()) {
            counts[c - 'a']++;
        }
        
        int validLengthsSum = 0;
        
        // Step 2: Validate each candidate word
        for (String word : words) {
            int[] currentWordCounts = new int[26];
            boolean isMatch = true;
            
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                currentWordCounts[index]++;
                
                // Early exit: we used more letters than available
                if (currentWordCounts[index] > counts[index]) {
                    isMatch = false;
                    break; 
                }
            }
            
            // Step 3: Accumulate lengths of fully valid words
            if (isMatch) {
                validLengthsSum += word.length();
            }
        }
        
        return validLengthsSum;
    }
}