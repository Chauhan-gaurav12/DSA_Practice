class Solution {
    public int distributeCandies(int[] candyType) {
         // 1. Create a HashSet to store unique candy types
        HashSet<Integer> uniqueCandies = new HashSet<>();
        
        // 2. Add each candy type to the set (duplicates are ignored automatically)
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        
        // 3. Get the maximum candies Alice is allowed to eat
        int maxAllowed = candyType.length / 2;
        
        // 4. Return the smaller value between unique types available and her eating limit
        return Math.min(uniqueCandies.size(), maxAllowed);
    }
}