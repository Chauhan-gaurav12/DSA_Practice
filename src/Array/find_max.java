package Array;


public class find_max {
    void max(){
        int []arr={1,5,6,3,2,9};
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println("The maximum value in the array is : "+max+" at index: "+index );
    }

    public static void main(String[] args){
        find_max obj=new find_max();
        obj.max();
    }
}
