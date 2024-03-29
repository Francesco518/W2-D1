public class DebuggerExercise {
    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println("Result: " + result);

            result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static int divide(int dividend, int divisor) {
        int result = dividend / divisor;
        return result;
    }
}
