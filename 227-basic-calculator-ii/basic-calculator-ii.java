class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        int len = s.length();
        int currentNumber = 0;
        int lastNumber = 0;
        int ans = 0;
        char sign = '+';

        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            if ((!Character.isDigit(currentChar) && currentChar != ' ') || i == len - 1) {

                if (sign == '+') {
                    ans += lastNumber;
                    lastNumber = currentNumber;
                } else if (sign == '-') {
                    ans += lastNumber;
                    lastNumber = -currentNumber;
                } else if (sign == '*') {
                    lastNumber = lastNumber * currentNumber;
                } else if (sign == '/') {
                    lastNumber = lastNumber / currentNumber;
                }

                sign = currentChar;
                currentNumber = 0;
            }
        }

        ans += lastNumber;
        return ans;
    }
}