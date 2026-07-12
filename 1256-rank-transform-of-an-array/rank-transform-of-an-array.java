class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int n=arr.length;
      int [] sorted=arr.clone();

      Arrays.sort(sorted);
      HashMap<Integer,Integer> hp=new HashMap<>();
        int rank=1;
      for(int num:sorted){
            if(!hp.containsKey(num)){
                hp.put(num,rank++);
            }
      }

      int []res =new int[n];

      for(int i=0;i<n;i++){
            res[i]=hp.get(arr[i]);
      }    
    return res;
    }
}