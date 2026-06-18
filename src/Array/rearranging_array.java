package Array;

public class rearranging_array {
    public static void main(String[] args){
        int []arr={1,2,2,1};
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]%2==0){
                    int j=i+1;
                    while(j<arr.length){
                        if(arr[j]%2!=0){
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            break;
                        }
                        j++;
                    }
                }
            }
            else{
                if(arr[i]%2!=0){
                    int j=i+1;
                    while(j<arr.length){
                        if(arr[j]%2==0){
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            break;
                        }
                        j++;
                    }
                }
            }
        }
        for (int i=0;i<arr.length ;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
