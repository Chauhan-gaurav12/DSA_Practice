class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> at=new ArrayList<>();
        int m=nums1.length;
        int n=nums2.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]==nums2[j]){
                at.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else
                j++;
        }
        i=0;
        int len=at.size();
        int []new_arr=new int[len];
        for(int num:at){
            new_arr[i++]=num;
        }
        return new_arr;
    }
}