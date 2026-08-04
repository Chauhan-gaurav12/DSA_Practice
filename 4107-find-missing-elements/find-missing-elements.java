class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        // first we are finding max and minimum value from the whole array  
        for(int num:nums){
            max=Math.max(num,max);
            min=Math.min(min,num);
        }
        // we are creating a array size of max-min and setting true for that element that is already exist
        boolean [] ans=new boolean[max-min+1];
        for(int num:nums){
            ans[num-min]=true;
        }
        // creating a arraylist that will help us to return result
        ArrayList<Integer> result=new ArrayList<>();
        // Traversing whole array and checking which element not exist
        for(int i=0;i<=max-min;i++){
            // if false will return so means I+min element not exist in array ex=i=7 and min is 40 so 47 is not exist;
            if(!ans[i]){
                result.add(i+min);
            }
        }
        return result;
    }
}