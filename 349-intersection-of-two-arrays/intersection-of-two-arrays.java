class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>() ;
       // first create a set and push all value of one array into set and remember set coantains only unique  value
       for(int n2: nums2){
            set.add(n2);
       }
       // create a dynamic list because we don't know about the unique element
       ArrayList<Integer> al=new ArrayList<>();
       //we will push all element into list that is unique and remove from the set  so duplicate chance no 
       for(int n1:nums1){
            if(set.contains(n1)){
                al.add(n1);
                set.remove(n1);
            }
       }
       int len=al.size();
       int[]arr=new int[len];
       for(int i=0;i<len;i++){
            arr[i]=al.get(i);
       }
       return arr;
    }
}