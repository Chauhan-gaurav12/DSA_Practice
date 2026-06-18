package Array;

public class sort_array {
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\nThe sorted array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String [] args){
        int []arr={14,21,11,32,23,65,45};
        System.out.println("Before sorting the array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
//        sort(arr);
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+"\t");
//        }
    }

    public static class buble_sort {
        int [] buble(int [] arr){
            int n=arr.length;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }
        public static  void main(String[] args){
            buble_sort obj=new buble_sort();
            int [] arr={12,4,5,7,1,8,12};
            System.out.println("Before sorting the array is : ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"\t");
            }

            int [] arr_1=obj.buble(arr);
            System.out.println("\nAfter sorting the array is : ");
            for(int i=0;i<arr_1.length;i++){
                System.out.print(arr_1[i]+"\t");
            }
        }
    }
}
