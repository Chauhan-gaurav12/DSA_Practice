class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int n=nums1.length;
        int [] nge=new int[n];

    for(int i=0;i<nums2.length;i++){
        while(!st.isEmpty() && st.peek()<nums2[i]){
            map.put(st.pop(),nums2[i]);
        }
        st.push(nums2[i]);
    }
    while(!st.isEmpty()){
        map.put(st.pop(),-1);
    }

    for(int i=0;i<n;i++){
        nge[i]=map.get(nums1[i]);
    }
    return nge;

    }
}