class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result=new ArrayList<>();
        int length=grid.length;
        int len=grid[0].length;

        if(k<=0){
            for(int i=0;i<length;i++){
                ArrayList<Integer> at=new ArrayList<>();
                for(int j=0;j<len;j++){
                    at.add(grid[i][j]);
                }
                result.add(at);
            }
            return result;
        }
        
        int n=length*len;


        int[]arr=new int[n];
        int var=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<len;j++){
                arr[var++]=grid[i][j];
            }
        }
        
        k=k%n;

        reverse (arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        var=0;
        for(int i=0;i<length;i++){
            ArrayList<Integer> ans=new ArrayList<>();
            for(int j=0;j<len;j++){
                ans.add(arr[var++]);
            }
            result.add(ans);
        }
        return result;
    }


    void reverse(int[] arr,int st,int en){
        while(st<en){
            int temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;
            en--;
        }
    }
}