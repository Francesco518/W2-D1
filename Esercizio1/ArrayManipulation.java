import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[] array = generateRandomArray(5);

        try (Scanner scanner = new Scanner(System.in)) {
            int userInput;

            do {
                printArray(array);

                System.out.print("Enter a number (0 to exit): ");
                userInput = scanner.nextInt();

                if (userInput != 0) {
                    System.out.print("Enter the position to insert: ");
                    int position = scanner.nextInt();

                    try {
                        array = insertNumber(array, position, userInput);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
            } while (userInput != 0);
        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid input. Please enter a number.");
        }
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10) + 1; // Random values between 1 and 10
        }

        return array;
    }

    private static void printArray(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    private static int[] insertNumber(int[] array, int position, int number) {
        if (position < 0 || position > array.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid position. Position should be between 0 and " + array.length);
        }

        int[] newArray = new int[array.length + 1];

        // Copy elements up to the specified position
        System.arraycopy(array, 0, newArray, 0, position);

        // Insert the new number
        newArray[position] = number;

        // Copy the remaining elements
        System.arraycopy(array, position, newArray, position + 1, array.length - position);

        return newArray;
    }
}
