class Solution {
    public int countPrimes(int n) {
        // Base case: there are no primes strictly less than 2
        if (n <= 2) {
            return 0;
        }
        
        // boolean array defaults to false. 
        // false means prime, true means composite (not prime).
        boolean[] isComposite = new boolean[n];
        int count = 0;
        
        // Loop up to the square root of n
        for (int i = 2; i * i < n; i++) {
            if (!isComposite[i]) {
                // Mark all multiples of i starting from i * i as composite
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        
        // Count how many numbers strictly less than n remain unmarked (primes)
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }
        
        return count;
    }
}
