class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int top = -1;
        int[] stack = new int[nums.length*2];
        int[] result = new int[nums.length];

        for (int i=nums.length-1; i>=0; i--)
        {
            stack[++top] = i;
        }

        for (int i=nums.length-1; i>=0; i--)
        {
            while (top != -1 && nums[stack[top]] <= nums[i])
            {
                top--;
            }
            
            result[i] = top == -1 ? -1 : nums[stack[top]];
            stack[++top] = i;
        }

        return result;
    }
}