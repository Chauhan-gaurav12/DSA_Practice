package Array;

public class lenth_array {
    public static void main (String[] args){
        int [] arr={1,2,5,2,8,2,82,8,12};
        System.out.println("The length of array is : "+arr.length);

         // searching the element in the array
        int x=8;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("Element is found at position : "+i);
            }
        }

        // print the maximum value in the array
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum value in the array is : "+max);

        int sec_lar=arr[0];
        // find the second largest element
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max && arr[i]>sec_lar){
                sec_lar=arr[i];
            }
        }
        System.out.println("The second largest element is : "+sec_lar);
    }
}
