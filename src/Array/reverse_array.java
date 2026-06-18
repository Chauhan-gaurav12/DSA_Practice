package Array;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7};
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i-1];
            arr[length - i-1] = temp;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
