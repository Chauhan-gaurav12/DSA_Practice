package Array;

public class chat_gpt_rearrnage {
    public static void main(String[] args){
        int[] arr = {1, 2, 4,8,10,7,9,3};

        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < arr.length && oddIndex < arr.length) {

            // correct element at even index (should be odd)
            if (arr[evenIndex] % 2 != 0) {
                evenIndex += 2;
            }

            // correct element at odd index (should be even)
            else if (arr[oddIndex] % 2 == 0) {
                oddIndex += 2;
            }

            // both are wrong → swap
            else {
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;

                evenIndex += 2;
                oddIndex += 2;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}