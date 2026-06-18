package Sorting;

public class selection_sort {
    public static void main(String[] args){
        String []arr= {"papaya", "lime", "watermelon", "apple", "apqle", "watermelon"};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(String val:arr){
            System.out.print(val+" ");
        }
    }
}
