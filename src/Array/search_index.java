package Array;

public class search_index {
    void search(){
        int []arr={6,3,2,1,5,8,2};
        int x=10;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                return;
            }

        }

        if(ans==-1){
            System.out.println(x+ " Not found");
        }
    }
    public static void main (String [] args){
        search_index obj=new search_index();
        obj.search();
    }
}
