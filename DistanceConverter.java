// Abby Dycus 003

import java.util.Scanner;

public class DistanceConverter {

    // Method to convert meters to kilometers
    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.printf("%.3f meters = %.3f kilometers%n", meters, kilometers);
    }

    // Method to convert meters to inches
    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.printf("%.3f meters = %.3f inches%n", meters, inches);
    }

    // Method to convert meters to feet
    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.printf("%.3f meters = %.3f feet%n", meters, feet);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Distance Converter (meters -> kilometers / inches / feet)");
        System.out.print("Enter a distance in meters (must be positive): ");

        // Check if the input is a valid number
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid input. Please enter a numeric value for meters.");
            return;
        }

        double meters = scanner.nextDouble();

        // Validate non-negative distance
        if (meters < 0) {
            System.out.println("Error: Distance cannot be negative.");
            return;
        }

        int choice = 0;
        while (choice != 4) {
            // Display menu
            System.out.println();
            System.out.println("Please choose an option:");
            System.out.println("1. Convert to kilometers");
            System.out.println("2. Convert to inches");
            System.out.println("3. Convert to feet");
            System.out.println("4. Quit the program");
            System.out.print("Enter your choice (1-4): ");

            // Validate menu input
            if (!scanner.hasNextInt()) {
                String badInput = scanner.next(); // consume invalid input
                System.out.println("Invalid selection: '" + badInput + "'. Please enter a number between 1 and 4.");
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    System.out.println("Quitting program");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
            }
        }
    }
}
