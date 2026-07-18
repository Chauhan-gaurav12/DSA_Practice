class Solution {
    public int findTheWinner(int n, int k) {
       // here we are entering element in a queue from 1 to n
       Queue<Integer> qe=new LinkedList<>();
       for(int i=0;i<n;i++){
            qe.add(i+1);
       }
       // here we will run lop untill qe size not equal to 1 and inner loop run form removing k element from queue ;

       // the time complexity of this is n*k
       // space complexity is n.
       while(qe.size()!=1){
            for(int i=1;i<k;i++){
                qe.add(qe.remove());
            }
            qe.remove();
       }
    return qe.remove(); // can also return qe peek();
    }
    
}