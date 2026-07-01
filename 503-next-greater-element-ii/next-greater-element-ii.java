class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int [] tmp=new int[n];
        
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){ // i%n use because make array circular
                st.pop(); // remove element untill greater element from the stack is not come;
            }
            if(st.size()==0){
                tmp[i%n]=-1;
            }
            else{
                tmp[i%n]=st.peek();
            }
            st.push(nums[i%n]);
        }
        return tmp;
    }
}