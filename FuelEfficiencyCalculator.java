import java.util.InputMismatchException;
import java.util.Scanner;

public class FuelEfficiencyCalculator {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of kilometers traveled: ");
            double kilometers = scanner.nextDouble();

            System.out.println("Enter the liters of fuel consumed: ");
            double liters = scanner.nextDouble();

            try {
                double kmPerLiter = calculateFuelEfficiency(kilometers, liters);
                System.out.println("Fuel efficiency: " + kmPerLiter + " km/l");
            } catch (ArithmeticException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid input. Please enter numeric values.");
        }
    }
    private static double calculateFuelEfficiency(double kilometers, double liters) {
        if (liters == 0) {
            throw new ArithmeticException("Division by zero. Cannot calculate fuel efficiency with 0 liters consumed.");
        }
        return kilometers/liters;
    }
}
