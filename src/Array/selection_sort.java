package Array;

public class selection_sort {
    static int [] sel_sort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){

            int min=i;
            for(int j=i+1;j<n;j++) {
                if (arr[min] >arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int [] arr={12,45,1,19,3,54,2};
        System.out.println("Before sorting the array is :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        int [] s=sel_sort(arr);
        System.out.println();
        System.out.println("After sorting the array is :");
        for (int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
