package recursion_function;

import java.util.ArrayList;

public class return_idx {
    static ArrayList<Integer>find_indices(int[]arr,int len,int target,int ids){
        if(ids>=len){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer>ans=new ArrayList<>();
        if(arr[ids]==target){
            ans.add(ids);
        }
        ArrayList<Integer>small=find_indices(arr,len,target,ids+1);
        ans.addAll(small);
        return ans;

    }
    public static void main(String[] args){
        int []arr={1,2,1,3,1,4,1};
        int target=1;
        int n=arr.length;
        ArrayList<Integer> ans=find_indices(arr,n,target,0);

        for(Integer i:ans){
            System.out.println(i+" ");
        }
    }
}
