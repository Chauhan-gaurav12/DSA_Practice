class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // Handle edge case
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        // First Pass: Find potential candidates
        int candidate1 = 0;
        int candidate2 = 1;

        int count1 = 0;
        int count2 = 0;

        for (int n : nums) {

            if (n == candidate1) {
                count1++;
            }
            else if (n == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = n;
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = n;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Second Pass: Verify candidates
        count1 = 0;
        count2 = 0;

        for (int n : nums) {
            if (n == candidate1) {
                count1++;
            }
            else if (n == candidate2) {
                count2++;
            }
        }

        // Elements must appear more than n/3 times
        int threshold = nums.length / 3;

        List<Integer> result = new ArrayList<>();

        if (count1 > threshold) {
            result.add(candidate1);
        }

        if (count2 > threshold) {
            result.add(candidate2);
        }

        return result;
    }
}
