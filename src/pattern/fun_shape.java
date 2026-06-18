package pattern;
import java.util.*;

public class fun_shape {
    public static void main(String[] args) {

        int n = 5;
        int totalStars = 9;

        // Upper part
        for (int i = 0; i < n; i++) {

            int leftStars = n - i;
            int rightStars = totalStars - leftStars;
            int spaces = i;

            // Left stars
            for (int j = 0; j < leftStars; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print("    ");
            }

            // Right stars
            for (int j = 0; j < rightStars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 2; i >= 0; i--) {

            int leftStars = n - i;
            int rightStars = totalStars - leftStars;
            int spaces = i;

            // Left stars
            for (int j = 0; j < leftStars; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print("    ");
            }

            // Right stars
            for (int j = 0; j < rightStars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
