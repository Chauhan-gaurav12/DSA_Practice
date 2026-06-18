package Sorting;

public class quick_sort {
    public static void display(int[]arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void quicksort(int[]arr,int st,int end){
        if(st>=end) return;
        int pivotidx=partion(arr,st,end);
        quicksort(arr,st,pivotidx-1);
        quicksort(arr,pivotidx+1,end);
    }
    public static int partion(int []arr,int st,int end){
        int pivotele=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivotele) count++;
        }
        int pivit_idx=st+count;
        int temp=arr[pivit_idx];
        arr[pivit_idx]=arr[st];
        arr[st]=temp;

        int i=st,j=end;
        while(i<pivit_idx && j>pivit_idx){
            while(arr[i] <= pivotele){
                i++;
            }
            while(arr[j]>pivotele){
                j--;
            }
            if(i<pivit_idx && j>pivit_idx){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;j--;
            }
        }
        return pivit_idx;
    }
    public static void main(String[] args){
        int [] arr={2,8,4,9,6,7,2,31,1,0};
        System.out.println("Before sorting the array is :");
        display(arr);
        quicksort(arr,0,arr.length-1);

        System.out.println("\nAfter sorting the array is :");
        display(arr);
    }
}
