package Array;

public class is_sorted {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,10,7,8,9};
        int count=0;
        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                count=1;
                break;
            }
        }
        if(count!=0){
            System.out.println("The array is not sorted");
        }
        else{
            System.out.println("Array is sorted");
        }

    }
}
