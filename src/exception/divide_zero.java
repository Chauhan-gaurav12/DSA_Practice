package exception;

public class divide_zero {

    static void divide(int a, int b) throws ArithmeticException {
        int c = a / b;
        System.out.println("Result: " + c);
    }

    public static void main(String[] args) {

        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        divide(14, 2);  // ✅ now it will run
    }
}