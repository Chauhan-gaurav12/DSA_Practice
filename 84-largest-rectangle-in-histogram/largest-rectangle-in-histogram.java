class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        if(n==0)
            return 0;

        int [] pse=new int[n];
        int[] nse=new int [n];
        Stack<Integer> st=new Stack<>();
        // claculate next smaller element right to left travel
        // we will write index of element in array
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()] >= heights[i]){
            st.pop();
            }
            if(st.size()==0)
                nse[i]=n;
            else
                nse[i]=st.peek();
            st.push(i);
        }
       
        //Emptying the stack
        while(!st.isEmpty()){
            st.pop();
        }

        // calculate the previous smaller element left to right
        st.push(0);
        pse[0]=-1;

        for(int i=1;i<=n-1;i++){
            while(st.size()>0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.size()==0)
                pse[i]=-1;
            else
                pse[i]=st.peek();
            st.push(i);
        }
        //Maximum area of rectangle
        int max=-1;
        for(int i=0;i<n;i++){
            int width=nse[i]-pse[i]-1;
            int area=heights[i]*width;
            max=Math.max(max,area);
        }
    return max;    
    }   

}