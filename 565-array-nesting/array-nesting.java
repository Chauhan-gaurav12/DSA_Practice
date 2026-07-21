class Solution {
    public int arrayNesting(int[] nums) {
        boolean visited[]=new boolean[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(visited[i]==false){
                int count=0;
                int curr=i;
                while(visited[curr]==false){
                    visited[curr]=true;
                    curr=nums[curr];
                    count++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}