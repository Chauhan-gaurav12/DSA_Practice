class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> at=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    at.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int i=0;
        int []arr=new int[at.size()];
        for(int num:at){
            arr[i++]=num;
        }
        return arr;
    }
}