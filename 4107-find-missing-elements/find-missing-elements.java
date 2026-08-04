class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(num,max);
            min=Math.min(min,num);
        }
        boolean [] ans=new boolean[max-min+1];
        for(int num:nums){
            ans[num-min]=true;
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<=max-min;i++){
            if(!ans[i]){
                result.add(i+min);
            }
        }
        return result;
    }
}