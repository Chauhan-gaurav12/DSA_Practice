package Sorting;

public class merge_sort {
    static void display(int [] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void divide(int []arr,int st,int end){
        if(st>=end){
            return ;
        }
        int mid=st+(end-st)/2;
        divide(arr,st,mid);
        divide(arr,mid+1,end);
        merge(arr,st,mid,end);
    }
    public static void merge(int[] arr,int st,int mid,int end){
        int[]new_arr=new int[end-st+1];
        int idx1=st;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid&& idx2<=end){
            if(arr[idx1]<arr[idx2]){
               new_arr[x]=arr[idx1++];
            }
            else{
                new_arr[x]=arr[idx2++];
            }
            x++;
        }
        while(idx1 <= mid){
            new_arr[x]=arr[idx1++];
            x++;
        }
        while(idx2 <= end){
            new_arr[x]=arr[idx2++];
            x++;
        }
        for(int i=0,j=st;i<new_arr.length;i++,j++){
            arr[j]=new_arr[i];
        }
    }
    public static void main(String[] args){
        int []arr={7,20,12,67,3,9,89};
        int n=arr.length;
        System.out.println("Before Sorting the array is ");
        display(arr);
        divide(arr,0,n-1);
        System.out.println("\n After sort the array is : ");
        display(arr);
    }
}
