class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [] row_sum=new int[m];
        int [] col_sum=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    row_sum[i]++;
                    col_sum[j]++;
                }
            }
        }
        int special_count=0;

        // find special count
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((mat[i][j]==1) && (row_sum[i]==1) && (col_sum[j]==1)){
                    special_count++;
                }
            }
        }
        return special_count;
    }
}