class Solution {
    public int distributeCandies(int[] candyType) {
          boolean [] visit = new boolean[200001];
        int advised = candyType.length/2;
       int count = 0;
        for( int num : candyType){
            int index = num + 100000;
            if(!visit[index]){
                visit[index] = true;
                if(++count> advised){
                    return advised;
                }
            }
        }
        return count;
    }
}