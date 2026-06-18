package Array;

public class left_rotate_k {
    public static void swap(int [] arr,int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;end--;
        }
    }
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k=3;
        k=k%arr.length;
        swap(arr,0,arr.length-1);
        swap(arr , 0,k-1);
        swap(arr,k,arr.length-1);
        System.out.println("The array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
