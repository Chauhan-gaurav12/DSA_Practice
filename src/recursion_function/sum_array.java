package recursion_function;

public class sum_array {
    static int sumarray(int [] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        return sumarray(arr, idx+1)+arr[idx];
    }
    public static void main(String[] args){
        int [] arr={};
        System.out.println(sumarray(arr,0));
    }

}
