package Array;
//import java.util.Scanner;
import java.util.*;
public class print_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of student: ");
        int n = sc.nextInt();
        int[] marks = null;
       // System.out.println("No of student is the : ", (+marks.length));
        marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (marks[i] < 35) {
                System.out.print(i + " ");
            }
        }
        // print the sum of all marks in the student marks
        int sum = 0;
        System.out.println("The index value less that 35 is : ");
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        System.out.print("\nThe sum of all marks is : " + sum);
    }
}
