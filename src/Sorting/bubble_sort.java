package Sorting;
// without creating a new array move all zero at end

public class bubble_sort {
    public static void main(String[] args){
        int []arr={0,0,5,0,0,3,4,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
