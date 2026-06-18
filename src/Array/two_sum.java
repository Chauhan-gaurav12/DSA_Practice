package Array;

public class two_sum {
    public static void main(String[] args) {
        int[] arr = {14, 25, 3, 6, 78, 95, 8, 47, 5};
        int x = 30;
        int flag=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println("The index value of two sum is " + x+" is = index: " + i+ " and"+ " index: " + j);
                    flag=1;
                    return ;
                }
            }
        }
        if(flag==0){
            System.out.println("Not found");
        }
    }
}
