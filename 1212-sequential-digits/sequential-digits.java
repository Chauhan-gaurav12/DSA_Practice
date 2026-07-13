class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str="123456789";
        ArrayList <Integer> res=new ArrayList<>();
        for(int len=2;len<=str.length();len++){
            for(int startIndex=0;startIndex<=str.length()-len;startIndex++){
                String temp=str.substring(startIndex,startIndex+len);
                
                int pos=Integer.parseInt(temp);
                
            
                if(pos>=low && pos <=high){
                    res.add(pos);
                }
            }            
        }
        return res;
    }
}