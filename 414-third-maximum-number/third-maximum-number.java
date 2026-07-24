class Solution {
    public int thirdMax(int[] nums) {
        // Track the top three distinct maximums using simple primitive variables
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for (int num : nums) {
            // Skip duplicates
            if (num == first || num == second || num == third) {
                continue;
            }
            
            // Shift values down when a larger number is found
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        
        // If 'third' was never updated, return the absolute maximum ('first')
        if (third == Long.MIN_VALUE) {
            return (int) first;
        }
        
        return (int) third;
    }
}
