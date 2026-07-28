class Solution {
    public String smallestPalindrome(String s) {

        int len = s.length();

        if (len <= 1)
            return s;

        char[] left = new char[len / 2];

        for (int i = 0; i < len / 2; i++) {
            left[i] = s.charAt(i);
        }

        Arrays.sort(left);

        StringBuilder ans = new StringBuilder();

        // Left half
        for (char c : left) {
            ans.append(c);
        }

        // Middle character (only for odd length)
        if (len % 2 == 1) {
            ans.append(s.charAt(len / 2));
        }

        // Right half (reverse of sorted left)
        for (int i = left.length - 1; i >= 0; i--) {
            ans.append(left[i]);
        }

        return ans.toString();
    }
}