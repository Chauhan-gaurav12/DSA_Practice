package Array;

public class passing_array_in_methods {
    public static void change(int [] arr){
        arr[5]=25;
    }
    public static void main(String[] args){
       // passing array in the function
        int [] arr={4,5,2,5,2,1};
        System.out.println(arr[5]);
        change(arr);
        System.out.println(arr[5]);
    }
}
