class Solution {
    public int minimumOperations(int[] nums, int start, int goal) {
    if (start == goal) return 0;
      Queue<Integer> q=new LinkedList<>();
      int ans=0;
      q.add(start);
      boolean []visit=new boolean[1001];
      visit[start]=true;
      int n=nums.length;
      while(!q.isEmpty()){
        int s=q.size();
        while(s > 0){ // Loop through all nodes at the current operations level
            int curr=q.poll();
            s--;
             // Try all 3 operations for each number in nums
            for(int i=0;i<n;i++){
                // addition
                int a=curr + nums[i];
                if(a==goal)
                    return ans+1;
                if(a >=0 && a <= 1000 &&  !visit[a]){
                    visit[a]=true;
                    q.add(a);
                }
                // subtraction
                int op2= curr - nums[i];
                if(op2 == goal)
                    return ans+1;
                if(op2 >= 0 && op2 <= 1000 && !visit[op2]){
                    visit[op2]=true;
                    q.add(op2);
                }

                // xor opertaion
                int op3=curr ^ nums[i];
                if( op3 == goal)
                    return ans+1;
                if(op3 >= 0 && op3 <= 1000 && !visit[op3]){
                    visit[op3]=true;
                    q.add(op3);
                }
            }
        }    
        ans++;    
      }  
      return -1;
    }
}